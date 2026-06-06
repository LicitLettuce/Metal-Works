package net.lettuce.metalworks.common.blockentity;

import net.lettuce.metalworks.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MageCampfireBlockEntity extends CampfireBlockEntity {
    public MageCampfireBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.MAGE_CAMPFIRE.get();
    }
}
