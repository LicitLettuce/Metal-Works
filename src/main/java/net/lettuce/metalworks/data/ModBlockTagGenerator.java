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

        // Mineable w/Pickaxe
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MWBlocks.TIN_ORE.get(),
                        MWBlocks.DEEPSLATE_TIN_ORE.get(),
                        MWBlocks.NETHER_TIN_ORE.get(),
                        MWBlocks.RAW_TIN_BLOCK.get(),
                        MWBlocks.CASSITERITE.get(),
                        MWBlocks.CASSITERITE_STAIRS.get(),
                        MWBlocks.CASSITERITE_SLAB.get(),
                        MWBlocks.CASSITERITE_WALL.get(),
                        MWBlocks.POLISHED_CASSITERITE.get(),
                        MWBlocks.POLISHED_CASSITERITE_STAIRS.get(),
                        MWBlocks.POLISHED_CASSITERITE_SLAB.get(),
                        MWBlocks.TIN_BLOCK.get(),
                        MWBlocks.TARNISHED_TIN.get(),
                        MWBlocks.CORRODED_TIN.get(),
                        MWBlocks.ERODED_TIN.get(),
                        MWBlocks.WAXED_TIN_BLOCK.get(),
                        MWBlocks.WAXED_TARNISHED_TIN.get(),
                        MWBlocks.WAXED_CORRODED_TIN.get(),
                        MWBlocks.WAXED_ERODED_TIN.get(),
                        MWBlocks.TIN_PLATE.get(),
                        MWBlocks.TARNISHED_TIN_PLATE.get(),
                        MWBlocks.CORRODED_TIN_PLATE.get(),
                        MWBlocks.ERODED_TIN_PLATE.get(),
                        MWBlocks.WAXED_TIN_PLATE.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_PLATE.get(),
                        MWBlocks.WAXED_CORRODED_TIN_PLATE.get(),
                        MWBlocks.WAXED_ERODED_TIN_PLATE.get(),
                        MWBlocks.CHISELED_TIN.get(),
                        MWBlocks.TARNISHED_CHISELED_TIN.get(),
                        MWBlocks.CORRODED_CHISELED_TIN.get(),
                        MWBlocks.ERODED_CHISELED_TIN.get(),
                        MWBlocks.WAXED_CHISELED_TIN.get(),
                        MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get(),
                        MWBlocks.WAXED_CORRODED_CHISELED_TIN.get(),
                        MWBlocks.WAXED_ERODED_CHISELED_TIN.get(),
                        MWBlocks.TIN_GRATE.get(),
                        MWBlocks.TARNISHED_TIN_GRATE.get(),
                        MWBlocks.CORRODED_TIN_GRATE.get(),
                        MWBlocks.ERODED_TIN_GRATE.get(),
                        MWBlocks.WAXED_TIN_GRATE.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_GRATE.get(),
                        MWBlocks.WAXED_CORRODED_TIN_GRATE.get(),
                        MWBlocks.WAXED_ERODED_TIN_GRATE.get(),
                        MWBlocks.TIN_GRATE_DRAIN.get(),
                        MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.CORRODED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.ERODED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.WAXED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get(),
                        MWBlocks.CUT_TIN.get(),
                        MWBlocks.TARNISHED_CUT_TIN.get(),
                        MWBlocks.CORRODED_CUT_TIN.get(),
                        MWBlocks.ERODED_CUT_TIN.get(),
                        MWBlocks.WAXED_CUT_TIN.get(),
                        MWBlocks.WAXED_TARNISHED_CUT_TIN.get(),
                        MWBlocks.WAXED_CORRODED_CUT_TIN.get(),
                        MWBlocks.WAXED_ERODED_CUT_TIN.get(),
                        MWBlocks.TARNISHED_CUT_TIN_STAIRS.get(),
                        MWBlocks.CORRODED_CUT_TIN_STAIRS.get(),
                        MWBlocks.ERODED_CUT_TIN_STAIRS.get(),
                        MWBlocks.WAXED_CUT_TIN_STAIRS.get(),
                        MWBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get(),
                        MWBlocks.WAXED_CORRODED_CUT_TIN_STAIRS.get(),
                        MWBlocks.WAXED_ERODED_CUT_TIN_STAIRS.get(),
                        MWBlocks.TARNISHED_CUT_TIN_SLAB.get(),
                        MWBlocks.CORRODED_CUT_TIN_SLAB.get(),
                        MWBlocks.ERODED_CUT_TIN_SLAB.get(),
                        MWBlocks.WAXED_CUT_TIN_SLAB.get(),
                        MWBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get(),
                        MWBlocks.WAXED_CORRODED_CUT_TIN_SLAB.get(),
                        MWBlocks.WAXED_ERODED_CUT_TIN_SLAB.get(),
                        MWBlocks.TIN_TILES.get(),
                        MWBlocks.TARNISHED_TIN_TILES.get(),
                        MWBlocks.CORRODED_TIN_TILES.get(),
                        MWBlocks.ERODED_TIN_TILES.get(),
                        MWBlocks.WAXED_TIN_TILES.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_TILES.get(),
                        MWBlocks.WAXED_CORRODED_TIN_TILES.get(),
                        MWBlocks.WAXED_ERODED_TIN_TILES.get(),
                        MWBlocks.TIN_TILE_STAIRS.get(),
                        MWBlocks.TARNISHED_TIN_TILE_STAIRS.get(),
                        MWBlocks.CORRODED_TIN_TILE_STAIRS.get(),
                        MWBlocks.ERODED_TIN_TILE_STAIRS.get(),
                        MWBlocks.WAXED_TIN_TILE_STAIRS.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get(),
                        MWBlocks.WAXED_CORRODED_TIN_TILE_STAIRS.get(),
                        MWBlocks.WAXED_ERODED_TIN_TILE_STAIRS.get(),
                        MWBlocks.TIN_TILE_SLAB.get(),
                        MWBlocks.TARNISHED_TIN_TILE_SLAB.get(),
                        MWBlocks.CORRODED_TIN_TILE_SLAB.get(),
                        MWBlocks.ERODED_TIN_TILE_SLAB.get(),
                        MWBlocks.WAXED_TIN_TILE_SLAB.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get(),
                        MWBlocks.WAXED_CORRODED_TIN_TILE_SLAB.get(),
                        MWBlocks.WAXED_ERODED_TIN_TILE_SLAB.get(),
                        MWBlocks.TIN_SHINGLES.get(),
                        MWBlocks.TARNISHED_TIN_SHINGLES.get(),
                        MWBlocks.CORRODED_TIN_SHINGLES.get(),
                        MWBlocks.ERODED_TIN_SHINGLES.get(),
                        MWBlocks.WAXED_TIN_SHINGLES.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(),
                        MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get(),
                        MWBlocks.WAXED_ERODED_TIN_SHINGLES.get(),
                        MWBlocks.TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.ERODED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.WAXED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS.get(),
                        MWBlocks.TIN_SHINGLE_SLAB.get(),
                        MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.ERODED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.WAXED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB.get(),
                        MWBlocks.TIN_DOOR.get(),
                        MWBlocks.TIN_TRAPDOOR.get(),
                        MWBlocks.TIN_BARS.get(),
                        MWBlocks.TARNISHED_TIN_BARS.get(),
                        MWBlocks.CORRODED_TIN_BARS.get(),
                        MWBlocks.ERODED_TIN_BARS.get(),
                        MWBlocks.WAXED_TIN_BARS.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_BARS.get(),
                        MWBlocks.WAXED_CORRODED_TIN_BARS.get(),
                        MWBlocks.WAXED_ERODED_TIN_BARS.get(),
                        MWBlocks.TIN_CHAIN.get(),
                        MWBlocks.TARNISHED_TIN_CHAIN.get(),
                        MWBlocks.CORRODED_TIN_CHAIN.get(),
                        MWBlocks.ERODED_TIN_CHAIN.get(),
                        MWBlocks.WAXED_TIN_CHAIN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_CHAIN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_CHAIN.get(),
                        MWBlocks.WAXED_ERODED_TIN_CHAIN.get(),
                        MWBlocks.TIN_LANTERN.get(),
                        MWBlocks.TARNISHED_TIN_LANTERN.get(),
                        MWBlocks.CORRODED_TIN_LANTERN.get(),
                        MWBlocks.ERODED_TIN_LANTERN.get(),
                        MWBlocks.WAXED_TIN_LANTERN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_LANTERN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_LANTERN.get(),
                        MWBlocks.WAXED_ERODED_TIN_LANTERN.get(),
                        MWBlocks.TIN_SOUL_LANTERN.get(),
                        MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.CORRODED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.ERODED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.WAXED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get(),
                        MWBlocks.TIN_MAGE_LANTERN.get(),
                        MWBlocks.TARNISHED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.CORRODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.ERODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get(),
                        MWBlocks.BRONZE_BLOCK.get(),
                        MWBlocks.BRONZE_GRATE.get(),
                        MWBlocks.BRONZE_GRATE_DRAIN.get(),
                        MWBlocks.BRONZE_TILES.get(),
                        MWBlocks.BRONZE_TILE_STAIRS.get(),
                        MWBlocks.BRONZE_TILE_SLAB.get(),
                        MWBlocks.BRONZE_SHINGLES.get(),
                        MWBlocks.BRONZE_SHINGLE_STAIRS.get(),
                        MWBlocks.BRONZE_SHINGLE_SLAB.get(),
                        MWBlocks.BRONZE_DOOR.get(),
                        MWBlocks.BRONZE_TRAPDOOR.get(),
                        MWBlocks.BRONZE_BARS.get(),
                        MWBlocks.LOOPING_PRESSURE_PLATE.get(),
                        MWBlocks.ROSE_GOLD_BLOCK.get(),
                        MWBlocks.ROSE_GOLD_MOSAIC.get(),
                        MWBlocks.ROSE_GOLD_MOSAIC_STAIRS.get(),
                        MWBlocks.ROSE_GOLD_MOSAIC_SLAB.get(),
                        MWBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(),
                        MWBlocks.ROSE_LANTERN.get(),
                        MWBlocks.MAGE_LANTERN.get());

        // Mineable w/AXe
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(MWBlocks.MAGE_TORCH.get(),
                        MWBlocks.MAGE_CAMPFIRE.get());

        // Needs Stone Tool
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MWBlocks.TIN_ORE.get(),
                    MWBlocks.DEEPSLATE_TIN_ORE.get(),
                    MWBlocks.NETHER_TIN_ORE.get());

        // Walls
        this.tag(BlockTags.WALLS)
                .add(MWBlocks.CASSITERITE_WALL.get());

        this.tag(MWTags.TIN_ORES)
                .add(MWBlocks.TIN_ORE.get(),
                    MWBlocks.DEEPSLATE_TIN_ORE.get(),
                    MWBlocks.NETHER_TIN_ORE.get());

        // Mage Fire Base Blocks
        this.tag(MWTags.MAGE_FIRE_BASE_BLOCKS)
                .add(MWBlocks.ROSE_GOLD_BLOCK.get(),
                        MWBlocks.ROSE_GOLD_MOSAIC.get());

        // Enchantment Power Provider
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