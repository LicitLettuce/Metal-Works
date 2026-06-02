package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, MetalWorks.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> TIN = ARMOR_MATERIALS.register("tin", () -> new ArmorMaterial(
            defense(2, 4, 5, 2, 4),
            15,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.TIN_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "tin"))),
            0f,
            0f
    ));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRONZE = ARMOR_MATERIALS.register("bronze", () -> new ArmorMaterial(
            defense(3, 6, 5, 3, 9),
            10,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "bronze"))),
            1f,
            0.05f
    ));

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ROSE_GOLD = ARMOR_MATERIALS.register("rose_gold", () -> new ArmorMaterial(
            defense(3, 6, 4, 2, 8),
            21,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MetalWorks.MOD_ID, "rose_gold"))),
            0.5f,
            0f
    ));

    private static EnumMap<ArmorItem.Type, Integer> defense(int helmet, int chestplate, int leggings, int boots, int body) {
        EnumMap<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        defense.put(ArmorItem.Type.HELMET, helmet);
        defense.put(ArmorItem.Type.CHESTPLATE, chestplate);
        defense.put(ArmorItem.Type.LEGGINGS, leggings);
        defense.put(ArmorItem.Type.BOOTS, boots);
        defense.put(ArmorItem.Type.BODY, body);
        return defense;
    }

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
