package net.lettuce.metalworks.datagen;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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

    }
}