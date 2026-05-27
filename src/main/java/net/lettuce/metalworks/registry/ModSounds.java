package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MetalWorks.MOD_ID);

    public static final RegistryObject<SoundEvent> ANCIENTS_MUSIC_DISC =
            registerSoundEvent("ancients");

    public static final RegistryObject<SoundEvent> UNDERWORLD_MUSIC_DISC =
            registerSoundEvent("underworld");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(new ResourceLocation(MetalWorks.MOD_ID, name)));
    }
}
