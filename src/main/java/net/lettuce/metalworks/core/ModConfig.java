package net.lettuce.metalworks.core;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ModConfig {
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common {
        public final ForgeConfigSpec.BooleanValue populateVanillaTabs;
        public final ForgeConfigSpec.BooleanValue tinVariantTab;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("creative_tabs");

            populateVanillaTabs = builder
                    .comment("If true, Metal Works items will be added to existing vanilla Creative Mode tabs.")
                    .define("populateVanillaTabs", true);

            tinVariantTab = builder
                    .comment("If true, a separate creative tab will be created for Weathered & Waxed Tin Blocks")
                    .define("separateWeatheredTin", false );

            builder.pop();
        }
    }
}
