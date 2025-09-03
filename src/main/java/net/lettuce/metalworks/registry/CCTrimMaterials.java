package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class CCTrimMaterials {
    public static final ResourceKey<TrimMaterial> TIN = createKey("tin");
    public static final ResourceKey<TrimMaterial> BRONZE = createKey("bronze");
    public static final ResourceKey<TrimMaterial> ROSE_GOLD = createKey("rose_gold");

    public static void bootstrap(BootstapContext<TrimMaterial> context) {
        register(context, TIN, MWItems.TIN_INGOT.get(), Style.EMPTY.withColor(0x96a096), Map.of());
        register(context, BRONZE, MWItems.BRONZE_INGOT.get(), Style.EMPTY.withColor(0xADAFF1), Map.of());
        register(context, ROSE_GOLD, MWItems.ROSE_GOLD_INGOT.get(), Style.EMPTY.withColor(0xC7D8E6), Map.of());
    }

    private static ResourceKey<TrimMaterial> createKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, new ResourceLocation(MetalWorks.MOD_ID, name));
    }

    private static void register(BootstapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Item item, Style style, Map<ArmorMaterials, String> overrides) {
        ResourceLocation location = key.location();
        context.register(key, new TrimMaterial(location.getNamespace() + "_" + location.getPath(), ForgeRegistries.ITEMS.getHolder(item).get(), -1.0F, overrides, Component.translatable(Util.makeDescriptionId("trim_material", location)).withStyle(style)));
    }
}
