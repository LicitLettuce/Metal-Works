package net.lettuce.metalworks.common.worldgen.structure;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModStructurePieces;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class LostCitadelPiece extends TemplateStructurePiece {
    private static final ResourceLocation[] VARIANTS = new ResourceLocation[] {
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "lost_citadel/citadel_portal"),
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "lost_citadel/citadel_summon"),
            ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "lost_citadel/citadel_treasure")
    };

    private final ResourceLocation templateLocation;

    public LostCitadelPiece(StructureTemplateManager templateManager, BlockPos pos, RandomSource random) {
        this(templateManager, randomVariant(random), pos);
    }

    public LostCitadelPiece(StructureTemplateManager templateManager, ResourceLocation templateLocation, BlockPos pos) {
        super(
                ModStructurePieces.LOST_CITADEL.get(),
                0,
                templateManager,
                templateLocation,
                templateLocation.toString(),
                makeSettings(),
                pos
        );

        this.templateLocation = templateLocation;
    }

    @Override
    public void postProcess(WorldGenLevel level,
                            StructureManager structureManager,
                            ChunkGenerator chunkGenerator,
                            RandomSource random,
                            BoundingBox box,
                            ChunkPos chunkPos,
                            BlockPos pos) {

        super.postProcess(level, structureManager, chunkGenerator, random, box, chunkPos, pos);
    }

    public LostCitadelPiece(StructurePieceSerializationContext context, CompoundTag tag) {
        super(
                ModStructurePieces.LOST_CITADEL.get(),
                tag,
                context.structureTemplateManager(),
                location -> makeSettings()
        );

        this.templateLocation = ResourceLocation.parse(tag.getString("Template"));
    }

    private static ResourceLocation randomVariant(RandomSource random) {
        return VARIANTS[random.nextInt(VARIANTS.length)];
    }

    private static StructurePlaceSettings makeSettings() {
        return new StructurePlaceSettings()
                .setIgnoreEntities(false);
    }

    @Override
    protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tag) {
        super.addAdditionalSaveData(context, tag);
        tag.putString("Template", this.templateLocation.toString());
    }

    @Override
    protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor level, RandomSource random, BoundingBox box) {
    }
}