package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.common.blockentity.MageCampfireBlockEntity;
import net.lettuce.metalworks.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;


import javax.annotation.Nullable;

public class MageCampfireBlock extends CampfireBlock {

    public MageCampfireBlock(Properties properties) {
        super(false, 2, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MageCampfireBlockEntity(pos, state);
    }

    @Override
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
        if (!entityIn.fireImmune() && state.getValue(LIT) && entityIn instanceof LivingEntity) {
            entityIn.hurt(entityIn.damageSources().campfire(), 0.5F);
        }
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide) {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.MAGE_CAMPFIRE.get(), CampfireBlockEntity::particleTick) : null;
        } else {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.MAGE_CAMPFIRE.get(), CampfireBlockEntity::cookTick) : createTickerHelper(blockEntityType, ModBlockEntities.MAGE_CAMPFIRE.get(), CampfireBlockEntity::cooldownTick);
        }
    }
}

