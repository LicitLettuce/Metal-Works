package net.lettuce.metalworks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.lettuce.metalworks.registry.MWWeathering;

public class WeatheringTin extends Block {

    public WeatheringTin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        // 1 in 30 chance to weather
        if (random.nextInt(300) == 0) {
            Block nextStage = MWWeathering.getNext(state.getBlock());
            if (nextStage != null) {
                level.setBlock(pos, nextStage.defaultBlockState(), 2);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return MWWeathering.getNext(state.getBlock()) != null;
    }
}
