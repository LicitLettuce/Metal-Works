package net.lettuce.metalworks.client.events.tin;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.util.DoorStateUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DeWaxingEvent {

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide) return;

        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = event.getItemStack();
        var player = event.getEntity();

        if (!(heldItem.getItem() instanceof AxeItem)) return;

        Map<Block, Block> unwaxables = WaxingEvent.UNWAXABLES;
        Block current = state.getBlock();
        Block target = unwaxables.get(current);
        if (target == null) return;

        // Replace (door-aware)
        if (current instanceof DoorBlock && target instanceof DoorBlock && level instanceof net.minecraft.server.level.ServerLevel server) {
            DoorStateUtil.transformDoor(server, pos, (DoorBlock) target);
        } else {
            BlockState newState = target.defaultBlockState();
            // copy matching properties
            for (var p : state.getProperties()) {
                if (newState.hasProperty(p)) {
                    try {
                        @SuppressWarnings("rawtypes") var v = (Comparable) state.getValue(p);
                        @SuppressWarnings("unchecked") var prop = (net.minecraft.world.level.block.state.properties.Property) p;
                        newState = newState.setValue(prop, v);
                    } catch (Exception ignored) {}
                }
            }
            // place & notify
            int flags = Block.UPDATE_KNOWN_SHAPE | Block.UPDATE_CLIENTS;
            level.setBlock(pos, newState, flags);
            level.blockUpdated(pos, target);
        }

        // Wax off particles/sound
        level.levelEvent(3004, pos, 0);

        if (!player.isCreative()) {
            heldItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(event.getHand()));
        }

        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setCanceled(true);
    }
}
