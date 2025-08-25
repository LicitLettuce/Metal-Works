package net.lettuce.metalworks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;

import net.lettuce.metalworks.registry.MWWeathering;

import java.util.function.Supplier;

public class WeatheringTinSlabBlock extends SlabBlock {

    private final Supplier<Block> parentBlock;

    public WeatheringTinSlabBlock(Supplier<Block> parentBlock, BlockBehaviour.Properties properties) {
        super(properties);
        this.parentBlock = parentBlock;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(TYPE, SlabType.BOTTOM)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) == 0) {
            Block next = MWWeathering.getNext(this.parentBlock.get());
            if (next instanceof SlabBlock nextSlab) {
                BlockState newState = nextSlab.defaultBlockState()
                        .setValue(TYPE, state.getValue(TYPE))
                        .setValue(WATERLOGGED, state.getValue(WATERLOGGED));

                level.setBlock(pos, newState, 2);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return MWWeathering.getNext(this.parentBlock.get()) != null;
    }
}

