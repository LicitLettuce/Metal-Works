package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.lettuce.metalworks.registry.MWTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetalWorks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MWBlocks.TIN_BLOCK.get());



        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MWBlocks.TIN_ORE.get(),
                MWBlocks.DEEPSLATE_TIN_ORE.get()

                );



    }
}