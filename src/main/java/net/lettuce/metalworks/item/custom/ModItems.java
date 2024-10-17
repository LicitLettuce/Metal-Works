package net.lettuce.metalworks.item.custom;

import net.lettuce.metalworks.MetalWorks;
import net.lettuce.metalworks.block.ModBlocks;
import net.lettuce.metalworks.tiers.ModArmorMaterials;
import net.lettuce.metalworks.tiers.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalWorks.MOD_ID);
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN = ITEMS.register("cut_tin", () -> new BlockItem(ModBlocks.CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN_STAIRS = ITEMS.register("cut_tin_stairs", () -> new BlockItem(ModBlocks.CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN_SLAB = ITEMS.register("cut_tin_slab", () -> new BlockItem(ModBlocks.CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN_WALL = ITEMS.register("cut_tin_wall", () -> new BlockItem(ModBlocks.CUT_TIN_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN_BUTTON = ITEMS.register("cut_tin_button", () -> new BlockItem(ModBlocks.CUT_TIN_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CUT_TIN_PRESSURE_PLATE = ITEMS.register("cut_tin_pressure_plate", () -> new BlockItem(ModBlocks.CUT_TIN_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_DOOR = ITEMS.register("tin_door", () -> new BlockItem(ModBlocks.TIN_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_TRAPDOOR = ITEMS.register("tin_trapdoor", () -> new BlockItem(ModBlocks.TIN_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_BARS = ITEMS.register("tin_bars", () -> new BlockItem(ModBlocks.TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_GRATE_DRAIN = ITEMS.register("tin_grate_drain", () -> new BlockItem(ModBlocks.TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_GRATE = ITEMS.register("tin_grate", () -> new BlockItem(ModBlocks.TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_CHAIN = ITEMS.register("tin_chain", () -> new BlockItem(ModBlocks.TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CHISELED_TIN = ITEMS.register("chiseled_tin", () -> new BlockItem(ModBlocks.CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_LANTERN = ITEMS.register("tin_lantern", () -> new BlockItem(ModBlocks.TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_SOUL_LANTERN = ITEMS.register("tin_soul_lantern", () -> new BlockItem(ModBlocks.TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(ModTiers.TIN, 3 ,-2.0F, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ModTiers.TIN, 1, -2.4F, new Item.Properties()));
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(ModTiers.TIN,  6.5F, -2.7F, new Item.Properties()));
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(ModTiers.TIN,1.5F, -2.6F, new Item.Properties()));
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(ModTiers.TIN, -2, -0.6F, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(ModBlocks.BRONZE_BLOCK.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_GRATE = ITEMS.register("bronze_grate", () -> new BlockItem(ModBlocks.BRONZE_GRATE.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLES = ITEMS.register("bronze_shingles", () -> new BlockItem(ModBlocks.BRONZE_SHINGLES.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_STAIRS = ITEMS.register("bronze_shingle_stairs", () -> new BlockItem(ModBlocks.BRONZE_SHINGLE_STAIRS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_SLAB = ITEMS.register("bronze_shingle_slab", () -> new BlockItem(ModBlocks.BRONZE_SHINGLE_SLAB.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_BARS = ITEMS.register("bronze_bars", () -> new BlockItem(ModBlocks.BRONZE_BARS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_GRATE_DRAIN = ITEMS.register("bronze_grate_drain", () -> new BlockItem(ModBlocks.BRONZE_GRATE_DRAIN.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModTiers.BRONZE,3,-2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModTiers.BRONZE,1,-2.8F, new Item.Properties().fireResistant()));
    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModTiers.BRONZE, 6, -3.1F, new Item.Properties().fireResistant()));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModTiers.BRONZE, 1.5F, -3.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModTiers.BRONZE, -2,-1, new Item.Properties().fireResistant()));
    public static final RegistryObject<HorseArmorItem> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem( 9,"bronze", new Item.Properties().stacksTo(1).fireResistant()));
    public static final RegistryObject<ShearsItem> BRONZE_SHEARS = ITEMS.register("bronze_shears", () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(964).fireResistant()));
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem(ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROSE_LAMP = ITEMS.register("rose_lamp", () -> new BlockItem(ModBlocks.ROSE_LAMP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<SwordItem> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", () -> new SwordItem(ModTiers.ROSE_GOLD, 3 ,-2.4F, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem(ModTiers.ROSE_GOLD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<AxeItem> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", () -> new AxeItem(ModTiers.ROSE_GOLD, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<ShovelItem> ROSE_GOLD_SHOVEl = ITEMS.register("rose_gold_shovel", () -> new ShovelItem(ModTiers.ROSE_GOLD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<HoeItem> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe", () -> new HoeItem(ModTiers.ROSE_GOLD, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<HorseArmorItem> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor", () -> new HorseArmorItem( 8, "rose_gold", new Item.Properties().stacksTo(1)));
    public static final RegistryObject<ArmorItem> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register("rose_gold_beetroot", () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_BEETROOT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
