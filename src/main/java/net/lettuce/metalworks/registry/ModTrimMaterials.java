package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> TIN =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "tin"));
    public static final ResourceKey<TrimMaterial> BRONZE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "bronze"));
    public static final ResourceKey<TrimMaterial> ROSE_GOLD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "rose_gold"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
    register(context, TIN, ModItems.TIN_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), -1.0F);
    register(context, BRONZE, ModItems.BRONZE_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), -1.0F);
    register(context, ROSE_GOLD, ModItems.ROSE_GOLD_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), -1.0F);

    }


    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
