package net.lettuce.metalworks.common.blockentity;


import net.lettuce.metalworks.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModBrushableBlockEntity extends BrushableBlockEntity {
    public ModBrushableBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public net.minecraft.world.level.block.entity.BlockEntityType<?> getType() {
        return ModBlockEntities.SUSPICIOUS_SOUL_SOIL.get();
    }
}