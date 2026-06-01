package net.lettuce.metalworks.core;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ModConfig {
    public static final ModConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Common, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common {
        public final ModConfigSpec.BooleanValue populateVanillaTabs;
        public final ModConfigSpec.BooleanValue tinVariantTab;

        public Common(ModConfigSpec.Builder builder) {
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
