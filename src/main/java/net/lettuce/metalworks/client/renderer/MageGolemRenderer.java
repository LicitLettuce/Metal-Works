package net.lettuce.metalworks.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.lettuce.metalworks.client.model.MageGolemEmissiveLayer;
import net.lettuce.metalworks.client.model.MageGolemModel;
import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.common.registry.ModModelLayers;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MageGolemRenderer extends MobRenderer<MageGolemEntity, MageGolemModel<MageGolemEntity>> {
    public MageGolemRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MageGolemModel<>(pContext.bakeLayer(ModModelLayers.MAGE_GOLEM_LAYER)), 0.5f);

        this.addLayer(new MageGolemEmissiveLayer(this, GLOW_FRAMES));
    }

    private static final ResourceLocation[] FRAMES = {
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame0.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame1.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame2.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame3.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame4.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame5.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame6.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame7.png"),
    };

    private static final ResourceLocation[] GLOW_FRAMES = {
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame0_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame1_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame2_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame3_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame4_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame5_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame6_glow.png"),
            new ResourceLocation(MetalWorks.MOD_ID, "textures/entity/mage_golem/frame7_glow.png"),
    };

    @Override
    public ResourceLocation getTextureLocation(MageGolemEntity entity) {
        int tick = (int)(entity.tickCount / 2 % FRAMES.length);
        return FRAMES[tick];
    }

    @Override
    public void render(MageGolemEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
