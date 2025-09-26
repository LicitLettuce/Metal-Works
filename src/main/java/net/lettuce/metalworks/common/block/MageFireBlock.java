package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.common.registry.MWTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class MageFireBlock extends BaseFireBlock {

    public MageFireBlock(Properties properties) {
        super(properties, 3.0f); // Damage per second like soul fire
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return canSurviveOnBlock(level.getBlockState(pos.below()));
    }

    private boolean canSurviveOnBlock(BlockState blockState) {
        return blockState.is(MWTags.MAGE_FIRE_BASE_BLOCKS); // Use a block tag
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return canSurvive(this.defaultBlockState(), context.getLevel(), context.getClickedPos())
                ? this.defaultBlockState()
                : null;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource rand) {
        super.animateTick(state, level, pos, rand);
        level.addParticle(ParticleTypes.SMOKE,
                pos.getX() + 0.5 + (rand.nextDouble() - 0.5) * 0.3,
                pos.getY() + 0.7,
                pos.getZ() + 0.5 + (rand.nextDouble() - 0.5) * 0.3,
                0.0, 0.01, 0.0);
    }

    @Override
    protected boolean canBurn(BlockState pState) {
        return false;

    }
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
    }
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (!canSurvive(state, level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }
}

