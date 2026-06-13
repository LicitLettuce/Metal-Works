package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModTrimPatterns {
    public static final ResourceKey<TrimPattern> ETHOS = create("ethos");
    public static final ResourceKey<TrimPattern> TARNISH = create("tarnish");

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, ETHOS, ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE);
        register(context, TARNISH, ModItems.TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE);
    }

    private static ResourceKey<TrimPattern> create(String name) {
        return ResourceKey.create(
                Registries.TRIM_PATTERN,
                ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, name)
        );
    }

    private static void register(BootstrapContext<TrimPattern> context,
                                 ResourceKey<TrimPattern> key,
                                 DeferredHolder<Item, ? extends Item> templateItem) {
        context.register(
                key,
                new TrimPattern(
                        key.location(),
                        templateItem.getDelegate(),
                        Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())),
                        false
                )
        );
    }
}