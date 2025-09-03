package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.block.state.properties.Property;
import java.util.Optional;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ToolnteractionsEvent {

    @SubscribeEvent
    public static void onToolUse(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() != ToolActions.AXE_SCRAPE) return;

        BlockState state = event.getState();
        Block block = state.getBlock();

        // Tin Block
        if (block == MWBlocks.ERODED_TIN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN.get());
        } else if (block == MWBlocks.CORRODED_TIN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN.get());
        } else if (block == MWBlocks.TARNISHED_TIN.get()) {
            setWeatheredState(event, MWBlocks.TIN_BLOCK.get());
        }

        // Chiseled Tin
        else if (block == MWBlocks.ERODED_CHISELED_TIN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_CHISELED_TIN.get());
        } else if (block == MWBlocks.CORRODED_CHISELED_TIN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_CHISELED_TIN.get());
        } else if (block == MWBlocks.TARNISHED_CHISELED_TIN.get()) {
            setWeatheredState(event, MWBlocks.CHISELED_TIN.get());
        }

        // Tin Grate
        else if (block == MWBlocks.ERODED_TIN_GRATE.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_GRATE.get());
        } else if (block == MWBlocks.CORRODED_TIN_GRATE.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_GRATE.get());
        } else if (block == MWBlocks.TARNISHED_TIN_GRATE.get()) {
            setWeatheredState(event, MWBlocks.TIN_GRATE.get());
        }

        // Tin Grate Drain
        else if (block == MWBlocks.ERODED_TIN_GRATE_DRAIN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        } else if (block == MWBlocks.CORRODED_TIN_GRATE_DRAIN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        } else if (block == MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get()) {
            setWeatheredState(event, MWBlocks.TIN_GRATE_DRAIN.get());
        }

        // Cut Tin
        else if (block == MWBlocks.ERODED_CUT_TIN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_CUT_TIN.get());
        } else if (block == MWBlocks.CORRODED_CUT_TIN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_CUT_TIN.get());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN.get()) {
            setWeatheredState(event, MWBlocks.CUT_TIN.get());
        }

        // Cut Tin Stairs
        else if (block == MWBlocks.ERODED_CUT_TIN_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_CUT_TIN_STAIRS.get());
        } else if (block == MWBlocks.CORRODED_CUT_TIN_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_CUT_TIN_STAIRS.get());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.CUT_TIN_STAIRS.get());
        }

        // Cut Tin Slabs
        else if (block == MWBlocks.ERODED_CUT_TIN_SLAB.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_CUT_TIN_SLAB.get());
        } else if (block == MWBlocks.CORRODED_CUT_TIN_SLAB.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_CUT_TIN_SLAB.get());
        } else if (block == MWBlocks.TARNISHED_CUT_TIN_SLAB.get()) {
            setWeatheredState(event, MWBlocks.CUT_TIN_SLAB.get());
        }

        // Tin Tiles
        else if (block == MWBlocks.ERODED_TIN_TILES.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_TILES.get());
        } else if (block == MWBlocks.CORRODED_TIN_TILES.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_TILES.get());
        } else if (block == MWBlocks.TARNISHED_TIN_TILES.get()) {
            setWeatheredState(event, MWBlocks.TIN_TILES.get());
        }

        // Tin Tile Stairs
        else if (block == MWBlocks.ERODED_TIN_TILE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_TILE_STAIRS.get());
        } else if (block == MWBlocks.CORRODED_TIN_TILE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_TILE_STAIRS.get());
        } else if (block == MWBlocks.TARNISHED_TIN_TILE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.TIN_TILE_STAIRS.get());
        }

        // Tin Tile Slabs
        else if (block == MWBlocks.ERODED_TIN_TILE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_TILE_SLAB.get());
        } else if (block == MWBlocks.CORRODED_TIN_TILE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_TILE_SLAB.get());
        } else if (block == MWBlocks.TARNISHED_TIN_TILE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.TIN_TILE_SLAB.get());
        }

        // Tin Shingles
        else if (block == MWBlocks.ERODED_TIN_SHINGLES.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_SHINGLES.get());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLES.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_SHINGLES.get());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLES.get()) {
            setWeatheredState(event, MWBlocks.TIN_SHINGLES.get());
        }

        // Tin Shingle Stairs
        else if (block == MWBlocks.ERODED_TIN_SHINGLE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get()) {
            setWeatheredState(event, MWBlocks.TIN_SHINGLE_STAIRS.get());
        }

        // Tin Shingle Slabs
        else if (block == MWBlocks.ERODED_TIN_SHINGLE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get());
        } else if (block == MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());
        } else if (block == MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get()) {
            setWeatheredState(event, MWBlocks.TIN_SHINGLE_SLAB.get());
        }

        // Tin Bars
        else if (block == MWBlocks.ERODED_TIN_BARS.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_BARS.get());
        } else if (block == MWBlocks.CORRODED_TIN_BARS.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_BARS.get());
        } else if (block == MWBlocks.TARNISHED_TIN_BARS.get()) {
            setWeatheredState(event, MWBlocks.TIN_BARS.get());
        }

        // Tin Chains
        else if (block == MWBlocks.ERODED_TIN_CHAIN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_CHAIN.get());
        } else if (block == MWBlocks.CORRODED_TIN_CHAIN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_CHAIN.get());
        } else if (block == MWBlocks.TARNISHED_TIN_CHAIN.get()) {
            setWeatheredState(event, MWBlocks.TIN_CHAIN.get());
        }

        // Tin Lanterns
        else if (block == MWBlocks.ERODED_TIN_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_LANTERN.get());
        } else if (block == MWBlocks.CORRODED_TIN_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_LANTERN.get());
        } else if (block == MWBlocks.TARNISHED_TIN_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.TIN_LANTERN.get());
        }

        // Tin Soul Lanterns
        else if (block == MWBlocks.ERODED_TIN_SOUL_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        } else if (block == MWBlocks.CORRODED_TIN_SOUL_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        } else if (block == MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get()) {
            setWeatheredState(event, MWBlocks.TIN_SOUL_LANTERN.get());
        }
    }

    // This is VERYYY important do not delete \/\/\/\/

    private static BlockState copyProperties(BlockState fromState, BlockState toState) {
        for (Property<?> property : fromState.getProperties()) {
            if (toState.hasProperty(property)) {
                Optional<?> value = fromState.getOptionalValue(property);
                if (value.isPresent()) {
                    toState = setUnchecked(toState, property, value.get());
                }
            }
        }
        return toState;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static <T extends Comparable<T>> BlockState setUnchecked(BlockState state, Property<?> property, Object value) {
        return state.setValue((Property<T>) property, (T) value);
    }

    private static void setWeatheredState(BlockEvent.BlockToolModificationEvent event, Block newBlock) {
        BlockState oldState = event.getState();
        BlockState newState = newBlock.defaultBlockState();
        BlockState copiedState = copyProperties(oldState, newState);
        event.setFinalState(copiedState);
    }
}

