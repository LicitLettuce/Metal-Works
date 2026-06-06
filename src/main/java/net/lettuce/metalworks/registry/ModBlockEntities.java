package net.lettuce.metalworks.registry;



import net.lettuce.metalworks.common.blockentity.MageCampfireBlockEntity;
import net.lettuce.metalworks.common.blockentity.ModBrushableBlockEntity;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Set;

import static com.teamabnormals.blueprint.core.registry.BlueprintBlockEntityTypes.HELPER;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MetalWorks.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MageCampfireBlockEntity>> MAGE_CAMPFIRE = HELPER.createBlockEntity
            ("mage_campfire", MageCampfireBlockEntity::new, () -> Set.of(ModBlocks.MAGE_CAMPFIRE.get()));


    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ModBrushableBlockEntity>> SUSPICIOUS_SOUL_SOIL =
            BLOCK_ENTITIES.register("suspicious_soul_soil",
                    () -> BlockEntityType.Builder.of(
                            ModBrushableBlockEntity::new,
                            ModBlocks.SUSPICIOUS_SOUL_SOIL.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
