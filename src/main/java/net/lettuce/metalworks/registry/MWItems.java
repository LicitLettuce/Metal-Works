package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MWItems {

    //TIN ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalWorks.MOD_ID);

        //Natural Tin Items

    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem
            (MWBlocks.RAW_TIN_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem
            (MWBlocks.TIN_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem
            (MWBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties()));

        //Tin Blocks

    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem
            (MWBlocks.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN = ITEMS.register("tarnished_tin", () -> new BlockItem
            (MWBlocks.TARNISHED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN = ITEMS.register("corroded_tin", () -> new BlockItem
            (MWBlocks.CORRODED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN = ITEMS.register("eroded_tin", () -> new BlockItem
            (MWBlocks.ERODED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_BLOCK = ITEMS.register("waxed_tin_block", () -> new BlockItem
            (MWBlocks.WAXED_TIN_BlOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN = ITEMS.register("waxed_tarnished_tin", () -> new BlockItem
            (MWBlocks.WAXED_TARNISHED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN = ITEMS.register("waxed_corroded_tin", () -> new BlockItem
            (MWBlocks.WAXED_CORRODED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN = ITEMS.register("waxed_eroded_tin", () -> new BlockItem
            (MWBlocks.WAXED_ERODED_TIN.get(), new Item.Properties()));

        //Chiseled Tin

    public static final RegistryObject<BlockItem> CHISELED_TIN = ITEMS.register("chiseled_tin", () -> new BlockItem
            (MWBlocks.CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CHISELED_TIN= ITEMS.register("tarnished_chiseled_tin", () -> new BlockItem
            (MWBlocks.TARNISHED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CHISELED_TIN = ITEMS.register("corroded_chiseled_tin", () -> new BlockItem
            (MWBlocks.CORRODED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CHISELED_TIN = ITEMS.register("eroded_chiseled_tin", () -> new BlockItem
            (MWBlocks.ERODED_CHISELED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CHISELED_TIN = ITEMS.register("waxed_chiseled_tin", () -> new BlockItem
            (MWBlocks.WAXED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CHISELED_TIN = ITEMS.register("waxed_tarnished_chiseled_tin", () -> new BlockItem
            (MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CHISELED_TIN = ITEMS.register("waxed_corroded_chiseled_tin", () -> new BlockItem
            (MWBlocks.WAXED_CORRODED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CHISELED_TIN = ITEMS.register("waxed_eroded_chiseled_tin", () -> new BlockItem
            (MWBlocks.WAXED_ERODED_CHISELED_TIN.get(), new Item.Properties()));

        //Cut Tin

    public static final RegistryObject<BlockItem> CUT_TIN = ITEMS.register("cut_tin", () -> new BlockItem
            (MWBlocks.CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN= ITEMS.register("tarnished_cut_tin", () -> new BlockItem
            (MWBlocks.TARNISHED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_CUT_TIN = ITEMS.register("corroded_cut_tin", () -> new BlockItem
            (MWBlocks.CORRODED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_CUT_TIN = ITEMS.register("eroded_cut_tin", () -> new BlockItem
            (MWBlocks.ERODED_CUT_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN = ITEMS.register("waxed_cut_tin", () -> new BlockItem
            (MWBlocks.WAXED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN = ITEMS.register("waxed_tarnished_cut_tin", () -> new BlockItem
            (MWBlocks.WAXED_TARNISHED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_CUT_TIN = ITEMS.register("waxed_corroded_cut_tin", () -> new BlockItem
            (MWBlocks.WAXED_CORRODED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_CUT_TIN = ITEMS.register("waxed_eroded_cut_tin", () -> new BlockItem
            (MWBlocks.WAXED_ERODED_CUT_TIN.get(), new Item.Properties()));

        //Tin Tiles

    public static final RegistryObject<BlockItem> TIN_TILES = ITEMS.register("tin_tiles", () -> new BlockItem
            (MWBlocks.TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILES= ITEMS.register("tarnished_tin_tiles", () -> new BlockItem
            (MWBlocks.TARNISHED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_TILES = ITEMS.register("corroded_tin_tiles", () -> new BlockItem
            (MWBlocks.CORRODED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_TILES = ITEMS.register("eroded_tin_tiles", () -> new BlockItem
            (MWBlocks.ERODED_TIN_TILES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TILES = ITEMS.register("waxed_tin_tiles", () -> new BlockItem
            (MWBlocks.WAXED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILES = ITEMS.register("waxed_tarnished_tin_tiles", () -> new BlockItem
            (MWBlocks.WAXED_TARNISHED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_TILES = ITEMS.register("waxed_corroded_tin_tiles", () -> new BlockItem
            (MWBlocks.WAXED_CORRODED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_TILES = ITEMS.register("waxed_eroded_tin_tiles", () -> new BlockItem
            (MWBlocks.WAXED_ERODED_TIN_TILES.get(), new Item.Properties()));

        //Tin Shingles

    public static final RegistryObject<BlockItem> TIN_SHINGLES = ITEMS.register("tin_shingles", () -> new BlockItem
            (MWBlocks.TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLES= ITEMS.register("tarnished_tin_shingles", () -> new BlockItem
            (MWBlocks.TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SHINGLES = ITEMS.register("corroded_tin_shingles", () -> new BlockItem
            (MWBlocks.CORRODED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SHINGLES = ITEMS.register("eroded_tin_shingles", () -> new BlockItem
            (MWBlocks.ERODED_TIN_SHINGLES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLES = ITEMS.register("waxed_tin_shingles", () -> new BlockItem
            (MWBlocks.WAXED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLES = ITEMS.register("waxed_tarnished_tin_shingles", () -> new BlockItem
            (MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SHINGLES = ITEMS.register("waxed_corroded_tin_shingles", () -> new BlockItem
            (MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SHINGLES = ITEMS.register("waxed_eroded_tin_shingles", () -> new BlockItem
            (MWBlocks.WAXED_ERODED_TIN_SHINGLES.get(), new Item.Properties()));






    public static final RegistryObject<BlockItem> TIN_TILE_STAIRS = ITEMS.register("tin_tile_stairs", () -> new BlockItem
            (MWBlocks.TIN_TILE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_TILE_SLAB = ITEMS.register("tin_tile_slab", () -> new BlockItem
            (MWBlocks.TIN_TILE_SLAB.get(), new Item.Properties()));



    public static final RegistryObject<BlockItem> TIN_SHINGLE_STAIRS = ITEMS.register("tin_shingle_stairs", () -> new BlockItem
            (MWBlocks.TIN_SHINGLE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_SHINGLE_SLAB = ITEMS.register("tin_shingle_slab", () -> new BlockItem
            (MWBlocks.TIN_SHINGLE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> CUT_TIN_STAIRS = ITEMS.register("cut_tin_stairs", () -> new BlockItem
            (MWBlocks.CUT_TIN_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> CUT_TIN_SLAB = ITEMS.register("cut_tin_slab", () -> new BlockItem
            (MWBlocks.CUT_TIN_SLAB.get(), new Item.Properties()));


    public static final RegistryObject<BlockItem> TIN_DOOR = ITEMS.register("tin_door", () -> new BlockItem
            (MWBlocks.TIN_DOOR.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_TRAPDOOR = ITEMS.register("tin_trapdoor", () -> new BlockItem
            (MWBlocks.TIN_TRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_BARS = ITEMS.register("tin_bars", () -> new BlockItem
            (MWBlocks.TIN_BARS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_GRATE_DRAIN = ITEMS.register("tin_grate_drain", () -> new BlockItem(
            MWBlocks.TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("tarnished_tin_grate_drain", () -> new BlockItem(
            MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_GRATE_DRAIN = ITEMS.register("corroded_tin_grate_drain", () -> new BlockItem(
            MWBlocks.CORRODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_GRATE_DRAIN = ITEMS.register("eroded_tin_grate_drain", () -> new BlockItem(
            MWBlocks.ERODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tin_grate_drain", () -> new BlockItem(
            MWBlocks.WAXED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tarnished_tin_grate_drain", () -> new BlockItem(
            MWBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_GRATE_DRAIN = ITEMS.register("waxed_corroded_tin_grate_drain", () -> new BlockItem(
            MWBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_GRATE_DRAIN = ITEMS.register("waxed_eroded_tin_grate_drain", () -> new BlockItem(
            MWBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_GRATE = ITEMS.register("tin_grate", () -> new BlockItem(
            MWBlocks.TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE = ITEMS.register("tarnished_tin_grate", () -> new BlockItem(
            MWBlocks.TARNISHED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_GRATE = ITEMS.register("corroded_tin_grate", () -> new BlockItem(
            MWBlocks.CORRODED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_GRATE = ITEMS.register("eroded_tin_grate", () -> new BlockItem(
            MWBlocks.ERODED_TIN_GRATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE = ITEMS.register("waxed_tin_grate", () -> new BlockItem(
            MWBlocks.WAXED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE = ITEMS.register("waxed_tarnished_tin_grate", () -> new BlockItem(
            MWBlocks.WAXED_TARNISHED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_GRATE = ITEMS.register("waxed_corroded_tin_grate", () -> new BlockItem(
            MWBlocks.WAXED_CORRODED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_GRATE = ITEMS.register("waxed_eroded_tin_grate", () -> new BlockItem(
            MWBlocks.WAXED_ERODED_TIN_GRATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TIN_CHAIN = ITEMS.register("tin_chain", () -> new BlockItem
            (MWBlocks.TIN_CHAIN.get(), new Item.Properties()));




    // --- Tin Lanterns ---
    public static final RegistryObject<BlockItem> TIN_LANTERN = ITEMS.register("tin_lantern",
            () -> new BlockItem(MWBlocks.TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_LANTERN = ITEMS.register("tarnished_tin_lantern",
            () -> new BlockItem(MWBlocks.TARNISHED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_LANTERN = ITEMS.register("corroded_tin_lantern",
            () -> new BlockItem(MWBlocks.CORRODED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_LANTERN = ITEMS.register("eroded_tin_lantern",
            () -> new BlockItem(MWBlocks.ERODED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TIN_LANTERN = ITEMS.register("waxed_tin_lantern",
            () -> new BlockItem(MWBlocks.WAXED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_LANTERN = ITEMS.register("waxed_tarnished_tin_lantern",
            () -> new BlockItem(MWBlocks.WAXED_TARNISHED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_LANTERN = ITEMS.register("waxed_corroded_tin_lantern",
            () -> new BlockItem(MWBlocks.WAXED_CORRODED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_LANTERN = ITEMS.register("waxed_eroded_tin_lantern",
            () -> new BlockItem(MWBlocks.WAXED_ERODED_TIN_LANTERN.get(), new Item.Properties()));

    // --- Soul Tin Lanterns ---
    public static final RegistryObject<BlockItem> TIN_SOUL_LANTERN = ITEMS.register("tin_soul_lantern",
            () -> new BlockItem(MWBlocks.TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("tarnished_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CORRODED_TIN_SOUL_LANTERN = ITEMS.register("corroded_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ERODED_TIN_SOUL_LANTERN = ITEMS.register("eroded_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.ERODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.WAXED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tarnished_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_CORRODED_TIN_SOUL_LANTERN = ITEMS.register("waxed_corroded_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_ERODED_TIN_SOUL_LANTERN = ITEMS.register("waxed_eroded_tin_soul_lantern",
            () -> new BlockItem(MWBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem
            (MWToolTiers.TIN, 3 ,-2.0F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem
            (MWToolTiers.TIN, 1, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem
            (MWToolTiers.TIN,  6.5F, -2.7F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem
            (MWToolTiers.TIN,1.5F, -2.6F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem
            (MWToolTiers.TIN, -2, -0.6F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem
            (MWArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem
            (MWArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem
            (MWArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem
            (MWArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));


    //BRONZE ITEMS
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem
            (MWBlocks.BRONZE_BLOCK.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_GRATE = ITEMS.register("bronze_grate", () -> new BlockItem
            (MWBlocks.BRONZE_GRATE.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_SHINGLES = ITEMS.register("bronze_shingles", () -> new BlockItem
            (MWBlocks.BRONZE_SHINGLES.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_TILES = ITEMS.register("bronze_tiles", () -> new BlockItem
            (MWBlocks.BRONZE_TILES.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_TILE_STAIRS = ITEMS.register("bronze_tile_stairs", () -> new BlockItem
            (MWBlocks.BRONZE_TILE_STAIRS.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_TILE_SLAB = ITEMS.register("bronze_tile_slab", () -> new BlockItem
            (MWBlocks.BRONZE_TILE_SLAB.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_STAIRS = ITEMS.register("bronze_shingle_stairs", () -> new BlockItem
            (MWBlocks.BRONZE_SHINGLE_STAIRS.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_SLAB = ITEMS.register("bronze_shingle_slab", () -> new BlockItem
            (MWBlocks.BRONZE_SHINGLE_SLAB.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_BARS = ITEMS.register("bronze_bars", () -> new BlockItem
            (MWBlocks.BRONZE_BARS.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_GRATE_DRAIN = ITEMS.register("bronze_grate_drain", () -> new BlockItem
            (MWBlocks.BRONZE_GRATE_DRAIN.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> BRONZE_DOOR = ITEMS.register("bronze_door", () -> new BlockItem
            (MWBlocks.BRONZE_DOOR.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> BRONZE_TRAPDOOR = ITEMS.register("bronze_trapdoor", () -> new BlockItem
            (MWBlocks.BRONZE_TRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem
            (MWToolTiers.BRONZE,3,-2.4F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem
            (MWToolTiers.BRONZE,1,-2.8F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem
            (MWToolTiers.BRONZE, 6, -3.1F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem
            (MWToolTiers.BRONZE, 1.5F, -3.0F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem
            (MWToolTiers.BRONZE, -2,-1, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register
            ("bronze_horse_armor", () -> new HorseArmorItem( 9,"bronze", new Item.Properties().stacksTo(1).fireResistant()));

    public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears", () -> new ShearsItem
            (new Item.Properties().stacksTo(1).durability(964).fireResistant()));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem
            (MWArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem
            (MWArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem
            (MWArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem
            (MWArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));


    //ROSE GOLD ITEMS
    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem
            (MWBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ROSE_LANTERN = ITEMS.register("rose_lantern", () -> new BlockItem
            (MWBlocks.ROSE_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", () -> new SwordItem
            (MWToolTiers.ROSE_GOLD, 3 ,-2.4F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem
            (MWToolTiers.ROSE_GOLD, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", () -> new AxeItem
            (MWToolTiers.ROSE_GOLD, 6, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SHOVEl = ITEMS.register("rose_gold_shovel", () -> new ShovelItem
            (MWToolTiers.ROSE_GOLD, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe", () -> new HoeItem
            (MWToolTiers.ROSE_GOLD, -2, -1.0F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor", () -> new HorseArmorItem
            ( 8, "rose_gold", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet", () -> new ArmorItem
            (MWArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate", () -> new ArmorItem
            (MWArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings", () -> new ArmorItem
            (MWArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots", () -> new ArmorItem
            (MWArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register("rose_gold_beetroot", () -> new Item
            (new Item.Properties().food(MWFoods.ROSE_GOLD_BEETROOT)));

    //Misc Items
    //public static final RegistryObject<Item> MUSIC_DISC_ALLOY = ITEMS.register("music_disc_alloy", () -> new RecordItem
            //(5, MWSounds.MUSIC_DISC_ALLOY, new Item.Properties().stacksTo(1), 3220));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
