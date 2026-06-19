package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.worldgen.structure.LostCitadelPiece;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModStructurePieces {
    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECE_TYPES =
            DeferredRegister.create(Registries.STRUCTURE_PIECE, MetalWorks.MOD_ID);

    public static final Supplier<StructurePieceType> LOST_CITADEL =
            STRUCTURE_PIECE_TYPES.register("lost_citadel", () -> LostCitadelPiece::new);
}