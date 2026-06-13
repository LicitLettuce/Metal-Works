package net.lettuce.metalworks.common.worldgen.structure;

import com.mojang.serialization.MapCodec;
import net.lettuce.metalworks.registry.ModStructures;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;

import java.util.Optional;

public class LostCitadelStructure extends Structure {
    public static final MapCodec<LostCitadelStructure> CODEC = simpleCodec(LostCitadelStructure::new);

    public LostCitadelStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    public Optional<GenerationStub> findGenerationPoint(GenerationContext context) {
        ChunkPos chunkPos = context.chunkPos();

        int x = chunkPos.getMiddleBlockX();
        int z = chunkPos.getMiddleBlockZ();

        int y = 70;

        BlockPos pos = new BlockPos(x, y, z);

        return Optional.of(new GenerationStub(pos, builder -> {
            builder.addPiece(new LostCitadelPiece(
                    context.structureTemplateManager(),
                    pos,
                    context.random()
            ));
        }));
    }

    @Override
    public StructureType<?> type() {
        return ModStructures.LOST_CITADEL.get();
    }
}