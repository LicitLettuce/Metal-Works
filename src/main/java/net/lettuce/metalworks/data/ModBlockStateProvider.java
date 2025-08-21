package net.lettuce.metalworks.data;


import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MetalWorks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Basic Blocks
        blockWithItem(MWBlocks.TIN_BLOCK);
        blockWithItem(MWBlocks.TARNISHED_TIN);
        blockWithItem(MWBlocks.CORRODED_TIN);
        blockWithItem(MWBlocks.ERODED_TIN);

        simpleBlockWithItem(
                MWBlocks.WAXED_TIN_BlOCK.get(),
                models().cubeAll(
                        "waxed_tin_block",
                        blockTexture(MWBlocks.TIN_BLOCK.get())
                )
        );

        simpleBlockWithItem(
                MWBlocks.WAXED_TARNISHED_TIN.get(),
                models().cubeAll(
                        "waxed_tarnished_tin",
                        blockTexture(MWBlocks.TARNISHED_TIN.get())
                )
        );

        simpleBlockWithItem(
                MWBlocks.WAXED_CORRODED_TIN.get(),
                models().cubeAll(
                        "waxed_corroded_tin",
                        blockTexture(MWBlocks.CORRODED_TIN.get())
                )
        );

        simpleBlockWithItem(
                MWBlocks.WAXED_ERODED_TIN.get(),
                models().cubeAll(
                        "waxed_eroded_tin",
                        blockTexture(MWBlocks.ERODED_TIN.get())
                )
        );

        //chainBlock(MWBlocks.TIN_CHAIN.get(), "tin_chain");

        blockWithItem(MWBlocks.TIN_TILES);
        blockWithItem(MWBlocks.TIN_SHINGLES);
        blockWithItem(MWBlocks.CUT_TIN);
        blockWithItem(MWBlocks.RAW_TIN_BLOCK);
        blockWithItem(MWBlocks.CHISELED_TIN);
        blockWithItem(MWBlocks.TIN_ORE);
        blockWithItem(MWBlocks.DEEPSLATE_TIN_ORE);

        blockWithItem(MWBlocks.BRONZE_BLOCK);
        blockWithItem(MWBlocks.BRONZE_TILES);
        blockWithItem(MWBlocks.BRONZE_SHINGLES);

        blockWithItem(MWBlocks.ROSE_GOLD_BLOCK);

        blockWithItem(MWBlocks.TARNISHED_TIN_TILES);
        blockWithItem(MWBlocks.CORRODED_TIN_TILES);
        blockWithItem(MWBlocks.ERODED_TIN_TILES);

        simpleBlockWithItem(MWBlocks.WAXED_TIN_TILES.get(),
                models().cubeAll("waxed_tin_tiles", blockTexture(MWBlocks.TIN_TILES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_TARNISHED_TIN_TILES.get(),
                models().cubeAll("waxed_tarnished_tin_tiles", blockTexture(MWBlocks.TARNISHED_TIN_TILES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_CORRODED_TIN_TILES.get(),
                models().cubeAll("waxed_corroded_tin_tiles", blockTexture(MWBlocks.CORRODED_TIN_TILES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_ERODED_TIN_TILES.get(),
                models().cubeAll("waxed_eroded_tin_tiles", blockTexture(MWBlocks.ERODED_TIN_TILES.get()))
        );

// TIN SHINGLES - Weathered and Waxed
        blockWithItem(MWBlocks.TARNISHED_TIN_SHINGLES);
        blockWithItem(MWBlocks.CORRODED_TIN_SHINGLES);
        blockWithItem(MWBlocks.ERODED_TIN_SHINGLES);

        simpleBlockWithItem(MWBlocks.WAXED_TIN_SHINGLES.get(),
                models().cubeAll("waxed_tin_shingles", blockTexture(MWBlocks.TIN_SHINGLES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(),
                models().cubeAll("waxed_tarnished_tin_shingles", blockTexture(MWBlocks.TARNISHED_TIN_SHINGLES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get(),
                models().cubeAll("waxed_corroded_tin_shingles", blockTexture(MWBlocks.CORRODED_TIN_SHINGLES.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_ERODED_TIN_SHINGLES.get(),
                models().cubeAll("waxed_eroded_tin_shingles", blockTexture(MWBlocks.ERODED_TIN_SHINGLES.get()))
        );

// CUT TIN - Weathered and Waxed
        blockWithItem(MWBlocks.TARNISHED_CUT_TIN);
        blockWithItem(MWBlocks.CORRODED_CUT_TIN);
        blockWithItem(MWBlocks.ERODED_CUT_TIN);

        simpleBlockWithItem(MWBlocks.WAXED_CUT_TIN.get(),
                models().cubeAll("waxed_cut_tin", blockTexture(MWBlocks.CUT_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_TARNISHED_CUT_TIN.get(),
                models().cubeAll("waxed_tarnished_cut_tin", blockTexture(MWBlocks.TARNISHED_CUT_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_CORRODED_CUT_TIN.get(),
                models().cubeAll("waxed_corroded_cut_tin", blockTexture(MWBlocks.CORRODED_CUT_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_ERODED_CUT_TIN.get(),
                models().cubeAll("waxed_eroded_cut_tin", blockTexture(MWBlocks.ERODED_CUT_TIN.get()))
        );

// CHISELED TIN - Weathered and Waxed
        blockWithItem(MWBlocks.TARNISHED_CHISELED_TIN);
        blockWithItem(MWBlocks.CORRODED_CHISELED_TIN);
        blockWithItem(MWBlocks.ERODED_CHISELED_TIN);

        simpleBlockWithItem(MWBlocks.WAXED_CHISELED_TIN.get(),
                models().cubeAll("waxed_chiseled_tin", blockTexture(MWBlocks.CHISELED_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get(),
                models().cubeAll("waxed_tarnished_chiseled_tin", blockTexture(MWBlocks.TARNISHED_CHISELED_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_CORRODED_CHISELED_TIN.get(),
                models().cubeAll("waxed_corroded_chiseled_tin", blockTexture(MWBlocks.CORRODED_CHISELED_TIN.get()))
        );
        simpleBlockWithItem(MWBlocks.WAXED_ERODED_CHISELED_TIN.get(),
                models().cubeAll("waxed_eroded_chiseled_tin", blockTexture(MWBlocks.ERODED_CHISELED_TIN.get()))
        );

        //Stair Blocks
        stairsBlock(((StairBlock) MWBlocks.CUT_TIN_STAIRS.get()), blockTexture(MWBlocks.CUT_TIN.get()));
        stairsBlock(((StairBlock) MWBlocks.TIN_TILE_STAIRS.get()), blockTexture(MWBlocks.TIN_TILES.get()));
        stairsBlock(((StairBlock) MWBlocks.TIN_SHINGLE_STAIRS.get()), blockTexture(MWBlocks.TIN_SHINGLES.get()));

        stairsBlock(((StairBlock) MWBlocks.BRONZE_TILE_STAIRS.get()), blockTexture(MWBlocks.BRONZE_TILES.get()));
        stairsBlock(((StairBlock) MWBlocks.BRONZE_SHINGLE_STAIRS.get()), blockTexture(MWBlocks.BRONZE_SHINGLES.get()));

        //Slabs
        slabBlock(((SlabBlock) MWBlocks.CUT_TIN_SLAB.get()), blockTexture(MWBlocks.CUT_TIN.get()), blockTexture(MWBlocks.CUT_TIN.get()));
        slabBlock(((SlabBlock) MWBlocks.TIN_TILE_SLAB.get()), blockTexture(MWBlocks.TIN_TILES.get()), blockTexture(MWBlocks.TIN_TILES.get()));
        slabBlock(((SlabBlock) MWBlocks.TIN_SHINGLE_SLAB.get()), blockTexture(MWBlocks.TIN_SHINGLES.get()), blockTexture(MWBlocks.TIN_SHINGLES.get()));

        slabBlock(((SlabBlock) MWBlocks.BRONZE_TILE_SLAB.get()), blockTexture(MWBlocks.BRONZE_TILES.get()), blockTexture(MWBlocks.BRONZE_TILES.get()));
        slabBlock(((SlabBlock) MWBlocks.BRONZE_SHINGLE_SLAB.get()), blockTexture(MWBlocks.BRONZE_SHINGLES.get()), blockTexture(MWBlocks.BRONZE_SHINGLES.get()));

        //Buttons

        //Doors
        doorBlockWithRenderType(((DoorBlock) MWBlocks.TIN_DOOR.get()), modLoc("block/tin_door_bottom"), modLoc("block/tin_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) MWBlocks.BRONZE_DOOR.get()), modLoc("block/bronze_door_bottom"), modLoc("block/bronze_door_top"), "translucent");

        //Trapdoors
        trapdoorBlockWithRenderType(((TrapDoorBlock) MWBlocks.TIN_TRAPDOOR.get()), modLoc("block/tin_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) MWBlocks.BRONZE_TRAPDOOR.get()), modLoc("block/bronze_trapdoor"), true, "translucent");

    }

    //Manual JSON Files

    //TIN BARS, LANTERNS, GRATE, GRATE DRAIN, CHAIN
    //BRONZE BARS, GRATE, GRATE DRAIN
    //ROSE GOLD LANTERN

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void chainBlock(Block chainBlock, String name) {
        getVariantBuilder(chainBlock)
                .partialState()
                .setModels(new ConfiguredModel(models().getExistingFile(modLoc("block/" + name))));
    }
}
