package net.lettuce.metalworks.data;


import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.lettuce.metalworks.registry.MWItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MetalWorks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
         simpleItem(MWItems.TIN_INGOT);
         simpleItem(MWItems.TIN_NUGGET);
         simpleItem(MWItems.RAW_TIN);
        simpleItem(MWItems.TIN_HELMET);
        simpleItem(MWItems.TIN_CHESTPLATE);
        simpleItem(MWItems.TIN_LEGGINGS);
        simpleItem(MWItems.TIN_BOOTS);
        handheldItem(MWItems.TIN_SWORD);
        handheldItem(MWItems.TIN_PICKAXE);
        handheldItem(MWItems.TIN_AXE);
        handheldItem(MWItems.TIN_SHOVEL);
        handheldItem(MWItems.TIN_HOE);

         simpleItem(MWItems.BRONZE_INGOT);
         simpleItem(MWItems.BRONZE_NUGGET);
         simpleItem(MWItems.BRONZE_HELMET);
         simpleItem(MWItems.BRONZE_CHESTPLATE);
         simpleItem(MWItems.BRONZE_LEGGINGS);
         simpleItem(MWItems.BRONZE_BOOTS);
         simpleItem(MWItems.BRONZE_HORSE_ARMOR);
         handheldItem(MWItems.BRONZE_SWORD);
         handheldItem(MWItems.BRONZE_PICKAXE);
         handheldItem(MWItems.BRONZE_AXE);
         handheldItem(MWItems.BRONZE_SHOVEL);
         handheldItem(MWItems.BRONZE_HOE);
        simpleItem(MWItems.BRONZE_SHEARS);

        simpleItem(MWItems.ROSE_GOLD_INGOT);
        simpleItem(MWItems.ROSE_GOLD_NUGGET);
        simpleItem(MWItems.ROSE_GOLD_HELMET);
        simpleItem(MWItems.ROSE_GOLD_CHESTPLATE);
        simpleItem(MWItems.ROSE_GOLD_LEGGINGS);
        simpleItem(MWItems.ROSE_GOLD_HORSE_ARMOR);
        simpleItem(MWItems.ROSE_GOLD_BOOTS);
        simpleItem(MWItems.ROSE_GOLD_BEETROOT);
        handheldItem(MWItems.ROSE_GOLD_SWORD);
        handheldItem(MWItems.ROSE_GOLD_PICKAXE);
        handheldItem(MWItems.ROSE_GOLD_AXE);
        handheldItem(MWItems.ROSE_GOLD_SHOVEl);
        handheldItem(MWItems.ROSE_GOLD_HOE);




        simpleBlockItem(MWBlocks.TIN_DOOR);

        simpleBlockItem(MWBlocks.TIN_LANTERN);
        simpleBlockItem(MWBlocks.TARNISHED_TIN_LANTERN);
        simpleBlockItem(MWBlocks.CORRODED_TIN_LANTERN);
        simpleBlockItem(MWBlocks.ERODED_TIN_LANTERN);
        withExistingParent(MWItems.WAXED_TIN_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tin_lantern"));
        withExistingParent(MWItems.WAXED_TARNISHED_TIN_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tarnished_tin_lantern"));
        withExistingParent(MWItems.WAXED_CORRODED_TIN_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/corroded_tin_lantern"));
        withExistingParent(MWItems.WAXED_ERODED_TIN_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/eroded_tin_lantern"));

        simpleBlockItem(MWBlocks.TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.TARNISHED_TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.CORRODED_TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.ERODED_TIN_SOUL_LANTERN);
        withExistingParent(MWItems.WAXED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tin_soul_lantern"));
        withExistingParent(MWItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tarnished_tin_soul_lantern"));
        withExistingParent(MWItems.WAXED_CORRODED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/corroded_tin_soul_lantern"));
        withExistingParent(MWItems.WAXED_ERODED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/eroded_tin_soul_lantern"));

        simpleBlockItem(MWBlocks.TARNISHED_TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.CORRODED_TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.ERODED_TIN_SOUL_LANTERN);

        simpleBlockItem(MWBlocks.TIN_CHAIN);
        simpleBlockItem(MWBlocks.TARNISHED_TIN_CHAIN);
        simpleBlockItem(MWBlocks.CORRODED_TIN_CHAIN);
        simpleBlockItem(MWBlocks.ERODED_TIN_CHAIN);

        withExistingParent(MWItems.WAXED_TIN_CHAIN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tin_chain"));
        withExistingParent(MWItems.WAXED_TARNISHED_TIN_CHAIN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tarnished_tin_chain"));
        withExistingParent(MWItems.WAXED_CORRODED_TIN_CHAIN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/corroded_tin_chain"));
        withExistingParent(MWItems.WAXED_ERODED_TIN_CHAIN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/eroded_tin_chain"));



        simpleBlockItem(MWBlocks.BRONZE_DOOR);




        //Stairs
        evenSimplerBlockItem(MWBlocks.CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.TARNISHED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.CORRODED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.ERODED_CUT_TIN_STAIRS);


        evenSimplerBlockItem(MWBlocks.TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.TIN_SHINGLE_STAIRS);

        evenSimplerBlockItem(MWBlocks.BRONZE_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.BRONZE_TILE_STAIRS);



        //Slabs
        evenSimplerBlockItem(MWBlocks.CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.TARNISHED_CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.CORRODED_CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.ERODED_CUT_TIN_SLAB);


        evenSimplerBlockItem(MWBlocks.TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.TIN_SHINGLE_SLAB);


        evenSimplerBlockItem(MWBlocks.BRONZE_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.BRONZE_TILE_SLAB);



        trapdoorItem(MWBlocks.TIN_TRAPDOOR);

        trapdoorItem(MWBlocks.BRONZE_TRAPDOOR);

        // Waxed Cut Tin Stairs
        evenSimplerBlockItem(MWBlocks.WAXED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_CUT_TIN_STAIRS);

// Waxed Tin Tile Stairs
        evenSimplerBlockItem(MWBlocks.TARNISHED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.CORRODED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.ERODED_TIN_TILE_STAIRS);

        evenSimplerBlockItem(MWBlocks.WAXED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_TIN_TILE_STAIRS);

// Waxed Tin Shingle Stairs
        evenSimplerBlockItem(MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.CORRODED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.ERODED_TIN_SHINGLE_STAIRS);

        evenSimplerBlockItem(MWBlocks.WAXED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS);

        // Waxed Cut Tin Slabs
        evenSimplerBlockItem(MWBlocks.WAXED_CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_CUT_TIN_SLAB);

// Waxed Tin Tile Slabs
        evenSimplerBlockItem(MWBlocks.TARNISHED_TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.CORRODED_TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.ERODED_TIN_TILE_SLAB);

        evenSimplerBlockItem(MWBlocks.WAXED_TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_TIN_TILE_SLAB);

// Waxed Tin Shingle Slabs
        evenSimplerBlockItem(MWBlocks.TARNISHED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.CORRODED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.ERODED_TIN_SHINGLE_SLAB);

        evenSimplerBlockItem(MWBlocks.WAXED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB);

        withExistingParent(MWItems.TIN_CHAIN.getId().getPath(), "item/generated")
                .texture("layer0", modLoc("item/tin_chain"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MetalWorks.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MetalWorks.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MetalWorks.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(MetalWorks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(MetalWorks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(MetalWorks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MetalWorks.MOD_ID,"item/" + item.getId().getPath()));
    }
}