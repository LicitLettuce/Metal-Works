package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.worldgen.structure.CitadelStructure;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModStructures {
    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPES =
            DeferredRegister.create(Registries.STRUCTURE_TYPE, MetalWorks.MOD_ID);

    public static final DeferredHolder<StructureType<?>, StructureType<CitadelStructure>> CITADEL =
            STRUCTURE_TYPES.register("lost_citadel", () -> () -> CitadelStructure.CODEC);
}