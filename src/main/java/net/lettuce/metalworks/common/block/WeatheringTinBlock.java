package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.registry.MWWeathering;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class WeatheringTinBlock extends Block {

    public WeatheringTinBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) == 0) {
            Block nextBlock = MWWeathering.getNext(state.getBlock());
            if (nextBlock != null) {
                BlockState nextState = nextBlock.defaultBlockState();

                // Copy all properties that exist in both current and next state
                for (Property<?> property : state.getProperties()) {
                    if (nextState.hasProperty(property)) {
                        nextState = copyProperty(state, nextState, property);
                    }
                }

                level.setBlock(pos, nextState, 2);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return MWWeathering.getNext(state.getBlock()) != null;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static BlockState copyProperty(BlockState fromState, BlockState toState, Property property) {
        try {
            Comparable value = fromState.getValue(property);
            return toState.setValue(property, value);
        } catch (Exception e) {
            // Skip properties with mismatched types or errors
            return toState;
        }
    }
}


