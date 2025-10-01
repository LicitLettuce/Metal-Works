package net.lettuce.metalworks.data.loot;



import net.lettuce.metalworks.common.registry.ModBlocks;
import net.lettuce.metalworks.common.registry.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
        this.dropSelf(ModBlocks.CASSITERITE.get());
        this.dropSelf(ModBlocks.CASSITERITE_STAIRS.get());
        this.add(ModBlocks.CASSITERITE_SLAB.get(), createSlabItemTable(ModBlocks.CASSITERITE_SLAB.get()));
        this.dropSelf(ModBlocks.CASSITERITE_WALL.get());

        this.dropSelf(ModBlocks.POLISHED_CASSITERITE.get());
        this.dropSelf(ModBlocks.POLISHED_CASSITERITE_STAIRS.get());
        this.add(ModBlocks.POLISHED_CASSITERITE_SLAB.get(), createSlabItemTable(ModBlocks.POLISHED_CASSITERITE_SLAB.get()));

            // Natural Tin Loot Tables
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.add(ModBlocks.TIN_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NETHER_TIN_ORE.get(), block -> createNetherLikeOreDrops(ModBlocks.NETHER_TIN_ORE.get(), ModItems.TIN_NUGGET.get()));

            // Tin Block Loot Tables
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN.get());
        this.dropSelf(ModBlocks.ERODED_TIN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN.get());

            // Chiseled Tin Loot Tables
        this.dropSelf(ModBlocks.CHISELED_TIN.get());
        this.dropSelf(ModBlocks.TARNISHED_CHISELED_TIN.get());
        this.dropSelf(ModBlocks.CORRODED_CHISELED_TIN.get());
        this.dropSelf(ModBlocks.ERODED_CHISELED_TIN.get());

        this.dropSelf(ModBlocks.WAXED_CHISELED_TIN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_CHISELED_TIN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_CHISELED_TIN.get());

            // Tin Grates Loot Tables
        this.dropSelf(ModBlocks.TIN_GRATE.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_GRATE.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_GRATE.get());
        this.dropSelf(ModBlocks.ERODED_TIN_GRATE.get());

        this.dropSelf(ModBlocks.WAXED_TIN_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_GRATE.get());

            // Tin Grate Drains Loot Tables
        this.dropSelf(ModBlocks.TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.ERODED_TIN_GRATE_DRAIN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_GRATE_DRAIN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_GRATE_DRAIN.get());

            // Cut Tin Loot Tables
        this.dropSelf(ModBlocks.CUT_TIN.get());
        this.dropSelf(ModBlocks.TARNISHED_CUT_TIN.get());
        this.dropSelf(ModBlocks.CORRODED_CUT_TIN.get());
        this.dropSelf(ModBlocks.ERODED_CUT_TIN.get());

        this.dropSelf(ModBlocks.WAXED_CUT_TIN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_CUT_TIN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_CUT_TIN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_CUT_TIN.get());

            // Cut Tin Stair Loot Tables
        this.dropSelf(ModBlocks.CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.TARNISHED_CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.CORRODED_CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.ERODED_CUT_TIN_STAIRS.get());

        this.dropSelf(ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_CUT_TIN_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_CUT_TIN_STAIRS.get());

            // Cut Tin Slab Loot Tables
        this.dropSelf(ModBlocks.CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.TARNISHED_CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.CORRODED_CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.ERODED_CUT_TIN_SLAB.get());

        this.dropSelf(ModBlocks.WAXED_CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_CUT_TIN_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_CUT_TIN_SLAB.get());

            // Tin Tile Loot Tables
        this.dropSelf(ModBlocks.TIN_TILES.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_TILES.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_TILES.get());
        this.dropSelf(ModBlocks.ERODED_TIN_TILES.get());

        this.dropSelf(ModBlocks.WAXED_TIN_TILES.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_TILES.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_TILES.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_TILES.get());

            // Tin Tile Stair Loot Tables
        this.dropSelf(ModBlocks.TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.ERODED_TIN_TILE_STAIRS.get());

        this.dropSelf(ModBlocks.WAXED_TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_TILE_STAIRS.get());

            // Tin Tile Slab Loot Tables
        this.dropSelf(ModBlocks.TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.ERODED_TIN_TILE_SLAB.get());

        this.dropSelf(ModBlocks.WAXED_TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_TILE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_TILE_SLAB.get());

            // Tin Shingle Loot Tables
        this.dropSelf(ModBlocks.TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.ERODED_TIN_SHINGLES.get());

        this.dropSelf(ModBlocks.WAXED_TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_SHINGLES.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_SHINGLES.get());

            // Tin Shingle Stair Loot Tables
        this.dropSelf(ModBlocks.TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.ERODED_TIN_SHINGLE_STAIRS.get());

        this.dropSelf(ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_SHINGLE_STAIRS.get());

            // Tin Shingle Slab Loot Tables
        this.dropSelf(ModBlocks.TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.ERODED_TIN_SHINGLE_SLAB.get());

        this.dropSelf(ModBlocks.WAXED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_SHINGLE_SLAB.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_SHINGLE_SLAB.get());

            // Tin Door Loot Table
        this.add(ModBlocks.TIN_DOOR.get(),
                block -> createDoorTable(ModBlocks.TIN_DOOR.get()));

            // Tin Trapdoor Loot Table
        this.dropSelf(ModBlocks.TIN_TRAPDOOR.get());

            // Tn Bar Loot Tables
        this.dropSelf(ModBlocks.TIN_BARS.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_BARS.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_BARS.get());
        this.dropSelf(ModBlocks.ERODED_TIN_BARS.get());

        this.dropSelf(ModBlocks.WAXED_TIN_BARS.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_BARS.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_BARS.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_BARS.get());

            // Tin Chain Loot Tables
        this.dropSelf(ModBlocks.TIN_CHAIN.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_CHAIN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_CHAIN.get());
        this.dropSelf(ModBlocks.ERODED_TIN_CHAIN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_CHAIN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_CHAIN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_CHAIN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_CHAIN.get());

            // Tin Lantern Loot Tables
        this.dropSelf(ModBlocks.TIN_LANTERN.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_LANTERN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_LANTERN.get());
        this.dropSelf(ModBlocks.ERODED_TIN_LANTERN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_LANTERN.get());

            // Soul Tin Lantern Loot Tables
        this.dropSelf(ModBlocks.TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.ERODED_TIN_SOUL_LANTERN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_SOUL_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_SOUL_LANTERN.get());

            // Tin Mage Lantern Loot Tables
        this.dropSelf(ModBlocks.TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.TARNISHED_TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.CORRODED_TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.ERODED_TIN_MAGE_LANTERN.get());

        this.dropSelf(ModBlocks.WAXED_TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_TARNISHED_TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_CORRODED_TIN_MAGE_LANTERN.get());
        this.dropSelf(ModBlocks.WAXED_ERODED_TIN_MAGE_LANTERN.get());

            // Bronze Block Loot Table
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());

            // Bronze Tile Loot Tables
        this.dropSelf(ModBlocks.BRONZE_TILES.get());
        this.dropSelf(ModBlocks.BRONZE_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.BRONZE_TILE_SLAB.get());

            // Bronze Shingle Loot Tables
        this.dropSelf(ModBlocks.BRONZE_SHINGLES.get());
        this.dropSelf(ModBlocks.BRONZE_SHINGLE_STAIRS.get());
        this.dropSelf(ModBlocks.BRONZE_SHINGLE_SLAB.get());

            // Bronze Door Loot Table
        this.add(ModBlocks.BRONZE_DOOR.get(),
                block -> createDoorTable(ModBlocks.BRONZE_DOOR.get()));

            // Bronze Trapdoor Loot Table
        this.dropSelf(ModBlocks.BRONZE_TRAPDOOR.get());

            // Bronze Bars Loot Table
        this.dropSelf(ModBlocks.BRONZE_BARS.get());

            // Bronze Grate Loot Table
        this.dropSelf(ModBlocks.BRONZE_GRATE.get());

            // Bronze Grate Drain Loot Table
        this.dropSelf(ModBlocks.BRONZE_GRATE_DRAIN.get());

            // Mechanical Pressure Plate Loot Table
        this.dropSelf(ModBlocks.LOOPING_PRESSURE_PLATE.get());

            // Rose Gold Block Loot Table
        this.dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());

            // Rose Gold Mosaic Loot Tables
        this.dropSelf(ModBlocks.ROSE_GOLD_MOSAIC.get());
        this.dropSelf(ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get());
        this.add(ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get(), createSlabItemTable(ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get()));

            // Rose Gold Lantern Loot Table
        this.dropSelf(ModBlocks.ROSE_LANTERN.get());

            // Medium Weighted Pressure Plate Loot Table
        this.dropSelf(ModBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());

            // Mage Fire Blocks
        this.dropSelf(ModBlocks.MAGE_TORCH.get());

        this.dropSelf(ModBlocks.MAGE_LANTERN.get());

        this.dropOther(ModBlocks.MAGE_FIRE.get(), Blocks.AIR);

        this.add(ModBlocks.MAGE_CAMPFIRE.get(), block -> createCampfireLikeDrop(ModBlocks.MAGE_CAMPFIRE.get()));


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
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
