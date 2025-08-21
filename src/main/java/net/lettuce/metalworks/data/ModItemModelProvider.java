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
        simpleBlockItem(MWBlocks.TIN_SOUL_LANTERN);
        simpleBlockItem(MWBlocks.TIN_CHAIN);

        simpleBlockItem(MWBlocks.BRONZE_DOOR);




        //Stairs
        evenSimplerBlockItem(MWBlocks.CUT_TIN_STAIRS);
        evenSimplerBlockItem(MWBlocks.TIN_TILE_STAIRS);
        evenSimplerBlockItem(MWBlocks.TIN_SHINGLE_STAIRS);

        evenSimplerBlockItem(MWBlocks.BRONZE_SHINGLE_STAIRS);
        evenSimplerBlockItem(MWBlocks.BRONZE_TILE_STAIRS);



        //Slabs
        evenSimplerBlockItem(MWBlocks.CUT_TIN_SLAB);
        evenSimplerBlockItem(MWBlocks.TIN_TILE_SLAB);
        evenSimplerBlockItem(MWBlocks.TIN_SHINGLE_SLAB);


        evenSimplerBlockItem(MWBlocks.BRONZE_SHINGLE_SLAB);
        evenSimplerBlockItem(MWBlocks.BRONZE_TILE_SLAB);



        trapdoorItem(MWBlocks.TIN_TRAPDOOR);
        trapdoorItem(MWBlocks.BRONZE_TRAPDOOR);
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