package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.block.*;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MetalWorks.MOD_ID);

        // Casserite Blocks
    public static final DeferredHolder<Block, Block> CASSITERITE = BLOCKS.register("cassiterite", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredHolder<Block, Block> CASSITERITE_STAIRS = BLOCKS.register("cassiterite_stairs", () -> new StairBlock
            (ModBlocks.CASSITERITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE.get())));
    public static final DeferredHolder<Block, Block> CASSITERITE_SLAB = BLOCKS.register("cassiterite_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE.get())));
    public static final DeferredHolder<Block, Block> CASSITERITE_WALL = BLOCKS.register("cassiterite_wall", () -> new WallBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE.get())));

    public static final DeferredHolder<Block, Block> POLISHED_CASSITERITE = BLOCKS.register("polished_cassiterite", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredHolder<Block, Block> POLISHED_CASSITERITE_STAIRS = BLOCKS.register("polished_cassiterite_stairs", () -> new StairBlock
            (ModBlocks.POLISHED_CASSITERITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get())));
    public static final DeferredHolder<Block, Block> POLISHED_CASSITERITE_SLAB = BLOCKS.register("polished_cassiterite_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get())));
    public static final DeferredHolder<Block, Block> POLISHED_CASSITERITE_WALL = BLOCKS.register("polished_cassiterite_wall", () -> new WallBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get())));

    public static final DeferredHolder<Block, Block> CASSITERITE_BRICKS = BLOCKS.register("cassiterite_bricks", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredHolder<Block, Block> CRACKED_CASSITERITE_BRICKS = BLOCKS.register("cracked_cassiterite_bricks", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredHolder<Block, Block> CASSITERITE_BRICK_STAIRS = BLOCKS.register("cassiterite_brick_stairs", () -> new StairBlock
            (ModBlocks.CASSITERITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE_BRICKS.get())));
    public static final DeferredHolder<Block, Block> CASSITERITE_BRICK_SLAB = BLOCKS.register("cassiterite_brick_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE_BRICKS.get())));
    public static final DeferredHolder<Block, Block> CASSITERITE_BRICK_WALL = BLOCKS.register("cassiterite_brick_wall", () -> new WallBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE_BRICKS.get())));
    public static final DeferredHolder<Block, Block> CHISELED_CASSITERITE_BRICKS = BLOCKS.register("chiseled_cassiterite_bricks", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.POLISHED_CASSITERITE.get()).mapColor(MapColor.COLOR_LIGHT_BLUE)));

        // Citadel Blocks
    public static final DeferredHolder<Block, Block> SOUL_BRICKS = BLOCKS.register("soul_bricks", () -> new Block
                (BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL)));
    public static final DeferredHolder<Block, Block> SOUL_BRICK_STAIRS = BLOCKS.register("soul_brick_stairs", () -> new StairBlock
            (ModBlocks.SOUL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.SOUL_BRICKS.get())));
    public static final DeferredHolder<Block, Block> SOUL_BRICK_SLAB = BLOCKS.register("soul_brick_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.SOUL_BRICKS.get())));
    public static final DeferredHolder<Block, Block> CRACKED_SOUL_BRICKS = BLOCKS.register("cracked_soul_bricks", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL)));
    public static final DeferredHolder<Block, Block> SOUL_TILES = BLOCKS.register("soul_tiles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.SOUL_BRICKS.get())));
    public static final DeferredHolder<Block, Block> SOUL_TILE_STAIRS = BLOCKS.register("soul_tile_stairs", () -> new StairBlock
            (ModBlocks.SOUL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.SOUL_BRICKS.get())));
    public static final DeferredHolder<Block, Block> SOUL_TILE_SLAB = BLOCKS.register("soul_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.SOUL_BRICKS.get())));

    public static final DeferredHolder<Block, Block> SUSPICIOUS_SOUL_SOIL = BLOCKS.register("suspicious_soul_soil", () -> new ModBrushableBlock
            (Blocks.SOUL_SOIL, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.SNARE).strength(0.25F).sound(SoundType.SUSPICIOUS_GRAVEL).pushReaction(PushReaction.DESTROY), SoundEvents.BRUSH_GRAVEL, SoundEvents.BRUSH_GRAVEL_COMPLETED));

        // Natural Tin Blocks
    public static final DeferredHolder<Block, Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final DeferredHolder<Block, Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final DeferredHolder<Block, Block> SOUL_TIN_ORE = BLOCKS.register("soul_tin_ore", () -> new DropExperienceBlock
            (UniformInt.of(0, 1), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    public static final DeferredHolder<Block, Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));

        // Tin Block Blocks
    public static final DeferredHolder<Block, Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).strength(3.0F)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN = BLOCKS.register("tarnished_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_BLOCK = BLOCKS.register("waxed_tin_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN = BLOCKS.register("waxed_tarnished_tin", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER).strength(3.5F).explosionResistance(12)));

        // Chiseled Tin
    public static final DeferredHolder<Block, Block> CHISELED_TIN = BLOCKS.register("chiseled_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> TARNISHED_CHISELED_TIN = BLOCKS.register("tarnished_chiseled_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_CHISELED_TIN = BLOCKS.register("waxed_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_CHISELED_TIN = BLOCKS.register("waxed_tarnished_chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

        // Tin Grate
    public static final DeferredHolder<Block, Block> TIN_GRATE = BLOCKS.register("tin_grate", () -> new WeatheringGrateBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_GRATE = BLOCKS.register("tarnished_tin_grate", () -> new WeatheringGrateBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_GRATE = BLOCKS.register("waxed_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.GREEN)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_GRATE = BLOCKS.register("waxed_tarnished_tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).strength(3.5F).explosionResistance(12).mapColor(DyeColor.LIGHT_GRAY)));;

        // Tin Grate Drain
    public static final DeferredHolder<Block, Block> TIN_GRATE_DRAIN = BLOCKS.register("tin_grate_drain", () -> new WeatheringGrateDrainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_GRATE_DRAIN = BLOCKS.register("tarnished_tin_grate_drain", () -> new WeatheringGrateDrainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.GREEN)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_GRATE_DRAIN = BLOCKS.register("waxed_tarnished_tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.LIGHT_GRAY).strength(3.5F).explosionResistance(12)));

        // Cut Tin
    public static final DeferredHolder<Block, Block> CUT_TIN = BLOCKS.register("cut_tin", () -> new WeatheringTinBlock
                (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredHolder<Block, Block> TARNISHED_CUT_TIN = BLOCKS.register("tarnished_cut_tin", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));

    public static final DeferredHolder<Block, Block> WAXED_CUT_TIN = BLOCKS.register("waxed_cut_tin", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_CUT_TIN = BLOCKS.register("waxed_tarnished_cut_tin", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Cut Tin Stairs
    public static final DeferredHolder<Block, Block> CUT_TIN_STAIRS = BLOCKS.register("cut_tin_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.CUT_TIN_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_CUT_TIN_STAIRS = BLOCKS.register("tarnished_cut_tin_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.TARNISHED_CUT_TIN_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_CUT_TIN_STAIRS = BLOCKS.register("waxed_cut_tin_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_CUT_TIN_STAIRS = BLOCKS.register("waxed_tarnished_cut_tin_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Cut Tin Slabs
    public static final DeferredHolder<Block, Block> CUT_TIN_SLAB = BLOCKS.register("cut_tin_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.CUT_TIN_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_CUT_TIN_SLAB = BLOCKS.register("tarnished_cut_tin_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.TARNISHED_CUT_TIN_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_CUT_TIN_SLAB = BLOCKS.register("waxed_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_CUT_TIN_SLAB = BLOCKS.register("waxed_tarnished_cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Tin Tiles
    public static final DeferredHolder<Block, Block> TIN_TILES = BLOCKS.register("tin_tiles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_TILES = BLOCKS.register("tarnished_tin_tiles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_TILES = BLOCKS.register("waxed_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_TILES = BLOCKS.register("waxed_tarnished_tin_tiles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

        // Tin Tiles Stairs
    public static final DeferredHolder<Block, Block> TIN_TILE_STAIRS = BLOCKS.register("tin_tile_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.TIN_TILE_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_TILE_STAIRS = BLOCKS.register("tarnished_tin_tile_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.TARNISHED_TIN_TILE_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_TILE_STAIRS = BLOCKS.register("waxed_tin_tile_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_TILE_STAIRS = BLOCKS.register("waxed_tarnished_tin_tile_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Tin Tile Slabs
    public static final DeferredHolder<Block, Block> TIN_TILE_SLAB = BLOCKS.register("tin_tile_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.CUT_TIN_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_TILE_SLAB = BLOCKS.register("tarnished_tin_tile_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.TARNISHED_TIN_TILE_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_TILE_SLAB = BLOCKS.register("waxed_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_TILE_SLAB = BLOCKS.register("waxed_tarnished_tin_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Tin Shingles
    public static final DeferredHolder<Block, Block> TIN_SHINGLES = BLOCKS.register("tin_shingles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_SHINGLES = BLOCKS.register("tarnished_tin_shingles", () -> new WeatheringTinBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_SHINGLES = BLOCKS.register("waxed_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_SHINGLES = BLOCKS.register("waxed_tarnished_tin_shingles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).strength(3.5F).explosionResistance(12)));

        // Tin Shingle Stairs
    public static final DeferredHolder<Block, Block> TIN_SHINGLE_STAIRS = BLOCKS.register("tin_shingle_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.TIN_SHINGLE_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_SHINGLE_STAIRS = BLOCKS.register("tarnished_tin_shingle_stairs", () -> new WeatheringTinStairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS::get, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_tin_shingle_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_SHINGLE_STAIRS = BLOCKS.register("waxed_tarnished_tin_shingle_stairs", () -> new StairBlock
            (ModBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Tin Shingle Slabs
    public static final DeferredHolder<Block, Block> TIN_SHINGLE_SLAB = BLOCKS.register("tin_shingle_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.TIN_SHINGLE_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_SHINGLE_SLAB = BLOCKS.register("tarnished_tin_shingle_slab", () -> new WeatheringTinSlabBlock
            (ModBlocks.TARNISHED_TIN_SHINGLE_SLAB, BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_SHINGLE_SLAB = BLOCKS.register("waxed_tarnished_tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.CUT_TIN.get()).strength(3.5F).explosionResistance(12)));

        // Tin Door
    public static final DeferredHolder<Block, Block> TIN_DOOR = BLOCKS.register("tin_door", () -> new WeatheringTinDoorBlock
                (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE, ModBlocks.TIN_DOOR::get));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_DOOR = BLOCKS.register("tarnished_tin_door", () -> new WeatheringTinDoorBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).strength(3.5F).explosionResistance(12).noOcclusion(), BlockSetType.STONE, ModBlocks.TARNISHED_TIN_DOOR::get));

    public static final DeferredHolder<Block, Block> WAXED_TIN_DOOR = BLOCKS.register("waxed_tin_door", () -> new DoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion()));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_DOOR = BLOCKS.register("waxed_tarnished_tin_door", () -> new DoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).strength(3.5F).explosionResistance(12).noOcclusion()));

        // Tin Trapdoor
    public static final DeferredHolder<Block, Block> TIN_TRAPDOOR = BLOCKS.register("tin_trapdoor", () -> new WeatheringTinTrapdoorBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE, ModBlocks.TIN_TRAPDOOR::get));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_TRAPDOOR = BLOCKS.register("tarnished_tin_trapdoor", () -> new WeatheringTinTrapdoorBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).strength(3.5F).explosionResistance(12).noOcclusion(), BlockSetType.STONE, ModBlocks.TARNISHED_TIN_TRAPDOOR::get));

    public static final DeferredHolder<Block, Block> WAXED_TIN_TRAPDOOR = BLOCKS.register("waxed_tin_trapdoor", () -> new TrapDoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion()));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_TRAPDOOR = BLOCKS.register("waxed_tarnished_tin_trapdoor", () -> new TrapDoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).strength(3.5F).explosionResistance(12).noOcclusion()));

        // Tin Bars
    public static final DeferredHolder<Block, Block> TIN_BARS = BLOCKS.register("tin_bars", () ->
            new WeatheringTinBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().randomTicks()));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_BARS = BLOCKS.register("tarnished_tin_bars", () -> new WeatheringTinBarsBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_BARS.get()).noOcclusion().randomTicks().strength(3.5F).explosionResistance(12)));


    public static final DeferredHolder<Block, Block> WAXED_TIN_BARS = BLOCKS.register("waxed_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_BARS.get()).noOcclusion()));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_BARS = BLOCKS.register("waxed_tarnished_tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_BARS.get()).noOcclusion().strength(3.5F).explosionResistance(12)));

        // Tin Chains
    public static final DeferredHolder<Block, Block> TIN_CHAIN = BLOCKS.register("tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).noOcclusion()));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_CHAIN = BLOCKS.register("tarnished_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).noOcclusion().strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_CHAIN = BLOCKS.register("waxed_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).noOcclusion()));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_CHAIN = BLOCKS.register("waxed_tarnished_tin_chain", () -> new WeatheringTinChainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).noOcclusion().strength(3.5F).explosionResistance(12)));

        // Tin Lantern
    public static final DeferredHolder<Block, Block> TIN_LANTERN = BLOCKS.register("tin_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_LANTERN = BLOCKS.register("tarnished_tin_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_LANTERN = BLOCKS.register("waxed_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_LANTERN = BLOCKS.register("waxed_tarnished_tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN).strength(3.5F).explosionResistance(12)));

        // Tin Soul Lantern
    public static final DeferredHolder<Block, Block> TIN_SOUL_LANTERN = BLOCKS.register("tin_soul_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredHolder<Block, Block> TARNISHED_TIN_SOUL_LANTERN = BLOCKS.register("tarnished_tin_soul_lantern", () -> new WeatheringTinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_SOUL_LANTERN.get()).strength(3.5F).explosionResistance(12)));

    public static final DeferredHolder<Block, Block> WAXED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_SOUL_LANTERN.get())));
    public static final DeferredHolder<Block, Block> WAXED_TARNISHED_TIN_SOUL_LANTERN = BLOCKS.register("waxed_tarnished_tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.TIN_SOUL_LANTERN.get()).strength(3.5F).explosionResistance(12)));

   // public static final DeferredHolder<Block, Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block
          //  (BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
   // public static final DeferredHolder<Block, Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block
          //  (BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));
   // public static final DeferredHolder<Block, Block> SOUL_TIN_ORE = BLOCKS.register("soul_tin_ore", () -> new DropExperienceBlock
           // (UniformInt.of(0, 1), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    //public static final DeferredHolder<Block, Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block
           // (BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));

    // Tin Block Blocks
    //public static final DeferredHolder<Block, Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new WeatheringTinBlock
            //(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).strength(3.0F)));

        // Bronze Blocks
    public static final DeferredHolder<Block, Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_GRATE = BLOCKS.register("bronze_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_SHINGLES = BLOCKS.register("bronze_shingles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_SHINGLE_STAIRS = BLOCKS.register("bronze_shingle_stairs", () -> new StairBlock
            (ModBlocks.BRONZE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_SHINGLE_SLAB = BLOCKS.register("bronze_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_BARS = BLOCKS.register("bronze_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion()));

    public static final DeferredHolder<Block, Block> BRONZE_GRATE_DRAIN = BLOCKS.register("bronze_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_TILES = BLOCKS.register("bronze_tiles", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_TILE_STAIRS = BLOCKS.register("bronze_tile_stairs", () -> new StairBlock
            (ModBlocks.BRONZE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_TILE_SLAB = BLOCKS.register("bronze_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final DeferredHolder<Block, Block> BRONZE_DOOR = BLOCKS.register("bronze_door", () -> new DoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion()));

    public static final DeferredHolder<Block, Block> BRONZE_TRAPDOOR = BLOCKS.register("bronze_trapdoor", () -> new TrapDoorBlock
            (BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion()));

    public static final DeferredHolder<Block, Block> LOOPING_PRESSURE_PLATE = BLOCKS.register("looping_pressure_plate", () -> new LoopingPressurePlateBlock());

        // Rose Gold Blocks
    public static final DeferredHolder<Block, Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).mapColor(DyeColor.PINK)));

    public static final DeferredHolder<Block, Block> ROSE_LANTERN = BLOCKS.register("rose_lantern", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN).mapColor(DyeColor.PINK).noOcclusion()));

    public static final DeferredHolder<Block, Block> ROSE_GOLD_MOSAIC = BLOCKS.register("rose_gold_mosaic", () -> new Block
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.ROSE_GOLD_BLOCK.get())));

    public static final DeferredHolder<Block, Block> ROSE_GOLD_MOSAIC_STAIRS = BLOCKS.register("rose_gold_mosaic_stairs", () -> new StairBlock
            (ModBlocks.ROSE_GOLD_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(ModBlocks.CASSITERITE.get())));

    public static final DeferredHolder<Block, Block> ROSE_GOLD_MOSAIC_SLAB = BLOCKS.register("rose_gold_mosaic_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.ofFullCopy(ModBlocks.ROSE_GOLD_MOSAIC.get())));

    public static final DeferredHolder<Block, WeightedPressurePlateBlock> MEDIUM_WEIGHTED_PRESSURE_PLATE = BLOCKS.register("medium_weighted_pressure_plate", () -> new WeightedPressurePlateBlock
            (75, BlockSetType.IRON, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

        // Mage Fire Blocks
    public static final DeferredHolder<Block, Block> MAGE_FIRE = BLOCKS.register("mage_fire", () -> new MageFireBlock
            (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).replaceable().noCollission().randomTicks().instabreak().lightLevel(s -> 10).sound(SoundType.WOOL)));

    public static final DeferredHolder<Block, Block> MAGE_TORCH = BLOCKS.register("mage_torch", () -> new MageTorchBlock
            (BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(s -> 12).sound(SoundType.WOOD)));

    public static final DeferredHolder<Block, Block> MAGE_WALL_TORCH = BLOCKS.register("mage_wall_torch", () -> new MageWallTorchBlock
            (BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(s -> 12).sound(SoundType.WOOD).dropsLike(MAGE_TORCH.get())));

    public static final DeferredHolder<Block, Block> MAGE_LANTERN = BLOCKS.register("mage_lantern", () -> new LanternBlock
            (BlockBehaviour.Properties.of().mapColor(MapColor.METAL).forceSolidOn().requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 12).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final DeferredHolder<Block, Block> MAGE_CAMPFIRE = BLOCKS.register("mage_campfire", () -> new MageCampfireBlock
            (Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE)));


        // Helper Methods
    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (blockState) -> blockState.getValue(CampfireBlock.LIT) ? lightLevel : 0;
    }
}
