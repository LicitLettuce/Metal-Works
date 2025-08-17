package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.block.GrateBlock;
import net.lettuce.metalworks.common.block.GrateDrainBlock;
import net.lettuce.metalworks.common.block.TinLanternBlock;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MWBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalWorks.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).mapColor(DyeColor.GRAY)));

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> CUT_TIN = BLOCKS.register("cut_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<Block> CHISELED_TIN = BLOCKS.register("chiseled_tin", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<StairBlock> CUT_TIN_STAIRS = BLOCKS.register("cut_tin_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<SlabBlock> CUT_TIN_SLAB = BLOCKS.register("cut_tin_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<WallBlock> CUT_TIN_WALL = BLOCKS.register("cut_tin_wall", () -> new WallBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<ButtonBlock> CUT_TIN_BUTTON = BLOCKS.register("cut_tin_button", () -> new ButtonBlock
            (BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.COPPER), BlockSetType.IRON, 10, true));

    public static final RegistryObject<PressurePlateBlock> CUT_TIN_PRESSURE_PLATE = BLOCKS.register("cut_tin_pressure_plate", () -> new PressurePlateBlock
            (PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CUT_COPPER), BlockSetType.STONE));

    public static final RegistryObject<Block> TIN_SHINGLES = BLOCKS.register("tin_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<SlabBlock> TIN_SHINGLE_SLAB = BLOCKS.register("tin_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<StairBlock> TIN_SHINGLE_STAIRS = BLOCKS.register("tin_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)));

    public static final RegistryObject<DoorBlock> TIN_DOOR = BLOCKS.register("tin_door", () -> new DoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> TIN_TRAPDOOR = BLOCKS.register("tin_trapdoor", () -> new TrapDoorBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<IronBarsBlock> TIN_BARS = BLOCKS.register("tin_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion()));

    public static final RegistryObject<GrateDrainBlock> TIN_GRATE_DRAIN = BLOCKS.register("tin_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion()));

    public static final RegistryObject<GrateBlock> TIN_GRATE = BLOCKS.register("tin_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion()));

    public static final RegistryObject<ChainBlock> TIN_CHAIN = BLOCKS.register("tin_chain", () -> new ChainBlock
            (BlockBehaviour.Properties.copy(Blocks.CHAIN).noOcclusion()));

    public static final RegistryObject<TinLanternBlock> TIN_LANTERN = BLOCKS.register("tin_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.LANTERN)));

    public static final RegistryObject<TinLanternBlock> TIN_SOUL_LANTERN = BLOCKS.register("tin_soul_lantern", () -> new TinLanternBlock
            (BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<GrateBlock> BRONZE_GRATE = BLOCKS.register("bronze_grate", () -> new GrateBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_SHINGLES = BLOCKS.register("bronze_shingles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<StairBlock> BRONZE_SHINGLE_STAIRS = BLOCKS.register("bronze_shingle_stairs", () -> new StairBlock
            (() -> MWBlocks.BRONZE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<SlabBlock> BRONZE_SHINGLE_SLAB = BLOCKS.register("bronze_shingle_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<IronBarsBlock> BRONZE_BARS = BLOCKS.register("bronze_bars", () -> new IronBarsBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion()));

    public static final RegistryObject<GrateDrainBlock> BRONZE_GRATE_DRAIN = BLOCKS.register("bronze_grate_drain", () -> new GrateDrainBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).noOcclusion().sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> BRONZE_TILES = BLOCKS.register("bronze_tiles", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).sound(SoundType.COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<StairBlock> BRONZE_TILE_STAIRS = BLOCKS.register("bronze_tile_stairs", () -> new StairBlock
            (() -> MWBlocks.BRONZE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<SlabBlock> BRONZE_TILE_SLAB = BLOCKS.register("bronze_tile_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).mapColor(DyeColor.PINK)));

    public static final RegistryObject<Block> ROSE_LANTERN = BLOCKS.register("rose_lantern", () -> new Block
            (BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).mapColor(DyeColor.PINK).noOcclusion()));

}