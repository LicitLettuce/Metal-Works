package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.block.*;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public class MWBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalWorks.MOD_ID);

        // Casserite Blocks
    public static final RegistryObject<Block> CASSITERITE = BLOCKS.register("cassiterite", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.GRANITE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> CASSITERITE_STAIRS = BLOCKS.register("cassiterite_stairs", () -> new StairBlock
            (() -> MWBlocks.CASSITERITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));
    public static final RegistryObject<Block> CASSITERITE_SLAB = BLOCKS.register("cassiterite_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));
    public static final RegistryObject<Block> CASSITERITE_WALL = BLOCKS.register("cassiterite_wall", () -> new WallBlock(
            BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));

    public static final RegistryObject<Block> POLISHED_CASSITERITE = BLOCKS.register("polished_cassiterite", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> POLISHED_CASSITERITE_STAIRS = BLOCKS.register("polished_cassiterite_stairs", () -> new StairBlock
            (() -> MWBlocks.CASSITERITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));
    public static final RegistryObject<Block> POLISHED_CASSITERITE_SLAB = BLOCKS.register("polished_cassiterite_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));

        // Natural Tin Blocks
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final RegistryObject<Block> NETHER_TIN_ORE = BLOCKS.register("nether_tin_ore", () -> new DropExperienceBlock
            (BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

        // Tin Block Blocks
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> TARNISHED_TIN = BLOCKS.register("tarnished_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> CORRODED_TIN = BLOCKS.register("corroded_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> ERODED_TIN = BLOCKS.register("eroded_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));

    public static final RegistryObject<Block> WAXED_TIN_BLOCK = BLOCKS.register("waxed_tin_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN = BLOCKS.register("waxed_tarnished_tin", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN = BLOCKS.register("waxed_corroded_tin", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN = BLOCKS.register("waxed_eroded_tin", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

    // Tin Plate Blocks
    public static final RegistryObject<Block> TIN_PLATE = BLOCKS.register("tin_plate", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> TARNISHED_TIN_PLATE = BLOCKS.register("tarnished_tin_plate", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> CORRODED_TIN_PLATE = BLOCKS.register("corroded_tin_plate", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final RegistryObject<Block> ERODED_TIN_PLATE = BLOCKS.register("eroded_tin_plate", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(3.0F)));

    public static final RegistryObject<Block> WAXED_TIN_PLATE = BLOCKS.register("waxed_tin_plate", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_PLATE = BLOCKS.register("waxed_tarnished_tin_plate", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_PLATE = BLOCKS.register("waxed_corroded_tin_plate", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_PLATE = BLOCKS.register("waxed_eroded_tin_plate", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));

        // Chiseled Tin
    public static final RegistryObject<Block> CHISELED_TIN = BLOCKS.register("chiseled_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> TARNISHED_CHISELED_TIN = BLOCKS.register("tarnished_chiseled_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> CORRODED_CHISELED_TIN = BLOCKS.register("corroded_chiseled_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> ERODED_CHISELED_TIN = BLOCKS.register("eroded_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<Block> WAXED_CHISELED_TIN = BLOCKS.register("waxed_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_TARNISHED_CHISELED_TIN = BLOCKS.register("waxed_tarnished_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_CORRODED_CHISELED_TIN = BLOCKS.register("waxed_corroded_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_ERODED_CHISELED_TIN = BLOCKS.register("waxed_eroded_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

        // Tin Grate
    public static final RegistryObject<Block> TIN_GRATE = BLOCKS.register("tin_grate", () -> new WeatheringGrateBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> TARNISHED_TIN_GRATE = BLOCKS.register("tarnished_tin_grate", () -> new WeatheringGrateBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> CORRODED_TIN_GRATE = BLOCKS.register("corroded_tin_grate", () -> new WeatheringGrateBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> ERODED_TIN_GRATE = BLOCKS.register("eroded_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> WAXED_TIN_GRATE = BLOCKS.register("waxed_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_GRATE = BLOCKS.register("waxed_tarnished_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_GRATE = BLOCKS.register("waxed_corroded_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_GRATE = BLOCKS.register("waxed_eroded_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.PURPLE)));

        // Tin Grate Drain
    public static final RegistryObject<Block> TIN_GRATE_DRAIN = BLOCKS.register("tin_grate_drain", () -> new WeatheringGrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> TARNISHED_TIN_GRATE_DRAIN = BLOCKS.register("tarnished_tin_grate_drain", () -> new WeatheringGrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> CORRODED_TIN_GRATE_DRAIN = BLOCKS.register("corroded_tin_grate_drain", () -> new WeatheringGrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> ERODED_TIN_GRATE_DRAIN = BLOCKS.register("eroded_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> WAXED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_tarnished_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_corroded_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_eroded_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.PURPLE)));

        // Cut Tin
    public static final RegistryObject<Block> CUT_TIN = BLOCKS.register("cut_tin", () -> new WeatheringTinBlock
                (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> TARNISHED_CUT_TIN = BLOCKS.register("tarnished_cut_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_CUT_TIN = BLOCKS.register("corroded_cut_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_CUT_TIN = BLOCKS.register("eroded_cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

    public static final RegistryObject<Block> WAXED_CUT_TIN = BLOCKS.register("waxed_cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_CUT_TIN = BLOCKS.register("waxed_tarnished_cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_CUT_TIN = BLOCKS.register("waxed_corroded_cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_CUT_TIN = BLOCKS.register("waxed_eroded_cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Cut Tin Stairs
    public static final RegistryObject<Block> CUT_TIN_STAIRS = BLOCKS.register("cut_tin_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.CUT_TIN_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_CUT_TIN_STAIRS = BLOCKS.register("tarnished_cut_tin_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.TARNISHED_CUT_TIN_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_CUT_TIN_STAIRS = BLOCKS.register("corroded_cut_tin_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.CORRODED_CUT_TIN_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_CUT_TIN_STAIRS = BLOCKS.register("eroded_cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

    public static final RegistryObject<Block> WAXED_CUT_TIN_STAIRS = BLOCKS.register("waxed_cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_CUT_TIN_STAIRS = BLOCKS.register("waxed_tarnished_cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_CUT_TIN_STAIRS = BLOCKS.register("waxed_corroded_cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_CUT_TIN_STAIRS = BLOCKS.register("waxed_eroded_cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Cut Tin Slabs
    public static final RegistryObject<Block> CUT_TIN_SLAB = BLOCKS.register("cut_tin_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.CUT_TIN_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_CUT_TIN_SLAB = BLOCKS.register("tarnished_cut_tin_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.TARNISHED_CUT_TIN_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_CUT_TIN_SLAB = BLOCKS.register("corroded_cut_tin_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.CORRODED_CUT_TIN_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_CUT_TIN_SLAB = BLOCKS.register("eroded_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy((MWBlocks.CUT_TIN.get()))));

    public static final RegistryObject<Block> WAXED_CUT_TIN_SLAB = BLOCKS.register("waxed_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_CUT_TIN_SLAB = BLOCKS.register("waxed_tarnished_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_CUT_TIN_SLAB = BLOCKS.register("waxed_corroded_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_CUT_TIN_SLAB = BLOCKS.register("waxed_eroded_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Tin Tiles
    public static final RegistryObject<Block> TIN_TILES = BLOCKS.register("tin_tiles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> TARNISHED_TIN_TILES = BLOCKS.register("tarnished_tin_tiles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> CORRODED_TIN_TILES = BLOCKS.register("corroded_tin_tiles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> ERODED_TIN_TILES = BLOCKS.register("eroded_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<Block> WAXED_TIN_TILES = BLOCKS.register("waxed_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_TILES = BLOCKS.register("waxed_tarnished_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_TILES = BLOCKS.register("waxed_corroded_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_TILES = BLOCKS.register("waxed_eroded_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

        // Tin Tiles Stairs
    public static final RegistryObject<Block> TIN_TILE_STAIRS = BLOCKS.register("tin_tile_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.TIN_TILE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_TIN_TILE_STAIRS = BLOCKS.register("tarnished_tin_tile_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.TARNISHED_TIN_TILE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_TILE_STAIRS = BLOCKS.register("corroded_tin_tile_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.CORRODED_TIN_TILE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_TIN_TILE_STAIRS = BLOCKS.register("eroded_tin_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

    public static final RegistryObject<Block> WAXED_TIN_TILE_STAIRS = BLOCKS.register("waxed_tin_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_TILE_STAIRS = BLOCKS.register("waxed_tarnished_tin_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_TILE_STAIRS = BLOCKS.register("waxed_corroded_tin_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_TILE_STAIRS = BLOCKS.register("waxed_eroded_tin_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Tin Tile Slabs
    public static final RegistryObject<Block> TIN_TILE_SLAB = BLOCKS.register("tin_tile_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.CUT_TIN_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_TIN_TILE_SLAB = BLOCKS.register("tarnished_tin_tile_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.TARNISHED_TIN_TILE_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_TILE_SLAB = BLOCKS.register("corroded_tin_tile_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.CORRODED_CUT_TIN_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_TIN_TILE_SLAB = BLOCKS.register("eroded_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy((MWBlocks.CUT_TIN.get()))));

    public static final RegistryObject<Block> WAXED_TIN_TILE_SLAB = BLOCKS.register("waxed_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_TILE_SLAB = BLOCKS.register("waxed_tarnished_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_TILE_SLAB = BLOCKS.register("waxed_corroded_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_TILE_SLAB = BLOCKS.register("waxed_eroded_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Tin Shingles
    public static final RegistryObject<Block> TIN_SHINGLES = BLOCKS.register("tin_shingles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> TARNISHED_TIN_SHINGLES = BLOCKS.register("tarnished_tin_shingles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> CORRODED_TIN_SHINGLES = BLOCKS.register("corroded_tin_shingles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> ERODED_TIN_SHINGLES = BLOCKS.register("eroded_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<Block> WAXED_TIN_SHINGLES = BLOCKS.register("waxed_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_SHINGLES = BLOCKS.register("waxed_tarnished_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_SHINGLES = BLOCKS.register("waxed_corroded_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_SHINGLES = BLOCKS.register("waxed_eroded_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

        // Tin Shingle Stairs
    public static final RegistryObject<Block> TIN_SHINGLE_STAIRS = BLOCKS.register("tin_shingle_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.TIN_SHINGLE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_TIN_SHINGLE_STAIRS = BLOCKS.register("tarnished_tin_shingle_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_SHINGLE_STAIRS = BLOCKS.register("corroded_tin_shingle_stairs", () -> new WeatheringTinStairBlock
            (MWBlocks.CUT_TIN.get().defaultBlockState(), MWBlocks.CORRODED_TIN_SHINGLE_STAIRS::get, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_TIN_SHINGLE_STAIRS = BLOCKS.register("eroded_tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

    public static final RegistryObject<Block> WAXED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_tarnished_tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_corroded_tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_eroded_tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Tin Shingle Slabs
    public static final RegistryObject<Block> TIN_SHINGLE_SLAB = BLOCKS.register("tin_shingle_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.TIN_SHINGLE_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> TARNISHED_TIN_SHINGLE_SLAB = BLOCKS.register("tarnished_tin_shingle_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.TARNISHED_TIN_SHINGLE_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_SHINGLE_SLAB = BLOCKS.register("corroded_tin_shingle_slab", () -> new WeatheringTinSlabBlock
            (MWBlocks.CORRODED_TIN_SHINGLE_SLAB, BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> ERODED_TIN_SHINGLE_SLAB = BLOCKS.register("eroded_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy((MWBlocks.CUT_TIN.get()))));

    public static final RegistryObject<Block> WAXED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_tarnished_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_corroded_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_eroded_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.CUT_TIN.get())));

        // Tin Door
    public static final RegistryObject<Block> TIN_DOOR = BLOCKS.register("tin_door", () -> new DoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

        // Tin Trapdoor
    public static final RegistryObject<Block> TIN_TRAPDOOR = BLOCKS.register("tin_trapdoor", () -> new TrapDoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

        // Tin Bars
    public static final RegistryObject<Block> TIN_BARS = BLOCKS.register("tin_bars", () ->
            new WeatheringTinBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> TARNISHED_TIN_BARS = BLOCKS.register("tarnished_tin_bars", () -> new WeatheringTinBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> CORRODED_TIN_BARS = BLOCKS.register("corroded_tin_bars", () -> new WeatheringTinBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> ERODED_TIN_BARS = BLOCKS.register("eroded_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion()));

    public static final RegistryObject<Block> WAXED_TIN_BARS = BLOCKS.register("waxed_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion()));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_BARS = BLOCKS.register("waxed_tarnished_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion()));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_BARS = BLOCKS.register("waxed_corroded_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion()));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_BARS = BLOCKS.register("waxed_eroded_tin_bars", () ->
           new IronBarsBlock(BlockBehaviour.Properties.copy(MWBlocks.TIN_BARS.get()).noOcclusion()));

        // Tin Chains
    public static final RegistryObject<Block> TIN_CHAIN = BLOCKS.register("tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> TARNISHED_TIN_CHAIN = BLOCKS.register("tarnished_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> CORRODED_TIN_CHAIN = BLOCKS.register("corroded_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> ERODED_TIN_CHAIN = BLOCKS.register("eroded_tin_chain", () -> new ChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));

    public static final RegistryObject<Block> WAXED_TIN_CHAIN = BLOCKS.register("waxed_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_CHAIN = BLOCKS.register("waxed_tarnished_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_CHAIN = BLOCKS.register("waxed_corroded_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_CHAIN = BLOCKS.register("waxed_eroded_tin_chain", () -> new ChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));

        // Tin Lantern
    public static final RegistryObject<Block> TIN_LANTERN = BLOCKS.register("tin_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> TARNISHED_TIN_LANTERN = BLOCKS.register("tarnished_tin_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> CORRODED_TIN_LANTERN = BLOCKS.register("corroded_tin_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> ERODED_TIN_LANTERN = BLOCKS.register("eroded_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));

    public static final RegistryObject<Block> WAXED_TIN_LANTERN = BLOCKS.register("waxed_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_LANTERN = BLOCKS.register("waxed_tarnished_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_LANTERN = BLOCKS.register("waxed_corroded_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_LANTERN = BLOCKS.register("waxed_eroded_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));

        // Tin Soul Lantern
    public static final RegistryObject<Block> TIN_SOUL_LANTERN = BLOCKS.register("tin_soul_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)));
    public static final RegistryObject<Block> TARNISHED_TIN_SOUL_LANTERN = BLOCKS.register("tarnished_tin_soul_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_SOUL_LANTERN = BLOCKS.register("corroded_tin_soul_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));
    public static final RegistryObject<Block> ERODED_TIN_SOUL_LANTERN = BLOCKS.register("eroded_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));

    public static final RegistryObject<Block> WAXED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_tarnished_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_corroded_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_eroded_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_SOUL_LANTERN.get())));


        // Bronze Blocks
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_GRATE = BLOCKS.register("bronze_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_SHINGLES = BLOCKS.register("bronze_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_SHINGLE_STAIRS = BLOCKS.register("bronze_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.BRONZE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_SHINGLE_SLAB = BLOCKS.register("bronze_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_BARS = BLOCKS.register("bronze_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion()));

    public static final RegistryObject<Block> BRONZE_GRATE_DRAIN = BLOCKS.register("bronze_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_TILES = BLOCKS.register("bronze_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_TILE_STAIRS = BLOCKS.register("bronze_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.BRONZE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_TILE_SLAB = BLOCKS.register("bronze_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_DOOR = BLOCKS.register("bronze_door", () -> new DoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<Block> BRONZE_TRAPDOOR = BLOCKS.register("bronze_trapdoor", () -> new TrapDoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<Block> LOOPING_PRESSURE_PLATE = BLOCKS.register("looping_pressure_plate", () -> new LoopingPressurePlateBlock());

        //Rose Gold Blocks
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).mapColor(DyeColor.PINK)));

    public static final RegistryObject<Block> ROSE_LANTERN = BLOCKS.register("rose_lantern", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).mapColor(DyeColor.PINK).noOcclusion()));

    public static final RegistryObject<Block> ROSE_GOLD_MOSAIC = BLOCKS.register("rose_gold_mosaic", () -> new Block
            (BlockBehaviour.Properties.copy(MWBlocks.ROSE_GOLD_BLOCK.get())));

    public static final RegistryObject<Block> ROSE_GOLD_MOSAIC_STAIRS = BLOCKS.register("rose_gold_mosaic_stairs", () -> new StairBlock
            (() -> MWBlocks.ROSE_GOLD_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(MWBlocks.CASSITERITE.get())));

    public static final RegistryObject<Block> ROSE_GOLD_MOSAIC_SLAB = BLOCKS.register("rose_gold_mosaic_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(MWBlocks.ROSE_GOLD_MOSAIC.get())));

    public static final RegistryObject<WeightedPressurePlateBlock> MEDIUM_WEIGHTED_PRESSURE_PLATE = BLOCKS.register("medium_weighted_pressure_plate", () -> new WeightedPressurePlateBlock
            (75, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY), BlockSetType.IRON));

        // Mage Fire Blocks
    public static final RegistryObject<Block> MAGE_FIRE = BLOCKS.register("mage_fire", () -> new MageFireBlock
            (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).replaceable().noCollission().randomTicks().instabreak().lightLevel(s -> 10).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> MAGE_TORCH = BLOCKS.register("mage_torch", () -> new MageTorchBlock
            (BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(s -> 12).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MAGE_WALL_TORCH = BLOCKS.register("mage_wall_torch", () -> new MageWallTorchBlock
            (BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(s -> 12).sound(SoundType.WOOD).dropsLike(MAGE_TORCH.get())));

    public static final RegistryObject<Block> MAGE_LANTERN = BLOCKS.register("mage_lantern", () -> new LanternBlock
            (BlockBehaviour.Properties.of().mapColor(MapColor.METAL).forceSolidOn().requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 12).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MAGE_CAMPFIRE = BLOCKS.register("mage_campfire", MageCampfireBlock::new);

    // Tin Mage Lantern
    public static final RegistryObject<Block> TIN_MAGE_LANTERN = BLOCKS.register("tin_mage_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.MAGE_LANTERN.get())));
    public static final RegistryObject<Block> TARNISHED_TIN_MAGE_LANTERN = BLOCKS.register("tarnished_tin_mage_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));
    public static final RegistryObject<Block> CORRODED_TIN_MAGE_LANTERN = BLOCKS.register("corroded_tin_mage_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));
    public static final RegistryObject<Block> ERODED_TIN_MAGE_LANTERN = BLOCKS.register("eroded_tin_mage_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));

    public static final RegistryObject<Block> WAXED_TIN_MAGE_LANTERN = BLOCKS.register("waxed_tin_mage_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_TARNISHED_TIN_MAGE_LANTERN = BLOCKS.register("waxed_tarnished_tin_mage_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_CORRODED_TIN_MAGE_LANTERN = BLOCKS.register("waxed_corroded_tin_mage_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));
    public static final RegistryObject<Block> WAXED_ERODED_TIN_MAGE_LANTERN = BLOCKS.register("waxed_eroded_tin_mage_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(MWBlocks.TIN_MAGE_LANTERN.get())));

        // Helper Methods
    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (blockState) -> blockState.getValue(CampfireBlock.LIT) ? lightLevel : 0;
    }
}