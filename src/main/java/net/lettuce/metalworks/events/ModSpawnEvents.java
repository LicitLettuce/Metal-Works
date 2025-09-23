package net.lettuce.metalworks.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Slime;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSpawnEvents {

    @SubscribeEvent
    public static void blockHostilesNearGolem(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide()) return;
        if (event.loadedFromDisk()) return;

        if (!(event.getEntity() instanceof Monster
                || event.getEntity() instanceof Ghast
                || event.getEntity() instanceof Slime)) {
            return;
        }

        Level level = (Level) event.getLevel();

        if (!level.getEntitiesOfClass(
                MageGolemEntity.class,
                event.getEntity().getBoundingBox().inflate(64) // 64-block ward radius
        ).isEmpty()) {
            event.setCanceled(true);
        }
    }
}
