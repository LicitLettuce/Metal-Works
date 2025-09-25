package net.lettuce.metalworks.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.lettuce.metalworks.registry.MWBlocks;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = "metal_works", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class WaxingEvent {

    private static final Map<RegistryObject<Block>, RegistryObject<Block>> waxablePairs = Map.ofEntries(
            Map.entry(MWBlocks.TIN_BLOCK, MWBlocks.WAXED_TIN_BLOCK),
            Map.entry(MWBlocks.TARNISHED_TIN, MWBlocks.WAXED_TARNISHED_TIN),
            Map.entry(MWBlocks.CORRODED_TIN, MWBlocks.WAXED_CORRODED_TIN),
            Map.entry(MWBlocks.ERODED_TIN, MWBlocks.WAXED_ERODED_TIN)
    );

    private static final Map<Block, Block> WAXABLES = new HashMap<>();
    public static final Map<Block, Block> UNWAXABLES = new HashMap<>();

    public static void initWaxables() {
        waxablePairs.forEach((from, to) -> {
            WAXABLES.put(from.get(), to.get());
            UNWAXABLES.put(to.get(), from.get());
        });
    }

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = event.getItemStack();
        var player = event.getEntity();

        if (level.isClientSide) return;

        Block currentBlock = state.getBlock();

        if (heldItem.getItem() instanceof HoneycombItem) {
            Block waxed = WAXABLES.get(currentBlock);
            if (waxed != null) {
                BlockState newState = waxed.defaultBlockState();

                level.setBlock(pos, newState, 11);
                level.levelEvent(3003, pos, 0);

                if (!player.isCreative()) {
                    heldItem.shrink(1);
                }

                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }
}


