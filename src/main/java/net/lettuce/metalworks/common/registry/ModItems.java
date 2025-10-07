package net.lettuce.metalworks.common.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalWorks.MOD_ID);

        // Casserite Items
    public static final RegistryObject<BlockItem> CASSITERITE = ITEMS.register("cassiterite", () -> new BlockItem
            (ModBlocks.CASSITERITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_STAIRS = ITEMS.register("cassiterite_stairs", () -> new BlockItem
            (ModBlocks.CASSITERITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_SLAB = ITEMS.register("cassiterite_slab", () -> new BlockItem
            (ModBlocks.CASSITERITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_WALL = ITEMS.register("cassiterite_wall", () -> new BlockItem
            (ModBlocks.CASSITERITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE = ITEMS.register("polished_cassiterite", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE_STAIRS = ITEMS.register("polished_cassiterite_stairs", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE_SLAB = ITEMS.register("polished_cassiterite_slab", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE_SLAB.get(), new Item.Properties()));

        // Natural Tin Items
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem
            (ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem
            (ModBlocks.TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem
            (ModBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> NETHER_TIN_ORE = ITEMS.register("nether_tin_ore", () -> new BlockItem
            (ModBlocks.NETHER_TIN_ORE.get(), new Item.Properties()));

        // Tin Blocks Items
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem
            (ModBlocks.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN = ITEMS.register("tarnished_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN = ITEMS.register("corroded_tin", () -> new BlockItem
            (ModBlocks.CORRODED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN = ITEMS.register("eroded_tin", () -> new BlockItem
            (ModBlocks.ERODED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_BLOCK = ITEMS.register("waxed_tin_block", () -> new BlockItem
            (ModBlocks.WAXED_TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN = ITEMS.register("waxed_tarnished_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN = ITEMS.register("waxed_corroded_tin", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN = ITEMS.register("waxed_eroded_tin", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN.get(), new Item.Properties()));

        // Chiseled Tin Items
    public static final RegistryObject<BlockItem> CHISELED_TIN = ITEMS.register("chiseled_tin", () -> new BlockItem
            (ModBlocks.CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CHISELED_TIN= ITEMS.register("tarnished_chiseled_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CHISELED_TIN = ITEMS.register("corroded_chiseled_tin", () -> new BlockItem
            (ModBlocks.CORRODED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CHISELED_TIN = ITEMS.register("eroded_chiseled_tin", () -> new BlockItem
            (ModBlocks.ERODED_CHISELED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CHISELED_TIN = ITEMS.register("waxed_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CHISELED_TIN = ITEMS.register("waxed_tarnished_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CHISELED_TIN = ITEMS.register("waxed_corroded_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CHISELED_TIN = ITEMS.register("waxed_eroded_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_CHISELED_TIN.get(), new Item.Properties()));

        // Tin Grate Items
    public static final RegistryObject<BlockItem> TIN_GRATE = ITEMS.register("tin_grate", () -> new BlockItem
            (ModBlocks.TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE = ITEMS.register("tarnished_tin_grate", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_GRATE = ITEMS.register("corroded_tin_grate", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_GRATE = ITEMS.register("eroded_tin_grate", () -> new BlockItem
            (ModBlocks.ERODED_TIN_GRATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE = ITEMS.register("waxed_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE = ITEMS.register("waxed_tarnished_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_GRATE = ITEMS.register("waxed_corroded_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_GRATE = ITEMS.register("waxed_eroded_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_GRATE.get(), new Item.Properties()));

        // Tin Grate Drain Items
    public static final RegistryObject<BlockItem> TIN_GRATE_DRAIN = ITEMS.register("tin_grate_drain", () -> new BlockItem
            (ModBlocks.TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("tarnished_tin_grate_drain", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_GRATE_DRAIN = ITEMS.register("corroded_tin_grate_drain", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_GRATE_DRAIN = ITEMS.register("eroded_tin_grate_drain", () -> new BlockItem
            (ModBlocks.ERODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tarnished_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_GRATE_DRAIN = ITEMS.register("waxed_corroded_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_GRATE_DRAIN = ITEMS.register("waxed_eroded_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

        // Cut Tin Items
    public static final RegistryObject<BlockItem> CUT_TIN = ITEMS.register("cut_tin", () -> new BlockItem
            (ModBlocks.CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN= ITEMS.register("tarnished_cut_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CUT_TIN = ITEMS.register("corroded_cut_tin", () -> new BlockItem
            (ModBlocks.CORRODED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CUT_TIN = ITEMS.register("eroded_cut_tin", () -> new BlockItem
            (ModBlocks.ERODED_CUT_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN = ITEMS.register("waxed_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN = ITEMS.register("waxed_tarnished_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CUT_TIN = ITEMS.register("waxed_corroded_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CUT_TIN = ITEMS.register("waxed_eroded_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_CUT_TIN.get(), new Item.Properties()));

        // Cut Tin Stair Items
    public static final RegistryObject<BlockItem> CUT_TIN_STAIRS = ITEMS.register("cut_tin_stairs", () -> new BlockItem
            (ModBlocks.CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN_STAIRS = ITEMS.register("tarnished_cut_tin_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CUT_TIN_STAIRS = ITEMS.register("corroded_cut_tin_stairs", () -> new BlockItem
            (ModBlocks.CORRODED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CUT_TIN_STAIRS = ITEMS.register("eroded_cut_tin_stairs", () -> new BlockItem
            (ModBlocks.ERODED_CUT_TIN_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN_STAIRS = ITEMS.register("waxed_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN_STAIRS = ITEMS.register("waxed_tarnished_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CUT_TIN_STAIRS = ITEMS.register("waxed_corroded_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_CORRODED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CUT_TIN_STAIRS = ITEMS.register("waxed_eroded_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_ERODED_CUT_TIN_STAIRS.get(), new Item.Properties()));

        // Cut Tin Slab Items
    public static final RegistryObject<BlockItem> CUT_TIN_SLAB = ITEMS.register("cut_tin_slab", () -> new BlockItem
            (ModBlocks.CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN_SLAB = ITEMS.register("tarnished_cut_tin_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CUT_TIN_SLAB = ITEMS.register("corroded_cut_tin_slab", () -> new BlockItem
            (ModBlocks.CORRODED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CUT_TIN_SLAB = ITEMS.register("eroded_cut_tin_slab", () -> new BlockItem
            (ModBlocks.ERODED_CUT_TIN_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN_SLAB = ITEMS.register("waxed_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN_SLAB = ITEMS.register("waxed_tarnished_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CUT_TIN_SLAB = ITEMS.register("waxed_corroded_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CUT_TIN_SLAB = ITEMS.register("waxed_eroded_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_CUT_TIN_SLAB.get(), new Item.Properties()));

        // Tin Tile Items
    public static final RegistryObject<BlockItem> TIN_TILES = ITEMS.register("tin_tiles", () -> new BlockItem
            (ModBlocks.TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILES= ITEMS.register("tarnished_tin_tiles", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_TILES = ITEMS.register("corroded_tin_tiles", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_TILES = ITEMS.register("eroded_tin_tiles", () -> new BlockItem
            (ModBlocks.ERODED_TIN_TILES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TILES = ITEMS.register("waxed_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILES = ITEMS.register("waxed_tarnished_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_TILES = ITEMS.register("waxed_corroded_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_TILES = ITEMS.register("waxed_eroded_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_TILES.get(), new Item.Properties()));

        // Tin Tile Stair Items
    public static final RegistryObject<BlockItem> TIN_TILE_STAIRS = ITEMS.register("tin_tile_stairs", () -> new BlockItem
            (ModBlocks.TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILE_STAIRS = ITEMS.register("tarnished_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_TILE_STAIRS = ITEMS.register("corroded_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_TILE_STAIRS = ITEMS.register("eroded_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.ERODED_TIN_TILE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TILE_STAIRS = ITEMS.register("waxed_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILE_STAIRS = ITEMS.register("waxed_tarnished_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_TILE_STAIRS = ITEMS.register("waxed_corroded_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_TILE_STAIRS = ITEMS.register("waxed_eroded_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_TILE_STAIRS.get(), new Item.Properties()));

        // Tin Tile Slab Items
    public static final RegistryObject<BlockItem> TIN_TILE_SLAB = ITEMS.register("tin_tile_slab", () -> new BlockItem
            (ModBlocks.TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILE_SLAB = ITEMS.register("tarnished_tin_tile_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_TILE_SLAB = ITEMS.register("corroded_tin_tile_slab", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_TILE_SLAB = ITEMS.register("eroded_tin_tile_slab", () -> new BlockItem
            (ModBlocks.ERODED_TIN_TILE_SLAB.get(), new Item.Properties()));


    public static final RegistryObject<BlockItem> WAXED_TIN_TILE_SLAB = ITEMS.register("waxed_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILE_SLAB = ITEMS.register("waxed_tarnished_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_TILE_SLAB = ITEMS.register("waxed_corroded_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_TILE_SLAB = ITEMS.register("waxed_eroded_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_TILE_SLAB.get(), new Item.Properties()));

        // Tin Shingle Items
    public static final RegistryObject<BlockItem> TIN_SHINGLES = ITEMS.register("tin_shingles", () -> new BlockItem
            (ModBlocks.TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLES= ITEMS.register("tarnished_tin_shingles", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SHINGLES = ITEMS.register("corroded_tin_shingles", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SHINGLES = ITEMS.register("eroded_tin_shingles", () -> new BlockItem
            (ModBlocks.ERODED_TIN_SHINGLES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLES = ITEMS.register("waxed_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLES = ITEMS.register("waxed_tarnished_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SHINGLES = ITEMS.register("waxed_corroded_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SHINGLES = ITEMS.register("waxed_eroded_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_SHINGLES.get(), new Item.Properties()));

        // Tin Shingle Stair Items
    public static final RegistryObject<BlockItem> TIN_SHINGLE_STAIRS = ITEMS.register("tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLE_STAIRS = ITEMS.register("tarnished_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SHINGLE_STAIRS = ITEMS.register("corroded_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SHINGLE_STAIRS = ITEMS.register("eroded_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.ERODED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_tarnished_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_corroded_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_eroded_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));

        // Tin Shingle Slab Items
    public static final RegistryObject<BlockItem> TIN_SHINGLE_SLAB = ITEMS.register("tin_shingle_slab", () -> new BlockItem
            (ModBlocks.TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLE_SLAB = ITEMS.register("tarnished_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SHINGLE_SLAB = ITEMS.register("corroded_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SHINGLE_SLAB = ITEMS.register("eroded_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.ERODED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_tarnished_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_corroded_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_eroded_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));

        // Tin Door Items
    public static final RegistryObject<BlockItem> TIN_DOOR = ITEMS.register("tin_door", () -> new BlockItem
            (ModBlocks.TIN_DOOR.get(), new Item.Properties()));

        // Tin Trapdoor Items
    public static final RegistryObject<BlockItem> TIN_TRAPDOOR = ITEMS.register("tin_trapdoor", () -> new BlockItem
            (ModBlocks.TIN_TRAPDOOR.get(), new Item.Properties()));

        // Tin Bar Items
    public static final RegistryObject<BlockItem> TIN_BARS = ITEMS.register("tin_bars", () -> new BlockItem
            (ModBlocks.TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_BARS = ITEMS.register("tarnished_tin_bars", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_BARS = ITEMS.register("corroded_tin_bars", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_BARS = ITEMS.register("eroded_tin_bars", () -> new BlockItem
            (ModBlocks.ERODED_TIN_BARS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_BARS = ITEMS.register("waxed_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_BARS = ITEMS.register("waxed_tarnished_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_BARS = ITEMS.register("waxed_corroded_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_BARS = ITEMS.register("waxed_eroded_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_BARS.get(), new Item.Properties()));

        // Tin Chain Items
    public static final RegistryObject<BlockItem> TIN_CHAIN = ITEMS.register("tin_chain", () -> new BlockItem
            (ModBlocks.TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_CHAIN = ITEMS.register("tarnished_tin_chain", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_CHAIN = ITEMS.register("corroded_tin_chain", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_CHAIN = ITEMS.register("eroded_tin_chain", () -> new BlockItem
            (ModBlocks.ERODED_TIN_CHAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_CHAIN = ITEMS.register("waxed_tin_chain", () -> new BlockItem
            (ModBlocks.WAXED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_CHAIN = ITEMS.register("waxed_tarnished_tin_chain", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_CHAIN = ITEMS.register("waxed_corroded_in_chain", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_CHAIN = ITEMS.register("waxed_eroded_tin_chain", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_CHAIN.get(), new Item.Properties()));

        // Tin Lantern Items
    public static final RegistryObject<BlockItem> TIN_LANTERN = ITEMS.register("tin_lantern", () -> new BlockItem
            (ModBlocks.TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_LANTERN = ITEMS.register("tarnished_tin_lantern", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_LANTERN = ITEMS.register("corroded_tin_lantern", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_LANTERN = ITEMS.register("eroded_tin_lantern", () -> new BlockItem
            (ModBlocks.ERODED_TIN_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_LANTERN = ITEMS.register("waxed_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_LANTERN = ITEMS.register("waxed_tarnished_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_LANTERN = ITEMS.register("waxed_corroded_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_LANTERN = ITEMS.register("waxed_eroded_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_LANTERN.get(), new Item.Properties()));

        // Tin Soul Lantern Items
    public static final RegistryObject<BlockItem> TIN_SOUL_LANTERN = ITEMS.register("tin_soul_lantern", () -> new BlockItem
            (ModBlocks.TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("tarnished_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SOUL_LANTERN = ITEMS.register("corroded_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SOUL_LANTERN = ITEMS.register("eroded_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.ERODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tarnished_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SOUL_LANTERN = ITEMS.register("waxed_corroded_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SOUL_LANTERN = ITEMS.register("waxed_eroded_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));

        // Tin Mage Lantern Items
    public static final RegistryObject<BlockItem> TIN_MAGE_LANTERN = ITEMS.register("tin_mage_lantern", () -> new BlockItem
            (ModBlocks.TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_MAGE_LANTERN = ITEMS.register("tarnished_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_MAGE_LANTERN = ITEMS.register("corroded_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.CORRODED_TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_MAGE_LANTERN = ITEMS.register("eroded_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.ERODED_TIN_MAGE_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_MAGE_LANTERN = ITEMS.register("waxed_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_MAGE_LANTERN = ITEMS.register("waxed_tarnished_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_MAGE_LANTERN = ITEMS.register("waxed_corroded_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_MAGE_LANTERN = ITEMS.register("waxed_eroded_tin_mage_lantern", () -> new BlockItem
            (ModBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get(), new Item.Properties()));

        // Tin Ingredients
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item
            (new Item.Properties()));

        // Tin Gear
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem
            (ModToolTiers.TIN, 3 ,-2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem
            (ModToolTiers.TIN, 1, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem
            (ModToolTiers.TIN,  6.5F, -2.7F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem
            (ModToolTiers.TIN,1.5F, -2.6F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem
            (ModToolTiers.TIN, -2, -0.6F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem
            ( 4, "tin", new Item.Properties().stacksTo(1)));

        // Bronze Block Item
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem
            (ModBlocks.BRONZE_BLOCK.get(), new Item.Properties().fireResistant()));

        // Bronze Grate Item
    public static final RegistryObject<BlockItem> BRONZE_GRATE = ITEMS.register("bronze_grate", () -> new BlockItem
            (ModBlocks.BRONZE_GRATE.get(), new Item.Properties().fireResistant()));

        // Bronze Grate Drain Item
    public static final RegistryObject<BlockItem> BRONZE_GRATE_DRAIN = ITEMS.register("bronze_grate_drain", () -> new BlockItem
            (ModBlocks.BRONZE_GRATE_DRAIN.get(), new Item.Properties().fireResistant()));

        // Bronze Tile Items
    public static final RegistryObject<BlockItem> BRONZE_TILES = ITEMS.register("bronze_tiles", () -> new BlockItem
            (ModBlocks.BRONZE_TILES.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_TILE_STAIRS = ITEMS.register("bronze_tile_stairs", () -> new BlockItem
            (ModBlocks.BRONZE_TILE_STAIRS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_TILE_SLAB = ITEMS.register("bronze_tile_slab", () -> new BlockItem
            (ModBlocks.BRONZE_TILE_SLAB.get(), new Item.Properties().fireResistant()));

        // Bronze Shingle Item
    public static final RegistryObject<BlockItem> BRONZE_SHINGLES = ITEMS.register("bronze_shingles", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLES.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_STAIRS = ITEMS.register("bronze_shingle_stairs", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLE_STAIRS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_SLAB = ITEMS.register("bronze_shingle_slab", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLE_SLAB.get(), new Item.Properties().fireResistant()));

        // Bronze Bar Item
    public static final RegistryObject<BlockItem> BRONZE_BARS = ITEMS.register("bronze_bars", () -> new BlockItem
            (ModBlocks.BRONZE_BARS.get(), new Item.Properties().fireResistant()));

        // Bronze Door Item
    public static final RegistryObject<BlockItem> BRONZE_DOOR = ITEMS.register("bronze_door", () -> new BlockItem
            (ModBlocks.BRONZE_DOOR.get(), new Item.Properties().fireResistant()));

        // Bronze Trapdoor Item
    public static final RegistryObject<BlockItem> BRONZE_TRAPDOOR = ITEMS.register("bronze_trapdoor", () -> new BlockItem
            (ModBlocks.BRONZE_TRAPDOOR.get(), new Item.Properties().fireResistant()));

        // Looping Pressure Plate Item
    public static final RegistryObject<BlockItem> LOOPING_PRESSURE_PLATE = ITEMS.register("looping_pressure_plate", () -> new BlockItem
            (ModBlocks.LOOPING_PRESSURE_PLATE.get(), new Item.Properties().fireResistant()));

        // Bronze Ingredients
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item
            (new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item
            (new Item.Properties().fireResistant()));

        // Bronze Gear
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem
            (ModToolTiers.BRONZE,3,-2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem
            (ModToolTiers.BRONZE,1,-2.8F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem
            (ModToolTiers.BRONZE, 6, -3.1F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem
            (ModToolTiers.BRONZE, 1.5F, -3.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem
            (ModToolTiers.BRONZE, -2,-1, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears", () -> new ShearsItem
            (new Item.Properties().stacksTo(1).durability(964).fireResistant()));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem
            ( 9,"bronze", new Item.Properties().stacksTo(1).fireResistant()));

        // Rose Gold Block Item
    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));

        // Rose Lantern Item
    public static final RegistryObject<BlockItem> ROSE_LANTERN = ITEMS.register("rose_lantern", () -> new BlockItem
            (ModBlocks.ROSE_LANTERN.get(), new Item.Properties()));

        // Rose Gold Mosaic Items
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC = ITEMS.register("rose_gold_mosaic", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC_STAIRS = ITEMS.register("rose_gold_mosaic_stairs", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC_SLAB = ITEMS.register("rose_gold_mosaic_slab", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get(), new Item.Properties()));

        // Medium Weighted Pressure Plate Item
    public static final RegistryObject<BlockItem> MEDIUM_WEIGHTED_PRESSURE_PLATE = ITEMS.register("medium_weighted_pressure_plate", () -> new BlockItem
            (ModBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), new Item.Properties()));

        // Mage Fire Items
    public static final RegistryObject<Item> MAGE_TORCH = ITEMS.register("mage_torch", () -> new StandingAndWallBlockItem
            (ModBlocks.MAGE_TORCH.get(), ModBlocks.MAGE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<BlockItem> MAGE_LANTERN = ITEMS.register("mage_lantern", () -> new BlockItem
            (ModBlocks.MAGE_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> MAGE_CAMPFIRE = ITEMS.register("mage_campfire", () -> new BlockItem
            (ModBlocks.MAGE_CAMPFIRE.get(), new Item.Properties()));

        // Rose Gold Ingredients
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> MAGE_POWDER = ITEMS.register("mage_powder", () -> new Item
            (new Item.Properties()));

        // Rose Gold Food Items
    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register("rose_gold_beetroot", () -> new Item
            (new Item.Properties().food(ModFoodProperties.ROSE_GOLD_BEETROOT)));

        // Rose Gold Gear
    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", () -> new SwordItem
            (ModToolTiers.ROSE_GOLD, 3 ,-2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem
            (ModToolTiers.ROSE_GOLD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", () -> new AxeItem
            (ModToolTiers.ROSE_GOLD, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel", () -> new ShovelItem
            (ModToolTiers.ROSE_GOLD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe", () -> new HoeItem
            (ModToolTiers.ROSE_GOLD, -2, -1.0F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor", () -> new HorseArmorItem
            ( 8, "rose_gold", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> MAGE_GOLEM_SPAWN_EGG = ITEMS.register("mage_golem_spawn_egg", () -> new ForgeSpawnEggItem
            (ModEntities.MAGE_GOLEM, 0xf25e63, 0xffcbc8, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
