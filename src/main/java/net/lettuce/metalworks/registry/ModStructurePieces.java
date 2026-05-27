package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.worldgen.structure.CitadelStructure;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModStructurePieces {
    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECES =
            DeferredRegister.create(Registries.STRUCTURE_PIECE, MetalWorks.MOD_ID);

    public static final RegistryObject<StructurePieceType> CITADEL_PIECE =
            STRUCTURE_PIECES.register("lost_citadel_piece",
                    () -> CitadelStructure.Piece::new);
}