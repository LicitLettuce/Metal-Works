package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.ModEntities;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MAGE_GOLEM.get(), MageGolemEntity.createAttributes().build());
    }

}
