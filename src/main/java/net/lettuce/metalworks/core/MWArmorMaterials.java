package net.lettuce.metalworks.core;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class MWArmorMaterials {
    public static final MWArmorTiers TIN = new MWArmorTiers(
            new int[] {110, 194, 182, 105},
            new int[] {3, 5, 4, 2},
            15,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(MWItems.TIN_INGOT::get),
            "tin",
            0f,
            0f
    );

    public static final MWArmorTiers BRONZE = new MWArmorTiers(
            new int[] {290, 472, 410, 392},
            new int[] {4, 6, 6, 3},
            10,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(MWItems.BRONZE_INGOT::get),
            "bronze",
            1f,
            0.05f
    );

    public static final MWArmorTiers ROSE_GOLD = new MWArmorTiers(
            new int[] {210, 356, 319, 292},
            new int[] {3, 6, 5, 2},
            21,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(MWItems.ROSE_GOLD_INGOT::get),
            "rose_gold",
            0f,
            0f
    );
}
