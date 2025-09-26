package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.MWEntities;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(MWEntities.MAGE_GOLEM.get(), MageGolemEntity.createAttributes().build());
    }

}
