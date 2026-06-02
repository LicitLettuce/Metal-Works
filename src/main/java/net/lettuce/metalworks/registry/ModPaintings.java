package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(Registries.PAINTING_VARIANT, MetalWorks.MOD_ID);

    public static final DeferredHolder<PaintingVariant, PaintingVariant> MARKET = REGISTRY.register("market", () -> new PaintingVariant
            (2, 3, ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "market")));

    public static final DeferredHolder<PaintingVariant, PaintingVariant> PRISON = REGISTRY.register("prison", () -> new PaintingVariant
            (2, 2, ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "prison")));
}
