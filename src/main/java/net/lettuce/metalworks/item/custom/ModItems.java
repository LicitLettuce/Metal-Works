package net.lettuce.metalworks.item.custom;

import net.lettuce.metalworks.MetalWorks;
import net.lettuce.metalworks.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalWorks.MOD_ID);

    public static final RegistryObject<BlockItem> GABBRO = ITEMS.register("gabbro",
            () -> new BlockItem(ModBlocks.GABBRO.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> POLISHED_GABBRO = ITEMS.register("polished_gabbro",
            () -> new BlockItem(ModBlocks.POLISHED_GABBRO.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block",
            () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block",
            () -> new BlockItem(ModBlocks.BRONZE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block",
            () -> new BlockItem(ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));

// // // // //
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SHOVEl = ITEMS.register("rose_gold_shovel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_APPLE = ITEMS.register("rose_gold_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_APPLE)));
    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register("rose_gold_beetroot",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_BEETROOT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
