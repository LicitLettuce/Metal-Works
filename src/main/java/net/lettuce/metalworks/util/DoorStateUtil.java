package net.lettuce.metalworks.util;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Property;

public final class DoorStateUtil {
    private DoorStateUtil() {}

    public static void transformDoor(ServerLevel level, BlockPos anyPos, DoorBlock newDoor) {
        BlockState clicked = level.getBlockState(anyPos);
        if (!(clicked.getBlock() instanceof DoorBlock)) return;

        BlockPos lowerPos = clicked.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER ? anyPos : anyPos.below();
        BlockPos upperPos = lowerPos.above();

        BlockState oldLower = level.getBlockState(lowerPos);
        BlockState oldUpper = level.getBlockState(upperPos);
        if (!(oldLower.getBlock() instanceof DoorBlock) || !(oldUpper.getBlock() instanceof DoorBlock)) return;

        BlockState nextLower = newDoor.defaultBlockState().setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER);
        BlockState nextUpper = newDoor.defaultBlockState().setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER);

        nextLower = copyAllMatching(oldLower, nextLower, DoorBlock.HALF);
        nextUpper = copyAllMatching(oldUpper, nextUpper, DoorBlock.HALF);

        int flags = Block.UPDATE_KNOWN_SHAPE | Block.UPDATE_CLIENTS;
        level.setBlock(lowerPos, nextLower, flags);
        level.setBlock(upperPos, nextUpper, flags);

        level.blockUpdated(lowerPos, newDoor);
        level.blockUpdated(upperPos, newDoor);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static BlockState copyAllMatching(BlockState from, BlockState to, Property<?>... exclude) {
        for (Property<?> property : from.getProperties()) {
            boolean skip = false;
            for (Property<?> ex : exclude) if (property == ex) { skip = true; break; }
            if (skip) continue;

            if (to.hasProperty(property)) {
                try {
                    Comparable value = from.getValue(property);
                    to = to.setValue((Property) property, value);
                } catch (Exception ignored) {}
            }
        }
        return to;
    }
}

