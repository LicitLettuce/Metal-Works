package net.lettuce.metalworks.datagen;


import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModBlocks;
import net.lettuce.metalworks.registry.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MetalWorks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

            // Cassiterite Items
        evenSimplerBlockItem(ModBlocks.CASSITERITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.CASSITERITE_SLAB);
        wallItem(ModBlocks.CASSITERITE_WALL, ModBlocks.CASSITERITE);
        evenSimplerBlockItem(ModBlocks.POLISHED_CASSITERITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_CASSITERITE_SLAB);
        wallItem(ModBlocks.POLISHED_CASSITERITE_WALL, ModBlocks.POLISHED_CASSITERITE);
        evenSimplerBlockItem(ModBlocks.CASSITERITE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CASSITERITE_BRICK_SLAB);
        wallItem(ModBlocks.CASSITERITE_BRICK_WALL, ModBlocks.CASSITERITE_BRICKS);

            // Citadel Items
        evenSimplerBlockItem(ModBlocks.SOUL_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.SOUL_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.SOUL_TILE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SOUL_TILE_SLAB);

        simpleItem(ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE);
        simpleItem(ModItems.TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE);
        // TODO missing ancients_music_disc.png texture
        // simpleItem(ModItems.MUSIC_DISC_ANCIENTS);
        simpleItem(ModItems.MUSIC_DISC_UNDERWORLD);

            // Tin Items
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.TIN_NUGGET);
        simpleItem(ModItems.RAW_TIN);
        trimmedArmorItem(ModItems.TIN_HELMET);
        trimmedArmorItem(ModItems.TIN_CHESTPLATE);
        trimmedArmorItem(ModItems.TIN_LEGGINGS);
        trimmedArmorItem(ModItems.TIN_BOOTS);
        simpleItem(ModItems.TIN_HORSE_ARMOR);
        handheldItem(ModItems.TIN_SWORD);
        handheldItem(ModItems.TIN_PICKAXE);
        handheldItem(ModItems.TIN_AXE);
        handheldItem(ModItems.TIN_SHOVEL);
        handheldItem(ModItems.TIN_HOE);

        evenSimplerBlockItem(ModBlocks.CUT_TIN_STAIRS);
        evenSimplerBlockItem(ModBlocks.TARNISHED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS);
        evenSimplerBlockItem(ModBlocks.CUT_TIN_SLAB);
        evenSimplerBlockItem(ModBlocks.TARNISHED_CUT_TIN_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_CUT_TIN_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB);;

        evenSimplerBlockItem(ModBlocks.TIN_TILE_STAIRS);
        evenSimplerBlockItem(ModBlocks.TARNISHED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_TIN_TILE_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS);

        evenSimplerBlockItem(ModBlocks.TIN_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.TARNISHED_TIN_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_TIN_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB);

        evenSimplerBlockItem(ModBlocks.TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_TIN_SHINGLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS);

        evenSimplerBlockItem(ModBlocks.TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_TIN_SHINGLE_SLAB);
        evenSimplerBlockItem(ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB);;

        simpleBlockItem(ModBlocks.TIN_DOOR);
        simpleBlockItem(ModBlocks.TARNISHED_TIN_DOOR);
        withExistingParent(ModItems.WAXED_TIN_DOOR.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tin_door"));
        withExistingParent(ModItems.WAXED_TARNISHED_TIN_DOOR.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tarnished_tin_door"));

        trapdoorItem(ModBlocks.TIN_TRAPDOOR);
        trapdoorItem(ModBlocks.TARNISHED_TIN_TRAPDOOR);
        trapdoorItem(ModBlocks.WAXED_TIN_TRAPDOOR);
        trapdoorItem(ModBlocks.WAXED_TARNISHED_TIN_TRAPDOOR);

        simpleBlockItem(ModBlocks.TIN_CHAIN);
        simpleBlockItem(ModBlocks.TARNISHED_TIN_CHAIN);
        withExistingParent(ModItems.WAXED_TIN_CHAIN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tin_chain"));
        withExistingParent(ModItems.WAXED_TARNISHED_TIN_CHAIN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tarnished_tin_chain"));

        simpleBlockItem(ModBlocks.TARNISHED_TIN_LANTERN);
        withExistingParent(ModItems.WAXED_TIN_LANTERN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tin_lantern"));
        withExistingParent(ModItems.WAXED_TARNISHED_TIN_LANTERN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tarnished_tin_lantern"));

        simpleBlockItem(ModBlocks.TIN_SOUL_LANTERN);
        simpleBlockItem(ModBlocks.TARNISHED_TIN_SOUL_LANTERN);
        withExistingParent(ModItems.WAXED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tin_soul_lantern"));
        withExistingParent(ModItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.getId().getPath(), "item/generated").texture("layer0", modLoc("item/tarnished_tin_soul_lantern"));

            // Bronze Items
        simpleItem(ModItems.CRUDE_BRONZE);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_NUGGET);
        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);
        simpleItem(ModItems.BRONZE_HORSE_ARMOR);
        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_HOE);
        simpleItem(ModItems.BRONZE_SHEARS);
        evenSimplerBlockItem(ModBlocks.BRONZE_SHINGLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.BRONZE_SHINGLE_SLAB);
        evenSimplerBlockItem(ModBlocks.BRONZE_TILE_STAIRS);
        evenSimplerBlockItem(ModBlocks.BRONZE_TILE_SLAB);
        simpleBlockItem(ModBlocks.BRONZE_DOOR);
        trapdoorItem(ModBlocks.BRONZE_TRAPDOOR);

            // Rose Gold Items
        simpleItem(ModItems.CRUDE_ROSE_GOLD);
        simpleItem(ModItems.ROSE_GOLD_INGOT);
        simpleItem(ModItems.ROSE_GOLD_NUGGET);
        simpleItem(ModItems.MAGE_POWDER);
        trimmedArmorItem(ModItems.ROSE_GOLD_HELMET);
        trimmedArmorItem(ModItems.ROSE_GOLD_CHESTPLATE);
        trimmedArmorItem(ModItems.ROSE_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.ROSE_GOLD_BOOTS);
        simpleItem(ModItems.ROSE_GOLD_HORSE_ARMOR);
        simpleItem(ModItems.ROSE_GOLD_BEETROOT);
        handheldItem(ModItems.ROSE_GOLD_SWORD);
        handheldItem(ModItems.ROSE_GOLD_PICKAXE);
        handheldItem(ModItems.ROSE_GOLD_AXE);
        handheldItem(ModItems.ROSE_GOLD_SHOVEL);
        handheldItem(ModItems.ROSE_GOLD_HOE);
        evenSimplerBlockItem(ModBlocks.ROSE_GOLD_MOSAIC_STAIRS);
        evenSimplerBlockItem(ModBlocks.ROSE_GOLD_MOSAIC_SLAB);
        simpleBlockItem(ModBlocks.TIN_LANTERN);
        simpleBlockItem(ModBlocks.MAGE_LANTERN);
        simpleBlockItem(ModBlocks.MAGE_CAMPFIRE);

        withExistingParent(ModItems.MAGE_GOLEM_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

            // GUI Items
        simpleItem(ModItems.TAB_ITEM);
        simpleItem(ModItems.MAGE_FIRE_ADVANCEMENT_ITEM);
        withExistingParent(ModItems.REFINED_RADIANCE_ITEM.getId().getPath(), "item/generated").texture("layer0", modLoc("item/rose_gold_chestplate"));
    }

    private ItemModelBuilder simpleItem(DeferredHolder<Item, ? extends Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredHolder<Item, ? extends Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(DeferredHolder<Block, ? extends Block> block) {
        this.withExistingParent(MetalWorks.MOD_ID + ":" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(DeferredHolder<Block, ? extends Block> block) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(DeferredHolder<Block, ? extends Block> block, DeferredHolder<Block, ? extends Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(DeferredHolder<Block, ? extends Block> block, DeferredHolder<Block, ? extends Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(DeferredHolder<Block, ? extends Block> block, DeferredHolder<Block, ? extends Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(DeferredHolder<Block, ? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "item/" + item.getId().getPath()));
    }

    // Shoutout to El_Redstoniano for making this
    // Shoutout to Kaupenjoe for showing me this
    private void trimmedArmorItem(DeferredHolder<Item, ? extends Item> itemHolder) {
        final String MOD_ID = MetalWorks.MOD_ID; // Change this to your mod id

        if(itemHolder.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + itemHolder.getId().getPath();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.withDefaultNamespace(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemHolder.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemHolder.getId().getPath()));
            });
        }
    }
}