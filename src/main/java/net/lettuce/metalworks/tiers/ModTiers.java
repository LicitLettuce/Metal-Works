package net.lettuce.metalworks.tiers;

import net.lettuce.metalworks.item.custom.ModItems;
import net.lettuce.metalworks.tags.ModTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers{
    public static final ForgeTier TIN = new  ForgeTier(
            2, 223, 5.0F, 1.5F, 15,
            ModTags.NEEDS_TIN_TOOL,
            () -> Ingredient.of(ModItems.TIN_INGOT::get)
    );
    public static final ForgeTier BRONZE = new  ForgeTier(
            2, 964, 7.0F, 2.5F, 10,
            ModTags.NEEDS_BRONZE_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get())
    );
    public static final ForgeTier ROSE_GOLD = new  ForgeTier(
            2, 792, 11.0F, 2.0F,21,
            ModTags.NEEDS_ROSE_GOLD_TOOL,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())
    );
}
