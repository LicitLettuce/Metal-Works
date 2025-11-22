package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.common.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
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
                .add(ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.SOUL_TIN_ORE.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.CASSITERITE.get(),
                        ModBlocks.CASSITERITE_STAIRS.get(),
                        ModBlocks.CASSITERITE_SLAB.get(),
                        ModBlocks.CASSITERITE_WALL.get(),
                        ModBlocks.POLISHED_CASSITERITE.get(),
                        ModBlocks.POLISHED_CASSITERITE_STAIRS.get(),
                        ModBlocks.POLISHED_CASSITERITE_SLAB.get(),
                        ModBlocks.POLISHED_CASSITERITE_WALL.get(),
                        ModBlocks.CASSITERITE_BRICKS.get(),
                        ModBlocks.CRACKED_CASSITERITE_BRICKS.get(),
                        ModBlocks.CASSITERITE_BRICK_STAIRS.get(),
                        ModBlocks.CASSITERITE_BRICK_SLAB.get(),
                        ModBlocks.CASSITERITE_BRICK_WALL.get(),
                        ModBlocks.CHISELED_CASSITERITE_BRICKS.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.TARNISHED_TIN.get(),
                        ModBlocks.WAXED_TIN_BLOCK.get(),
                        ModBlocks.WAXED_TARNISHED_TIN.get(),
                        ModBlocks.CHISELED_TIN.get(),
                        ModBlocks.TARNISHED_CHISELED_TIN.get(),
                        ModBlocks.WAXED_CHISELED_TIN.get(),
                        ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get(),
                        ModBlocks.TIN_GRATE.get(),
                        ModBlocks.TARNISHED_TIN_GRATE.get(),
                        ModBlocks.WAXED_TIN_GRATE.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_GRATE.get(),
                        ModBlocks.TIN_GRATE_DRAIN.get(),
                        ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(),
                        ModBlocks.WAXED_TIN_GRATE_DRAIN.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(),
                        ModBlocks.CUT_TIN.get(),
                        ModBlocks.TARNISHED_CUT_TIN.get(),
                        ModBlocks.WAXED_CUT_TIN.get(),
                        ModBlocks.WAXED_TARNISHED_CUT_TIN.get(),
                        ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(),
                        ModBlocks.WAXED_CUT_TIN_STAIRS.get(),
                        ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get(),
                        ModBlocks.TARNISHED_CUT_TIN_SLAB.get(),
                        ModBlocks.WAXED_CUT_TIN_SLAB.get(),
                        ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get(),
                        ModBlocks.TIN_TILES.get(),
                        ModBlocks.TARNISHED_TIN_TILES.get(),
                        ModBlocks.WAXED_TIN_TILES.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_TILES.get(),
                        ModBlocks.TIN_TILE_STAIRS.get(),
                        ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(),
                        ModBlocks.WAXED_TIN_TILE_STAIRS.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get(),
                        ModBlocks.TIN_TILE_SLAB.get(),
                        ModBlocks.TARNISHED_TIN_TILE_SLAB.get(),
                        ModBlocks.WAXED_TIN_TILE_SLAB.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get(),
                        ModBlocks.TIN_SHINGLES.get(),
                        ModBlocks.TARNISHED_TIN_SHINGLES.get(),
                        ModBlocks.WAXED_TIN_SHINGLES.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(),
                        ModBlocks.TIN_SHINGLE_STAIRS.get(),
                        ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(),
                        ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(),
                        ModBlocks.TIN_SHINGLE_SLAB.get(),
                        ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(),
                        ModBlocks.WAXED_TIN_SHINGLE_SLAB.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(),
                        ModBlocks.TIN_DOOR.get(),
                        ModBlocks.TIN_TRAPDOOR.get(),
                        ModBlocks.TIN_BARS.get(),
                        ModBlocks.TARNISHED_TIN_BARS.get(),
                        ModBlocks.WAXED_TIN_BARS.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_BARS.get(),
                        ModBlocks.TIN_CHAIN.get(),
                        ModBlocks.TARNISHED_TIN_CHAIN.get(),
                        ModBlocks.WAXED_TIN_CHAIN.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_CHAIN.get(),
                        ModBlocks.TIN_LANTERN.get(),
                        ModBlocks.TARNISHED_TIN_LANTERN.get(),
                        ModBlocks.WAXED_TIN_LANTERN.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_LANTERN.get(),
                        ModBlocks.TIN_SOUL_LANTERN.get(),
                        ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get(),
                        ModBlocks.WAXED_TIN_SOUL_LANTERN.get(),
                        ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.BRONZE_GRATE.get(),
                        ModBlocks.BRONZE_GRATE_DRAIN.get(),
                        ModBlocks.BRONZE_TILES.get(),
                        ModBlocks.BRONZE_TILE_STAIRS.get(),
                        ModBlocks.BRONZE_TILE_SLAB.get(),
                        ModBlocks.BRONZE_SHINGLES.get(),
                        ModBlocks.BRONZE_SHINGLE_STAIRS.get(),
                        ModBlocks.BRONZE_SHINGLE_SLAB.get(),
                        ModBlocks.BRONZE_DOOR.get(),
                        ModBlocks.BRONZE_TRAPDOOR.get(),
                        ModBlocks.BRONZE_BARS.get(),
                        ModBlocks.LOOPING_PRESSURE_PLATE.get(),
                        ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get(),
                        ModBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(),
                        ModBlocks.ROSE_LANTERN.get(),
                        ModBlocks.MAGE_LANTERN.get());

        // Mineable w/AXe
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.MAGE_TORCH.get(),
                        ModBlocks.MAGE_CAMPFIRE.get());

        // Needs Stone Tool
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get(),
                    ModBlocks.DEEPSLATE_TIN_ORE.get(),
                    ModBlocks.SOUL_TIN_ORE.get());

        // Walls
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.CASSITERITE_WALL.get(),
                        ModBlocks.POLISHED_CASSITERITE_WALL.get(),
                        ModBlocks.CASSITERITE_BRICK_WALL.get());

        this.tag(ModTags.TIN_ORES)
                .add(ModBlocks.TIN_ORE.get(),
                    ModBlocks.DEEPSLATE_TIN_ORE.get(),
                    ModBlocks.SOUL_TIN_ORE.get());

        // Mage Fire Base Blocks
        this.tag(ModTags.MAGE_FIRE_BASE_BLOCKS)
                .add(ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get(),
                        ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get());

        // Enchantment Power Provider
        this.tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(ModBlocks.MAGE_FIRE.get(),
                        ModBlocks.MAGE_TORCH.get(),
                        ModBlocks.MAGE_LANTERN.get(),
                        ModBlocks.MAGE_CAMPFIRE.get(),
                        Blocks.BOOKSHELF);

        this.tag(ModTags.TARNISHED_TIN_BLOCKS)
                .add(ModBlocks.TARNISHED_TIN.get(),
                ModBlocks.TARNISHED_CHISELED_TIN.get(),
                ModBlocks.TARNISHED_TIN_GRATE.get(),
                ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(),
                ModBlocks.TARNISHED_CUT_TIN.get(),
                ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(),
                ModBlocks.TARNISHED_CUT_TIN_SLAB.get(),
                ModBlocks.TARNISHED_TIN_TILES.get(),
                ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(),
                ModBlocks.TARNISHED_TIN_TILE_SLAB.get(),
                ModBlocks.TARNISHED_TIN_SHINGLES.get(),
                ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(),
                ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(),
                ModBlocks.TARNISHED_TIN_BARS.get(),
                ModBlocks.TARNISHED_TIN_CHAIN.get());

    }
}