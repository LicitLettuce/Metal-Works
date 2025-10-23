package net.lettuce.metalworks.data;

import net.lettuce.metalworks.common.loot.AddItemModifier;
import net.lettuce.metalworks.common.registry.ModItems;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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

        add("tin_ingot_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_ingot_from_mineshafts", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_ingot_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_ingot_from_nether_fortresses", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.TIN_INGOT.get()));

        add("tin_sword_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, ModItems.TIN_SWORD.get()));

        add("bronze_ingot_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_pickaxe_from_dungeons", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.BRONZE_PICKAXE.get()));

        add("bronze_ingot_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_crossing")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_ingot_from_fortresses", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_horse_armor_from_fortresses", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, ModItems.BRONZE_HORSE_ARMOR.get()));

        add("bronze_ingot_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.BRONZE_INGOT.get()));

        add("bronze_chestplate_from_ancient_cities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, ModItems.BRONZE_CHESTPLATE.get()));

        add("rose_gold_ingot_from_mansions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("rose_gold_pickaxe_from_end_cities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, ModItems.ROSE_GOLD_PICKAXE.get()));

        add("rose_gold_chestplate_from_ancient_cities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build()
        }, ModItems.ROSE_GOLD_CHESTPLATE.get()));

        add("rose_gold_ingot_from_stronghold_library", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.ROSE_GOLD_INGOT.get()));

        add("mage_powder_from_ancient_cities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.85f).build()
        }, ModItems.MAGE_POWDER.get()));

        add("rose_gold_horse_armor_from_bastions", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, ModItems.ROSE_GOLD_HORSE_ARMOR.get()));

        add("rose_gold_boots_from_strongholds", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("minecraft:chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build()
        }, ModItems.ROSE_GOLD_BOOTS.get()));

    }
}
