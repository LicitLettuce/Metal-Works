package net.lettuce.metalworks.common.registry;

import net.lettuce.metalworks.core.ModConfig;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MetalWorks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> METAL_WORKS_TAB = CREATIVE_MODE_TABS.register("metal_works_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_HELMET.get()))
                    .title(Component.translatable("creativetab.metal_works_tab"))
                    .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.CASSITERITE.get());
                                pOutput.accept(ModItems.CASSITERITE_STAIRS.get());
                                pOutput.accept(ModItems.CASSITERITE_SLAB.get());
                                pOutput.accept(ModItems.CASSITERITE_WALL.get());
                                pOutput.accept(ModItems.POLISHED_CASSITERITE.get());
                                pOutput.accept(ModItems.POLISHED_CASSITERITE_STAIRS.get());
                                pOutput.accept(ModItems.POLISHED_CASSITERITE_SLAB.get());
                                pOutput.accept(ModItems.TIN_ORE.get());
                                pOutput.accept(ModItems.DEEPSLATE_TIN_ORE.get());
                                pOutput.accept(ModItems.NETHER_TIN_ORE.get());
                                pOutput.accept(ModItems.RAW_TIN_BLOCK.get());
                                pOutput.accept(ModItems.TIN_BLOCK.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {
                                    pOutput.accept(ModItems.TARNISHED_TIN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN.get());
                                    pOutput.accept(ModItems.ERODED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_BLOCK.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN.get());
                            }
                                pOutput.accept(ModItems.CHISELED_TIN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {
                                    pOutput.accept(ModItems.TARNISHED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.CORRODED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.ERODED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_CHISELED_TIN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_CHISELED_TIN.get());
                            }
                                pOutput.accept(ModItems.TIN_GRATE.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.ERODED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.WAXED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_GRATE.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_GRATE.get());
                            }
                                pOutput.accept(ModItems.TIN_GRATE_DRAIN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.ERODED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_GRATE_DRAIN.get());
                            }
                                pOutput.accept(ModItems.CUT_TIN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_CUT_TIN.get());
                                    pOutput.accept(ModItems.CORRODED_CUT_TIN.get());
                                    pOutput.accept(ModItems.ERODED_CUT_TIN.get());
                                    pOutput.accept(ModItems.WAXED_CUT_TIN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN.get());
                            }
                                pOutput.accept(ModItems.CUT_TIN_STAIRS.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.CORRODED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.ERODED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN_STAIRS.get());
                            }
                                pOutput.accept(ModItems.CUT_TIN_SLAB.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.CORRODED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.ERODED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN_SLAB.get());
                            }
                                pOutput.accept(ModItems.TIN_TILES.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_TILES.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_TILES.get());
                                    pOutput.accept(ModItems.ERODED_TIN_TILES.get());
                                    pOutput.accept(ModItems.WAXED_TIN_TILES.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILES.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILES.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_TILES.get());
                            }
                                pOutput.accept(ModItems.TIN_TILE_STAIRS.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.ERODED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_TILE_STAIRS.get());
                            }
                                pOutput.accept(ModItems.TIN_TILE_SLAB.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.ERODED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_TILE_SLAB.get());
                            }
                                pOutput.accept(ModItems.TIN_SHINGLES.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.ERODED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.WAXED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLES.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLES.get());
                            }
                                pOutput.accept(ModItems.TIN_SHINGLE_STAIRS.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.ERODED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get());
                            }
                                pOutput.accept(ModItems.TIN_SHINGLE_SLAB.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.ERODED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get());
                            }
                                pOutput.accept(ModItems.TIN_DOOR.get());
                                pOutput.accept(ModItems.TIN_TRAPDOOR.get());
                                pOutput.accept(ModItems.TIN_BARS.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_BARS.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_BARS.get());
                                    pOutput.accept(ModItems.ERODED_TIN_BARS.get());
                                    pOutput.accept(ModItems.WAXED_TIN_BARS.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_BARS.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_BARS.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_BARS.get());
                            }
                                pOutput.accept(ModItems.TIN_CHAIN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.ERODED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_CHAIN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_CHAIN.get());
                            }
                                pOutput.accept(ModItems.TIN_LANTERN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.ERODED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_LANTERN.get());
                            }
                                pOutput.accept(ModItems.TIN_SOUL_LANTERN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.ERODED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_SOUL_LANTERN.get());
                            }
                                pOutput.accept(ModItems.TIN_MAGE_LANTERN.get());
                            if (!ModConfig.COMMON.tinVariantTab.get()) {

                                    pOutput.accept(ModItems.TARNISHED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.CORRODED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.ERODED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_TARNISHED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_CORRODED_TIN_MAGE_LANTERN.get());
                                    pOutput.accept(ModItems.WAXED_ERODED_TIN_MAGE_LANTERN.get());
                            }
                                pOutput.accept(ModItems.BRONZE_BLOCK.get());
                                pOutput.accept(ModItems.BRONZE_GRATE.get());
                                pOutput.accept(ModItems.BRONZE_GRATE_DRAIN.get());
                                pOutput.accept(ModItems.BRONZE_TILES.get());
                                pOutput.accept(ModItems.BRONZE_TILE_STAIRS.get());
                                pOutput.accept(ModItems.BRONZE_TILE_SLAB.get());
                                pOutput.accept(ModItems.BRONZE_SHINGLES.get());
                                pOutput.accept(ModItems.BRONZE_SHINGLE_STAIRS.get());
                                pOutput.accept(ModItems.BRONZE_SHINGLE_SLAB.get());
                                pOutput.accept(ModItems.BRONZE_DOOR.get());
                                pOutput.accept(ModItems.BRONZE_TRAPDOOR.get());
                                pOutput.accept(ModItems.BRONZE_BARS.get());
                                pOutput.accept(ModItems.LOOPING_PRESSURE_PLATE.get());
                                pOutput.accept(ModItems.ROSE_GOLD_BLOCK.get());
                                pOutput.accept(ModItems.ROSE_GOLD_MOSAIC.get());
                                pOutput.accept(ModItems.ROSE_GOLD_MOSAIC_STAIRS.get());
                                pOutput.accept(ModItems.ROSE_GOLD_MOSAIC_SLAB.get());
                                pOutput.accept(ModItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());
                                pOutput.accept(ModItems.ROSE_LANTERN.get());
                                pOutput.accept(ModItems.MAGE_TORCH.get());
                                pOutput.accept(ModItems.MAGE_LANTERN.get());
                                pOutput.accept(ModItems.MAGE_CAMPFIRE.get());
                                pOutput.accept(ModItems.RAW_TIN.get());
                                pOutput.accept(ModItems.TIN_INGOT.get());
                                pOutput.accept(ModItems.TIN_NUGGET.get());
                                pOutput.accept(ModItems.BRONZE_INGOT.get());
                                pOutput.accept(ModItems.BRONZE_NUGGET.get());
                                pOutput.accept(ModItems.ROSE_GOLD_INGOT.get());
                                pOutput.accept(ModItems.ROSE_GOLD_NUGGET.get());
                                pOutput.accept(ModItems.MAGE_POWDER.get());
                                pOutput.accept(ModItems.ROSE_GOLD_BEETROOT.get());
                                pOutput.accept(ModItems.TIN_SWORD.get());
                                pOutput.accept(ModItems.TIN_PICKAXE.get());
                                pOutput.accept(ModItems.TIN_AXE.get());
                                pOutput.accept(ModItems.TIN_SHOVEL.get());
                                pOutput.accept(ModItems.TIN_HOE.get());
                                pOutput.accept(ModItems.BRONZE_SWORD.get());
                                pOutput.accept(ModItems.BRONZE_PICKAXE.get());
                                pOutput.accept(ModItems.BRONZE_AXE.get());
                                pOutput.accept(ModItems.BRONZE_SHOVEL.get());
                                pOutput.accept(ModItems.BRONZE_HOE.get());
                                pOutput.accept(ModItems.BRONZE_SHEARS.get());
                                pOutput.accept(ModItems.ROSE_GOLD_SWORD.get());
                                pOutput.accept(ModItems.ROSE_GOLD_PICKAXE.get());
                                pOutput.accept(ModItems.ROSE_GOLD_AXE.get());
                                pOutput.accept(ModItems.ROSE_GOLD_SHOVEl.get());
                                pOutput.accept(ModItems.ROSE_GOLD_HOE.get());
                                pOutput.accept(ModItems.TIN_HELMET.get());
                                pOutput.accept(ModItems.TIN_CHESTPLATE.get());
                                pOutput.accept(ModItems.TIN_LEGGINGS.get());
                                pOutput.accept(ModItems.TIN_BOOTS.get());
                                pOutput.accept(ModItems.TIN_HORSE_ARMOR.get());
                                pOutput.accept(ModItems.BRONZE_HELMET.get());
                                pOutput.accept(ModItems.BRONZE_CHESTPLATE.get());
                                pOutput.accept(ModItems.BRONZE_LEGGINGS.get());
                                pOutput.accept(ModItems.BRONZE_BOOTS.get());
                                pOutput.accept(ModItems.BRONZE_HORSE_ARMOR.get());
                                pOutput.accept(ModItems.ROSE_GOLD_HELMET.get());
                                pOutput.accept(ModItems.ROSE_GOLD_CHESTPLATE.get());
                                pOutput.accept(ModItems.ROSE_GOLD_LEGGINGS.get());
                                pOutput.accept(ModItems.ROSE_GOLD_BOOTS.get());
                                pOutput.accept(ModItems.ROSE_GOLD_HORSE_ARMOR.get());
                                pOutput.accept(ModItems.MAGE_GOLEM_SPAWN_EGG.get());
                        })
                    .build());

    public static final RegistryObject<CreativeModeTab> TIN_VARIANTS_TAB = CREATIVE_MODE_TABS.register("tin_variants_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_BLOCK.get()))
                    .title(Component.translatable("creativetab.tin_variants_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        if (ModConfig.COMMON.tinVariantTab.get()) {
                            pOutput.accept(ModItems.TIN_BLOCK.get());
                            pOutput.accept(ModItems.TARNISHED_TIN.get());
                            pOutput.accept(ModItems.CORRODED_TIN.get());
                            pOutput.accept(ModItems.ERODED_TIN.get());
                            pOutput.accept(ModItems.WAXED_TIN_BLOCK.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN.get());
                            pOutput.accept(ModItems.CHISELED_TIN.get());
                            pOutput.accept(ModItems.TARNISHED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.CORRODED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.ERODED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.WAXED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_CHISELED_TIN.get());
                            pOutput.accept(ModItems.TIN_GRATE.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_GRATE.get());
                            pOutput.accept(ModItems.CORRODED_TIN_GRATE.get());
                            pOutput.accept(ModItems.ERODED_TIN_GRATE.get());
                            pOutput.accept(ModItems.WAXED_TIN_GRATE.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_GRATE.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_GRATE.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_GRATE.get());
                            pOutput.accept(ModItems.TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.CORRODED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.ERODED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.WAXED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_GRATE_DRAIN.get());
                            pOutput.accept(ModItems.CUT_TIN.get());
                            pOutput.accept(ModItems.TARNISHED_CUT_TIN.get());
                            pOutput.accept(ModItems.CORRODED_CUT_TIN.get());
                            pOutput.accept(ModItems.ERODED_CUT_TIN.get());
                            pOutput.accept(ModItems.WAXED_CUT_TIN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN.get());
                            pOutput.accept(ModItems.CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.TARNISHED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.CORRODED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.ERODED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN_STAIRS.get());
                            pOutput.accept(ModItems.CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.TARNISHED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.CORRODED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.ERODED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.WAXED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.WAXED_ERODED_CUT_TIN_SLAB.get());
                            pOutput.accept(ModItems.TIN_TILES.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_TILES.get());
                            pOutput.accept(ModItems.CORRODED_TIN_TILES.get());
                            pOutput.accept(ModItems.ERODED_TIN_TILES.get());
                            pOutput.accept(ModItems.WAXED_TIN_TILES.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILES.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILES.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_TILES.get());
                            pOutput.accept(ModItems.TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.CORRODED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.ERODED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_TILE_STAIRS.get());
                            pOutput.accept(ModItems.TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.CORRODED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.ERODED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_TILE_SLAB.get());
                            pOutput.accept(ModItems.TIN_SHINGLES.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.CORRODED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.ERODED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.WAXED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLES.get());
                            pOutput.accept(ModItems.TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.CORRODED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.ERODED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get());
                            pOutput.accept(ModItems.TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.CORRODED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.ERODED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get());
                            pOutput.accept(ModItems.TIN_DOOR.get());
                            pOutput.accept(ModItems.TIN_TRAPDOOR.get());
                            pOutput.accept(ModItems.TIN_BARS.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_BARS.get());
                            pOutput.accept(ModItems.CORRODED_TIN_BARS.get());
                            pOutput.accept(ModItems.ERODED_TIN_BARS.get());
                            pOutput.accept(ModItems.WAXED_TIN_BARS.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_BARS.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_BARS.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_BARS.get());
                            pOutput.accept(ModItems.TIN_CHAIN.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.CORRODED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.ERODED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.WAXED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_CHAIN.get());
                            pOutput.accept(ModItems.TIN_LANTERN.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.CORRODED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.ERODED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_LANTERN.get());
                            pOutput.accept(ModItems.TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.CORRODED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.ERODED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_SOUL_LANTERN.get());
                            pOutput.accept(ModItems.TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.TARNISHED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.CORRODED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.ERODED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_TARNISHED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_CORRODED_TIN_MAGE_LANTERN.get());
                            pOutput.accept(ModItems.WAXED_ERODED_TIN_MAGE_LANTERN.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
