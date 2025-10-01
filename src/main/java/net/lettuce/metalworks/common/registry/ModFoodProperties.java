package net.lettuce.metalworks.common.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ROSE_GOLD_BEETROOT = (new FoodProperties.Builder())
            .nutrition(7)
            .saturationMod(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150, 0), 0.35F)
            .build();
}
