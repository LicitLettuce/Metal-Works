package net.lettuce.metalworks.common.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class MWParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MetalWorks.MOD_ID);

    public static final RegistryObject<SimpleParticleType> MAGE_FLAME =
            PARTICLES.register("mage_flame", () -> new SimpleParticleType(true));
}
