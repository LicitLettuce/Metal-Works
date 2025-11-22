package net.lettuce.metalworks.client.events.tin;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.util.DoorStateUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE) // <-- no Dist filter
public class WaxingEvent {

    /** From -> Waxed */
    private static final Map<RegistryObject<Block>, RegistryObject<Block>> waxablePairs = Map.ofEntries(
            Map.entry(ModBlocks.TIN_BLOCK, ModBlocks.WAXED_TIN_BLOCK),
            Map.entry(ModBlocks.TARNISHED_TIN, ModBlocks.WAXED_TARNISHED_TIN),

            Map.entry(ModBlocks.CHISELED_TIN, ModBlocks.WAXED_CHISELED_TIN),
            Map.entry(ModBlocks.TARNISHED_CHISELED_TIN, ModBlocks.WAXED_TARNISHED_CHISELED_TIN),

            Map.entry(ModBlocks.TIN_GRATE, ModBlocks.WAXED_TIN_GRATE),
            Map.entry(ModBlocks.TARNISHED_TIN_GRATE, ModBlocks.WAXED_TARNISHED_TIN_GRATE),

            Map.entry(ModBlocks.TIN_GRATE_DRAIN, ModBlocks.WAXED_TIN_GRATE_DRAIN),
            Map.entry(ModBlocks.TARNISHED_TIN_GRATE_DRAIN, ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN),

            Map.entry(ModBlocks.CUT_TIN, ModBlocks.WAXED_CUT_TIN),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN, ModBlocks.WAXED_TARNISHED_CUT_TIN),

