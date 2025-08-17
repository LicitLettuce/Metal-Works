package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class MWPaintings {
    public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MetalWorks.MOD_ID);

    public static final RegistryObject<PaintingVariant> MARKET = REGISTRY.register
            ("market", () -> new PaintingVariant(32, 48));
    public static final RegistryObject<PaintingVariant> PRISON = REGISTRY.register
            ("prison", () -> new PaintingVariant(32, 32));
}

