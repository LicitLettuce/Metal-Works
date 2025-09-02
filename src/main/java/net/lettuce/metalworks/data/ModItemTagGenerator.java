package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MetalWorks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        // Trimmable Armor
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(MWItems.TIN_HELMET.get(),
                MWItems.TIN_CHESTPLATE.get(),
                MWItems.TIN_LEGGINGS.get(),
                MWItems.TIN_BOOTS.get(),
                MWItems.BRONZE_HELMET.get(),
                MWItems.BRONZE_CHESTPLATE.get(),
                MWItems.BRONZE_LEGGINGS.get(),
                MWItems.BRONZE_BOOTS.get(),
                MWItems.ROSE_GOLD_HELMET.get(),
                MWItems.ROSE_GOLD_CHESTPLATE.get(),
                MWItems.ROSE_GOLD_LEGGINGS.get(),
                MWItems.ROSE_GOLD_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(MWItems.TIN_INGOT.get(),
                MWItems.BRONZE_INGOT.get(),
                MWItems.ROSE_GOLD_INGOT.get());

    }
}