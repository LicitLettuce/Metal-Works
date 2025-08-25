package net.lettuce.metalworks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.lettuce.metalworks.registry.MWWeathering;

import java.util.function.Supplier;

public class WeatheringTinStairBlock extends StairBlock {
    private final Supplier<Block> parentBlock;

    public WeatheringTinStairBlock(BlockState baseState, Supplier<Block> parentBlock, BlockBehaviour.Properties properties) {
        super(baseState, properties);
        this.parentBlock = parentBlock;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) == 0) {
            Block next = MWWeathering.getNext(this.parentBlock.get());
            if (next instanceof StairBlock nextStair) {
                level.setBlock(pos, nextStair.defaultBlockState()
                        .setValue(FACING, state.getValue(FACING))
                        .setValue(HALF, state.getValue(HALF))
                        .setValue(SHAPE, state.getValue(SHAPE))
                        .setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 2);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return MWWeathering.getNext(this.parentBlock.get()) != null;
    }
}
