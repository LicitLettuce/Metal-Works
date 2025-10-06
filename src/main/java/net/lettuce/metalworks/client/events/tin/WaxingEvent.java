package net.lettuce.metalworks.client.events.tin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.lettuce.metalworks.common.registry.ModBlocks;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = "metal_works", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class WaxingEvent {

    private static final Map<RegistryObject<Block>, RegistryObject<Block>> waxablePairs = Map.ofEntries(
            Map.entry(ModBlocks.TIN_BLOCK, ModBlocks.WAXED_TIN_BLOCK),
            Map.entry(ModBlocks.TARNISHED_TIN, ModBlocks.WAXED_TARNISHED_TIN),
            Map.entry(ModBlocks.CORRODED_TIN, ModBlocks.WAXED_CORRODED_TIN),
            Map.entry(ModBlocks.ERODED_TIN, ModBlocks.WAXED_ERODED_TIN),

            Map.entry(ModBlocks.CHISELED_TIN, ModBlocks.WAXED_CHISELED_TIN),
            Map.entry(ModBlocks.TARNISHED_CHISELED_TIN, ModBlocks.WAXED_TARNISHED_CHISELED_TIN),
            Map.entry(ModBlocks.CORRODED_CHISELED_TIN, ModBlocks.WAXED_CORRODED_CHISELED_TIN),
            Map.entry(ModBlocks.ERODED_CHISELED_TIN, ModBlocks.WAXED_ERODED_CHISELED_TIN),

            Map.entry(ModBlocks.TIN_GRATE, ModBlocks.WAXED_TIN_GRATE),
            Map.entry(ModBlocks.TARNISHED_TIN_GRATE, ModBlocks.WAXED_TARNISHED_TIN_GRATE),
            Map.entry(ModBlocks.CORRODED_TIN_GRATE, ModBlocks.WAXED_CORRODED_TIN_GRATE),
            Map.entry(ModBlocks.ERODED_TIN_GRATE, ModBlocks.WAXED_ERODED_TIN_GRATE),

            Map.entry(ModBlocks.TIN_GRATE_DRAIN, ModBlocks.WAXED_TIN_GRATE_DRAIN),
            Map.entry(ModBlocks.TARNISHED_TIN_GRATE_DRAIN, ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN),
            Map.entry(ModBlocks.CORRODED_TIN_GRATE_DRAIN, ModBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN),
            Map.entry(ModBlocks.ERODED_TIN_GRATE_DRAIN, ModBlocks.WAXED_ERODED_TIN_GRATE_DRAIN),

            Map.entry(ModBlocks.CUT_TIN, ModBlocks.WAXED_CUT_TIN),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN, ModBlocks.WAXED_TARNISHED_CUT_TIN),
            Map.entry(ModBlocks.CORRODED_CUT_TIN, ModBlocks.WAXED_CORRODED_CUT_TIN),
            Map.entry(ModBlocks.ERODED_CUT_TIN, ModBlocks.WAXED_ERODED_CUT_TIN),

            Map.entry(ModBlocks.CUT_TIN_STAIRS, ModBlocks.WAXED_CUT_TIN_STAIRS),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN_STAIRS, ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS),
            Map.entry(ModBlocks.CORRODED_CUT_TIN_STAIRS, ModBlocks.WAXED_CORRODED_CUT_TIN_STAIRS),
            Map.entry(ModBlocks.ERODED_CUT_TIN_STAIRS, ModBlocks.WAXED_ERODED_CUT_TIN_STAIRS),

            Map.entry(ModBlocks.CUT_TIN_SLAB, ModBlocks.WAXED_CUT_TIN_SLAB),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN_SLAB, ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB),
            Map.entry(ModBlocks.CORRODED_CUT_TIN_SLAB, ModBlocks.WAXED_CORRODED_CUT_TIN_SLAB),
            Map.entry(ModBlocks.ERODED_CUT_TIN_SLAB, ModBlocks.WAXED_ERODED_CUT_TIN_SLAB),

            Map.entry(ModBlocks.TIN_TILES, ModBlocks.WAXED_TIN_TILES),
            Map.entry(ModBlocks.TARNISHED_TIN_TILES, ModBlocks.WAXED_TARNISHED_TIN_TILES),
            Map.entry(ModBlocks.CORRODED_TIN_TILES, ModBlocks.WAXED_CORRODED_TIN_TILES),
            Map.entry(ModBlocks.ERODED_TIN_TILES, ModBlocks.WAXED_ERODED_TIN_TILES),

            Map.entry(ModBlocks.TIN_TILE_STAIRS, ModBlocks.WAXED_TIN_TILE_STAIRS),
            Map.entry(ModBlocks.TARNISHED_TIN_TILE_STAIRS, ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS),
            Map.entry(ModBlocks.CORRODED_TIN_TILE_STAIRS, ModBlocks.WAXED_CORRODED_TIN_TILE_STAIRS),
            Map.entry(ModBlocks.ERODED_TIN_TILE_STAIRS, ModBlocks.WAXED_ERODED_TIN_TILE_STAIRS),

            Map.entry(ModBlocks.TIN_TILE_SLAB, ModBlocks.WAXED_TIN_TILE_SLAB),
            Map.entry(ModBlocks.TARNISHED_TIN_TILE_SLAB, ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB),
            Map.entry(ModBlocks.CORRODED_TIN_TILE_SLAB, ModBlocks.WAXED_CORRODED_TIN_TILE_SLAB),
            Map.entry(ModBlocks.ERODED_TIN_TILE_SLAB, ModBlocks.WAXED_ERODED_TIN_TILE_SLAB),

            Map.entry(ModBlocks.TIN_SHINGLES, ModBlocks.WAXED_TIN_SHINGLES),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLES, ModBlocks.WAXED_TARNISHED_TIN_SHINGLES),
            Map.entry(ModBlocks.CORRODED_TIN_SHINGLES, ModBlocks.WAXED_CORRODED_TIN_SHINGLES),
            Map.entry(ModBlocks.ERODED_TIN_SHINGLES, ModBlocks.WAXED_ERODED_TIN_SHINGLES),

            Map.entry(ModBlocks.TIN_SHINGLE_STAIRS, ModBlocks.WAXED_TIN_SHINGLE_STAIRS),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS, ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS),
            Map.entry(ModBlocks.CORRODED_TIN_SHINGLE_STAIRS, ModBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS),
            Map.entry(ModBlocks.ERODED_TIN_SHINGLE_STAIRS, ModBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS),

            Map.entry(ModBlocks.TIN_SHINGLE_SLAB, ModBlocks.WAXED_TIN_SHINGLE_SLAB),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB, ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB),
            Map.entry(ModBlocks.CORRODED_TIN_SHINGLE_SLAB, ModBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB),
            Map.entry(ModBlocks.ERODED_TIN_SHINGLE_SLAB, ModBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB),

            Map.entry(ModBlocks.TIN_BARS, ModBlocks.WAXED_TIN_BARS),
            Map.entry(ModBlocks.TARNISHED_TIN_BARS, ModBlocks.WAXED_TARNISHED_TIN_BARS),
            Map.entry(ModBlocks.CORRODED_TIN_BARS, ModBlocks.WAXED_CORRODED_TIN_BARS),
            Map.entry(ModBlocks.ERODED_TIN_BARS, ModBlocks.WAXED_ERODED_TIN_BARS),

            Map.entry(ModBlocks.TIN_CHAIN, ModBlocks.WAXED_TIN_CHAIN),
            Map.entry(ModBlocks.TARNISHED_TIN_CHAIN, ModBlocks.WAXED_TARNISHED_TIN_CHAIN),
            Map.entry(ModBlocks.CORRODED_TIN_CHAIN, ModBlocks.WAXED_CORRODED_TIN_CHAIN),
            Map.entry(ModBlocks.ERODED_TIN_CHAIN, ModBlocks.WAXED_ERODED_TIN_CHAIN),

            Map.entry(ModBlocks.TIN_LANTERN, ModBlocks.WAXED_TIN_LANTERN),
            Map.entry(ModBlocks.TARNISHED_TIN_LANTERN, ModBlocks.WAXED_TARNISHED_TIN_LANTERN),
            Map.entry(ModBlocks.CORRODED_TIN_LANTERN, ModBlocks.WAXED_CORRODED_TIN_LANTERN),
            Map.entry(ModBlocks.ERODED_TIN_LANTERN, ModBlocks.WAXED_ERODED_TIN_LANTERN),

            Map.entry(ModBlocks.TIN_SOUL_LANTERN, ModBlocks.WAXED_TIN_SOUL_LANTERN),
            Map.entry(ModBlocks.TARNISHED_TIN_SOUL_LANTERN, ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN),
            Map.entry(ModBlocks.CORRODED_TIN_SOUL_LANTERN, ModBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN),
            Map.entry(ModBlocks.ERODED_TIN_SOUL_LANTERN, ModBlocks.WAXED_ERODED_TIN_SOUL_LANTERN),

            Map.entry(ModBlocks.TIN_MAGE_LANTERN, ModBlocks.WAXED_TIN_MAGE_LANTERN),
            Map.entry(ModBlocks.TARNISHED_TIN_MAGE_LANTERN, ModBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN),
            Map.entry(ModBlocks.CORRODED_TIN_MAGE_LANTERN, ModBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN),
            Map.entry(ModBlocks.ERODED_TIN_MAGE_LANTERN, ModBlocks.WAXED_ERODED_TIN_MAGE_LANTERN)

            );

    private static final Map<Block, Block> WAXABLES = new HashMap<>();
    public static final Map<Block, Block> UNWAXABLES = new HashMap<>();

    public static void initWaxables() {
        waxablePairs.forEach((from, to) -> {
            WAXABLES.put(from.get(), to.get());
            UNWAXABLES.put(to.get(), from.get());
        });
    }

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = event.getItemStack();
        var player = event.getEntity();

        if (level.isClientSide) return;

        Block currentBlock = state.getBlock();

        if (heldItem.getItem() instanceof HoneycombItem) {
            Block waxed = WAXABLES.get(currentBlock);
            if (waxed != null) {
                BlockState newState = waxed.defaultBlockState();

                level.setBlock(pos, newState, 11);
                level.levelEvent(3003, pos, 0);

                if (!player.isCreative()) {
                    heldItem.shrink(1);
                }

                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }
}


