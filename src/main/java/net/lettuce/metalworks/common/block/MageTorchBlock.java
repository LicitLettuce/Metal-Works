package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.common.registry.MWParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MageTorchBlock extends TorchBlock {

    public MageTorchBlock(Properties properties) {
        super(properties, ParticleTypes.UNDERWATER);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource rand) {
        super.animateTick(state, level, pos, rand);

        if (!level.isClientSide()) return;

        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.7;
        double z = pos.getZ() + 0.5;

        level.addParticle(MWParticles.MAGE_FLAME.get(), x, y, z, 0.0, 0.0, 0.0);
    }
}
