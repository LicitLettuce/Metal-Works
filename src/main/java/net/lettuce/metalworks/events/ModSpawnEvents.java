package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSpawnEvents {

    @SubscribeEvent
    public static void blockHostilesNearGolem(EntityJoinLevelEvent event) {
        // Server only
        if (event.getLevel().isClientSide()) return;

        // Ignore entities loading from disk (prevents wiping mobs when chunks load)
        if (event.loadedFromDisk()) return;

        // Only care about hostile mobs
        if (!(event.getEntity() instanceof Monster monster)) return;

        Level level = (Level) event.getLevel();

        // 32-block radius "ward"
        if (!level.getEntitiesOfClass(MageGolemEntity.class,
                monster.getBoundingBox().inflate(64)).isEmpty()) {
            event.setCanceled(true); // prevent the mob from being added to the world
        }
    }
}
