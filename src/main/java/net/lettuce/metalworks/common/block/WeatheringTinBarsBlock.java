package net.lettuce.metalworks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.lettuce.metalworks.registry.MWWeathering;

public class WeatheringTinBarsBlock extends IronBarsBlock {

    public WeatheringTinBarsBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) == 0) {
            Block next = MWWeathering.getNext(this);
            if (next instanceof IronBarsBlock nextBars) {
                level.setBlock(pos, nextBars.defaultBlockState()
                        .setValue(NORTH, state.getValue(NORTH))
                        .setValue(EAST, state.getValue(EAST))
                        .setValue(SOUTH, state.getValue(SOUTH))
                        .setValue(WEST, state.getValue(WEST)), 2);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return MWWeathering.getNext(this) != null;
    }
}


