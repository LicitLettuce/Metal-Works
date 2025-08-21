package net.lettuce.metalworks.core;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.registry.*;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MetalWorks.MOD_ID)
public class MetalWorks
{
    public static final String MOD_ID = "metal_works";
    private static final Logger LOGGER = LogUtils.getLogger();
    public MetalWorks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MWCreativeModeTabs.register(modEventBus);
        MWItems.register(modEventBus);
        MWBlocks.BLOCKS.register(modEventBus);
        MWPaintings.REGISTRY.register(modEventBus);
        MWSounds.register(modEventBus);





        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);




    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MWWeathering.registerWeatheringChain();
            MWWeathering.registerWaxables();
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {


            event.getEntries().putAfter(Items.COAL_BLOCK.getDefaultInstance(), MWItems.TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_BLOCK.get().getDefaultInstance(), MWItems.CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.CHISELED_TIN.get().getDefaultInstance(), MWItems.TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_GRATE.get().getDefaultInstance(), MWItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.CUT_TIN.get().getDefaultInstance(), MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_SHINGLES.get().getDefaultInstance(), MWItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_BARS.get().getDefaultInstance(), MWItems.TIN_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_DOOR.get().getDefaultInstance(), MWItems.TIN_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_TRAPDOOR.get().getDefaultInstance(), MWItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), MWItems.BRONZE_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_BLOCK.get().getDefaultInstance(), MWItems.BRONZE_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_GRATE.get().getDefaultInstance(), MWItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), MWItems.BRONZE_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_TILES.get().getDefaultInstance(), MWItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), MWItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), MWItems.BRONZE_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_SHINGLES.get().getDefaultInstance(), MWItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.BRONZE_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), MWItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

            event.getEntries().putBefore(Items.RAW_IRON_BLOCK.getDefaultInstance(), MWItems.RAW_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_COAL_ORE.getDefaultInstance(), MWItems.TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_ORE.get().getDefaultInstance(), MWItems.DEEPSLATE_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.getEntries().putAfter(Items.SOUL_LANTERN.getDefaultInstance(), MWItems.TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_LANTERN.get().getDefaultInstance(), MWItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), MWItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SEA_LANTERN.getDefaultInstance(), MWItems.ROSE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

            event.accept(MWItems.ROSE_GOLD_BEETROOT);
            event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), MWItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {


            event.getEntries().putAfter(Items.IRON_HOE.getDefaultInstance(), MWItems.BRONZE_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_SHOVEL.get().getDefaultInstance(), MWItems.BRONZE_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_PICKAXE.get().getDefaultInstance(), MWItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_AXE.get().getDefaultInstance(), MWItems.BRONZE_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SHEARS.getDefaultInstance(), MWItems.BRONZE_SHEARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.getEntries().putAfter(Items.STONE_HOE.getDefaultInstance(), MWItems.TIN_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_SHOVEL.get().getDefaultInstance(), MWItems.TIN_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_PICKAXE.get().getDefaultInstance(), MWItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_AXE.get().getDefaultInstance(), MWItems.TIN_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GOLDEN_HOE.getDefaultInstance(), MWItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), MWItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), MWItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_AXE.get().getDefaultInstance(), MWItems.ROSE_GOLD_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //event.getEntries().putBefore(MWItems.MUSIC_DISC_ALLOY.get().getDefaultInstance(), Items.MUSIC_DISC_RELIC.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {


            event.getEntries().putAfter(Items.STONE_SWORD.getDefaultInstance(), MWItems.TIN_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.STONE_AXE.getDefaultInstance(), MWItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(), MWItems.BRONZE_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_AXE.getDefaultInstance(), MWItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_SWORD.getDefaultInstance(), MWItems.ROSE_GOLD_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_AXE.getDefaultInstance(), MWItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_HORSE_ARMOR.getDefaultInstance(), MWItems.BRONZE_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_HORSE_ARMOR.getDefaultInstance(), MWItems.ROSE_GOLD_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CHAINMAIL_BOOTS.getDefaultInstance(), MWItems.TIN_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_HELMET.get().getDefaultInstance(), MWItems.TIN_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_CHESTPLATE.get().getDefaultInstance(), MWItems.TIN_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.TIN_LEGGINGS.get().getDefaultInstance(), MWItems.TIN_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_BOOTS.getDefaultInstance(), MWItems.BRONZE_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_HELMET.get().getDefaultInstance(), MWItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), MWItems.BRONZE_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.BRONZE_LEGGINGS.get().getDefaultInstance(), MWItems.BRONZE_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_BOOTS.getDefaultInstance(), MWItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), MWItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), MWItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(MWItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), MWItems.ROSE_GOLD_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {


            event.getEntries().putBefore(Items.RAW_IRON.getDefaultInstance(), MWItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), MWItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_NUGGET.getDefaultInstance(), MWItems.ROSE_GOLD_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.IRON_INGOT.getDefaultInstance(), MWItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.COPPER_INGOT.getDefaultInstance(), MWItems.BRONZE_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), MWItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.RAW_GOLD.getDefaultInstance(), Items.NETHERITE_SCRAP.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_NUGGET.getDefaultInstance(), MWItems.BRONZE_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Metal Works Mod Loaded");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents

    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
