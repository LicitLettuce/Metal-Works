package net.lettuce.metalworks.datagen;

import net.lettuce.metalworks.common.loot.AddItemModifier;
import net.lettuce.metalworks.registry.ModItems;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, MetalWorks.MOD_ID);
    }

    @Override
    protected void start() {

        // Village Toolsmith
        add("tin_ingot_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()
        }, ModItems.TIN_INGOT.get()));

        add("extra_tin_ingot_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_pickaxe_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_PICKAXE.get()));

        add("tin_axe_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_AXE.get()));

        add("bronze_ingot_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_axe_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_AXE.get()));

        add("rose_gold_ingot_from_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        // Village Weaponsmith
        add("tin_ingot_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.TIN_INGOT.get()));

        add("extra_tin_ingot_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.TIN_INGOT.get()));

        add("bronze_sword_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.BRONZE_SWORD.get()));

        add("tin_axe_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_AXE.get()));

        add("bronze_ingot_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_axe_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_AXE.get()));

        add("rose_gold_ingot_from_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        // Village Armorer
        add("tin_ingot_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.TIN_INGOT.get()));

        add("extra_tin_ingot_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.TIN_INGOT.get()));

        add("bronze_helmet_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.BRONZE_HELMET.get()));

        add("tin_boots_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_BOOTS.get()));

        add("bronze_ingot_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_leggings_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_LEGGINGS.get()));

        add("rose_gold_ingot_from_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        // Dungeon
        add("tin_ingot_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()
        }, ModItems.TIN_INGOT.get()));

        add("extra_tin_ingot_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_INGOT.get()));

        add("bronze_ingot_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_pickaxe_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/village/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_PICKAXE.get()));

        // Mineshaft
        add("tin_ingot_from_mineshafts", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_extra_ingot_from_mineshafts", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_boots_from_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.TIN_BOOTS.get()));

        add("bronze_pickaxe_from_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_PICKAXE.get()));

        // Stronghold
        add("tin_ingot_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_INGOT.get()));

        add("bronze_ingot_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("rose_gold_ingot_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        // Nether Fortress
        add("bronze_ingot_from_fortress", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_horse_armor_from_fortresses", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, ModItems.BRONZE_HORSE_ARMOR.get()));

        add("rose_gold_ingot_from_fortress", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("bronze_horse_armor_from_fortresses", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.ROSE_GOLD_HORSE_ARMOR.get()));

        // Bastion Remnant
        add("tin_sword_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.TIN_SWORD.get()));

        add("tin_axe_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.TIN_AXE.get()));

        add("tin_ingot_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()
        }, ModItems.TIN_INGOT.get()));

        add("nether_tin_ore_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.80f).build()
        }, ModItems.TIN_INGOT.get()));

        add("nether_tin_ore_extra_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.80f).build()
        }, ModItems.TIN_INGOT.get()));

        add("bronze_ingot_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_ingot_extra_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_chestplate_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.BRONZE_CHESTPLATE.get()));

        add("bronze_leggings_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.BRONZE_LEGGINGS.get()));

        add("bronze_boots_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.BRONZE_BOOTS.get()));

        add("bronze_sword_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, ModItems.BRONZE_SWORD.get()));

        add("bronze_block_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.BRONZE_BLOCK.get()));

        // Pillager Outpost
        add("rose_gold_ingot_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("mage_powder_from_pillage_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()
        }, ModItems.MAGE_POWDER.get()));

        add("extra_mage_powder_from_pillage_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()
        }, ModItems.MAGE_POWDER.get()));

        add("mage_torch_from_pillage_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()
        }, ModItems.MAGE_TORCH.get()));

        // Woodland Mansion
        add("rose_gold_ingot_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("extra_rose_gold_ingot_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("mage_powder_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.MAGE_POWDER.get()));

        add("extra_mage_powder_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.MAGE_POWDER.get()));

        add("rose_gold_nugget_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("extra_rose_gold_nugget_from_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("extra_rare_rose_gold_ingot_from_mansions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("rose_gold_horse_armor_from_mansions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, ModItems.ROSE_GOLD_HORSE_ARMOR.get()));

        add("rose_gold_sword_armor_from_mansions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, ModItems.ROSE_GOLD_SWORD.get()));



    }
}
