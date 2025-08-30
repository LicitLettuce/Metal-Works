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

        // Tin Block
        if (block == MWBlocks.ERODED_TIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN.get()) {
            event.setFinalState(MWBlocks.TIN_BLOCK.get().defaultBlockState());
        }

        // Chiseled Tin
        if (block == MWBlocks.ERODED_CHISELED_TIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_CHISELED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_CHISELED_TIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_CHISELED_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_CHISELED_TIN.get()) {
            event.setFinalState(MWBlocks.CHISELED_TIN.get().defaultBlockState());
        }

        // Tin Grate
        if (block == MWBlocks.ERODED_TIN_GRATE.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_GRATE.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_GRATE.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_GRATE.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_GRATE.get()) {
            event.setFinalState(MWBlocks.TIN_GRATE.get().defaultBlockState());
        }

        // Tin Grate Drain
        if (block == MWBlocks.ERODED_TIN_GRATE_DRAIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_GRATE_DRAIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get()) {
            event.setFinalState(MWBlocks.TIN_GRATE_DRAIN.get().defaultBlockState());
        }

        // Cut Tin
        if (block == MWBlocks.ERODED_CUT_TIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_CUT_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_CUT_TIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_CUT_TIN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN.get()) {
            event.setFinalState(MWBlocks.CUT_TIN.get().defaultBlockState());
        }

        // Cut Tin Stairs
        else if (block == MWBlocks.ERODED_CUT_TIN_STAIRS.get()) {
            event.setFinalState(MWBlocks.CORRODED_CUT_TIN_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_CUT_TIN_STAIRS.get()) {
            event.setFinalState(MWBlocks.TARNISHED_CUT_TIN_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN_STAIRS.get()) {
            event.setFinalState(MWBlocks.CUT_TIN_STAIRS.get().defaultBlockState());
        }

        // Cut Tin Slabs
        else if (block == MWBlocks.ERODED_CUT_TIN_SLAB.get()) {
            event.setFinalState(MWBlocks.CORRODED_CUT_TIN_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_CUT_TIN_SLAB.get()) {
            event.setFinalState(MWBlocks.TARNISHED_CUT_TIN_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN_SLAB.get()) {
            event.setFinalState(MWBlocks.CUT_TIN_SLAB.get().defaultBlockState());
        }

        // Tin Tiles
        else if (block == MWBlocks.ERODED_TIN_TILES.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_TILES.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_TILES.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_TILES.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_TILES.get()) {
            event.setFinalState(MWBlocks.TIN_TILES.get().defaultBlockState());
        }

        // Tin Tile Stairs
        else if (block == MWBlocks.ERODED_TIN_TILE_STAIRS.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_TILE_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_TILE_STAIRS.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_TILE_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_TILE_STAIRS.get()) {
            event.setFinalState(MWBlocks.TIN_TILE_STAIRS.get().defaultBlockState());
        }

        // Tin Tile Slabs
        else if (block == MWBlocks.ERODED_TIN_TILE_SLAB.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_TILE_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_TILE_SLAB.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_TILE_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_TILE_SLAB.get()) {
            event.setFinalState(MWBlocks.TIN_TILE_SLAB.get().defaultBlockState());
        }

        // Tin Shingles
        else if (block == MWBlocks.ERODED_TIN_SHINGLES.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_SHINGLES.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLES.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_SHINGLES.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLES.get()) {
            event.setFinalState(MWBlocks.TIN_SHINGLES.get().defaultBlockState());
        }

        // Tin Shingle Stairs
        else if (block == MWBlocks.ERODED_TIN_SHINGLE_STAIRS.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get()) {
            event.setFinalState(MWBlocks.TIN_SHINGLE_STAIRS.get().defaultBlockState());
        }

        // Tin Shingle Slabs
        else if (block == MWBlocks.ERODED_TIN_SHINGLE_SLAB.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get()) {
            event.setFinalState(MWBlocks.TIN_SHINGLE_SLAB.get().defaultBlockState());
        }

        // Tin Bars
        else if (block == MWBlocks.ERODED_TIN_BARS.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_BARS.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_BARS.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_BARS.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_BARS.get()) {
            event.setFinalState(MWBlocks.TIN_BARS.get().defaultBlockState());
        }

        // Tin Chains
        else if (block == MWBlocks.ERODED_TIN_CHAIN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_CHAIN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_CHAIN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_CHAIN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_CHAIN.get()) {
            event.setFinalState(MWBlocks.TIN_CHAIN.get().defaultBlockState());
        }

        // Tin Lanterns
        else if (block == MWBlocks.ERODED_TIN_LANTERN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_LANTERN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_LANTERN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_LANTERN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_LANTERN.get()) {
            event.setFinalState(MWBlocks.TIN_LANTERN.get().defaultBlockState());
        }

        // Tin Soul Lanterns
        else if (block == MWBlocks.ERODED_TIN_SOUL_LANTERN.get()) {
            event.setFinalState(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get().defaultBlockState());
        } else if (block == MWBlocks.CORRODED_TIN_SOUL_LANTERN.get()) {
            event.setFinalState(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get().defaultBlockState());
        } else if (block == MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get()) {
            event.setFinalState(MWBlocks.TIN_SOUL_LANTERN.get().defaultBlockState());
        }
    }
}
