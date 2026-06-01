package net.lettuce.metalworks.registry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier TIN = new SimpleTier(
            ModTags.NEEDS_TIN_TOOL,
            223, 5.0F, 1.5F, 15,
            () -> Ingredient.of(ModItems.TIN_INGOT.get())
    );
    public static final Tier BRONZE = new SimpleTier(
            ModTags.NEEDS_BRONZE_TOOL,
            964, 7.0F, 2.5F, 10,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get())
    );
    public static final Tier ROSE_GOLD = new SimpleTier(
            ModTags.NEEDS_ROSE_GOLD_TOOL,
            792, 11.0F, 2.0F, 21,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())
    );
}
