package net.lettuce.metalworks.data;


import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MetalWorks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

            // Cassiterite Blocks
        blockWithItem(ModBlocks.CASSITERITE);
        stairsBlock(((StairBlock) ModBlocks.CASSITERITE_STAIRS.get()), blockTexture(ModBlocks.CASSITERITE.get()));
        slabBlock(((SlabBlock) ModBlocks.CASSITERITE_SLAB.get()), blockTexture(ModBlocks.CASSITERITE.get()), blockTexture(ModBlocks.CASSITERITE.get()));
        wallBlock(((WallBlock) ModBlocks.CASSITERITE_WALL.get()), blockTexture(ModBlocks.CASSITERITE.get()));

            // Polished Cassiterite
        blockWithItem(ModBlocks.POLISHED_CASSITERITE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_CASSITERITE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_CASSITERITE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_CASSITERITE_SLAB.get()), blockTexture(ModBlocks.POLISHED_CASSITERITE.get()), blockTexture(ModBlocks.POLISHED_CASSITERITE.get()));
        wallBlock(((WallBlock) ModBlocks.POLISHED_CASSITERITE_WALL.get()), blockTexture(ModBlocks.POLISHED_CASSITERITE.get()));

            // Cassiterite Bricks
        blockWithItem(ModBlocks.CASSITERITE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_CASSITERITE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CASSITERITE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CASSITERITE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CASSITERITE_BRICK_SLAB.get()), blockTexture(ModBlocks.CASSITERITE_BRICKS.get()), blockTexture(ModBlocks.CASSITERITE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CASSITERITE_BRICK_WALL.get()), blockTexture(ModBlocks.CASSITERITE_BRICKS.get()));
        blockWithItem(ModBlocks.CHISELED_CASSITERITE_BRICKS);


        // Natural Tin Blocks
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.SOUL_TIN_ORE);

            // Tin Blocks
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TARNISHED_TIN);

        simpleBlockWithItem(ModBlocks.WAXED_TIN_BLOCK.get(), models().cubeAll("waxed_tin_block", blockTexture(ModBlocks.TIN_BLOCK.get())));
        simpleBlockWithItem(ModBlocks.WAXED_TARNISHED_TIN.get(), models().cubeAll("waxed_tarnished_tin", blockTexture(ModBlocks.TARNISHED_TIN.get())));

            // Chiseled Tin
        blockWithItem(ModBlocks.CHISELED_TIN);
        blockWithItem(ModBlocks.TARNISHED_CHISELED_TIN);

        simpleBlockWithItem(ModBlocks.WAXED_CHISELED_TIN.get(), models().cubeAll("waxed_chiseled_tin", blockTexture(ModBlocks.CHISELED_TIN.get())));
        simpleBlockWithItem(ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get(), models().cubeAll("waxed_tarnished_chiseled_tin", blockTexture(ModBlocks.TARNISHED_CHISELED_TIN.get())));

            // Cut Tin
        blockWithItem(ModBlocks.CUT_TIN);
        blockWithItem(ModBlocks.TARNISHED_CUT_TIN);

        simpleBlockWithItem(ModBlocks.WAXED_CUT_TIN.get(), models().cubeAll("waxed_cut_tin", blockTexture(ModBlocks.CUT_TIN.get())));
        simpleBlockWithItem(ModBlocks.WAXED_TARNISHED_CUT_TIN.get(), models().cubeAll("waxed_tarnished_cut_tin", blockTexture(ModBlocks.TARNISHED_CUT_TIN.get())));

            //Cut Tin Stairs
        stairsBlock(((StairBlock) ModBlocks.CUT_TIN_STAIRS.get()), blockTexture(ModBlocks.CUT_TIN.get()));
        stairsBlock(((StairBlock) ModBlocks.TARNISHED_CUT_TIN_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()));

        stairsBlock(((StairBlock) ModBlocks.WAXED_CUT_TIN_STAIRS.get()), blockTexture(ModBlocks.CUT_TIN.get()));
        stairsBlock(((StairBlock) ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()));

            // Cut Tin Slabs
        slabBlock(((SlabBlock) ModBlocks.CUT_TIN_SLAB.get()), blockTexture(ModBlocks.CUT_TIN.get()), blockTexture(ModBlocks.CUT_TIN.get()));
        slabBlock(((SlabBlock) ModBlocks.TARNISHED_CUT_TIN_SLAB.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()));

        slabBlock(((SlabBlock) ModBlocks.WAXED_CUT_TIN_SLAB.get()), blockTexture(ModBlocks.CUT_TIN.get()), blockTexture(ModBlocks.CUT_TIN.get()));
        slabBlock(((SlabBlock) ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()), blockTexture(ModBlocks.TARNISHED_CUT_TIN.get()));

            // Tin Tiles
        blockWithItem(ModBlocks.TIN_TILES);
        blockWithItem(ModBlocks.TARNISHED_TIN_TILES);

        simpleBlockWithItem(ModBlocks.WAXED_TIN_TILES.get(), models().cubeAll("waxed_tin_tiles", blockTexture(ModBlocks.TIN_TILES.get())));
        simpleBlockWithItem(ModBlocks.WAXED_TARNISHED_TIN_TILES.get(), models().cubeAll("waxed_tarnished_tin_tiles", blockTexture(ModBlocks.TARNISHED_TIN_TILES.get())));

            // Tin Tile Stair
        stairsBlock(((StairBlock) ModBlocks.TIN_TILE_STAIRS.get()), blockTexture(ModBlocks.TIN_TILES.get()));
        stairsBlock(((StairBlock) ModBlocks.TARNISHED_TIN_TILE_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()));

        stairsBlock(((StairBlock) ModBlocks.WAXED_TIN_TILE_STAIRS.get()), blockTexture(ModBlocks.TIN_TILES.get()));
        stairsBlock(((StairBlock) ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()));

            // Tin Tile Slab
        slabBlock(((SlabBlock) ModBlocks.TIN_TILE_SLAB.get()), blockTexture(ModBlocks.TIN_TILES.get()), blockTexture(ModBlocks.TIN_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.TARNISHED_TIN_TILE_SLAB.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()));

        slabBlock(((SlabBlock) ModBlocks.WAXED_TIN_TILE_SLAB.get()), blockTexture(ModBlocks.TIN_TILES.get()), blockTexture(ModBlocks.TIN_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()), blockTexture(ModBlocks.TARNISHED_TIN_TILES.get()));

            // Tin Shingles
        blockWithItem(ModBlocks.TIN_SHINGLES);
        blockWithItem(ModBlocks.TARNISHED_TIN_SHINGLES);

        simpleBlockWithItem(ModBlocks.WAXED_TIN_SHINGLES.get(), models().cubeAll("waxed_tin_shingles", blockTexture(ModBlocks.TIN_SHINGLES.get())));
        simpleBlockWithItem(ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(), models().cubeAll("waxed_tarnished_tin_shingles", blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get())));

            // Tin Shingle Stair
        stairsBlock(((StairBlock) ModBlocks.TIN_SHINGLE_STAIRS.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()));
        stairsBlock(((StairBlock) ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()));

        stairsBlock(((StairBlock) ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()));
        stairsBlock(((StairBlock) ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()));

            // Tin Shingle Slab
        slabBlock(((SlabBlock) ModBlocks.TIN_SHINGLE_SLAB.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()));
        slabBlock(((SlabBlock) ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()));

        slabBlock(((SlabBlock) ModBlocks.WAXED_TIN_SHINGLE_SLAB.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()), blockTexture(ModBlocks.TIN_SHINGLES.get()));
        slabBlock(((SlabBlock) ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()), blockTexture(ModBlocks.TARNISHED_TIN_SHINGLES.get()));

            // Tin Door
        doorBlockWithRenderType(((DoorBlock) ModBlocks.TIN_DOOR.get()), modLoc("block/tin_door_bottom"), modLoc("block/tin_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.TARNISHED_TIN_DOOR.get()), modLoc("block/tarnished_tin_door_bottom"), modLoc("block/tarnished_tin_door_top"), "cutout");

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WAXED_TIN_DOOR.get()), modLoc("block/tin_door_bottom"), modLoc("block/tin_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.WAXED_TARNISHED_TIN_DOOR.get()), modLoc("block/tarnished_tin_door_bottom"), modLoc("block/tarnished_tin_door_top"), "cutout");

            // Tin Trapdoor
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.TIN_TRAPDOOR.get()), modLoc("block/tin_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.TARNISHED_TIN_TRAPDOOR.get()), modLoc("block/tarnished_tin_trapdoor"), true, "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WAXED_TIN_TRAPDOOR.get()), modLoc("block/tin_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WAXED_TARNISHED_TIN_TRAPDOOR.get()), modLoc("block/tarnished_tin_trapdoor"), true, "cutout");

            // Bronze Block
        blockWithItem(ModBlocks.BRONZE_BLOCK);

            // Bronze Tile
        blockWithItem(ModBlocks.BRONZE_TILES);
        stairsBlock(((StairBlock) ModBlocks.BRONZE_TILE_STAIRS.get()), blockTexture(ModBlocks.BRONZE_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.BRONZE_TILE_SLAB.get()), blockTexture(ModBlocks.BRONZE_TILES.get()), blockTexture(ModBlocks.BRONZE_TILES.get()));

            // Bronze Shingle
        blockWithItem(ModBlocks.BRONZE_SHINGLES);
        stairsBlock(((StairBlock) ModBlocks.BRONZE_SHINGLE_STAIRS.get()), blockTexture(ModBlocks.BRONZE_SHINGLES.get()));
        slabBlock(((SlabBlock) ModBlocks.BRONZE_SHINGLE_SLAB.get()), blockTexture(ModBlocks.BRONZE_SHINGLES.get()), blockTexture(ModBlocks.BRONZE_SHINGLES.get()));

            // Rose Gold Block
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);

            // Rose Gold Mosaic
        blockWithItem(ModBlocks.ROSE_GOLD_MOSAIC);
        stairsBlock(((StairBlock) ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get()), blockTexture(ModBlocks.ROSE_GOLD_MOSAIC.get()));
        slabBlock(((SlabBlock) ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get()), blockTexture(ModBlocks.ROSE_GOLD_MOSAIC.get()), blockTexture(ModBlocks.ROSE_GOLD_MOSAIC.get()));

            // Bronze Door
        doorBlockWithRenderType(((DoorBlock) ModBlocks.BRONZE_DOOR.get()), modLoc("block/bronze_door_bottom"), modLoc("block/bronze_door_top"), "translucent");

            //Bronze Trapdoor
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BRONZE_TRAPDOOR.get()), modLoc("block/bronze_trapdoor"), true, "translucent");
    }

    //Manual JSON Files \/\/\/

    // Tin Bars, Tin Lanterns, Tin Grates, Tin Grate Drains, and Tin Bars
    // Bronze Bars, Bronze Grate, and Bronze Grate Drain
    // Rose Gold Lantern
    // Medium Weighted Pressure Plate
    // Mechanical Pressure Plate

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
