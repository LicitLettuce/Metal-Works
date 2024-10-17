package net.lettuce.metalworks.tiers;

import net.lettuce.metalworks.item.custom.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials {
    public static final ModArmorTiers TIN = new ModArmorTiers (
            new int[] {220, 232, 230, 223},
            new int[] {3, 5, 4, 2},
            15,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.TIN_INGOT::get),
            "tin",
            0f,
            0f
    );

    public static final ModArmorTiers BRONZE = new ModArmorTiers (
            new int[] {1152, 1164, 1163, 1152},
            new int[] {4, 6, 6, 3},
            10,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ModItems.BRONZE_INGOT::get),
            "bronze",
            1f,
            0.05f
    );

    public static final ModArmorTiers ROSE_GOLD = new ModArmorTiers (
            new int[] {758, 764, 749, 759},
            new int[] {3, 6, 5, 2},
            21,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT::get),
            "rose_gold",
            0f,
            0f
    );
}
