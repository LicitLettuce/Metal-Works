package net.lettuce.metalworks.common.worldgen.structure;

import com.mojang.serialization.Codec;
import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModStructurePieces;
import net.lettuce.metalworks.registry.ModStructures;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

import java.util.Optional;

public class CitadelStructure extends Structure {
    public static final Codec<CitadelStructure> CODEC = simpleCodec(CitadelStructure::new);

    public CitadelStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    public Optional<GenerationStub> findGenerationPoint(GenerationContext context) {
        int x = context.chunkPos().getMinBlockX() + 8;
        int z = context.chunkPos().getMinBlockZ() + 8;

        Optional<Integer> yOptional = findNetherFloorY(context, x, z);

        if (yOptional.isEmpty()) {
            return Optional.empty();
        }

        // Sink it slightly into the terrain so it looks less floaty/pasted.
        BlockPos pos = new BlockPos(x, yOptional.get() - 2, z);

        return Optional.of(new GenerationStub(pos, builder ->
                addPieces(context.structureTemplateManager(), pos, builder)
        ));
    }

    private static Optional<Integer> findNetherFloorY(GenerationContext context, int x, int z) {
        final int minY = 32;
        final int maxY = 95;

        var column = context.chunkGenerator().getBaseColumn(
                x,
                z,
                context.heightAccessor(),
                context.randomState()
        );

        RandomSource random = RandomSource.create(
                context.seed()
                        + (long) context.chunkPos().x * 341873128712L
                        + (long) context.chunkPos().z * 132897987541L
        );

        for (int attempt = 0; attempt < 16; attempt++) {
            int startY = minY + random.nextInt(maxY - minY + 1);

            for (int y = startY; y >= minY; y--) {
                BlockState floor = column.getBlock(y - 1);
                BlockState feet = column.getBlock(y);
                BlockState head = column.getBlock(y + 1);

                if (isGoodNetherFloor(floor) && isOpenSpace(feet) && isOpenSpace(head)) {
                    return Optional.of(y);
                }
            }
        }

        return Optional.empty();
    }

    private static boolean isGoodNetherFloor(BlockState state) {
        return !state.isAir()
                && state.getFluidState().isEmpty()
                && !state.is(Blocks.BEDROCK);
    }

    private static boolean isOpenSpace(BlockState state) {
        return state.isAir() && state.getFluidState().isEmpty();
    }

    private static void addPieces(StructureTemplateManager templateManager,
                                  BlockPos pos,
                                  StructurePiecesBuilder builder) {
        builder.addPiece(new Piece(templateManager, pos));
    }

    @Override
    public StructureType<?> type() {
        return ModStructures.CITADEL.get();
    }

    public static class Piece extends TemplateStructurePiece {
        private static final ResourceLocation TEMPLATE =
                new ResourceLocation(MetalWorks.MOD_ID, "lost_citadel");

        public Piece(StructureTemplateManager templateManager, BlockPos pos) {
            super(
                    ModStructurePieces.CITADEL_PIECE.get(),
                    0,
                    templateManager,
                    TEMPLATE,
                    TEMPLATE.toString(),
                    makeSettings(),
                    pos
            );
        }

        public Piece(StructurePieceSerializationContext context, CompoundTag tag) {
            super(
                    ModStructurePieces.CITADEL_PIECE.get(),
                    tag,
                    context.structureTemplateManager(),
                    id -> makeSettings()
            );
        }

        private static StructurePlaceSettings makeSettings() {
            return new StructurePlaceSettings()
                    // Keep entities saved inside citadel.nbt.
                    .setIgnoreEntities(false)

                    // Prevent saved air/structure blocks from carving a giant empty cube.
                    .addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR);
        }

        @Override
        protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tag) {
            super.addAdditionalSaveData(context, tag);
        }

        @Override
        protected void handleDataMarker(String function,
                                        BlockPos pos,
                                        ServerLevelAccessor level,
                                        RandomSource random,
                                        BoundingBox box) {
        }
    }
}