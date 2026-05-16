package net.lettuce.metalworks.datagen;

import net.lettuce.metalworks.registry.ModEntities;
import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Consumer;
import net.minecraft.core.HolderLookup;

public class ModAdvancementsGenerator implements ForgeAdvancementProvider.AdvancementGenerator {

    @Override
    public void generate(HolderLookup.Provider registries,
                         Consumer<Advancement> saver,
                         ExistingFileHelper fileHelper) {

        // Metal Works
        Advancement root = Advancement.Builder.advancement()
                .display(
                        ModItems.TAB_ITEM.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".root.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".root.desc"),
                        new ResourceLocation("metal_works:textures/gui/advancements/backgrounds/tarnished_tin.png"),
                        FrameType.TASK,
                        true,  // show toast
                        false,  // announce to chat
                        false  // hidden
                )
                .addCriterion("metal_works_related_ingots",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ModItems.TIN_INGOT.get(),
                                ModItems.BRONZE_INGOT.get(),
                                ModItems.ROSE_GOLD_INGOT.get(),
                                Items.COPPER_INGOT,
                                Items.GOLD_INGOT
                        )
                )
                .save(saver, MetalWorks.MOD_ID + ":root");

        // Pickle Ore
        Advancement rawTin = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        ModItems.RAW_TIN.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".raw_tin.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".raw_tin.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("has_raw_tin",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RAW_TIN.get()))
                .save(saver, MetalWorks.MOD_ID + ":raw_tin");

        // From Ore to Ingot
        Advancement smeltTin = Advancement.Builder.advancement()
                .parent(rawTin)
                .display(
                        ModItems.TIN_INGOT.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_ingot.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_ingot.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_tin_ingot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_INGOT.get()))
                .save(saver, MetalWorks.MOD_ID + ":tin_ingot");


        // Industrial Architecture
        Advancement tinBlock = Advancement.Builder.advancement()
                .parent(smeltTin)
                .display(
                        ModItems.TIN_BLOCK.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_block.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_block.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("has_tin_block",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_BLOCK.get()))
                .save(saver, MetalWorks.MOD_ID + ":tin_block");

        // Preservation!
        Advancement waxedInInv = Advancement.Builder.advancement()
                .parent(tinBlock)
                .display(
                        Items.HONEYCOMB,
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".waxed_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".waxed_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("waxed_tin_block", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_BLOCK.get()))
                .addCriterion("waxed_chiseled_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_CHISELED_TIN.get()))
                .addCriterion("waxed_tin_grate", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_GRATE.get()))
                .addCriterion("waxed_tin_grate_drain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_GRATE_DRAIN.get()))
                .addCriterion("waxed_cut_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_CUT_TIN.get()))
                .addCriterion("waxed_cut_tin_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_CUT_TIN_STAIRS.get()))
                .addCriterion("waxed_cut_tin_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_CUT_TIN_SLAB.get()))
                .addCriterion("waxed_tin_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_TILES.get()))
                .addCriterion("waxed_tin_tile_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_TILE_STAIRS.get()))
                .addCriterion("waxed_tin_tile_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_TILE_SLAB.get()))
                .addCriterion("waxed_tin_shingles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_SHINGLES.get()))
                .addCriterion("waxed_tin_shingle_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_SHINGLE_STAIRS.get()))
                .addCriterion("waxed_tin_shingle_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_SHINGLE_SLAB.get()))
                .addCriterion("waxed_tin_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_BARS.get()))
                .addCriterion("waxed_tin_chain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TIN_CHAIN.get()))

                .addCriterion("waxed_tarnished_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN.get()))
                .addCriterion("waxed_tarnished_chiseled", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_CHISELED_TIN.get()))
                .addCriterion("waxed_tarnished_grate", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_GRATE.get()))
                .addCriterion("waxed_tarnished_grate_drain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get()))
                .addCriterion("waxed_tarnished_cut", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_CUT_TIN.get()))
                .addCriterion("waxed_tarnished_cut_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get()))
                .addCriterion("waxed_tarnished_cut_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get()))
                .addCriterion("waxed_tarnished_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_TILES.get()))
                .addCriterion("waxed_tarnished_tile_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get()))
                .addCriterion("waxed_tarnished_tile_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get()))
                .addCriterion("waxed_tarnished_shingles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_SHINGLES.get()))
                .addCriterion("waxed_tarnished_shingle_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get()))
                .addCriterion("waxed_tarnished_shingle_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get()))
                .addCriterion("waxed_tarnished_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_BARS.get()))
                .addCriterion("waxed_tarnished_chain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_CHAIN.get()))
                .addCriterion("waxed_tarnished_tin_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_LANTERN.get()))
                .addCriterion("waxed_tarnished_tin_soul_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get()))

                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":waxed_any_in_inventory");

        // Foul Tarnish!
        Advancement weatheredInInv = Advancement.Builder.advancement()
                .parent(tinBlock)
                .display(
                        ModItems.TARNISHED_CHISELED_TIN.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".weathered_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".weathered_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("tarnished_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN.get()))
                .addCriterion("tarnished_chiseled", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_CHISELED_TIN.get()))
                .addCriterion("tarnished_grate", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_GRATE.get()))
                .addCriterion("tarnished_grate_drain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_GRATE_DRAIN.get()))
                .addCriterion("tarnished_cut", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_CUT_TIN.get()))
                .addCriterion("tarnished_cut_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_CUT_TIN_STAIRS.get()))
                .addCriterion("tarnished_cut_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_CUT_TIN_SLAB.get()))
                .addCriterion("tarnished_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_TILES.get()))
                .addCriterion("tarnished_tile_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_TILE_STAIRS.get()))
                .addCriterion("tarnished_tile_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_TILE_SLAB.get()))
                .addCriterion("tarnished_shingles", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_SHINGLES.get()))
                .addCriterion("tarnished_shingle_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get()))
                .addCriterion("tarnished_shingle_slab", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_SHINGLE_SLAB.get()))
                .addCriterion("tarnished_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_BARS.get()))
                .addCriterion("tarnished_chain", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TARNISHED_TIN_CHAIN.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":weathered_any_in_inventory");

        // Not So Hardware
        Advancement tinArmorAny = Advancement.Builder.advancement()
                .parent(smeltTin)
                .display(
                        ModItems.TIN_HELMET.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_armor_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_armor_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("tin_helmet",      InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_HELMET.get()))
                .addCriterion("tin_chestplate",  InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_CHESTPLATE.get()))
                .addCriterion("tin_leggings",    InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_LEGGINGS.get()))
                .addCriterion("tin_boots",       InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_BOOTS.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":tin_armor_any");

        // Not So Hardware
        Advancement tinToolsAny = Advancement.Builder.advancement()
                .parent(smeltTin)
                .display(
                        ModItems.TIN_AXE.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_tool_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".tin_tool_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("tin_sword",   InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_SWORD.get()))
                .addCriterion("tin_pickaxe", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_PICKAXE.get()))
                .addCriterion("tin_axe",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_AXE.get()))
                .addCriterion("tin_shovel",  InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_SHOVEL.get()))
                .addCriterion("tin_hoe",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TIN_HOE.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":tin_tool_any");


        // Curde Awakening
        Advancement crudeBronze = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        ModItems.CRUDE_BRONZE.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".crude_bronze.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".crude_bronze.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("has_crude_bronze",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CRUDE_BRONZE.get()))
                .save(saver, MetalWorks.MOD_ID + ":crude_bronze");

        // The Bronze Age
        Advancement smeltBronze = Advancement.Builder.advancement()
                .parent(crudeBronze)
                .display(
                        ModItems.BRONZE_INGOT.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_ingot.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_ingot.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_bronze_ingot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_INGOT.get()))
                .save(saver, MetalWorks.MOD_ID + ":bronze_ingot");

        // Time For A Side-Grade!
        Advancement bronzeArmorAny = Advancement.Builder.advancement()
                .parent(smeltBronze)
                .display(
                        ModItems.BRONZE_HELMET.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_armor_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_armor_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("bronze_helmet",      InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_HELMET.get()))
                .addCriterion("bronze_chestplate",  InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_CHESTPLATE.get()))
                .addCriterion("bronze_leggings",    InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_LEGGINGS.get()))
                .addCriterion("bronze_boots",       InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_BOOTS.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":bronze_armor_any");

        // Metal Evolution
        Advancement bronzeToolAny = Advancement.Builder.advancement()
                .parent(smeltBronze)
                .display(
                        ModItems.BRONZE_SWORD.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_tool_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".bronze_tool_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("bronze_sword",   InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_SWORD.get()))
                .addCriterion("bronze_pickaxe", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_PICKAXE.get()))
                .addCriterion("bronze_axe",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_AXE.get()))
                .addCriterion("bronze_shovel",  InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_SHOVEL.get()))
                .addCriterion("bronze_hoe",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_HOE.get()))
                .addCriterion("bronze_shears",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_SHEARS.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":bronze_tool_any");

        // Aquarium Gravel
        Advancement crudeRoseGold = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        ModItems.CRUDE_ROSE_GOLD.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".crude_rose_gold.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".crude_rose_gold.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("has_crude_rose_gold",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CRUDE_ROSE_GOLD.get()))
                .save(saver, MetalWorks.MOD_ID + ":crude_rose_gold");

        // Alchemist’s Alloy
        Advancement smeltRoseGold = Advancement.Builder.advancement()
                .parent(crudeRoseGold)
                .display(
                        ModItems.ROSE_GOLD_INGOT.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_ingot.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_ingot.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_rose_gold_ingot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_INGOT.get()))
                .save(saver, MetalWorks.MOD_ID + ":rose_gold_ingot");

        // A Touch of Elegance
        Advancement roseGoldArmorAny = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        ModItems.ROSE_GOLD_HELMET.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_armor_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_armor_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("rose_gold_helmet",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_HELMET.get()))
                .addCriterion("rose_gold_chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_CHESTPLATE.get()))
                .addCriterion("rose_gold_leggings",   InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_LEGGINGS.get()))
                .addCriterion("rose_gold_boots",      InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_BOOTS.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":rose_gold_armor_any");

        // Gilded Precision
        Advancement roseGoldToolAny = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        ModItems.ROSE_GOLD_SHOVEL.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_tool_any.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_tool_any.desc"),
                        null, FrameType.TASK, true, true, false
                )
                .addCriterion("rose_gold_sword",      InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_SWORD.get()))
                .addCriterion("rose_gold_pickaxe",    InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_PICKAXE.get()))
                .addCriterion("rose_gold_axe",        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_AXE.get()))
                .addCriterion("rose_gold_shovel",     InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_SHOVEL.get()))
                .addCriterion("rose_gold_hoe",        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_HOE.get()))
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":rose_gold_tool_any");

        // Arcane Ember
        Advancement obtainMagePowder = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        ModItems.MAGE_FIRE_ADVANCEMENT_ITEM.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".mage_powder.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".mage_powder.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_mage_powder",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGE_POWDER.get()))
                .save(saver, MetalWorks.MOD_ID + ":mage_powder");

        // Wow, that's fast!
        Advancement craftRoseGoldPickaxe = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        ModItems.ROSE_GOLD_PICKAXE.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_pickaxe.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_pickaxe.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_rose_gold_pickaxe",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGE_POWDER.get()))
                .save(saver, MetalWorks.MOD_ID + ":rose_gold_pickaxe");

        // Super Food
        Advancement roseGoldBeetroot = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        ModItems.ROSE_GOLD_BEETROOT.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_beetroot.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".rose_gold_beetroot.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("has_rose_gold_beetroot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_GOLD_BEETROOT.get()))
                .save(saver, MetalWorks.MOD_ID + ":rose_gold_beetroot");

        // Arcane Protection
        Advancement summonMageGolem = Advancement.Builder.advancement()
                .parent(smeltRoseGold)
                .display(
                        Items.CARVED_PUMPKIN,
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".summon_mage_golem.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".summon_mage_golem.desc"),
                        null, FrameType.CHALLENGE, true, true, false
                )
                .addCriterion("spawn_mage_golem",
                        SummonedEntityTrigger.TriggerInstance.summonedEntity(
                                EntityPredicate.Builder.entity().of(ModEntities.MAGE_GOLEM.get())
                        )
                )
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":summon_mage_golem");

        // Refined Radiance
        Advancement enchantedRoseGoldArmor = Advancement.Builder.advancement()
                .parent(roseGoldArmorAny)
                .display(
                        ModItems.REFINED_RADIANCE_ITEM.get(),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".enchanted_rose_gold_armor.title"),
                        Component.translatable("advancements." + MetalWorks.MOD_ID + ".enchanted_rose_gold_armor.desc"),
                        null, FrameType.GOAL, true, true, false
                )
                .addCriterion("enchanted_rose_gold_helmet",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                ItemPredicate.Builder.item().of(ModItems.ROSE_GOLD_HELMET.get()).build(),
                                MinMaxBounds.Ints.ANY
                        )
                )
                .addCriterion("enchanted_rose_gold_chestplate",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                ItemPredicate.Builder.item().of(ModItems.ROSE_GOLD_CHESTPLATE.get()).build(),
                                MinMaxBounds.Ints.ANY
                        )
                )
                .addCriterion("enchanted_rose_gold_leggings",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                ItemPredicate.Builder.item().of(ModItems.ROSE_GOLD_LEGGINGS.get()).build(),
                                MinMaxBounds.Ints.ANY
                        )
                )
                .addCriterion("enchanted_rose_gold_boots",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                ItemPredicate.Builder.item().of(ModItems.ROSE_GOLD_BOOTS.get()).build(),
                                MinMaxBounds.Ints.ANY
                        )
                )
                .requirements(RequirementsStrategy.OR)
                .save(saver, MetalWorks.MOD_ID + ":enchanted_rose_gold_armor");

    }
}

