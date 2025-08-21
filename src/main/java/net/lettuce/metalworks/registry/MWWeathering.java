package net.lettuce.metalworks.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.Block;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MWWeathering {

    public static final Map<Block, Block> TIN_WEATHERING_CHAIN = new HashMap<>();

    public static void registerWeatheringChain() {
        // Base Tin Block
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_BLOCK.get(), MWBlocks.TARNISHED_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN.get(), MWBlocks.CORRODED_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN.get(), MWBlocks.ERODED_TIN.get());

        // Chiseled
        TIN_WEATHERING_CHAIN.put(MWBlocks.CHISELED_TIN.get(), MWBlocks.TARNISHED_CHISELED_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CHISELED_TIN.get(), MWBlocks.CORRODED_CHISELED_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_CHISELED_TIN.get(), MWBlocks.ERODED_CHISELED_TIN.get());

        // Cut
        TIN_WEATHERING_CHAIN.put(MWBlocks.CUT_TIN.get(), MWBlocks.TARNISHED_CUT_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_CUT_TIN.get(), MWBlocks.CORRODED_CUT_TIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_CUT_TIN.get(), MWBlocks.ERODED_CUT_TIN.get());

        // Tiles
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_TILES.get(), MWBlocks.TARNISHED_TIN_TILES.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_TILES.get(), MWBlocks.CORRODED_TIN_TILES.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_TILES.get(), MWBlocks.ERODED_TIN_TILES.get());

        // Shingles
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_SHINGLES.get(), MWBlocks.TARNISHED_TIN_SHINGLES.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SHINGLES.get(), MWBlocks.CORRODED_TIN_SHINGLES.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SHINGLES.get(), MWBlocks.ERODED_TIN_SHINGLES.get());

        // Grates
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_GRATE.get(), MWBlocks.TARNISHED_TIN_GRATE.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_GRATE.get(), MWBlocks.CORRODED_TIN_GRATE.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_GRATE.get(), MWBlocks.ERODED_TIN_GRATE.get());

        // Grate Drains
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_GRATE_DRAIN.get(), MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), MWBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get(), MWBlocks.ERODED_TIN_GRATE_DRAIN.get());

        // Tin Lanterns
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_LANTERN.get(), MWBlocks.TARNISHED_TIN_LANTERN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_LANTERN.get(), MWBlocks.CORRODED_TIN_LANTERN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_LANTERN.get(), MWBlocks.ERODED_TIN_LANTERN.get());

        // Tin Soul Lanterns
        TIN_WEATHERING_CHAIN.put(MWBlocks.TIN_SOUL_LANTERN.get(), MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), MWBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        TIN_WEATHERING_CHAIN.put(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get(), MWBlocks.ERODED_TIN_SOUL_LANTERN.get());
    }

    public static Block getNext(Block block) {
        return TIN_WEATHERING_CHAIN.get(block);
    }

    public static void registerWaxables() {
        try {
            Field waxablesField = HoneycombItem.class.getDeclaredField("WAXABLES");
            waxablesField.setAccessible(true);

            Field theUnsafeField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeField.setAccessible(true);
            sun.misc.Unsafe unsafe = (sun.misc.Unsafe) theUnsafeField.get(null);

            Object staticBase = unsafe.staticFieldBase(waxablesField);
            long staticOffset = unsafe.staticFieldOffset(waxablesField);

            @SuppressWarnings("unchecked")
            Supplier<BiMap<Block, Block>> originalSupplier = (Supplier<BiMap<Block, Block>>) waxablesField.get(null);
            BiMap<Block, Block> originalMap = originalSupplier.get();

            BiMap<Block, Block> newMap = HashBiMap.create(originalMap);

            // Core Tin
            newMap.put(MWBlocks.TIN_BLOCK.get(), MWBlocks.WAXED_TIN_BlOCK.get());
            newMap.put(MWBlocks.TARNISHED_TIN.get(), MWBlocks.WAXED_TARNISHED_TIN.get());
            newMap.put(MWBlocks.CORRODED_TIN.get(), MWBlocks.WAXED_CORRODED_TIN.get());
            newMap.put(MWBlocks.ERODED_TIN.get(), MWBlocks.WAXED_ERODED_TIN.get());

            // Chiseled
            newMap.put(MWBlocks.CHISELED_TIN.get(), MWBlocks.WAXED_CHISELED_TIN.get());
            newMap.put(MWBlocks.TARNISHED_CHISELED_TIN.get(), MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get());
            newMap.put(MWBlocks.CORRODED_CHISELED_TIN.get(), MWBlocks.WAXED_CORRODED_CHISELED_TIN.get());
            newMap.put(MWBlocks.ERODED_CHISELED_TIN.get(), MWBlocks.WAXED_ERODED_CHISELED_TIN.get());

            // Cut
            newMap.put(MWBlocks.CUT_TIN.get(), MWBlocks.WAXED_CUT_TIN.get());
            newMap.put(MWBlocks.TARNISHED_CUT_TIN.get(), MWBlocks.WAXED_TARNISHED_CUT_TIN.get());
            newMap.put(MWBlocks.CORRODED_CUT_TIN.get(), MWBlocks.WAXED_CORRODED_CUT_TIN.get());
            newMap.put(MWBlocks.ERODED_CUT_TIN.get(), MWBlocks.WAXED_ERODED_CUT_TIN.get());

            // Tiles
            newMap.put(MWBlocks.TIN_TILES.get(), MWBlocks.WAXED_TIN_TILES.get());
            newMap.put(MWBlocks.TARNISHED_TIN_TILES.get(), MWBlocks.WAXED_TARNISHED_TIN_TILES.get());
            newMap.put(MWBlocks.CORRODED_TIN_TILES.get(), MWBlocks.WAXED_CORRODED_TIN_TILES.get());
            newMap.put(MWBlocks.ERODED_TIN_TILES.get(), MWBlocks.WAXED_ERODED_TIN_TILES.get());

            // Shingles
            newMap.put(MWBlocks.TIN_SHINGLES.get(), MWBlocks.WAXED_TIN_SHINGLES.get());
            newMap.put(MWBlocks.TARNISHED_TIN_SHINGLES.get(), MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get());
            newMap.put(MWBlocks.CORRODED_TIN_SHINGLES.get(), MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get());
            newMap.put(MWBlocks.ERODED_TIN_SHINGLES.get(), MWBlocks.WAXED_ERODED_TIN_SHINGLES.get());

            // Grates
            newMap.put(MWBlocks.TIN_GRATE.get(), MWBlocks.WAXED_TIN_GRATE.get());
            newMap.put(MWBlocks.TARNISHED_TIN_GRATE.get(), MWBlocks.WAXED_TARNISHED_TIN_GRATE.get());
            newMap.put(MWBlocks.CORRODED_TIN_GRATE.get(), MWBlocks.WAXED_CORRODED_TIN_GRATE.get());
            newMap.put(MWBlocks.ERODED_TIN_GRATE.get(), MWBlocks.WAXED_ERODED_TIN_GRATE.get());

            // Grate Drains
            newMap.put(MWBlocks.TIN_GRATE_DRAIN.get(), MWBlocks.WAXED_TIN_GRATE_DRAIN.get());
            newMap.put(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), MWBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
            newMap.put(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get(), MWBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
            newMap.put(MWBlocks.ERODED_TIN_GRATE_DRAIN.get(), MWBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get());

            newMap.put(MWBlocks.TIN_LANTERN.get(), MWBlocks.WAXED_TIN_LANTERN.get());
            newMap.put(MWBlocks.TARNISHED_TIN_LANTERN.get(), MWBlocks.WAXED_TARNISHED_TIN_LANTERN.get());
            newMap.put(MWBlocks.CORRODED_TIN_LANTERN.get(), MWBlocks.WAXED_CORRODED_TIN_LANTERN.get());
            newMap.put(MWBlocks.ERODED_TIN_LANTERN.get(), MWBlocks.WAXED_ERODED_TIN_LANTERN.get());

// Tin Soul Lanterns
            newMap.put(MWBlocks.TIN_SOUL_LANTERN.get(), MWBlocks.WAXED_TIN_SOUL_LANTERN.get());
            newMap.put(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), MWBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
            newMap.put(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get(), MWBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
            newMap.put(MWBlocks.ERODED_TIN_SOUL_LANTERN.get(), MWBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get());



            Supplier<BiMap<Block, Block>> newSupplier = () -> newMap;
            unsafe.putObject(staticBase, staticOffset, newSupplier);

        } catch (Exception e) {
            throw new RuntimeException("Failed to register waxable blocks!", e);
        }
    }
}