            Map.entry(ModBlocks.CUT_TIN_STAIRS, ModBlocks.WAXED_CUT_TIN_STAIRS),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN_STAIRS, ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS),

            Map.entry(ModBlocks.CUT_TIN_SLAB, ModBlocks.WAXED_CUT_TIN_SLAB),
            Map.entry(ModBlocks.TARNISHED_CUT_TIN_SLAB, ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB),

            Map.entry(ModBlocks.TIN_TILES, ModBlocks.WAXED_TIN_TILES),
            Map.entry(ModBlocks.TARNISHED_TIN_TILES, ModBlocks.WAXED_TARNISHED_TIN_TILES),

            Map.entry(ModBlocks.TIN_TILE_STAIRS, ModBlocks.WAXED_TIN_TILE_STAIRS),
            Map.entry(ModBlocks.TARNISHED_TIN_TILE_STAIRS, ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS),

            Map.entry(ModBlocks.TIN_TILE_SLAB, ModBlocks.WAXED_TIN_TILE_SLAB),
            Map.entry(ModBlocks.TARNISHED_TIN_TILE_SLAB, ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB),

            Map.entry(ModBlocks.TIN_SHINGLES, ModBlocks.WAXED_TIN_SHINGLES),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLES, ModBlocks.WAXED_TARNISHED_TIN_SHINGLES),

            Map.entry(ModBlocks.TIN_SHINGLE_STAIRS, ModBlocks.WAXED_TIN_SHINGLE_STAIRS),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS, ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS),

            Map.entry(ModBlocks.TIN_SHINGLE_SLAB, ModBlocks.WAXED_TIN_SHINGLE_SLAB),
            Map.entry(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB, ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB),

            // Doors (weathering + waxed)
            Map.entry(ModBlocks.TIN_DOOR, ModBlocks.WAXED_TIN_DOOR),
            Map.entry(ModBlocks.TARNISHED_TIN_DOOR, ModBlocks.WAXED_TARNISHED_TIN_DOOR),

            // Trapdoors (weathering + waxed)
            Map.entry(ModBlocks.TIN_TRAPDOOR, ModBlocks.WAXED_TIN_TRAPDOOR),
            Map.entry(ModBlocks.TARNISHED_TIN_TRAPDOOR, ModBlocks.WAXED_TARNISHED_TIN_TRAPDOOR),

            Map.entry(ModBlocks.TIN_BARS, ModBlocks.WAXED_TIN_BARS),
            Map.entry(ModBlocks.TARNISHED_TIN_BARS, ModBlocks.WAXED_TARNISHED_TIN_BARS),

            Map.entry(ModBlocks.TIN_CHAIN, ModBlocks.WAXED_TIN_CHAIN),
            Map.entry(ModBlocks.TARNISHED_TIN_CHAIN, ModBlocks.WAXED_TARNISHED_TIN_CHAIN),

            Map.entry(ModBlocks.TIN_LANTERN, ModBlocks.WAXED_TIN_LANTERN),
            Map.entry(ModBlocks.TARNISHED_TIN_LANTERN, ModBlocks.WAXED_TARNISHED_TIN_LANTERN),

            Map.entry(ModBlocks.TIN_SOUL_LANTERN, ModBlocks.WAXED_TIN_SOUL_LANTERN),
            Map.entry(ModBlocks.TARNISHED_TIN_SOUL_LANTERN, ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN)
    );

    /** Runtime maps for quick lookup */
    private static final Map<Block, Block> WAXABLES = new HashMap<>();   // from -> waxed
    public static final Map<Block, Block> UNWAXABLES = new HashMap<>();  // waxed -> from

    public static void initWaxables() {
        waxablePairs.forEach((from, to) -> {
            WAXABLES.put(from.get(), to.get());
            UNWAXABLES.put(to.get(), from.get());
        });
    }

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide) return;

        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        Block block = state.getBlock();
        ItemStack stack = event.getItemStack();

        // 1) WAX with Honeycomb
        if (stack.getItem() instanceof HoneycombItem) {
            Block waxed = WAXABLES.get(block);
            if (waxed != null) {
                replace(level, pos, block, waxed);
                level.levelEvent(3003, pos, 0); // vanilla wax particles/sound
                if (!event.getEntity().isCreative()) stack.shrink(1);
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
            return;
        }

        // 2) UNWAX or SCRAPE with Axe
        if (stack.getItem() instanceof AxeItem) {
            // (a) Unwax: if current is waxed, revert to its unwaxed original
            Block unwaxed = UNWAXABLES.get(block);
            if (unwaxed != null) {
                replace(level, pos, block, unwaxed);
                level.levelEvent(3004, pos, 0); // scrape sound/particles (same event id vanilla uses)
                stack.hurtAndBreak(1, event.getEntity(), p -> p.broadcastBreakEvent(event.getHand()));
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
                return;
            }

            // (b) Scrape: step "back" in the weathering chain (e.g., Eroded -> Corroded -> Tarnished -> Tin)
            Block previous = getPreviousInChain(block);
            if (previous != null) {
                replace(level, pos, block, previous);
                level.levelEvent(3005, pos, 0); // oxidation scrape particles (vanilla)
                stack.hurtAndBreak(1, event.getEntity(), p -> p.broadcastBreakEvent(event.getHand()));
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }

    /** Door-aware replacement. Replaces both halves if both old/new are DoorBlocks, otherwise single-block set. */
    private static void replace(Level level, BlockPos pos, Block oldBlock, Block newBlock) {
        if (!(level instanceof net.minecraft.server.level.ServerLevel server)) {
            return; // safety: we only transform on server
        }

        if (oldBlock instanceof DoorBlock oldDoor && newBlock instanceof DoorBlock newDoor) {
           DoorStateUtil.transformDoor(server, pos, newDoor);
        } else {
            // Generic single-block replacement keeping properties when possible (like your other blocks)
            BlockState oldState = level.getBlockState(pos);
            BlockState newState = newBlock.defaultBlockState();
            for (var p : oldState.getProperties()) {
                if (newState.hasProperty(p)) {
                    try {
                        @SuppressWarnings("rawtypes")
                        var value = (Comparable) oldState.getValue(p);
                        @SuppressWarnings("unchecked")
                        var prop = (net.minecraft.world.level.block.state.properties.Property) p;
                        newState = newState.setValue(prop, value);
                    } catch (Exception ignored) { }
                }
            }
            // Use flags that sync to client and avoid mid-update neighbor spam
            int flags = Block.UPDATE_KNOWN_SHAPE | Block.UPDATE_CLIENTS;
            server.setBlock(pos, newState, flags);
            server.blockUpdated(pos, newBlock);
        }
    }

    /** Find the previous block in the weathering chain by scanning the map once. */
    private static Block getPreviousInChain(Block current) {
        for (var e : TarnishingChain.TARNISHING_CHAIN.entrySet()) {
            if (e.getValue() == current) {
                return e.getKey();
            }
        }
        return null;
    }
}



