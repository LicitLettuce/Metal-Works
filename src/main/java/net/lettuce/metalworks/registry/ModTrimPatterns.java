package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTrimPatterns {
    public static final ResourceKey<TrimPattern> ETHOS = createKey("ethos");
    public static final ResourceKey<TrimPattern> TARNISH = createKey("tarnish");

    public static void bootstrap(BootstapContext<TrimPattern> context) {
        register(context, ETHOS, ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE.get());
        register(context, TARNISH, ModItems.TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE.get());


    }

    public static ResourceKey<TrimPattern> createKey(String name) {
        return ResourceKey.create(Registries.TRIM_PATTERN, new ResourceLocation(MetalWorks.MOD_ID, name));
    }

    private static void register(BootstapContext<TrimPattern> context, ResourceKey<TrimPattern> key, Item item) {
        context.register(
                key,
                new TrimPattern(
                        key.location(),
                        ForgeRegistries.ITEMS.getHolder(item).get(),
                        Component.translatable(Util.makeDescriptionId("trim_pattern", key.location()))
                )
        );
    }
}