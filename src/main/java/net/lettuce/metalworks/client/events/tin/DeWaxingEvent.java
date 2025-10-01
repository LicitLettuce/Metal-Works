package net.lettuce.metalworks.client.events.tin;


import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = "metal_works", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class DeWaxingEvent {

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = event.getItemStack();
        var player = event.getEntity();

        if (level.isClientSide) return;

        Block currentBlock = state.getBlock();
        Map<Block, Block> unwaxables = WaxingEvent.UNWAXABLES;

        if (heldItem.getItem() instanceof AxeItem && unwaxables.containsKey(currentBlock)) {
            Block unwaxed = unwaxables.get(currentBlock);
            BlockState newState = unwaxed.defaultBlockState();

            level.setBlock(pos, newState, 11);
            level.levelEvent(3004, pos, 0); // Wax off particles

            if (!player.isCreative()) {
                heldItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(event.getHand()));
            }

            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }
    }
}
