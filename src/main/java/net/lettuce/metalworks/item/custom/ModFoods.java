package net.lettuce.metalworks.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.time.Duration;

public class ModFoods {
    public static final FoodProperties ROSE_GOLD_APPLE = (new FoodProperties.Builder()).nutrition(5).saturationMod(2)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 160, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 0), 1f).alwaysEat().build();
    public static final FoodProperties ROSE_GOLD_BEETROOT = (new FoodProperties.Builder()).nutrition(7)
            .saturationMod(1.4F).build();
}
