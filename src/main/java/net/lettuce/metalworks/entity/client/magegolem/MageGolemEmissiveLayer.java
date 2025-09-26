package net.lettuce.metalworks.entity.client.magegolem;

import com.mojang.blaze3d.vertex.PoseStack;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class MageGolemEmissiveLayer extends RenderLayer<MageGolemEntity, MageGolemModel<MageGolemEntity>> {
    private final ResourceLocation[] glowFrames;

    public MageGolemEmissiveLayer(RenderLayerParent<MageGolemEntity, MageGolemModel<MageGolemEntity>> parent,
                                  ResourceLocation[] glowFrames) {
        super(parent);
        this.glowFrames = glowFrames;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight,
                       MageGolemEntity entity, float limbSwing, float limbSwingAmount,
                       float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        int tick = (int)(entity.tickCount / 2 % glowFrames.length);
        ResourceLocation glowTex = glowFrames[tick];

        var vc = buffer.getBuffer(RenderType.entityTranslucentEmissive(glowTex));
        this.getParentModel().renderToBuffer(poseStack, vc,
                0xF000F0, // fullbright
                packedLight,
                1.0F, 1.0F, 1.0F, 1.0F);
    }
}