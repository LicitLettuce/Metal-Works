package net.lettuce.metalworks.common.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.ArrayList;
import java.util.List;

public class PowerHammerItem extends DiggerItem {
    public PowerHammerItem(Tier tier, Properties properties) {
        super(1.0F, -2.8F, tier, BlockTags.MINEABLE_WITH_PICKAXE, properties);
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayer player) {
        List<BlockPos> positions = new ArrayList<>();

        BlockHitResult traceResult = player.level().clip(new ClipContext(
                player.getEyePosition(1f),
                player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f)),
                ClipContext.Block.COLLIDER,
                ClipContext.Fluid.NONE,
                player
        ));

        if (traceResult.getType() == HitResult.Type.MISS) {
            return positions;
        }

        Direction face = traceResult.getDirection();

        if (face == Direction.UP || face == Direction.DOWN) {
            for (int x = -range; x <= range; x++) {
                for (int z = -range; z <= range; z++) {
                    positions.add(initialBlockPos.offset(x, 0, z));
                }
            }
        } else if (face == Direction.NORTH || face == Direction.SOUTH) {
            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    positions.add(initialBlockPos.offset(x, y, 0));
                }
            }
        } else if (face == Direction.EAST || face == Direction.WEST) {
            for (int z = -range; z <= range; z++) {
                for (int y = -range; y <= range; y++) {
                    positions.add(initialBlockPos.offset(0, y, z));
                }
            }
        }

        return positions;
    }
}


