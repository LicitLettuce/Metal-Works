package net.lettuce.metalworks.common.block;


import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ModBrushableBlock extends BrushableBlock {
    public ModBrushableBlock(Block turnsInto,
                             Properties properties,
                             SoundEvent brushSound,
                             SoundEvent brushCompletedSound) {
        super(turnsInto, brushSound, brushCompletedSound, properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new net.lettuce.metalworks.common.blockentity.ModBrushableBlockEntity(pos, state);
    }
}