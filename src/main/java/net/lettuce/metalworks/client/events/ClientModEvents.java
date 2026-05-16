package net.lettuce.metalworks.client.events;

import net.lettuce.metalworks.registry.ModBlockEntities;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.client.renderer.blockentity.CampfireRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = MetalWorks.MOD_ID,
        value = Dist.CLIENT,
        bus = Mod.EventBusSubscriber.Bus.MOD
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
