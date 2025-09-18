package net.lettuce.metalworks.data.loot;



import net.lettuce.metalworks.registry.MWBlocks;
import net.lettuce.metalworks.registry.MWItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

            // Casserite Loot Tables
        this.dropSelf(MWBlocks.CASSITERITE.get());
        this.dropSelf(MWBlocks.CASSITERITE_STAIRS.get());
        this.add(MWBlocks.CASSITERITE_SLAB.get(), createSlabItemTable(MWBlocks.CASSITERITE_SLAB.get()));
        this.dropSelf(MWBlocks.CASSITERITE_WALL.get());

        this.dropSelf(MWBlocks.POLISHED_CASSITERITE.get());
        this.dropSelf(MWBlocks.POLISHED_CASSITERITE_STAIRS.get());
        this.add(MWBlocks.POLISHED_CASSITERITE_SLAB.get(), createSlabItemTable(MWBlocks.POLISHED_CASSITERITE_SLAB.get()));

            // Natural Tin Loot Tables
        this.dropSelf(MWBlocks.RAW_TIN_BLOCK.get());
        this.add(MWBlocks.TIN_ORE.get(), block -> createCopperLikeOreDrops(MWBlocks.TIN_ORE.get(), MWItems.RAW_TIN.get()));
        this.add(MWBlocks.DEEPSLATE_TIN_ORE.get(), block -> createCopperLikeOreDrops(MWBlocks.DEEPSLATE_TIN_ORE.get(), MWItems.RAW_TIN.get()));
        this.add(MWBlocks.CASSITERITE_TIN_ORE.get(), block -> createCopperLikeOreDrops(MWBlocks.CASSITERITE_TIN_ORE.get(), MWItems.RAW_TIN.get()));
        this.add(MWBlocks.NETHER_TIN_ORE.get(), block -> createNetherLikeOreDrops(MWBlocks.NETHER_TIN_ORE.get(), MWItems.TIN_NUGGET.get()));

            // Tin Block Loot Tables
        this.dropSelf(MWBlocks.TIN_BLOCK.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN.get());
        this.dropSelf(MWBlocks.ERODED_TIN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_BLOCK.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN.get());

            // Tin Block Loot Tables
        this.dropSelf(MWBlocks.TIN_PLATE.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_PLATE.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_PLATE.get());
        this.dropSelf(MWBlocks.ERODED_TIN_PLATE.get());

        this.dropSelf(MWBlocks.WAXED_TIN_PLATE.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_PLATE.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_PLATE.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_PLATE.get());

            // Chiseled Tin Loot Tables
        this.dropSelf(MWBlocks.CHISELED_TIN.get());
        this.dropSelf(MWBlocks.TARNISHED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.ERODED_CHISELED_TIN.get());

        this.dropSelf(MWBlocks.WAXED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CHISELED_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CHISELED_TIN.get());

            // Tin Grates Loot Tables
        this.dropSelf(MWBlocks.TIN_GRATE.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.ERODED_TIN_GRATE.get());

        this.dropSelf(MWBlocks.WAXED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_GRATE.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_GRATE.get());

            // Tin Grate Drains Loot Tables
        this.dropSelf(MWBlocks.TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_GRATE_DRAIN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get());

            // Cut Tin Loot Tables
        this.dropSelf(MWBlocks.CUT_TIN.get());
        this.dropSelf(MWBlocks.TARNISHED_CUT_TIN.get());
        this.dropSelf(MWBlocks.CORRODED_CUT_TIN.get());
        this.dropSelf(MWBlocks.ERODED_CUT_TIN.get());

        this.dropSelf(MWBlocks.WAXED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CUT_TIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CUT_TIN.get());

            // Cut Tin Stair Loot Tables
        this.dropSelf(MWBlocks.CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.TARNISHED_CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.CORRODED_CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.ERODED_CUT_TIN_STAIRS.get());

        this.dropSelf(MWBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CUT_TIN_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_CUT_TIN_STAIRS.get());

            // Cut Tin Slab Loot Tables
        this.dropSelf(MWBlocks.CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.CORRODED_CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.ERODED_CUT_TIN_SLAB.get());

        this.dropSelf(MWBlocks.WAXED_CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_CUT_TIN_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_CUT_TIN_SLAB.get());

            // Tin Tile Loot Tables
        this.dropSelf(MWBlocks.TIN_TILES.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_TILES.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_TILES.get());
        this.dropSelf(MWBlocks.ERODED_TIN_TILES.get());

        this.dropSelf(MWBlocks.WAXED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_TILES.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_TILES.get());

            // Tin Tile Stair Loot Tables
        this.dropSelf(MWBlocks.TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.ERODED_TIN_TILE_STAIRS.get());

        this.dropSelf(MWBlocks.WAXED_TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_TILE_STAIRS.get());

            // Tin Tile Slab Loot Tables
        this.dropSelf(MWBlocks.TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.ERODED_TIN_TILE_SLAB.get());

        this.dropSelf(MWBlocks.WAXED_TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_TILE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_TILE_SLAB.get());

            // Tin Shingle Loot Tables
        this.dropSelf(MWBlocks.TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SHINGLES.get());

        this.dropSelf(MWBlocks.WAXED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SHINGLES.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SHINGLES.get());

            // Tin Shingle Stair Loot Tables
        this.dropSelf(MWBlocks.TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SHINGLE_STAIRS.get());

        this.dropSelf(MWBlocks.WAXED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS.get());

            // Tin Shingle Slab Loot Tables
        this.dropSelf(MWBlocks.TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SHINGLE_SLAB.get());

        this.dropSelf(MWBlocks.WAXED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB.get());

            // Tin Door Loot Table
        this.add(MWBlocks.TIN_DOOR.get(),
                block -> createDoorTable(MWBlocks.TIN_DOOR.get()));

            // Tin Trapdoor Loot Table
        this.dropSelf(MWBlocks.TIN_TRAPDOOR.get());

            // Tn Bar Loot Tables
        this.dropSelf(MWBlocks.TIN_BARS.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_BARS.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_BARS.get());
        this.dropSelf(MWBlocks.ERODED_TIN_BARS.get());

        this.dropSelf(MWBlocks.WAXED_TIN_BARS.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_BARS.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_BARS.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_BARS.get());

            // Tin Chain Loot Tables
        this.dropSelf(MWBlocks.TIN_CHAIN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_CHAIN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_CHAIN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_CHAIN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_CHAIN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_CHAIN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_CHAIN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_CHAIN.get());

            // Tin Lantern Loot Tables
        this.dropSelf(MWBlocks.TIN_LANTERN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_LANTERN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_LANTERN.get());

            // Soul Tin Lantern Loot Tables
        this.dropSelf(MWBlocks.TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_SOUL_LANTERN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get());

            // Tin Mage Lantern Loot Tables
        this.dropSelf(MWBlocks.TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.TARNISHED_TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.CORRODED_TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.ERODED_TIN_MAGE_LANTERN.get());

        this.dropSelf(MWBlocks.WAXED_TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get());
        this.dropSelf(MWBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get());

            // Bronze Block Loot Table
        this.dropSelf(MWBlocks.BRONZE_BLOCK.get());

            // Bronze Tile Loot Tables
        this.dropSelf(MWBlocks.BRONZE_TILES.get());
        this.dropSelf(MWBlocks.BRONZE_TILE_STAIRS.get());
        this.dropSelf(MWBlocks.BRONZE_TILE_SLAB.get());

            // Bronze Shingle Loot Tables
        this.dropSelf(MWBlocks.BRONZE_SHINGLES.get());
        this.dropSelf(MWBlocks.BRONZE_SHINGLE_STAIRS.get());
        this.dropSelf(MWBlocks.BRONZE_SHINGLE_SLAB.get());

            // Bronze Door Loot Table
        this.add(MWBlocks.BRONZE_DOOR.get(),
                block -> createDoorTable(MWBlocks.BRONZE_DOOR.get()));

            // Bronze Trapdoor Loot Table
        this.dropSelf(MWBlocks.BRONZE_TRAPDOOR.get());

            // Bronze Bars Loot Table
        this.dropSelf(MWBlocks.BRONZE_BARS.get());

            // Bronze Grate Loot Table
        this.dropSelf(MWBlocks.BRONZE_GRATE.get());

            // Bronze Grate Drain Loot Table
        this.dropSelf(MWBlocks.BRONZE_GRATE_DRAIN.get());

            // Mechanical Pressure Plate Loot Table
        this.dropSelf(MWBlocks.LOOPING_PRESSURE_PLATE.get());

            // Rose Gold Block Loot Table
        this.dropSelf(MWBlocks.ROSE_GOLD_BLOCK.get());

            // Rose Gold Mosaic Loot Tables
        this.dropSelf(MWBlocks.ROSE_GOLD_MOSAIC.get());
        this.dropSelf(MWBlocks.ROSE_GOLD_MOSAIC_STAIRS.get());
        this.add(MWBlocks.ROSE_GOLD_MOSAIC_SLAB.get(), createSlabItemTable(MWBlocks.ROSE_GOLD_MOSAIC_SLAB.get()));

            // Rose Gold Lantern Loot Table
        this.dropSelf(MWBlocks.ROSE_LANTERN.get());

            // Medium Weighted Pressure Plate Loot Table
        this.dropSelf(MWBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());

            // Mage Fire Blocks
        this.dropSelf(MWBlocks.MAGE_TORCH.get());

        this.dropSelf(MWBlocks.MAGE_LANTERN.get());

        this.add(MWBlocks.MAGE_CAMPFIRE.get(), block -> createCampfireLikeDrop(MWBlocks.MAGE_CAMPFIRE.get()));


    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createNetherLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 6.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }


    protected LootTable.Builder createCampfireLikeDrop(Block block) {
        return createSilkTouchDispatchTable(block,
                applyExplosionDecay(block,
                        LootItem.lootTableItem(net.minecraft.world.item.Items.CHARCOAL)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
