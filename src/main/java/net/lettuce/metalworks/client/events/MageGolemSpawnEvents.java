package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModBlocks;
import net.lettuce.metalworks.registry.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;


@EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class MageGolemSpawnEvents {

    @SubscribeEvent
    public static void onPumpkinPlaced(BlockEvent.EntityPlaceEvent event) {
        Level level = (Level) event.getLevel();

        if (level.isClientSide()) return;

        BlockState state = event.getPlacedBlock();

        if (!(state.getBlock() instanceof CarvedPumpkinBlock)) return;

        BlockPos pumpkinPos = event.getPos();

        BlockPos middle = pumpkinPos.below();
        BlockPos bottom = middle.below();

        BlockState middleState = level.getBlockState(middle);
        BlockState bottomState = level.getBlockState(bottom);

        if (middleState.is(ModBlocks.ROSE_GOLD_BLOCK.get()) &&
                bottomState.is(ModBlocks.ROSE_GOLD_BLOCK.get())) {

            level.removeBlock(pumpkinPos, false);
            level.removeBlock(middle, false);
            level.removeBlock(bottom, false);

            if (level instanceof ServerLevel serverLevel) {
                serverLevel.levelEvent(2001, pumpkinPos, Block.getId(Blocks.CARVED_PUMPKIN.defaultBlockState()));
                serverLevel.levelEvent(2001, middle, Block.getId(ModBlocks.ROSE_GOLD_BLOCK.get().defaultBlockState()));
                serverLevel.levelEvent(2001, bottom, Block.getId(ModBlocks.ROSE_GOLD_BLOCK.get().defaultBlockState()));
            }

                if (level instanceof ServerLevel serverLevel) {
                var golem = ModEntities.MAGE_GOLEM.get().create(serverLevel);
                if (golem != null) {
                    golem.moveTo(
                            bottom.getX() + 0.5,
                            bottom.getY(),
                            bottom.getZ() + 0.5,
                            0.0f,
                            0.0f
                    );
                    serverLevel.addFreshEntity(golem);


                }
            }
        }
    }
}
