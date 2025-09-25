package net.lettuce.metalworks.core;

import net.minecraftforge.common.ForgeConfigSpec;
import java.util.List;

public class MWConfig {
    public static ForgeConfigSpec COMMON_SPEC;

    public static ForgeConfigSpec.ConfigValue<List<? extends String>> whitelistExtra;
    public static ForgeConfigSpec.ConfigValue<List<? extends String>> blacklistExtra;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("Mage Golem");

        whitelistExtra = builder
                .comment("Extra entity IDs always allowed to spawn near Mage Golems")
                .defineList("whitelistExtra",
                        List.of("minecraft:wandering_trader"),
                        o -> o instanceof String);

        blacklistExtra = builder
                .comment("Extra entity IDs always blocked from spawning near Mage Golems")
                .defineList("blacklistExtra",
                        List.of(),
                        o -> o instanceof String);

        builder.pop();

        COMMON_SPEC = builder.build();
    }
}
