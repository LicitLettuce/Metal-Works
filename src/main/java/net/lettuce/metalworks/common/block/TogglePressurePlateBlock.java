package net.lettuce.metalworks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class TogglePressurePlateBlock extends Block {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public TogglePressurePlateBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult hit) {
        // Optional: allow right-click toggle (in addition to stepping)
        toggle(level, pos, state);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide && entity instanceof LivingEntity) {
            toggle(level, pos, state);
        }
    }

    private void toggle(Level level, BlockPos pos, BlockState state) {
        boolean powered = state.getValue(POWERED);
        level.setBlock(pos, state.setValue(POWERED, !powered), 3);
        level.updateNeighborsAt(pos, this);
        level.updateNeighborsAt(pos.below(), this); // Important for redstone to update below
        level.playSound(null, pos, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                SoundSource.BLOCKS, 0.3F, powered ? 0.5F : 0.6F); // Change pitch for toggle feel :) -Lettuce
    }

    @Override
    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}

