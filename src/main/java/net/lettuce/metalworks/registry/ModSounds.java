package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, MetalWorks.MOD_ID);

    // Music Discs
    public static final DeferredHolder<SoundEvent, SoundEvent> ANCIENTS_MUSIC_DISC =
            registerSoundEvent("ancients");

    public static final DeferredHolder<SoundEvent, SoundEvent> UNDERWORLD_MUSIC_DISC =
            registerSoundEvent("underworld");

    // Mage Golem Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent> MAGE_GOLEM_IDLE =
            registerSoundEvent("entity.mage_golem.idle");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, name)));
    }
}
