package net.lettuce.metalworks.registry;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class MWWeathering {

    public static final Map<Block, Block> WEATHERING_CHAIN = new HashMap<>();

    public static void registerWeatheringChain() {
        // Base Tin Block
        WEATHERING_CHAIN.put(MWBlocks.TIN_BLOCK.get(), MWBlocks.TARNISHED_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN.get(), MWBlocks.CORRODED_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN.get(), MWBlocks.ERODED_TIN.get());

        // Tin Plates
        WEATHERING_CHAIN.put(MWBlocks.TIN_PLATE.get(), MWBlocks.TARNISHED_TIN_PLATE.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_PLATE.get(), MWBlocks.CORRODED_TIN_PLATE.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_PLATE.get(), MWBlocks.ERODED_TIN_PLATE.get());

        // Chiseled
        WEATHERING_CHAIN.put(MWBlocks.CHISELED_TIN.get(), MWBlocks.TARNISHED_CHISELED_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CHISELED_TIN.get(), MWBlocks.CORRODED_CHISELED_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_CHISELED_TIN.get(), MWBlocks.ERODED_CHISELED_TIN.get());

        // Grates
        WEATHERING_CHAIN.put(MWBlocks.TIN_GRATE.get(), MWBlocks.TARNISHED_TIN_GRATE.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_GRATE.get(), MWBlocks.CORRODED_TIN_GRATE.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_GRATE.get(), MWBlocks.ERODED_TIN_GRATE.get());

        // Grate Drains
        WEATHERING_CHAIN.put(MWBlocks.TIN_GRATE_DRAIN.get(), MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), MWBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get(), MWBlocks.ERODED_TIN_GRATE_DRAIN.get());

        // Cut
        WEATHERING_CHAIN.put(MWBlocks.CUT_TIN.get(), MWBlocks.TARNISHED_CUT_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CUT_TIN.get(), MWBlocks.CORRODED_CUT_TIN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_CUT_TIN.get(), MWBlocks.ERODED_CUT_TIN.get());

        // Cut Stairs
        WEATHERING_CHAIN.put(MWBlocks.CUT_TIN_STAIRS.get(), MWBlocks.TARNISHED_CUT_TIN_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CUT_TIN_STAIRS.get(), MWBlocks.CORRODED_CUT_TIN_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_CUT_TIN_STAIRS.get(), MWBlocks.ERODED_CUT_TIN_STAIRS.get());

        // Cut Slabs
        WEATHERING_CHAIN.put(MWBlocks.CUT_TIN_SLAB.get(), MWBlocks.TARNISHED_CUT_TIN_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CUT_TIN_SLAB.get(), MWBlocks.CORRODED_CUT_TIN_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_CUT_TIN_SLAB.get(), MWBlocks.ERODED_CUT_TIN_SLAB.get());

        // Tiles
        WEATHERING_CHAIN.put(MWBlocks.TIN_TILES.get(), MWBlocks.TARNISHED_TIN_TILES.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_TILES.get(), MWBlocks.CORRODED_TIN_TILES.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_TILES.get(), MWBlocks.ERODED_TIN_TILES.get());

        // Tile Stairs
        WEATHERING_CHAIN.put(MWBlocks.TIN_TILE_STAIRS.get(), MWBlocks.TARNISHED_TIN_TILE_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_TILE_STAIRS.get(), MWBlocks.CORRODED_TIN_TILE_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_TILE_STAIRS.get(), MWBlocks.ERODED_TIN_TILE_STAIRS.get());

        // Tile Slabs
        WEATHERING_CHAIN.put(MWBlocks.TIN_TILE_SLAB.get(), MWBlocks.TARNISHED_TIN_TILE_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_TILE_SLAB.get(), MWBlocks.CORRODED_TIN_TILE_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_TILE_SLAB.get(), MWBlocks.ERODED_TIN_TILE_SLAB.get());

        // Shingles
        WEATHERING_CHAIN.put(MWBlocks.TIN_SHINGLES.get(), MWBlocks.TARNISHED_TIN_SHINGLES.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SHINGLES.get(), MWBlocks.CORRODED_TIN_SHINGLES.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SHINGLES.get(), MWBlocks.ERODED_TIN_SHINGLES.get());

        // Shingle Stairs
        WEATHERING_CHAIN.put(MWBlocks.TIN_SHINGLE_STAIRS.get(), MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(), MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get(), MWBlocks.ERODED_TIN_SHINGLE_STAIRS.get());

        // Shingle Slabs
        WEATHERING_CHAIN.put(MWBlocks.TIN_SHINGLE_SLAB.get(), MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(), MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get(), MWBlocks.ERODED_TIN_SHINGLE_SLAB.get());

        // Tin Bars
        WEATHERING_CHAIN.put(MWBlocks.TIN_BARS.get(), MWBlocks.TARNISHED_TIN_BARS.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_BARS.get(), MWBlocks.CORRODED_TIN_BARS.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_BARS.get(), MWBlocks.ERODED_TIN_BARS.get());

        //Tin Chains
        WEATHERING_CHAIN.put(MWBlocks.TIN_CHAIN.get(), MWBlocks.TARNISHED_TIN_CHAIN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_CHAIN.get(), MWBlocks.CORRODED_TIN_CHAIN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_CHAIN.get(), MWBlocks.ERODED_TIN_CHAIN.get());

        // Tin Lanterns
        WEATHERING_CHAIN.put(MWBlocks.TIN_LANTERN.get(), MWBlocks.TARNISHED_TIN_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_LANTERN.get(), MWBlocks.CORRODED_TIN_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_LANTERN.get(), MWBlocks.ERODED_TIN_LANTERN.get());

        // Tin Soul Lanterns
        WEATHERING_CHAIN.put(MWBlocks.TIN_SOUL_LANTERN.get(), MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), MWBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get(), MWBlocks.ERODED_TIN_SOUL_LANTERN.get());

        // Tin Mage Lanterns
        WEATHERING_CHAIN.put(MWBlocks.TIN_MAGE_LANTERN.get(), MWBlocks.TARNISHED_TIN_MAGE_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_MAGE_LANTERN.get(), MWBlocks.CORRODED_TIN_MAGE_LANTERN.get());
        WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_MAGE_LANTERN.get(), MWBlocks.ERODED_TIN_MAGE_LANTERN.get());
    }

    public static Block getNext(Block block) {
        return WEATHERING_CHAIN.get(block);
    }
}


