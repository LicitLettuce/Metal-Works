package net.lettuce.metalworks.registry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MWToolTiers {
    public static final ForgeTier TIN = new  ForgeTier(
            2, 223, 5.0F, 1.5F, 15,
            MWTags.NEEDS_TIN_TOOL,
            () -> Ingredient.of(MWItems.TIN_INGOT::get)
    );
    public static final ForgeTier BRONZE = new  ForgeTier(
            2, 964, 7.0F, 2.5F, 10,
            MWTags.NEEDS_BRONZE_TOOL,
            () -> Ingredient.of(MWItems.BRONZE_INGOT.get())
    );
    public static final ForgeTier ROSE_GOLD = new  ForgeTier(
            2, 792, 11.0F, 2.0F,21,
            MWTags.NEEDS_ROSE_GOLD_TOOL,
            () -> Ingredient.of(MWItems.ROSE_GOLD_INGOT.get())
    );
}
