package net.lettuce.metalworks.common.block;

import net.lettuce.metalworks.client.events.tin.TarnishingChain;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.function.Supplier;

public class WeatheringTinTrapdoorBlock extends TrapDoorBlock {
    private final Supplier<Block> parentBlock;

    public WeatheringTinTrapdoorBlock(BlockBehaviour.Properties props,
                                      net.minecraft.world.level.block.state.properties.BlockSetType setType,
                                      Supplier<Block> parentBlock) {
        super(props, setType);
        this.parentBlock = parentBlock;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(300) != 0) return;

        Block next = TarnishingChain.getNext(this.parentBlock.get());
        if (!(next instanceof TrapDoorBlock nextTrap)) return;

        BlockState nextState = nextTrap.defaultBlockState();
        for (Property<?> p : state.getProperties()) {
            if (nextState.hasProperty(p)) {
                nextState = copyProperty(state, nextState, p);
            }
        }
        level.setBlock(pos, nextState, 2);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return TarnishingChain.getNext(this.parentBlock.get()) != null;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static BlockState copyProperty(BlockState from, BlockState to, Property property) {
        try {
            Comparable value = from.getValue(property);
            return to.setValue(property, value);
        } catch (Exception e) {
            return to;
        }
    }
}
