package net.lettuce.metalworks.tags;

import net.lettuce.metalworks.MetalWorks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> NEEDS_TIN_TOOL = tag("needs_tin_tool");
    public static final TagKey<Block> NEEDS_BRONZE_TOOL = tag("needs_bronze_tool");
    public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = tag("needs_rose_gold_tool");
    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(MetalWorks.MOD_ID, name));
    }
}
