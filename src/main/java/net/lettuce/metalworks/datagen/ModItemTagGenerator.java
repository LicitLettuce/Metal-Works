package net.lettuce.metalworks.datagen;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MetalWorks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TIN_HELMET.get(),
                ModItems.TIN_CHESTPLATE.get(),
                ModItems.TIN_LEGGINGS.get(),
                ModItems.TIN_BOOTS.get(),
                ModItems.BRONZE_HELMET.get(),
                ModItems.BRONZE_CHESTPLATE.get(),
                ModItems.BRONZE_LEGGINGS.get(),
                ModItems.BRONZE_BOOTS.get(),
                ModItems.ROSE_GOLD_HELMET.get(),
                ModItems.ROSE_GOLD_CHESTPLATE.get(),
                ModItems.ROSE_GOLD_LEGGINGS.get(),
                ModItems.ROSE_GOLD_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.TIN_INGOT.get(),
                        ModItems.BRONZE_INGOT.get(),
                        ModItems.ROSE_GOLD_INGOT.get());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                        ModItems.TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE .get());

        this.tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.TIN_HELMET.get(),
                        ModItems.TIN_CHESTPLATE .get(),
                        ModItems.TIN_LEGGINGS .get(),
                        ModItems.TIN_BOOTS .get(),
                        ModItems.BRONZE_HELMET .get(),
                        ModItems.BRONZE_CHESTPLATE .get(),
                        ModItems.BRONZE_LEGGINGS .get(),
                        ModItems.BRONZE_BOOTS .get(),
                        ModItems.ROSE_GOLD_HELMET .get(),
                        ModItems.ROSE_GOLD_CHESTPLATE .get(),
                        ModItems.ROSE_GOLD_LEGGINGS .get(),
                        ModItems.ROSE_GOLD_BOOTS .get());

        this.tag(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.TIN_SHOVEL .get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.TIN_PICKAXE .get(),
                        ModItems.TIN_HOE .get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_SWORD .get(),
                        ModItems.ROSE_GOLD_SHOVEL .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get(),
                        ModItems.ROSE_GOLD_HOE .get(),
                        ModItems.ROSE_GOLD_AXE .get());

        this.tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.TIN_HOE.get(),
                        ModItems.TIN_SHOVEL .get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.TIN_PICKAXE .get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_SHOVEL .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get(),
                        ModItems.ROSE_GOLD_HOE .get(),
                        ModItems.ROSE_GOLD_AXE .get(),
                        ModItems.BRONZE_SHEARS .get());

        this.tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.TIN_HOE.get(),
                        ModItems.TIN_SHOVEL .get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.TIN_PICKAXE .get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_SHOVEL .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get(),
                        ModItems.ROSE_GOLD_HOE .get(),
                        ModItems.ROSE_GOLD_AXE .get());


        this.tag(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.ROSE_GOLD_SWORD .get(),
                        ModItems.ROSE_GOLD_AXE .get());

        this.tag(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.ROSE_GOLD_SWORD .get(),
                        ModItems.ROSE_GOLD_AXE .get());


        this.tag(ItemTags.SWORDS)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.ROSE_GOLD_SWORD .get());

        this.tag(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.ROSE_GOLD_SWORD .get());

        this.tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.TIN_PICKAXE.get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.TIN_PICKAXE.get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get());

        this.tag(ItemTags.AXES)
                .add(ModItems.TIN_AXE.get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.ROSE_GOLD_AXE .get());

        this.tag(ItemTags.SHOVELS)
                .add(ModItems.TIN_SHOVEL.get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.ROSE_GOLD_SHOVEL .get());

        this.tag(ItemTags.HOES)
                .add(ModItems.TIN_HOE.get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_HOE.get());

        this.tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.TIN_SHOVEL .get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.TIN_PICKAXE .get(),
                        ModItems.TIN_HOE .get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_SWORD .get(),
                        ModItems.ROSE_GOLD_SHOVEL .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get(),
                        ModItems.ROSE_GOLD_HOE .get(),
                        ModItems.ROSE_GOLD_AXE .get(),
                        ModItems.TIN_HELMET.get(),
                        ModItems.TIN_CHESTPLATE .get(),
                        ModItems.TIN_LEGGINGS .get(),
                        ModItems.TIN_BOOTS .get(),
                        ModItems.BRONZE_HELMET .get(),
                        ModItems.BRONZE_CHESTPLATE .get(),
                        ModItems.BRONZE_LEGGINGS .get(),
                        ModItems.BRONZE_BOOTS .get(),
                        ModItems.ROSE_GOLD_HELMET .get(),
                        ModItems.ROSE_GOLD_CHESTPLATE .get(),
                        ModItems.ROSE_GOLD_LEGGINGS .get(),
                        ModItems.BRONZE_SHEARS .get(),
                        ModItems.ROSE_GOLD_BOOTS .get());

        this.tag(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.TIN_SWORD.get(),
                        ModItems.TIN_SHOVEL .get(),
                        ModItems.TIN_AXE .get(),
                        ModItems.TIN_PICKAXE .get(),
                        ModItems.TIN_HOE .get(),
                        ModItems.BRONZE_SWORD .get(),
                        ModItems.BRONZE_SHOVEL .get(),
                        ModItems.BRONZE_PICKAXE .get(),
                        ModItems.BRONZE_AXE .get(),
                        ModItems.BRONZE_HOE.get(),
                        ModItems.ROSE_GOLD_SWORD .get(),
                        ModItems.ROSE_GOLD_SHOVEL .get(),
                        ModItems.ROSE_GOLD_PICKAXE .get(),
                        ModItems.ROSE_GOLD_HOE .get(),
                        ModItems.ROSE_GOLD_AXE .get(),
                        ModItems.TIN_HELMET.get(),
                        ModItems.TIN_CHESTPLATE .get(),
                        ModItems.TIN_LEGGINGS .get(),
                        ModItems.TIN_BOOTS .get(),
                        ModItems.BRONZE_HELMET .get(),
                        ModItems.BRONZE_CHESTPLATE .get(),
                        ModItems.BRONZE_LEGGINGS .get(),
                        ModItems.BRONZE_BOOTS .get(),
                        ModItems.ROSE_GOLD_HELMET .get(),
                        ModItems.ROSE_GOLD_CHESTPLATE .get(),
                        ModItems.ROSE_GOLD_LEGGINGS .get(),
                        ModItems.BRONZE_SHEARS .get(),
                        ModItems.ROSE_GOLD_BOOTS .get());

        // Ingots
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/tin")))
                .add(ModItems.TIN_INGOT.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/bronze")))
                .add(ModItems.BRONZE_INGOT.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/rose_gold")))
                .add(ModItems.ROSE_GOLD_INGOT.get());

        // Nuggets
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/tin")))
                .add(ModItems.TIN_NUGGET.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/bronze")))
                .add(ModItems.BRONZE_NUGGET.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/rose_gold")))
                .add(ModItems.ROSE_GOLD_NUGGET.get());

        // Raw materials
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/tin")))
                .add(ModItems.RAW_TIN.get());

        // Ores as items
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tin")))
                .add(
                        ModItems.TIN_ORE.get(),
                        ModItems.DEEPSLATE_TIN_ORE.get(),
                        ModItems.SOUL_TIN_ORE.get()
                );

        // Storage blocks as items
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tin")))
                .add(ModItems.TIN_BLOCK.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_tin")))
                .add(ModItems.RAW_TIN_BLOCK.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/bronze")))
                .add(ModItems.BRONZE_BLOCK.get());

        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/rose_gold")))
                .add(ModItems.ROSE_GOLD_BLOCK.get());

    }
}