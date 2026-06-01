package net.lettuce.metalworks.common.worldgen.structure;

import com.mojang.serialization.MapCodec;
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
    public static final MapCodec<CitadelStructure> CODEC = simpleCodec(CitadelStructure::new);

    private static final ResourceLocation[] VARIANTS = {
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "citadel_treasure"),
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "citadel_portal"),
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "citadel_ancient"),
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "citadel_summon")
    };

    public CitadelStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    public Optional<GenerationStub> findGenerationPoint(GenerationContext context) {
        int x = context.chunkPos().getMinBlockX() + 8;
        int z = context.chunkPos().getMinBlockZ() + 8;

        Optional<Integer> yOptional = findLavaOceanPlacementY(context, x, z);

        if (yOptional.isEmpty()) {
            return Optional.empty();
        }

        BlockPos pos = new BlockPos(x, yOptional.get(), z);
        ResourceLocation template = getRandomVariant(context.random());

        return Optional.of(new GenerationStub(pos, builder ->
                addPieces(context.structureTemplateManager(), pos, builder, template)
        ));
    }

    private static ResourceLocation getRandomVariant(RandomSource random) {
        return VARIANTS[random.nextInt(VARIANTS.length)];
    }

    private static Optional<Integer> findLavaOceanPlacementY(GenerationContext context, int x, int z) {
        int seaLevel = context.chunkGenerator().getSeaLevel();

        var column = context.chunkGenerator().getBaseColumn(
                x,
                z,
                context.heightAccessor(),
                context.randomState()
        );

        BlockState topLava = column.getBlock(seaLevel - 1);

        if (!topLava.is(Blocks.LAVA)) {
            return Optional.empty();
        }

        return Optional.of(seaLevel - 2);
    }

    private static void addPieces(StructureTemplateManager templateManager,
                                  BlockPos pos,
                                  StructurePiecesBuilder builder,
                                  ResourceLocation template) {
        builder.addPiece(new Piece(templateManager, pos, template));
    }

    @Override
    public StructureType<?> type() {
        return ModStructures.CITADEL.get();
    }

    public static class Piece extends TemplateStructurePiece {
        public Piece(StructureTemplateManager templateManager, BlockPos pos, ResourceLocation template) {
            super(
                    ModStructurePieces.CITADEL_PIECE.get(),
                    0,
                    templateManager,
                    template,
                    template.toString(),
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
                    .setIgnoreEntities(false)
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
