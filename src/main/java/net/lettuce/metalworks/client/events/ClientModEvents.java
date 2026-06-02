package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.registry.ModBlockEntities;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.client.renderer.blockentity.CampfireRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(
        modid = MetalWorks.MOD_ID,
        value = Dist.CLIENT,
        bus = EventBusSubscriber.Bus.MOD
)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(
                ModBlockEntities.MAGE_CAMPFIRE.get(),
                CampfireRenderer::new
        );
    }

}
