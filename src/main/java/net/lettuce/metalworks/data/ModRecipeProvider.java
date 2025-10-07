package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get(),
            ModBlocks.DEEPSLATE_TIN_ORE.get());

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CASSITERITE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CASSITERITE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CASSITERITE_WALL.get(), 6)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POLISHED_CASSITERITE.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POLISHED_CASSITERITE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModItems.POLISHED_CASSITERITE.get())
                .unlockedBy(getHasName(ModItems.CASSITERITE.get()), has(ModItems.CASSITERITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POLISHED_CASSITERITE_SLAB.get(), 6)
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_BLOCK.get())
                .requires(ModItems.TIN_INGOT.get(), 9)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        // Tin Ingot from Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_BLOCK.get()), has(ModItems.TIN_BLOCK.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":tin_ingot_from_block");

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

        // Bronze Ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 4)
                .requires(ModItems.TIN_INGOT.get(), 4)
                .requires(Items.COPPER_INGOT, 4)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

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

        // Rose Gold Ingot Recipe
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 4)
                .requires(Items.GOLD_INGOT, 4)
                .requires(Items.COPPER_INGOT, 4)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

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

        // Rose Gold Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_BLOCK.get(), 1)
                .requires(ModItems.ROSE_GOLD_INGOT.get(), 9)
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

        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin");

        //Rose Gold Mosaic


        buildWaxingRecipes(pWriter);

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