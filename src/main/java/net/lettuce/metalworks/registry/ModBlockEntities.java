package net.lettuce.metalworks.registry;



import net.lettuce.metalworks.common.blockentity.MageCampfireBlockEntity;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MetalWorks.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MageCampfireBlockEntity>> MAGE_CAMPFIRE =
            BLOCK_ENTITIES.register("mage_campfire", () ->
                    BlockEntityType.Builder.of(MageCampfireBlockEntity::new, ModBlocks.MAGE_CAMPFIRE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
