package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.registry.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MageWallTorchBlock extends WallTorchBlock {
    public MageWallTorchBlock(Properties properties) {
        super(ParticleTypes.UNDERWATER, properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource rand) {
        if (!level.isClientSide()) return;

        Direction direction = state.getValue(FACING);
        double x = pos.getX() + 0.5 - 0.27 * direction.getStepX();
        double y = pos.getY() + 0.9;
        double z = pos.getZ() + 0.5 - 0.27 * direction.getStepZ();

        level.addParticle(ModParticles.MAGE_FLAME.get(), x, y, z, 0.0, 0.0, 0.0);
        level.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0, 0.0, 0.0);
    }
}
