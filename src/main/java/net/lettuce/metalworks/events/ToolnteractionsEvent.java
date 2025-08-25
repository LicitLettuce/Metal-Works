package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ToolnteractionsEvent {

    @SubscribeEvent
    public static void onToolUse(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() != ToolActions.AXE_SCRAPE) return;

        BlockState state = event.getState();
        Block block = state.getBlock();

        if (block == MWBlocks.WAXED_TIN_BLOCK.get()) {
            event.setFinalState(MWBlocks.TIN_BLOCK.get().defaultBlockState());
        } else if (block == MWBlocks.WAXED_TARNISHED_TIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.WAXED_CORRODED_TIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.WAXED_ERODED_TIN.get()) {
            event.setFinalState(MWBlocks.ERODED_TIN.get().defaultBlockState());
        }
    }
}
