package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.client.events.tin.WeatheringChain;
import net.lettuce.metalworks.util.DoorStateUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import java.util.function.Supplier;

public class WeatheringTinDoorBlock extends DoorBlock {
    private final Supplier<Block> parentBlock;

    public WeatheringTinDoorBlock(BlockBehaviour.Properties props,
                                  BlockSetType setType,
                                  Supplier<Block> parentBlock) {
        super(props, setType);
        this.parentBlock = parentBlock;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) != 0) return;

        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) return;

        Block next = WeatheringChain.getNext(this.parentBlock.get());
        if (!(next instanceof DoorBlock nextDoor)) return;

        DoorStateUtil.transformDoor(level, pos, nextDoor);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(HALF) == DoubleBlockHalf.LOWER
                && WeatheringChain.getNext(this.parentBlock.get()) != null;
    }
}

