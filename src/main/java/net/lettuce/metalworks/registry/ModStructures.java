package net.lettuce.metalworks.registry;

import com.mojang.serialization.MapCodec;
import net.lettuce.metalworks.common.worldgen.structure.LostCitadelStructure;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModStructures {
    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPES =
            DeferredRegister.create(Registries.STRUCTURE_TYPE, MetalWorks.MOD_ID);

    public static final Supplier<StructureType<LostCitadelStructure>> LOST_CITADEL =
            STRUCTURE_TYPES.register("lost_citadel",
                    () -> explicitStructureTypeTyping(LostCitadelStructure.CODEC));

    private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(MapCodec<T> codec) {
        return () -> codec;
    }
}