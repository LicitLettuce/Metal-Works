package net.lettuce.metalworks.client.events.tin;
import net.lettuce.metalworks.registry.ModBlocks;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class TarnishingChain {

    public static final Map<Block, Block> TARNISHING_CHAIN = new HashMap<>();

    public static void registerWeatheringChain() {
        // Base Tin Block
        TARNISHING_CHAIN.put(ModBlocks.TIN_BLOCK.get(), ModBlocks.TARNISHED_TIN.get());

        // Chiseled Tin
        TARNISHING_CHAIN.put(ModBlocks.CHISELED_TIN.get(), ModBlocks.TARNISHED_CHISELED_TIN.get());

        // Grates
        TARNISHING_CHAIN.put(ModBlocks.TIN_GRATE.get(), ModBlocks.TARNISHED_TIN_GRATE.get());

        // Grate Drains
        TARNISHING_CHAIN.put(ModBlocks.TIN_GRATE_DRAIN.get(), ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get());

        // Cut
        TARNISHING_CHAIN.put(ModBlocks.CUT_TIN.get(), ModBlocks.TARNISHED_CUT_TIN.get());

        // Cut Stairs
        TARNISHING_CHAIN.put(ModBlocks.CUT_TIN_STAIRS.get(), ModBlocks.TARNISHED_CUT_TIN_STAIRS.get());

        // Cut Slabs
        TARNISHING_CHAIN.put(ModBlocks.CUT_TIN_SLAB.get(), ModBlocks.TARNISHED_CUT_TIN_SLAB.get());

        // Tiles
        TARNISHING_CHAIN.put(ModBlocks.TIN_TILES.get(), ModBlocks.TARNISHED_TIN_TILES.get());

        // Tile Stairs
        TARNISHING_CHAIN.put(ModBlocks.TIN_TILE_STAIRS.get(), ModBlocks.TARNISHED_TIN_TILE_STAIRS.get());

        // Tile Slabs
        TARNISHING_CHAIN.put(ModBlocks.TIN_TILE_SLAB.get(), ModBlocks.TARNISHED_TIN_TILE_SLAB.get());

        // Shingles
        TARNISHING_CHAIN.put(ModBlocks.TIN_SHINGLES.get(), ModBlocks.TARNISHED_TIN_SHINGLES.get());

        // Shingle Stairs
        TARNISHING_CHAIN.put(ModBlocks.TIN_SHINGLE_STAIRS.get(), ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());

        // Shingle Slabs
        TARNISHING_CHAIN.put(ModBlocks.TIN_SHINGLE_SLAB.get(), ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());

        // Doors
        TARNISHING_CHAIN.put(ModBlocks.TIN_DOOR.get(), ModBlocks.TARNISHED_TIN_DOOR.get());

        // Trapdoors
        TARNISHING_CHAIN.put(ModBlocks.TIN_TRAPDOOR.get(), ModBlocks.TARNISHED_TIN_TRAPDOOR.get());

        // Tin Bars
        TARNISHING_CHAIN.put(ModBlocks.TIN_BARS.get(), ModBlocks.TARNISHED_TIN_BARS.get());

        //Tin Chains
        TARNISHING_CHAIN.put(ModBlocks.TIN_CHAIN.get(), ModBlocks.TARNISHED_TIN_CHAIN.get());

        // Tin Lanterns
        TARNISHING_CHAIN.put(ModBlocks.TIN_LANTERN.get(), ModBlocks.TARNISHED_TIN_LANTERN.get());

        // Tin Soul Lanterns
        TARNISHING_CHAIN.put(ModBlocks.TIN_SOUL_LANTERN.get(), ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
    }

    public static Block getNext(Block block) {
        return TARNISHING_CHAIN.get(block);
    }
}


