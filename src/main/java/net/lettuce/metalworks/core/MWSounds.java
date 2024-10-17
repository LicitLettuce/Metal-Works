package net.lettuce.metalworks.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MWSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MetalWorks.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALLOY = registerSoundEvents();

    private static RegistryObject<SoundEvent> registerSoundEvents() {
        return SOUND_EVENTS.register("music_disc_alloy",()-> SoundEvent.createVariableRangeEvent(new ResourceLocation(MetalWorks.MOD_ID)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
