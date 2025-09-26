package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MageGolemBlockSpawnEvents {

    @SubscribeEvent
    public static void blockHostilesNearGolem(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide()) return;
        if (event.loadedFromDisk()) return;

        Entity entity = event.getEntity();

        if (entity instanceof Warden
                || entity instanceof Phantom
                || entity instanceof EnderDragon
                || entity instanceof Pillager
                || entity instanceof Vindicator
                || entity instanceof Evoker
                || entity instanceof Illusioner) {
            return;
        }

        if (!(entity instanceof Monster ||
                entity instanceof Ghast ||
                entity instanceof Slime)) {
            return;
        }

        Level level = (Level) event.getLevel();

        for (MageGolemEntity golem : level.getEntitiesOfClass(MageGolemEntity.class,
                entity.getBoundingBox().inflate(64))) { // 64 = max possible radius
            int radius = getProtectionRadius(golem);
            if (entity.distanceTo(golem) <= radius) {
                event.setCanceled(true);
                break;
            }
        }
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

