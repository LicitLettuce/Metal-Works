package net.lettuce.metalworks.registry;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.DecoratedPotPatterns;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.Map;

public class ModDecoratedPotPatterns {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final ResourceKey<String> LOST_POTTERY_PATTERN =
            ResourceKey.create(Registries.DECORATED_POT_PATTERNS,
                    new ResourceLocation(MetalWorks.MOD_ID, "lost_pottery_pattern"));

    public static final ResourceKey<String> REAP_POTTERY_PATTERN =
            ResourceKey.create(Registries.DECORATED_POT_PATTERNS,
                    new ResourceLocation(MetalWorks.MOD_ID, "reap_pottery_pattern"));

    public static void register() {
        LOGGER.info("Registering Metal Works decorated pot patterns");
        LOGGER.info("Lost sherd present: {}", ModItems.LOST_POTTERY_SHERD.isPresent());
        LOGGER.info("Reap sherd present: {}", ModItems.REAP_POTTERY_SHERD.isPresent());

        if (ModItems.LOST_POTTERY_SHERD.isPresent()) {
            addPattern(ModItems.LOST_POTTERY_SHERD.get(), LOST_POTTERY_PATTERN);
        }

        if (ModItems.REAP_POTTERY_SHERD.isPresent()) {
            addPattern(ModItems.REAP_POTTERY_SHERD.get(), REAP_POTTERY_PATTERN);
        }
    }

    @SuppressWarnings("unchecked")
    private static void addPattern(Item item, ResourceKey<String> pattern) {
        try {
            Field field;

            try {
                field = DecoratedPotPatterns.class.getDeclaredField("ITEM_TO_POT_TEXTURE");
            } catch (NoSuchFieldException ignored) {
                field = DecoratedPotPatterns.class.getDeclaredField("SHERD_TO_PATTERN");
            }

            field.setAccessible(true);

            Map<Item, ResourceKey<String>> map =
                    (Map<Item, ResourceKey<String>>) field.get(null);

            map.put(item, pattern);

            LOGGER.info("Added decorated pot pattern: {} -> {}", item, pattern.location());
        } catch (Exception e) {
            LOGGER.error("Failed to register decorated pot pattern for {}", item, e);
        }
    }
}