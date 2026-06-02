package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.worldgen.structure.CitadelStructure;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModStructurePieces {
    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECES =
            DeferredRegister.create(Registries.STRUCTURE_PIECE, MetalWorks.MOD_ID);

    public static final DeferredHolder<StructurePieceType, StructurePieceType> CITADEL_PIECE =
            STRUCTURE_PIECES.register("lost_citadel_piece",
                    () -> CitadelStructure.Piece::new);
}