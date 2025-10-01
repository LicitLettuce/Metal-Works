package net.lettuce.metalworks.client.events.tin;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class WeatheringChain {

    public static final Map<Block, Block> WEATHERING_CHAIN = new HashMap<>();

    public static void registerWeatheringChain() {
        // Base Tin Block
        WEATHERING_CHAIN.put(ModBlocks.TIN_BLOCK.get(), ModBlocks.TARNISHED_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN.get(), ModBlocks.CORRODED_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN.get(), ModBlocks.ERODED_TIN.get());

        // Chiseled
        WEATHERING_CHAIN.put(ModBlocks.CHISELED_TIN.get(), ModBlocks.TARNISHED_CHISELED_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_CHISELED_TIN.get(), ModBlocks.CORRODED_CHISELED_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_CHISELED_TIN.get(), ModBlocks.ERODED_CHISELED_TIN.get());

        // Grates
        WEATHERING_CHAIN.put(ModBlocks.TIN_GRATE.get(), ModBlocks.TARNISHED_TIN_GRATE.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_GRATE.get(), ModBlocks.CORRODED_TIN_GRATE.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_GRATE.get(), ModBlocks.ERODED_TIN_GRATE.get());

        // Grate Drains
        WEATHERING_CHAIN.put(ModBlocks.TIN_GRATE_DRAIN.get(), ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), ModBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_GRATE_DRAIN.get(), ModBlocks.ERODED_TIN_GRATE_DRAIN.get());

        // Cut
        WEATHERING_CHAIN.put(ModBlocks.CUT_TIN.get(), ModBlocks.TARNISHED_CUT_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_CUT_TIN.get(), ModBlocks.CORRODED_CUT_TIN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_CUT_TIN.get(), ModBlocks.ERODED_CUT_TIN.get());

        // Cut Stairs
        WEATHERING_CHAIN.put(ModBlocks.CUT_TIN_STAIRS.get(), ModBlocks.TARNISHED_CUT_TIN_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(), ModBlocks.CORRODED_CUT_TIN_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_CUT_TIN_STAIRS.get(), ModBlocks.ERODED_CUT_TIN_STAIRS.get());

        // Cut Slabs
        WEATHERING_CHAIN.put(ModBlocks.CUT_TIN_SLAB.get(), ModBlocks.TARNISHED_CUT_TIN_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_CUT_TIN_SLAB.get(), ModBlocks.CORRODED_CUT_TIN_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_CUT_TIN_SLAB.get(), ModBlocks.ERODED_CUT_TIN_SLAB.get());

        // Tiles
        WEATHERING_CHAIN.put(ModBlocks.TIN_TILES.get(), ModBlocks.TARNISHED_TIN_TILES.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_TILES.get(), ModBlocks.CORRODED_TIN_TILES.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_TILES.get(), ModBlocks.ERODED_TIN_TILES.get());

        // Tile Stairs
        WEATHERING_CHAIN.put(ModBlocks.TIN_TILE_STAIRS.get(), ModBlocks.TARNISHED_TIN_TILE_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(), ModBlocks.CORRODED_TIN_TILE_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_TILE_STAIRS.get(), ModBlocks.ERODED_TIN_TILE_STAIRS.get());

        // Tile Slabs
        WEATHERING_CHAIN.put(ModBlocks.TIN_TILE_SLAB.get(), ModBlocks.TARNISHED_TIN_TILE_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_TILE_SLAB.get(), ModBlocks.CORRODED_TIN_TILE_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_TILE_SLAB.get(), ModBlocks.ERODED_TIN_TILE_SLAB.get());

        // Shingles
        WEATHERING_CHAIN.put(ModBlocks.TIN_SHINGLES.get(), ModBlocks.TARNISHED_TIN_SHINGLES.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_SHINGLES.get(), ModBlocks.CORRODED_TIN_SHINGLES.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_SHINGLES.get(), ModBlocks.ERODED_TIN_SHINGLES.get());

        // Shingle Stairs
        WEATHERING_CHAIN.put(ModBlocks.TIN_SHINGLE_STAIRS.get(), ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(), ModBlocks.CORRODED_TIN_SHINGLE_STAIRS.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_SHINGLE_STAIRS.get(), ModBlocks.ERODED_TIN_SHINGLE_STAIRS.get());

        // Shingle Slabs
        WEATHERING_CHAIN.put(ModBlocks.TIN_SHINGLE_SLAB.get(), ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(), ModBlocks.CORRODED_TIN_SHINGLE_SLAB.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_SHINGLE_SLAB.get(), ModBlocks.ERODED_TIN_SHINGLE_SLAB.get());

        // Tin Bars
        WEATHERING_CHAIN.put(ModBlocks.TIN_BARS.get(), ModBlocks.TARNISHED_TIN_BARS.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_BARS.get(), ModBlocks.CORRODED_TIN_BARS.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_BARS.get(), ModBlocks.ERODED_TIN_BARS.get());

        //Tin Chains
        WEATHERING_CHAIN.put(ModBlocks.TIN_CHAIN.get(), ModBlocks.TARNISHED_TIN_CHAIN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_CHAIN.get(), ModBlocks.CORRODED_TIN_CHAIN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_CHAIN.get(), ModBlocks.ERODED_TIN_CHAIN.get());

        // Tin Lanterns
        WEATHERING_CHAIN.put(ModBlocks.TIN_LANTERN.get(), ModBlocks.TARNISHED_TIN_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_LANTERN.get(), ModBlocks.CORRODED_TIN_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_LANTERN.get(), ModBlocks.ERODED_TIN_LANTERN.get());

        // Tin Soul Lanterns
        WEATHERING_CHAIN.put(ModBlocks.TIN_SOUL_LANTERN.get(), ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), ModBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_SOUL_LANTERN.get(), ModBlocks.ERODED_TIN_SOUL_LANTERN.get());

        // Tin Mage Lanterns
        WEATHERING_CHAIN.put(ModBlocks.TIN_MAGE_LANTERN.get(), ModBlocks.TARNISHED_TIN_MAGE_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.TARNISHED_TIN_MAGE_LANTERN.get(), ModBlocks.CORRODED_TIN_MAGE_LANTERN.get());
        WEATHERING_CHAIN.put(ModBlocks.CORRODED_TIN_MAGE_LANTERN.get(), ModBlocks.ERODED_TIN_MAGE_LANTERN.get());
    }

    public static Block getNext(Block block) {
        return WEATHERING_CHAIN.get(block);
    }
}


