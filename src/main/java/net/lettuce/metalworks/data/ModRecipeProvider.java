package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get(),
            ModBlocks.DEEPSLATE_TIN_ORE.get(),
            ModBlocks.NETHER_TIN_ORE.get(),
            ModBlocks.CASSITERITE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }



    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Cassiterite Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CASSITERITE.get(), 1)
                .requires(Blocks.ANDESITE)
                .requires(ModItems.RAW_TIN.get())
                .unlockedBy(getHasName(ModItems.RAW_TIN.get()), has(ModItems.RAW_TIN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CASSITERITE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CASSITERITE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CASSITERITE_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.CASSITERITE_STAIRS.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":casiterite_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.CASSITERITE_SLAB.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":casiterite_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.CASSITERITE_WALL.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":casiterite_wall_from_stonecutting");

        // Polished Cassiterite
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_CASSITERITE.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_CASSITERITE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.POLISHED_CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_CASSITERITE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.POLISHED_CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.POLISHED_CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":polished_casiterite_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.POLISHED_CASSITERITE_STAIRS.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":polished_casiterite_stairs_from_cassiterite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.POLISHED_CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.POLISHED_CASSITERITE_STAIRS.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":polished_casiterite_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.POLISHED_CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.POLISHED_CASSITERITE_SLAB.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":polished_casiterite_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ModItems.CASSITERITE.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModItems.POLISHED_CASSITERITE_SLAB.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":polished_casiterite_slab_from_cassiterite_stonecutting");

        // Tin Nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                .requires(ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Ingot from Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                .requires(ModItems.TIN_NUGGET.get(), 9)
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":tin_ingot_from_nuggets");

        // Tin Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_BLOCK.get())
                .requires(ModItems.TIN_INGOT.get(), 9)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Ingot from Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_BLOCK.get()), has(ModItems.TIN_BLOCK.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":tin_ingot_from_block");

        // Raw Tin Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN_BLOCK.get())
                .requires(ModItems.RAW_TIN.get(), 9)
                .unlockedBy(getHasName(ModItems.RAW_TIN.get()), has(ModItems.RAW_TIN.get()))
                .save(pWriter);

        // Raw Tin from Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TIN.get(), 9)
                .requires(ModItems.RAW_TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_BLOCK.get()), has(ModItems.TIN_BLOCK.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":raw_tin_from_block");

        // Chiseled Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CHISELED_TIN.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);


        // Tin Bars
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_BARS.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Door
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TRAPDOOR.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Chain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_CHAIN.get(), 1)
                .pattern("$")
                .pattern("#")
                .pattern("$")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Lantern
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_LANTERN.get(), 1)
                .pattern("$$$")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', Items.TORCH)
                .define('$', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pWriter);

        // Tin Soul Lantern
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SOUL_LANTERN.get(), 1)
                .pattern("$$$")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', Items.SOUL_TORCH)
                .define('$', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pWriter);

        // Tin Mage Lantern
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_MAGE_LANTERN.get(), 1)
                .pattern("$$$")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', ModItems.MAGE_TORCH.get())
                .define('$', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pWriter);

        // Chiseled Tarnished Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CHISELED_TIN.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.TARNISHED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.TARNISHED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.TARNISHED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TARNISHED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.TARNISHED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tarnished Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.TARNISHED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Chiseled Corroded Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CHISELED_TIN.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.CORRODED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.CORRODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.CORRODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CORRODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CORRODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Corroded Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CORRODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Chiseled Eroded Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CHISELED_TIN.get(), 1)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.ERODED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.ERODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.ERODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.ERODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.ERODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Eroded Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.ERODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Chiseled Tarnished Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CHISELED_TIN.get())
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_TARNISHED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_TARNISHED_TIN_GRATE.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TARNISHED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_TARNISHED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Tarnished Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_TARNISHED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);


        // Waxed Chiseled Corroded Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CHISELED_TIN.get())
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_CORRODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_CORRODED_TIN_GRATE.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_CORRODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_CORRODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Corroded Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_CORRODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Chiseled Eroded Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CHISELED_TIN.get())
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.WAXED_ERODED_CUT_TIN_SLAB.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_ERODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Grate Drain
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.WAXED_ERODED_TIN_GRATE.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Cut Tin Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Cut Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_ERODED_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Cut Tin Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_CUT_TIN.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.WAXED_ERODED_TIN_TILES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Shingle Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Waxed Eroded Tin Shingle Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.WAXED_ERODED_TIN_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TIN_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("$")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TIN_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TIN_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TIN_SHOVEL.get())
                .pattern("#")
                .pattern("$")
                .pattern("$")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TIN_HOE.get())
                .pattern("##")
                .pattern(" $")
                .pattern(" $")
                .define('#', ModItems.TIN_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TIN_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TIN_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TIN_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Crude Bronze
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CRUDE_BRONZE.get(), 4)
                .requires(ModItems.RAW_TIN.get(), 4)
                .requires(Items.RAW_COPPER, 4)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Bronze Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.CRUDE_BRONZE.get()),
                        RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 200)
                .unlockedBy(getHasName(ModItems.CRUDE_BRONZE.get()), has(ModItems.CRUDE_BRONZE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":smelting/crude_bronze_to_bronze_ingot");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.CRUDE_BRONZE.get()),
                        RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 100)
                .unlockedBy(getHasName(ModItems.CRUDE_BRONZE.get()), has(ModItems.CRUDE_BRONZE.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":blasting/crude_bronze_to_bronze_ingot");

        // Bronze Nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_NUGGET.get(), 9)
                .requires(ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Ingot From Bronze Nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 1)
                .requires(ModItems.BRONZE_NUGGET.get(), 9)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":bronze_ingot_from_bronze_nugget");

        // Bronze Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLOCK.get(), 1)
                .requires(ModItems.BRONZE_INGOT.get(), 9)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Ingot From Bronze Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModItems.BRONZE_BLOCK.get(), 1)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":bronze_ingot_from_bronze_block");

        // Bronze Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.BRONZE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Grate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_GRATE_DRAIN.get(), 6)
                .pattern("# #")
                .pattern(" # ")
                .define('#', ModItems.BRONZE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Tiles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BRONZE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.BRONZE_TILES.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.BRONZE_TILES.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Shingles
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BRONZE_TILES.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Tile Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.BRONZE_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Tile Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.BRONZE_SHINGLES.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Door
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TRAPDOOR.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_BARS.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_SWORD.get(), 1)
                .pattern("#")
                .pattern("#")
                .pattern("$")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_PICKAXE.get(), 1)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_AXE.get(), 1)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_SHOVEL.get(), 1)
                .pattern("#")
                .pattern("$")
                .pattern("$")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_HOE.get(), 1)
                .pattern("##")
                .pattern(" $")
                .pattern(" $")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Shears
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_SHEARS.get(), 1)
                .pattern(" #")
                .pattern("# ")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_HELMET.get(), 1)
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_CHESTPLATE.get(), 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_LEGGINGS.get(), 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Boots
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BRONZE_BOOTS.get(), 1)
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Crude Rose Gold
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CRUDE_ROSE_GOLD.get(), 4)
                .requires(Items.RAW_GOLD, 4)
                .requires(Items.RAW_COPPER, 4)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        // Rose Gold Ingot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.CRUDE_ROSE_GOLD.get()),
                        RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.7f, 200)
                .unlockedBy(getHasName(ModItems.CRUDE_ROSE_GOLD.get()), has(ModItems.CRUDE_ROSE_GOLD.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":smelting/crude_rose_gold_to_rose_gold_ingot");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.CRUDE_ROSE_GOLD.get()),
                        RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 0.7f, 100)
                .unlockedBy(getHasName(ModItems.CRUDE_ROSE_GOLD.get()), has(ModItems.CRUDE_ROSE_GOLD.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":blasting/crude_rose_gold_to_rose_gold_ingot");

        // Rose Gold Nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Ingot From Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 1)
                .requires(ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":rose_gold_ingot_from_nuggets");

        // Rose Gold Beetroot
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BEETROOT.get(), 1)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_NUGGET.get())
                .define('@', Items.BEETROOT)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_BLOCK.get(), 1)
                .requires(ModItems.ROSE_GOLD_INGOT.get(), 9)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        //Mage Powder
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MAGE_POWDER.get(), 2)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_NUGGET.get())
                .define('@', Items.GUNPOWDER)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Ingot From Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 9)
                .requires(ModItems.ROSE_GOLD_BLOCK.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_BLOCK.get()), has(ModItems.ROSE_GOLD_BLOCK.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":rose_gold_ingot_from_block");

        // Rose Gold Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("$")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL.get())
                .pattern("#")
                .pattern("$")
                .pattern("$")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE.get())
                .pattern("##")
                .pattern(" $")
                .pattern(" $")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Rose Gold Boots
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin");

        //Rose Gold Mosaic
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.ROSE_GOLD_BLOCK.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_MOSAIC.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.ROSE_GOLD_MOSAIC.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        // Mage Fire
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.MAGE_TORCH.get(), 4)
                .pattern("#")
                .pattern("$")
                .pattern("@")
                .define('#', ItemTags.COALS)
                .define('$', Items.STICK)
                .define('@', ModItems.MAGE_POWDER.get())
                .unlockedBy(getHasName(ModItems.MAGE_POWDER.get()), has(ModItems.MAGE_POWDER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.MAGE_LANTERN.get(), 1)
                .pattern("$$$")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', ModItems.MAGE_TORCH.get())
                .define('$', Items.IRON_NUGGET)
                .unlockedBy(getHasName(ModItems.MAGE_TORCH.get()), has(ModItems.MAGE_TORCH.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGE_CAMPFIRE.get(), 1)
                .pattern(" $ " )
                .pattern("$@$")
                .pattern("###")
                .define('#', ItemTags.LOGS)
                .define('$', Items.STICK)
                .define('@', ModItems.MAGE_POWDER.get())
                .unlockedBy(getHasName(ModItems.MAGE_TORCH.get()), has(ModItems.MAGE_TORCH.get()))
                .save(pWriter);

        // Medium Weighted Pressure Plate
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), 1)
                .pattern("##")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGE_TORCH.get()), has(ModItems.MAGE_TORCH.get()))
                .save(pWriter);

        // Looping Pressure Plate
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModItems.LOOPING_PRESSURE_PLATE.get(), 1)
                .pattern("##")
                .pattern("%%")
                .define('#', ModItems.BRONZE_INGOT.get())
                .define('%', Items.REDSTONE)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Rose Lantern
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_LANTERN.get(), 4)
                .pattern("#@#")
                .pattern("@ @")
                .pattern("#@#")
                .define('#', ModItems.ROSE_GOLD_INGOT.get())
                .define('@', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        buildWaxingRecipes(pWriter);

        // Cut Tin From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN.get(),            4, "tin_block_to_cut_tin");

        // Cut Tin Stairs From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_STAIRS.get(),      4, "tin_block_to_cut_tin_stairs");

        // Cut Tin Slab From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_SLAB.get(),        8, "tin_block_to_cut_tin_slab");

        // Tin Tiles From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILES.get(),           4, "tin_block_to_tin_tiles");

        // Tin Tile Stairs From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_STAIRS.get(),     4, "tin_block_to_tin_tile_stairs");

        // Tin Tile Slab From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_SLAB.get(),       8, "tin_block_to_tin_tile_slab");

        // Tin Shingles From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLES.get(),        4, "tin_block_to_tin_shingles");

        // Tin Shingle Stairs From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_STAIRS.get(),  4, "tin_block_to_tin_shingle_stairs");

        // Tin Shingle Slab From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_SLAB.get(),    8, "tin_block_to_tin_shingle_slab");

        // Tin Grate From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_GRATE.get(),           4, "tin_block_to_tin_grate");

        // Tin Grate Drain From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_GRATE_DRAIN.get(),     8, "tin_block_to_tin_grate_drain");

        // Chiseled Tin From Stonecutting Tin Block
        stonecut(pWriter, ModItems.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CHISELED_TIN.get(),        4, "tin_block_to_chiseled_tin");

        // Cut Tin Stairs From Stonecutting Cut Tin
        stonecut(pWriter, ModItems.CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_STAIRS.get(),        1, "cut_tin_to_cut_tin_stairs");

        // Cut Tin Slab From Stonecutting Cut Tin
        stonecut(pWriter, ModItems.CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_TIN_SLAB.get(),          2, "cut_tin_to_cut_tin_slab");

        // Tin Tile Stairs From Stonecutting Tin Tiles
        stonecut(pWriter, ModItems.TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_STAIRS.get(),     1, "tin_tiles_to_tile_stairs");

        // Tin Tile Slab From Stonecutting Tin Tiles
        stonecut(pWriter, ModItems.TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_TILE_SLAB.get(),       2, "tin_tiles_to_tile_slab");

        // Tin Shingle Stairs From Stonecutting Tin Shingles
        stonecut(pWriter, ModItems.TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_STAIRS.get(), 1, "tin_shingles_to_shingle_stairs");

        // Tin Shingle Slab From Stonecutting Tin Shingles
        stonecut(pWriter, ModItems.TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_SHINGLE_SLAB.get(),   2, "tin_shingles_to_shingle_slab");

        // Tarnished Cut Tin From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN.get(),            4, "tarnished_tin_to_tarnished_cut_tin");

        // Tarnished Cut Tin Stairs From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_STAIRS.get(),      4, "tarnished_tin_to_tarnished_cut_tin_stairs");

        // Tarnished Cut Tin Slab From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_SLAB.get(),        8, "tarnished_tin_to_tarnished_cut_tin_slab");

        // Tarnished Tin Tiles From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILES.get(),           4, "tarnished_tin_to_tarnished_tin_tiles");

        // Tarnished Tin Tile Stairs From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_STAIRS.get(),     4, "tarnished_tin_to_tarnished_tin_tile_stairs");

        // Tarnished Tin Tile Slab From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_SLAB.get(),       8, "tarnished_tin_to_tarnished_tin_tile_slab");

        // Tarnished Tin Shingles From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLES.get(),        4, "tarnished_tin_to_tarnished_tin_shingles");

        // Tarnished Tin Shingle Stairs From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get(),  4, "tarnished_tin_to_tarnished_tin_shingle_stairs");

        // Tarnished Tin Shingle Slab From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_SLAB.get(),    8, "tarnished_tin_to_tarnished_tin_shingle_slab");

        // Tarnished Tin Grate From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_GRATE.get(),           4, "tarnished_tin_to_tarnished_tin_grate");

        // Tarnished Tin Grate Drain From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_GRATE_DRAIN.get(),     8, "tarnished_tin_to_tarnished_tin_grate_drain");

        // Tarnished Chiseled Tin From Stonecutting Tarnished Tin
        stonecut(pWriter, ModItems.TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CHISELED_TIN.get(),        4, "tarnished_tin_to_tarnished_chiseled_tin");

        // Tarnished Cut Tin Stairs From Stonecutting Tarnished Cut Tin
        stonecut(pWriter, ModItems.TARNISHED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_STAIRS.get(),  1, "tarnished_cut_tin_to_stairs");

        // Tarnished Cut Tin Slab From Stonecutting Tarnished Cut Tin
        stonecut(pWriter, ModItems.TARNISHED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_CUT_TIN_SLAB.get(),    2, "tarnished_cut_tin_to_slab");

        // Tarnished Tin Tile Stairs From Stonecutting Tarnished Tin Tiles
        stonecut(pWriter, ModItems.TARNISHED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_STAIRS.get(), 1, "tarnished_tin_tiles_to_stairs");

        // Tarnished Tin Tile Slab From Stonecutting Tarnished Tin Tiles
        stonecut(pWriter, ModItems.TARNISHED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_TILE_SLAB.get(),   2, "tarnished_tin_tiles_to_slab");

        // Tarnished Tin Shingle Stairs From Stonecutting Tarnished Tin Shingles
        stonecut(pWriter, ModItems.TARNISHED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get(), 1, "tarnished_tin_shingles_to_stairs");

        // Tarnished Tin Shingle Slab From Stonecutting Tarnished Tin Shingles
        stonecut(pWriter, ModItems.TARNISHED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.TARNISHED_TIN_SHINGLE_SLAB.get(),   2, "tarnished_tin_shingles_to_slab");

        // Corroded Cut Tin Stairs From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_STAIRS.get(),      4, "corroded_tin_to_corroded_cut_tin_stairs");

        // Corroded Cut Tin Slab From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_SLAB.get(),        8, "corroded_tin_to_corroded_cut_tin_slab");

        // Corroded Tin Tiles From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILES.get(),           4, "corroded_tin_to_corroded_tin_tiles");

        // Corroded Tin Tile Stairs From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_STAIRS.get(),     4, "corroded_tin_to_corroded_tin_tile_stairs");

        // Corroded Tin Tile Slab From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_SLAB.get(),       8, "corroded_tin_to_corroded_tin_tile_slab");

        // Corroded Tin Shingles From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLES.get(),        4, "corroded_tin_to_corroded_tin_shingles");

        // Corroded Tin Shingle Stairs From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_STAIRS.get(),  4, "corroded_tin_to_corroded_tin_shingle_stairs");

        // Corroded Tin Shingle Slab From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_SLAB.get(),    8, "corroded_tin_to_corroded_tin_shingle_slab");

        // Corroded Tin Grate From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_GRATE.get(),           4, "corroded_tin_to_corroded_tin_grate");

        // Corroded Tin Grate Drain From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_GRATE_DRAIN.get(),     8, "corroded_tin_to_corroded_tin_grate_drain");

        // Corroded Chiseled Tin From Stonecutting Corroded Tin
        stonecut(pWriter, ModItems.CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CHISELED_TIN.get(),        4, "corroded_tin_to_corroded_chiseled_tin");

        // Corroded Cut Tin Stairs From Stonecutting Corroded Cut Tin
        stonecut(pWriter, ModItems.CORRODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_STAIRS.get(),  1, "corroded_cut_tin_to_stairs");

        // Corroded Cut Tin Slab From Stonecutting Corroded Cut Tin
        stonecut(pWriter, ModItems.CORRODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_CUT_TIN_SLAB.get(),    2, "corroded_cut_tin_to_slab");

        // Corroded Tin Tile Stairs From Stonecutting Corroded Tin Tiles
        stonecut(pWriter, ModItems.CORRODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_STAIRS.get(), 1, "corroded_tin_tiles_to_stairs");

        // Corroded Tin Tile Slab From Stonecutting Corroded Tin Tiles
        stonecut(pWriter, ModItems.CORRODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_TILE_SLAB.get(),   2, "corroded_tin_tiles_to_slab");

        // Corroded Tin Shingle Stairs From Stonecutting Corroded Tin Shingles
        stonecut(pWriter, ModItems.CORRODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_STAIRS.get(), 1, "corroded_tin_shingles_to_stairs");

        // Corroded Tin Shingle Slab From Stonecutting Corroded Tin Shingles
        stonecut(pWriter, ModItems.CORRODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.CORRODED_TIN_SHINGLE_SLAB.get(),   2, "corroded_tin_shingles_to_slab");

        // Eroded Cut Tin From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN.get(),            4, "eroded_tin_to_eroded_cut_tin");

        // Eroded Cut Tin Stairs From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_STAIRS.get(),      4, "eroded_tin_to_eroded_cut_tin_stairs");

        // Eroded Cut Tin Slab From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_SLAB.get(),        8, "eroded_tin_to_eroded_cut_tin_slab");

        // Eroded Tin Tiles From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILES.get(),           4, "eroded_tin_to_eroded_tin_tiles");

        // Eroded Tin Tile Stairs From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_STAIRS.get(),     4, "eroded_tin_to_eroded_tin_tile_stairs");

        // Eroded Tin Tile Slab From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_SLAB.get(),       8, "eroded_tin_to_eroded_tin_tile_slab");

        // Eroded Tin Shingles From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLES.get(),        4, "eroded_tin_to_eroded_tin_shingles");

        // Eroded Tin Shingle Stairs From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_STAIRS.get(),  4, "eroded_tin_to_eroded_tin_shingle_stairs");

        // Eroded Tin Shingle Slab From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_SLAB.get(),    8, "eroded_tin_to_eroded_tin_shingle_slab");

        // Eroded Tin Grate From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_GRATE.get(),           4, "eroded_tin_to_eroded_tin_grate");

        // Eroded Tin Grate Drain From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_GRATE_DRAIN.get(),     8, "eroded_tin_to_eroded_tin_grate_drain");

        // Eroded Chiseled Tin From Stonecutting Eroded Tin
        stonecut(pWriter, ModItems.ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CHISELED_TIN.get(),        4, "eroded_tin_to_eroded_chiseled_tin");

        // Eroded Cut Tin Stairs From Stonecutting Eroded Cut Tin
        stonecut(pWriter, ModItems.ERODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_STAIRS.get(),  1, "eroded_cut_tin_to_stairs");

        // Eroded Cut Tin Slab From Stonecutting Eroded Cut Tin
        stonecut(pWriter, ModItems.ERODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_CUT_TIN_SLAB.get(),    2, "eroded_cut_tin_to_slab");

        // Eroded Tin Tile Stairs From Stonecutting Eroded Tin Tiles
        stonecut(pWriter, ModItems.ERODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_STAIRS.get(), 1, "eroded_tin_tiles_to_stairs");

        // Eroded Tin Tile Slab From Stonecutting Eroded Tin Tiles
        stonecut(pWriter, ModItems.ERODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_TILE_SLAB.get(),   2, "eroded_tin_tiles_to_slab");

        // Eroded Tin Shingle Stairs From Stonecutting Eroded Tin Shingles
        stonecut(pWriter, ModItems.ERODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_STAIRS.get(), 1, "eroded_tin_shingles_to_stairs");

        // Eroded Tin Shingle Slab From Stonecutting Eroded Tin Shingles
        stonecut(pWriter, ModItems.ERODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ERODED_TIN_SHINGLE_SLAB.get(),   2, "eroded_tin_shingles_to_slab");

        // Cut Tin From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN.get(),            4, "waxed_tin_block_to_waxed_cut_tin");

        // Cut Tin Stairs From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_STAIRS.get(),      4, "waxed_tin_block_to_waxed_cut_tin_stairs");

        // Cut Tin Slab From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_SLAB.get(),        8, "waxed_tin_block_to_waxed_cut_tin_slab");

        // Tin Tiles From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILES.get(),           4, "waxed_tin_block_to_waxed_tin_tiles");

        // Tin Tile Stairs From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_STAIRS.get(),     4, "waxed_tin_block_to_waxed_tin_tile_stairs");

        // Tin Tile Slab From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_SLAB.get(),       8, "waxed_tin_block_to_waxed_tin_tile_slab");

        // Tin Shingles From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLES.get(),        4, "waxed_tin_block_to_waxed_tin_shingles");

        // Tin Shingle Stairs From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_STAIRS.get(),  4, "waxed_tin_block_to_waxed_tin_shingle_stairs");

        // Tin Shingle Slab From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_SLAB.get(),    8, "waxed_tin_block_to_waxed_tin_shingle_slab");

        // Tin Grate From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_GRATE.get(),           4, "waxed_tin_block_to_waxed_tin_grate");

        // Tin Grate Drain From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_GRATE_DRAIN.get(),     8, "waxed_tin_block_to_waxed_tin_grate_drain");

        // Chiseled Tin From Stonecutting Waxed Tin Block
        stonecut(pWriter, ModItems.WAXED_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CHISELED_TIN.get(),        4, "waxed_tin_block_to_waxed_chiseled_tin");

        // Cut Tin Stairs From Stonecutting Waxed Cut Tin
        stonecut(pWriter, ModItems.WAXED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_STAIRS.get(),        1, "waxed_cut_tin_to_stairs");

        // Cut Tin Slab From Stonecutting Waxed Cut Tin
        stonecut(pWriter, ModItems.WAXED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_TIN_SLAB.get(),          2, "waxed_cut_tin_to_slab");

        // Tin Tile Stairs From Stonecutting Waxed Tin Tiles
        stonecut(pWriter, ModItems.WAXED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_STAIRS.get(),     1, "waxed_tin_tiles_to_stairs");

        // Tin Tile Slab From Stonecutting Waxed Tin Tiles
        stonecut(pWriter, ModItems.WAXED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_TILE_SLAB.get(),       2, "waxed_tin_tiles_to_slab");

        // Tin Shingle Stairs From Stonecutting Waxed Tin Shingles
        stonecut(pWriter, ModItems.WAXED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_STAIRS.get(), 1, "waxed_tin_shingles_to_stairs");

        // Tin Shingle Slab From Stonecutting Waxed Tin Shingles
        stonecut(pWriter, ModItems.WAXED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TIN_SHINGLE_SLAB.get(),   2, "waxed_tin_shingles_to_slab");

        // Tarnished Cut Tin From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN.get(),            4, "waxed_tarnished_tin_to_waxed_tarnished_cut_tin");

        // Tarnished Cut Tin Stairs From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get(),      4, "waxed_tarnished_tin_to_waxed_tarnished_cut_tin_stairs");

        // Tarnished Cut Tin Slab From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get(),        8, "waxed_tarnished_tin_to_waxed_tarnished_cut_tin_slab");

        // Tarnished Tin Tiles From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILES.get(),           4, "waxed_tarnished_tin_to_waxed_tarnished_tin_tiles");

        // Tarnished Tin Tile Stairs From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get(),     4, "waxed_tarnished_tin_to_waxed_tarnished_tin_tile_stairs");

        // Tarnished Tin Tile Slab From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get(),       8, "waxed_tarnished_tin_to_waxed_tarnished_tin_tile_slab");

        // Tarnished Tin Shingles From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLES.get(),        4, "waxed_tarnished_tin_to_waxed_tarnished_tin_shingles");

        // Tarnished Tin Shingle Stairs From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(),  4, "waxed_tarnished_tin_to_waxed_tarnished_tin_shingle_stairs");

        // Tarnished Tin Shingle Slab From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(),    8, "waxed_tarnished_tin_to_waxed_tarnished_tin_shingle_slab");

        // Tarnished Tin Grate From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_GRATE.get(),           4, "waxed_tarnished_tin_to_waxed_tarnished_tin_grate");

        // Tarnished Tin Grate Drain From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(),     8, "waxed_tarnished_tin_to_waxed_tarnished_tin_grate_drain");

        // Tarnished Chiseled Tin From Stonecutting Waxed Tarnished Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CHISELED_TIN.get(),        4, "waxed_tarnished_tin_to_waxed_tarnished_chiseled_tin");

        // Tarnished Cut Tin Stairs From Stonecutting Waxed Tarnished Cut Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get(),  1, "waxed_tarnished_cut_tin_to_stairs");

        // Tarnished Cut Tin Slab From Stonecutting Waxed Tarnished Cut Tin
        stonecut(pWriter, ModItems.WAXED_TARNISHED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get(),    2, "waxed_tarnished_cut_tin_to_slab");

        // Tarnished Tin Tile Stairs From Stonecutting Waxed Tarnished Tin Tiles
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get(), 1, "waxed_tarnished_tin_tiles_to_stairs");

        // Tarnished Tin Tile Slab From Stonecutting Waxed Tarnished Tin Tiles
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get(),   2, "waxed_tarnished_tin_tiles_to_slab");

        // Tarnished Tin Shingle Stairs From Stonecutting Waxed Tarnished Tin Shingles
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(), 1, "waxed_tarnished_tin_shingles_to_stairs");

        // Tarnished Tin Shingle Slab From Stonecutting Waxed Tarnished Tin Shingles
        stonecut(pWriter, ModItems.WAXED_TARNISHED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(),   2, "waxed_tarnished_tin_shingles_to_slab");

        // Corroded Cut Tin From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN.get(),            4, "waxed_corroded_tin_to_waxed_corroded_cut_tin");

        // Corroded Cut Tin Stairs From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_STAIRS.get(),      4, "waxed_corroded_tin_to_waxed_corroded_cut_tin_stairs");

        // Corroded Cut Tin Slab From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get(),        8, "waxed_corroded_tin_to_waxed_corroded_cut_tin_slab");

        // Corroded Tin Tiles From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILES.get(),           4, "waxed_corroded_tin_to_waxed_corroded_tin_tiles");

        // Corroded Tin Tile Stairs From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_STAIRS.get(),     4, "waxed_corroded_tin_to_waxed_corroded_tin_tile_stairs");

        // Corroded Tin Tile Slab From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_SLAB.get(),       8, "waxed_corroded_tin_to_waxed_corroded_tin_tile_slab");

        // Corroded Tin Shingles From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLES.get(),        4, "waxed_corroded_tin_to_waxed_corroded_tin_shingles");

        // Corroded Tin Shingle Stairs From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get(),  4, "waxed_corroded_tin_to_waxed_corroded_tin_shingle_stairs");

        // Corroded Tin Shingle Slab From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get(),    8, "waxed_corroded_tin_to_waxed_corroded_tin_shingle_slab");

        // Corroded Tin Grate From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_GRATE.get(),           4, "waxed_corroded_tin_to_waxed_corroded_tin_grate");

        // Corroded Tin Grate Drain From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get(),     8, "waxed_corroded_tin_to_waxed_corroded_tin_grate_drain");

        // Corroded Chiseled Tin From Stonecutting Waxed Corroded Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CHISELED_TIN.get(),        4, "waxed_corroded_tin_to_waxed_corroded_chiseled_tin");

        // Corroded Cut Tin Stairs From Stonecutting Waxed Corroded Cut Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_STAIRS.get(),  1, "waxed_corroded_cut_tin_to_stairs");

        // Corroded Cut Tin Slab From Stonecutting Waxed Corroded Cut Tin
        stonecut(pWriter, ModItems.WAXED_CORRODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_CUT_TIN_SLAB.get(),    2, "waxed_corroded_cut_tin_to_slab");

        // Corroded Tin Tile Stairs From Stonecutting Waxed Corroded Tin Tiles
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_STAIRS.get(), 1, "waxed_corroded_tin_tiles_to_stairs");

        // Corroded Tin Tile Slab From Stonecutting Waxed Corroded Tin Tiles
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_TILE_SLAB.get(),   2, "waxed_corroded_tin_tiles_to_slab");

        // Corroded Tin Shingle Stairs From Stonecutting Waxed Corroded Tin Shingles
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get(), 1, "waxed_corroded_tin_shingles_to_stairs");

        // Corroded Tin Shingle Slab From Stonecutting Waxed Corroded Tin Shingles
        stonecut(pWriter, ModItems.WAXED_CORRODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get(),   2, "waxed_corroded_tin_shingles_to_slab");

        // Eroded Cut Tin From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN.get(),            4, "waxed_eroded_tin_to_waxed_eroded_cut_tin");

        // Eroded Cut Tin Stairs From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_STAIRS.get(),      4, "waxed_eroded_tin_to_waxed_eroded_cut_tin_stairs");

        // Eroded Cut Tin Slab From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_SLAB.get(),        8, "waxed_eroded_tin_to_waxed_eroded_cut_tin_slab");

        // Eroded Tin Tiles From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILES.get(),           4, "waxed_eroded_tin_to_waxed_eroded_tin_tiles");

        // Eroded Tin Tile Stairs From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_STAIRS.get(),     4, "waxed_eroded_tin_to_waxed_eroded_tin_tile_stairs");

        // Eroded Tin Tile Slab From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_SLAB.get(),       8, "waxed_eroded_tin_to_waxed_eroded_tin_tile_slab");

        // Eroded Tin Shingles From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLES.get(),        4, "waxed_eroded_tin_to_waxed_eroded_tin_shingles");

        // Eroded Tin Shingle Stairs From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get(),  4, "waxed_eroded_tin_to_waxed_eroded_tin_shingle_stairs");

        // Eroded Tin Shingle Slab From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get(),    8, "waxed_eroded_tin_to_waxed_eroded_tin_shingle_slab");

        // Eroded Tin Grate From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_GRATE.get(),           4, "waxed_eroded_tin_to_waxed_eroded_tin_grate");

        // Eroded Tin Grate Drain From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_GRATE_DRAIN.get(),     8, "waxed_eroded_tin_to_waxed_eroded_tin_grate_drain");

        // Eroded Chiseled Tin From Stonecutting Waxed Eroded Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CHISELED_TIN.get(),        4, "waxed_eroded_tin_to_waxed_eroded_chiseled_tin");

        // Eroded Cut Tin Stairs From Stonecutting Waxed Eroded Cut Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_STAIRS.get(),  1, "waxed_eroded_cut_tin_to_stairs");

        // Eroded Cut Tin Slab From Stonecutting Waxed Eroded Cut Tin
        stonecut(pWriter, ModItems.WAXED_ERODED_CUT_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_CUT_TIN_SLAB.get(),    2, "waxed_eroded_cut_tin_to_slab");

        // Eroded Tin Tile Stairs From Stonecutting Waxed Eroded Tin Tiles
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_STAIRS.get(), 1, "waxed_eroded_tin_tiles_to_stairs");

        // Eroded Tin Tile Slab From Stonecutting Waxed Eroded Tin Tiles
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_TILE_SLAB.get(),   2, "waxed_eroded_tin_tiles_to_slab");

        // Eroded Tin Shingle Stairs From Stonecutting Waxed Eroded Tin Shingles
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get(), 1, "waxed_eroded_tin_shingles_to_stairs");

        // Eroded Tin Shingle Slab From Stonecutting Waxed Eroded Tin Shingles
        stonecut(pWriter, ModItems.WAXED_ERODED_TIN_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get(),   2, "waxed_eroded_tin_shingles_to_slab");

        // Bronze Tiles From Stonecutting
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILES.get(),   4, "bronze_block_to_bronze_tiles");

        // Bronze Tile Stairs From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_STAIRS.get(),   4, "bronze_block_to_bronze_tile_stairs");

        // Bronze Tile Slab From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_SLAB.get(),   8, "bronze_block_to_bronze_tile_slab");

        // Bronze Shingles From Stonecutting
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLES.get(),   4, "bronze_block_to_bronze_shingles");

        // Bronze Shingle Stairs From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_STAIRS.get(),   4, "bronze_block_to_bronze_shingle_stairs");

        // Bronze Shingle Slab From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_SLAB.get(),   8, "bronze_block_to_bronze_shingle_slab");

        // Bronze Grate From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_GRATE.get(),   4, "bronze_block_to_bronze_grate");

        // Bronze Grate Drain From Stonecutting Bronze Block
        stonecut(pWriter, ModItems.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_GRATE_DRAIN.get(),   6, "bronze_block_to_bronze_grate_drain");

        // Bronze Tile Stairs Stonecutting
        stonecut(pWriter, ModItems.BRONZE_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_STAIRS.get(),   1, "bronze_tile_to_bronze_tile_stair");

        // Bronze Tile Slab Stonecutting
        stonecut(pWriter, ModItems.BRONZE_TILES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_TILE_STAIRS.get(),   2, "bronze_tile_to_bronze_tile_slab");

        // Bronze Shingle Stairs Stonecutting
        stonecut(pWriter, ModItems.BRONZE_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_STAIRS.get(),   1, "bronze_shingle_to_bronze_shingle_stair");

        // Bronze Shingle Slab Stonecutting
        stonecut(pWriter, ModItems.BRONZE_SHINGLES.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_SHINGLE_STAIRS.get(),   2, "bronze_shingle_to_bronze_shingle_slab");

        // Rose Gold Mosaic From Stonecutting Rose Gold Block
        stonecut(pWriter, ModItems.ROSE_GOLD_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC.get(),   4, "rose_gold_block_to_rose_gold_mosaic");

        // Rose Gold Mosaic Stairs From Rose Gold Block
        stonecut(pWriter, ModItems.ROSE_GOLD_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_STAIRS.get(),   4, "rose_gold_block_to_rose_gold_mosaic_stairs");

        // Rose Gold Mosaic Slab From Rose Gold Block
        stonecut(pWriter, ModItems.ROSE_GOLD_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_SLAB.get(),   8, "rose_gold_block_to_rose_gold_mosaic_slab");

        // Rose Gold Mosaic Stairs From Rose Gold Mosaic
        stonecut(pWriter, ModItems.ROSE_GOLD_MOSAIC.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_STAIRS.get(),   1, "rose_gold_mosaic_to_rose_gold_mosaic_stairs");

        // Rose Gold Mosaic Slab From Rose Gold Mosaic
        stonecut(pWriter, ModItems.ROSE_GOLD_MOSAIC.get(), RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_MOSAIC_SLAB.get(),   2, "rose_gold_osaic_to_rose_gold_mosaic_slab");
    }

    private void buildWaxingRecipes(Consumer<FinishedRecipe> writer) {
        List<Pair<ItemLike, ItemLike>> waxingPairs = List.of(
                // Tin Block
                Pair.of(ModBlocks.TIN_BLOCK.get(), ModBlocks.WAXED_TIN_BLOCK.get()),
                Pair.of(ModBlocks.TARNISHED_TIN.get(), ModBlocks.WAXED_TARNISHED_TIN.get()),
                Pair.of(ModBlocks.CORRODED_TIN.get(), ModBlocks.WAXED_CORRODED_TIN.get()),
                Pair.of(ModBlocks.ERODED_TIN.get(), ModBlocks.WAXED_ERODED_TIN.get()),

                // Chiseled Tin
                Pair.of(ModBlocks.CHISELED_TIN.get(), ModBlocks.WAXED_CHISELED_TIN.get()),
                Pair.of(ModBlocks.TARNISHED_CHISELED_TIN.get(), ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get()),
                Pair.of(ModBlocks.CORRODED_CHISELED_TIN.get(), ModBlocks.WAXED_CORRODED_CHISELED_TIN.get()),
                Pair.of(ModBlocks.ERODED_CHISELED_TIN.get(), ModBlocks.WAXED_ERODED_CHISELED_TIN.get()),

                // Tin Grate
                Pair.of(ModBlocks.TIN_GRATE.get(), ModBlocks.WAXED_TIN_GRATE.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_GRATE.get(), ModBlocks.WAXED_TARNISHED_TIN_GRATE.get()),
                Pair.of(ModBlocks.CORRODED_TIN_GRATE.get(), ModBlocks.WAXED_CORRODED_TIN_GRATE.get()),
                Pair.of(ModBlocks.ERODED_TIN_GRATE.get(), ModBlocks.WAXED_ERODED_TIN_GRATE.get()),

                // Tin Grate Drain
                Pair.of(ModBlocks.TIN_GRATE_DRAIN.get(), ModBlocks.WAXED_TIN_GRATE_DRAIN.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get()),
                Pair.of(ModBlocks.CORRODED_TIN_GRATE_DRAIN.get(), ModBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get()),
                Pair.of(ModBlocks.ERODED_TIN_GRATE_DRAIN.get(), ModBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get()),

                // Cut Tin
                Pair.of(ModBlocks.CUT_TIN.get(), ModBlocks.WAXED_CUT_TIN.get()),
                Pair.of(ModBlocks.TARNISHED_CUT_TIN.get(), ModBlocks.WAXED_TARNISHED_CUT_TIN.get()),
                Pair.of(ModBlocks.CORRODED_CUT_TIN.get(), ModBlocks.WAXED_CORRODED_CUT_TIN.get()),
                Pair.of(ModBlocks.ERODED_CUT_TIN.get(), ModBlocks.WAXED_ERODED_CUT_TIN.get()),

                // Cut Tin Stairs
                Pair.of(ModBlocks.CUT_TIN_STAIRS.get(), ModBlocks.WAXED_CUT_TIN_STAIRS.get()),
                Pair.of(ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(), ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get()),
                Pair.of(ModBlocks.CORRODED_CUT_TIN_STAIRS.get(), ModBlocks.WAXED_CORRODED_CUT_TIN_STAIRS.get()),
                Pair.of(ModBlocks.ERODED_CUT_TIN_STAIRS.get(), ModBlocks.WAXED_ERODED_CUT_TIN_STAIRS.get()),

                // Cut Tin Slab
                Pair.of(ModBlocks.CUT_TIN_SLAB.get(), ModBlocks.WAXED_CUT_TIN_SLAB.get()),
                Pair.of(ModBlocks.TARNISHED_CUT_TIN_SLAB.get(), ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get()),
                Pair.of(ModBlocks.CORRODED_CUT_TIN_SLAB.get(), ModBlocks.WAXED_CORRODED_CUT_TIN_SLAB.get()),
                Pair.of(ModBlocks.ERODED_CUT_TIN_SLAB.get(), ModBlocks.WAXED_ERODED_CUT_TIN_SLAB.get()),

                // Tin Tiles
                Pair.of(ModBlocks.TIN_TILES.get(), ModBlocks.WAXED_TIN_TILES.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_TILES.get(), ModBlocks.WAXED_TARNISHED_TIN_TILES.get()),
                Pair.of(ModBlocks.CORRODED_TIN_TILES.get(), ModBlocks.WAXED_CORRODED_TIN_TILES.get()),
                Pair.of(ModBlocks.ERODED_TIN_TILES.get(), ModBlocks.WAXED_ERODED_TIN_TILES.get()),

                // Tin Tile Stairs
                Pair.of(ModBlocks.TIN_TILE_STAIRS.get(), ModBlocks.WAXED_TIN_TILE_STAIRS.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(), ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get()),
                Pair.of(ModBlocks.CORRODED_TIN_TILE_STAIRS.get(), ModBlocks.WAXED_CORRODED_TIN_TILE_STAIRS.get()),
                Pair.of(ModBlocks.ERODED_TIN_TILE_STAIRS.get(), ModBlocks.WAXED_ERODED_TIN_TILE_STAIRS.get()),

                // Tin Tile Slab
                Pair.of(ModBlocks.TIN_TILE_SLAB.get(), ModBlocks.WAXED_TIN_TILE_SLAB.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_TILE_SLAB.get(), ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get()),
                Pair.of(ModBlocks.CORRODED_TIN_TILE_SLAB.get(), ModBlocks.WAXED_CORRODED_TIN_TILE_SLAB.get()),
                Pair.of(ModBlocks.ERODED_TIN_TILE_SLAB.get(), ModBlocks.WAXED_ERODED_TIN_TILE_SLAB.get()),

                // Tin Shingle
                Pair.of(ModBlocks.TIN_SHINGLES.get(), ModBlocks.WAXED_TIN_SHINGLES.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_SHINGLES.get(), ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get()),
                Pair.of(ModBlocks.CORRODED_TIN_SHINGLES.get(), ModBlocks.WAXED_CORRODED_TIN_SHINGLES.get()),
                Pair.of(ModBlocks.ERODED_TIN_SHINGLES.get(), ModBlocks.WAXED_ERODED_TIN_SHINGLES.get()),

                // Tin Shingle Stairs
                Pair.of(ModBlocks.TIN_SHINGLE_STAIRS.get(), ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(), ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get()),
                Pair.of(ModBlocks.CORRODED_TIN_SHINGLE_STAIRS.get(), ModBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get()),
                Pair.of(ModBlocks.ERODED_TIN_SHINGLE_STAIRS.get(), ModBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS.get()),

                // Tin Shingle Slab
                Pair.of(ModBlocks.TIN_SHINGLE_SLAB.get(), ModBlocks.WAXED_TIN_SHINGLE_SLAB.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(), ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get()),
                Pair.of(ModBlocks.CORRODED_TIN_SHINGLE_SLAB.get(), ModBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB.get()),
                Pair.of(ModBlocks.ERODED_TIN_SHINGLE_SLAB.get(), ModBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB.get()),

                // Tin Bars
                Pair.of(ModBlocks.TIN_BARS.get(), ModBlocks.WAXED_TIN_BARS.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_BARS.get(), ModBlocks.WAXED_TARNISHED_TIN_BARS.get()),
                Pair.of(ModBlocks.CORRODED_TIN_BARS.get(), ModBlocks.WAXED_CORRODED_TIN_BARS.get()),
                Pair.of(ModBlocks.ERODED_TIN_BARS.get(), ModBlocks.WAXED_ERODED_TIN_BARS.get()),

                // Tin Chain
                Pair.of(ModBlocks.TIN_CHAIN.get(), ModBlocks.WAXED_TIN_CHAIN.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_CHAIN.get(), ModBlocks.WAXED_TARNISHED_TIN_CHAIN.get()),
                Pair.of(ModBlocks.CORRODED_TIN_CHAIN.get(), ModBlocks.WAXED_CORRODED_TIN_CHAIN.get()),
                Pair.of(ModBlocks.ERODED_TIN_CHAIN.get(), ModBlocks.WAXED_ERODED_TIN_CHAIN.get()),

                // Tin Lanterns
                Pair.of(ModBlocks.TIN_LANTERN.get(), ModBlocks.WAXED_TIN_LANTERN.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_LANTERN.get(), ModBlocks.WAXED_TARNISHED_TIN_LANTERN.get()),
                Pair.of(ModBlocks.CORRODED_TIN_LANTERN.get(), ModBlocks.WAXED_CORRODED_TIN_LANTERN.get()),
                Pair.of(ModBlocks.ERODED_TIN_LANTERN.get(), ModBlocks.WAXED_ERODED_TIN_LANTERN.get()),

                // Tin Soul Lantern
                Pair.of(ModBlocks.TIN_SOUL_LANTERN.get(), ModBlocks.WAXED_TIN_SOUL_LANTERN.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get()),
                Pair.of(ModBlocks.CORRODED_TIN_SOUL_LANTERN.get(), ModBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get()),
                Pair.of(ModBlocks.ERODED_TIN_SOUL_LANTERN.get(), ModBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get()),

                // Tin Mage Lantern
                Pair.of(ModBlocks.TIN_MAGE_LANTERN.get(), ModBlocks.WAXED_TIN_MAGE_LANTERN.get()),
                Pair.of(ModBlocks.TARNISHED_TIN_MAGE_LANTERN.get(), ModBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get()),
                Pair.of(ModBlocks.CORRODED_TIN_MAGE_LANTERN.get(), ModBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get()),
                Pair.of(ModBlocks.ERODED_TIN_MAGE_LANTERN.get(), ModBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get())
        );

        for (Pair<ItemLike, ItemLike> pair : waxingPairs) {
            makeWaxingRecipe(writer, pair.getLeft(), pair.getRight());
        }
    }

    private static void smeltDownEquipment(Consumer<FinishedRecipe> writer, List<ItemLike> inputs, ItemLike result, float xp, int cookTime, String material) {
        for (ItemLike input : inputs) {
            SimpleCookingRecipeBuilder.smelting(
                            Ingredient.of(input),
                            RecipeCategory.MISC,
                            result,
                            xp,
                            cookTime
                    )
                    .unlockedBy("has_" + getItemName(input), has(input))
                    .save(writer, MetalWorks.MOD_ID + ":" + getItemName(result) + "_from_smelting_" + getItemName(input));
        }
    }

    private void makeWaxingRecipe(Consumer<FinishedRecipe> writer, ItemLike unwaxed, ItemLike waxed) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, waxed)
                .requires(unwaxed)
                .requires(Items.HONEYCOMB)
                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                .unlockedBy("has_" + getItemName(unwaxed), has(unwaxed))
                .save(writer, new ResourceLocation(MetalWorks.MOD_ID, "waxing/" + getItemName(waxed)));
    }

    private void stonecut(Consumer<FinishedRecipe> writer, ItemLike input, RecipeCategory category,
                          ItemLike output, int count, String id) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, output, count)
                .unlockedBy(getHasName(input), has(input))
                .save(writer, MetalWorks.MOD_ID + ":stonecutting/" + id);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MetalWorks.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}