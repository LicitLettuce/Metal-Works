package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.client.model.MageGolemModel;
import net.lettuce.metalworks.registry.ModModelLayers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MAGE_GOLEM_LAYER, MageGolemModel::createBodyLayer);
    }
}
