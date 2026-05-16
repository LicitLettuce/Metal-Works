package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.entity.MageGolemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MetalWorks.MOD_ID);

    public static final RegistryObject<EntityType<MageGolemEntity>> MAGE_GOLEM =
            ENTITY_TYPES.register("mage_golem", () -> EntityType.Builder.of(MageGolemEntity::new, MobCategory.MISC)
                    .sized(0.7f, 2f).build("mage_golem"));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
