package net.lettuce.metalworks.common.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class LoopingPressurePlateBlock extends Block {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    private static final int TOGGLE_COOLDOWN_TICKS = 20;
    private static final String LAST_STEPPED_TAG = "toggle_pressure_plate_last_step";

    private static final VoxelShape SHAPE_UNPOWERED = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
    private static final VoxelShape SHAPE_POWERED   = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 0.5D, 15.0D);

    public LoopingPressurePlateBlock() {
        super(BlockBehaviour.Properties.of()
                .strength(0.5F)
                .noCollission()
        );
        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide && entity instanceof LivingEntity) {
            AABB aabb = new AABB(pos);
            List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, aabb);

            if (!entities.isEmpty() && justSteppedOn(level, pos, entity)) {
                boolean currentlyPowered = state.getValue(POWERED);
                boolean newPoweredState = !currentlyPowered;

                level.setBlock(pos, state.setValue(POWERED, newPoweredState), 3);
                updateNeighbors(level, pos);

                // ✅ Play sound from registry
                SoundEvent clickSound = BuiltInRegistries.SOUND_EVENT.get(
                        new ResourceLocation("minecraft", newPoweredState
                                ? "block.wooden_pressure_plate.click_on"
                                : "block.wooden_pressure_plate.click_off")
                );

                if (clickSound != null) {
                    level.playSound(null, pos, clickSound, SoundSource.BLOCKS, 0.3F, 1.0F);
                } else {
                    System.err.println("Could not find pressure plate sound");
                }
            }
        }
    }

    private boolean justSteppedOn(Level level, BlockPos pos, Entity entity) {
        long gameTime = level.getGameTime();
        String key = pos.asLong() + "_" + LAST_STEPPED_TAG;

        if (entity.getPersistentData().contains(key)) {
            long lastStep = entity.getPersistentData().getLong(key);
            if (gameTime - lastStep < TOGGLE_COOLDOWN_TICKS) {
                return false;
            }
        }

        entity.getPersistentData().putLong(key, gameTime);
        return true;
    }

    private void updateNeighbors(Level level, BlockPos pos) {
        level.updateNeighborsAt(pos, this);
        level.updateNeighborsAt(pos.below(), this); // update redstone below
    }

    // Redstone output
    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    public int getSignal(BlockState state, BlockGetter blockAccess, BlockPos pos, net.minecraft.core.Direction side) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    public int getDirectSignal(BlockState state, BlockGetter blockAccess, BlockPos pos, net.minecraft.core.Direction side) {
        return getSignal(state, blockAccess, pos, side);
    }

    // Voxel shape based on powered state
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(POWERED) ? SHAPE_POWERED : SHAPE_UNPOWERED;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getShape(state, level, pos, context);
    }
}


