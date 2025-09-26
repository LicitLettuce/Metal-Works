package net.lettuce.metalworks.common.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MWTags {

    //Blocks
    public static final TagKey<Block> NEEDS_TIN_TOOL = tag
            ("needs_tin_tool");

    public static final TagKey<Block> NEEDS_BRONZE_TOOL = tag
            ("needs_bronze_tool");

    public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = tag
            ("needs_rose_gold_tool");

    public static final TagKey<Block> TIN_ORES = tag
            ("tin_ores");

    public static final TagKey<Block> MAGE_FIRE_BASE_BLOCKS = tag
            ("mage_fire_base_blocks");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(MetalWorks.MOD_ID, name));
    }
}
