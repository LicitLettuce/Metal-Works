package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWBlocks;
import net.lettuce.metalworks.registry.MWTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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

        this.tag(BlockTags.WALLS)
                .add(MWBlocks.CASSITERITE_WALL.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MWBlocks.TIN_ORE.get(),
                MWBlocks.DEEPSLATE_TIN_ORE.get(),
                MWBlocks.CASSITERITE_TIN_ORE.get(),
                MWBlocks.NETHER_TIN_ORE.get());

        this.tag(MWTags.TIN_ORE)
                .add(MWBlocks.TIN_ORE.get(),
        MWBlocks.DEEPSLATE_TIN_ORE.get(),
        MWBlocks.CASSITERITE_TIN_ORE.get(),
        MWBlocks.NETHER_TIN_ORE.get());

        this.tag(MWTags.CASSITERITE_ORE_REPLACEABLES)
                .add(MWBlocks.CASSITERITE.get());

        this.tag(MWTags.MAGE_FIRE_BASE_BLOCKS)
                .add(MWBlocks.ROSE_GOLD_BLOCK.get(),
                        MWBlocks.ROSE_GOLD_MOSAIC.get());

        this.tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(MWBlocks.MAGE_FIRE.get(),
                        MWBlocks.MAGE_TORCH.get(),
                        MWBlocks.MAGE_LANTERN.get(),
                        MWBlocks.MAGE_CAMPFIRE.get(),
                        MWBlocks.TIN_MAGE_LANTERN.get(),
                        MWBlocks.TARNISHED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.CORRODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.ERODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get());

    }
}