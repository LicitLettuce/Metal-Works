package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MWConfig;
import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MageGolemBlockSpawnEvents {

    // Define whitelist + blacklist tags
    private static final TagKey<EntityType<?>> WHITELIST_TAG =
            TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(MetalWorks.MOD_ID, "mage_golem_whitelist"));

    private static final TagKey<EntityType<?>> BLACKLIST_TAG =
            TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(MetalWorks.MOD_ID, "mage_golem_blacklist"));

    @SubscribeEvent
    public static void blockHostilesNearGolem(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide()) return;
        if (event.loadedFromDisk()) return;

        Entity entity = event.getEntity();
        Level level = (Level) event.getLevel();
        EntityType<?> type = entity.getType();

        // Step 1: blacklist check
        if (isBlacklisted(type)) {
            event.setCanceled(true);
            return;
        }

        // Step 2: whitelist check
        if (isWhitelisted(type)) {
            return;
        }

        // Step 3: default hostile checks
        if (!(entity instanceof Monster || entity instanceof Slime || entity instanceof Ghast)) {
            return; // not hostile
        }

        // Step 4: check for nearby golems
        for (MageGolemEntity golem : level.getEntitiesOfClass(MageGolemEntity.class,
                entity.getBoundingBox().inflate(64))) {
            int radius = getProtectionRadius(golem);
            if (entity.distanceTo(golem) <= radius) {
                event.setCanceled(true);
                break;
            }
        }
    }

    // 🔹 Helper methods for whitelist/blacklist
    private static boolean isBlacklisted(EntityType<?> type) {
        if (type.is(BLACKLIST_TAG)) return true; // tag first
        return MWConfig.blacklistExtra.get().stream()
                .map(ResourceLocation::new)
                .anyMatch(id -> type.equals(EntityType.byString(id.toString()).orElse(null)));
    }

    private static boolean isWhitelisted(EntityType<?> type) {
        if (type.is(WHITELIST_TAG)) return true; // tag first
        return MWConfig.whitelistExtra.get().stream()
                .map(ResourceLocation::new)
                .anyMatch(id -> type.equals(EntityType.byString(id.toString()).orElse(null)));
    }

    private static int getProtectionRadius(MageGolemEntity golem) {
        return switch (golem.getGolemLevel()) {
            case 1 -> 16;
            case 2 -> 32;
            case 3 -> 64;
            default -> 8;
        };
    }
}


