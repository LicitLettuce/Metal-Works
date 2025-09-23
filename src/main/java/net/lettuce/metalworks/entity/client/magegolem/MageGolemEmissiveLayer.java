package net.lettuce.metalworks.entity.client.magegolem;

import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;

public class MageGolemEmissiveLayer
        extends EyesLayer<MageGolemEntity, MageGolemModel<MageGolemEntity>> {

    private final ResourceLocation texture;

    public MageGolemEmissiveLayer(RenderLayerParent<MageGolemEntity, MageGolemModel<MageGolemEntity>> parent,
                                  ResourceLocation texture) {
        super(parent);
        this.texture = texture;
    }

    @Override
    public RenderType renderType() {
        return RenderType.eyes(texture);
    }
}
