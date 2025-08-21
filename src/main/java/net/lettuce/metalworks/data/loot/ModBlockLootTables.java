package net.lettuce.metalworks.data.loot;



import net.lettuce.metalworks.registry.MWBlocks;
import net.lettuce.metalworks.registry.MWItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(MWBlocks.TIN_BLOCK.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN.get());
        this.dropSelf(MWBlocks.ERODED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_TIN_BlOCK.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN.get());
        this.dropSelf(MWBlocks.RAW_TIN_BLOCK.get());

        this.dropSelf(MWBlocks.TIN_GRATE.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.ERODED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_GRATE.get());

        this.dropSelf(MWBlocks.TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get());

        this.dropSelf(MWBlocks.CHISELED_TIN.get());
        this.dropSelf(MWBlocks.TARNISHED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.ERODED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CHISELED_TIN.get());

        this.dropSelf(MWBlocks.CUT_TIN.get());
        this.dropSelf(MWBlocks.CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_CUT_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_CUT_TIN.get());
        this.dropSelf(MWBlocks.ERODED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CUT_TIN.get());

        this.dropSelf(MWBlocks.TIN_TILES.get());
        this.dropSelf(MWBlocks.TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_TILES.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_TILES.get());
        this.dropSelf(MWBlocks.ERODED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_TILES.get());

        this.dropSelf(MWBlocks.TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SHINGLES.get());

        this.dropSelf(MWBlocks.TIN_GRATE.get());
        this.dropSelf(MWBlocks.TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.TIN_BARS.get());
        this.dropSelf(MWBlocks.TIN_DOOR.get());
        this.dropSelf(MWBlocks.TIN_TRAPDOOR.get());
        this.dropSelf(MWBlocks.TIN_CHAIN.get());
// Tin Lanterns
        this.dropSelf(MWBlocks.TIN_LANTERN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_LANTERN.get());

// Soul Tin Lanterns
        this.dropSelf(MWBlocks.TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get());

        this.dropSelf(MWBlocks.BRONZE_BLOCK.get());
        this.dropSelf(MWBlocks.BRONZE_TILES.get());
        this.dropSelf(MWBlocks.BRONZE_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.BRONZE_TILE_SLAB.get());
        this.dropSelf(MWBlocks.BRONZE_SHINGLES.get());
        this.dropSelf(MWBlocks.BRONZE_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.BRONZE_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.BRONZE_DOOR.get());
        this.dropSelf(MWBlocks.BRONZE_TRAPDOOR.get());
        this.dropSelf(MWBlocks.BRONZE_BARS.get());
        this.dropSelf(MWBlocks.BRONZE_GRATE.get());
        this.dropSelf(MWBlocks.BRONZE_GRATE_DRAIN.get());

        this.dropSelf(MWBlocks.ROSE_GOLD_BLOCK.get());
        this.dropSelf(MWBlocks.ROSE_LANTERN.get());


        this.add(MWBlocks.TIN_ORE.get(),
                block -> createCopperLikeOreDrops(MWBlocks.TIN_ORE.get(), MWItems.RAW_TIN.get()));
        this.add(MWBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createCopperLikeOreDrops(MWBlocks.DEEPSLATE_TIN_ORE.get(), MWItems.RAW_TIN.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
