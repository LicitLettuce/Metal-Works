package net.lettuce.metalworks.registry;



import net.lettuce.metalworks.common.blockentity.MageCampfireBlockEntity;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class MWBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MetalWorks.MOD_ID);

    public static final RegistryObject<BlockEntityType<MageCampfireBlockEntity>> MAGE_CAMPFIRE =
            BLOCK_ENTITIES.register("mage_campfire", () ->
                    BlockEntityType.Builder.of(MageCampfireBlockEntity::new, MWBlocks.MAGE_CAMPFIRE.get()).build(null));

    public static void register() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

