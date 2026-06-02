package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, MetalWorks.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<MageGolemEntity>> MAGE_GOLEM =
            ENTITY_TYPES.register("mage_golem", () -> EntityType.Builder.of(MageGolemEntity::new, MobCategory.MISC)
                    .sized(0.7f, 2f).build("mage_golem"));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
