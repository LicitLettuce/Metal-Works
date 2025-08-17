package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MWCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MetalWorks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MWItems.BRONZE_HELMET.get()))
                    .title(Component.translatable("creativetab.metal_works_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // --- NATURAL BLOCKS ---
                        pOutput.accept(MWItems.TIN_ORE.get());
                        pOutput.accept(MWItems.DEEPSLATE_TIN_ORE.get());
                        pOutput.accept(MWItems.RAW_TIN_BLOCK.get());

                        // --- BUILDING BLOCKS ---
                        pOutput.accept(MWItems.TIN_BLOCK.get());
                        pOutput.accept(MWItems.CHISELED_TIN.get());
                        pOutput.accept(MWItems.TIN_GRATE.get());
                        pOutput.accept(MWItems.TIN_GRATE_DRAIN.get());
                        pOutput.accept(MWItems.CUT_TIN.get());
                        pOutput.accept(MWItems.CUT_TIN_STAIRS.get());
                        pOutput.accept(MWItems.CUT_TIN_SLAB.get());
                        pOutput.accept(MWItems.CUT_TIN_WALL.get());
                        pOutput.accept(MWItems.CUT_TIN_BUTTON.get());
                        pOutput.accept(MWItems.CUT_TIN_PRESSURE_PLATE.get());
                        pOutput.accept(MWItems.TIN_SHINGLES.get());
                        pOutput.accept(MWItems.TIN_SHINGLE_STAIRS.get());
                        pOutput.accept(MWItems.TIN_SHINGLE_SLAB.get());
                        pOutput.accept(MWItems.TIN_DOOR.get());
                        pOutput.accept(MWItems.TIN_TRAPDOOR.get());
                        pOutput.accept(MWItems.TIN_BARS.get());


                        pOutput.accept(MWItems.TIN_CHAIN.get());

                        pOutput.accept(MWItems.TIN_LANTERN.get());
                        pOutput.accept(MWItems.TIN_SOUL_LANTERN.get());

                        pOutput.accept(MWItems.BRONZE_BLOCK.get());
                        pOutput.accept(MWItems.BRONZE_GRATE.get());
                        pOutput.accept(MWItems.BRONZE_GRATE_DRAIN.get());
                        pOutput.accept(MWItems.BRONZE_TILES.get());
                        pOutput.accept(MWItems.BRONZE_TILE_STAIRS.get());
                        pOutput.accept(MWItems.BRONZE_TILE_SLAB.get());
                        pOutput.accept(MWItems.BRONZE_SHINGLES.get());
                        pOutput.accept(MWItems.BRONZE_SHINGLE_STAIRS.get());
                        pOutput.accept(MWItems.BRONZE_SHINGLE_SLAB.get());
                        pOutput.accept(MWItems.BRONZE_BARS.get());



                        pOutput.accept(MWItems.ROSE_GOLD_BLOCK.get());
                        pOutput.accept(MWItems.ROSE_LANTERN.get());



                        // --- INGREDIENTS ---
                        pOutput.accept(MWItems.RAW_TIN.get());

                        pOutput.accept(MWItems.TIN_INGOT.get());
                        pOutput.accept(MWItems.TIN_NUGGET.get());

                        pOutput.accept(MWItems.BRONZE_INGOT.get());
                        pOutput.accept(MWItems.BRONZE_NUGGET.get());

                        pOutput.accept(MWItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(MWItems.ROSE_GOLD_NUGGET.get());

                        // --- FOOD ---
                        pOutput.accept(MWItems.ROSE_GOLD_BEETROOT.get());

                        // --- TOOLS ---
                        pOutput.accept(MWItems.TIN_SWORD.get());
                        pOutput.accept(MWItems.TIN_PICKAXE.get());
                        pOutput.accept(MWItems.TIN_AXE.get());
                        pOutput.accept(MWItems.TIN_SHOVEL.get());
                        pOutput.accept(MWItems.TIN_HOE.get());

                        pOutput.accept(MWItems.BRONZE_SWORD.get());
                        pOutput.accept(MWItems.BRONZE_PICKAXE.get());
                        pOutput.accept(MWItems.BRONZE_AXE.get());
                        pOutput.accept(MWItems.BRONZE_SHOVEL.get());
                        pOutput.accept(MWItems.BRONZE_HOE.get());
                        pOutput.accept(MWItems.BRONZE_SHEARS.get());

                        pOutput.accept(MWItems.ROSE_GOLD_SWORD.get());
                        pOutput.accept(MWItems.ROSE_GOLD_PICKAXE.get());
                        pOutput.accept(MWItems.ROSE_GOLD_AXE.get());
                        pOutput.accept(MWItems.ROSE_GOLD_SHOVEl.get());
                        pOutput.accept(MWItems.ROSE_GOLD_HOE.get());

                        // --- ARMOR ---
                        pOutput.accept(MWItems.TIN_HELMET.get());
                        pOutput.accept(MWItems.TIN_CHESTPLATE.get());
                        pOutput.accept(MWItems.TIN_LEGGINGS.get());
                        pOutput.accept(MWItems.TIN_BOOTS.get());

                        pOutput.accept(MWItems.BRONZE_HELMET.get());
                        pOutput.accept(MWItems.BRONZE_CHESTPLATE.get());
                        pOutput.accept(MWItems.BRONZE_LEGGINGS.get());
                        pOutput.accept(MWItems.BRONZE_BOOTS.get());
                        pOutput.accept(MWItems.BRONZE_HORSE_ARMOR.get());

                        pOutput.accept(MWItems.ROSE_GOLD_HELMET.get());
                        pOutput.accept(MWItems.ROSE_GOLD_CHESTPLATE.get());
                        pOutput.accept(MWItems.ROSE_GOLD_LEGGINGS.get());
                        pOutput.accept(MWItems.ROSE_GOLD_BOOTS.get());
                        pOutput.accept(MWItems.ROSE_GOLD_HORSE_ARMOR.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
