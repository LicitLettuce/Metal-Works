package net.lettuce.metalworks.data;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

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
                .requires(ModItems.BRONZE_NUGGET.get(),9)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter, MetalWorks.MOD_ID + ":bronze_ingot_from_bronze_nugget");

        // Bronze Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLOCK.get(), 1)
                .requires(ModItems.BRONZE_INGOT.get(), 9)
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        // Bronze Ingot From Bronze Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModItems.BRONZE_BLOCK.get(),1)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModItems.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModItems.TIN_BLOCK.get()), has(ModItems.TIN_BLOCK.get()))
                .save(pWriter);
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