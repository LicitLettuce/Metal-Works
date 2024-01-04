package net.lettuce.metalworks;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.item.custom.ModItems;
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

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.ROSE_GOLD_INGOT);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.TIN_NUGGET);
            event.getEntries().putAfter(Items.COPPER_INGOT.getDefaultInstance(), ModItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.GOLD_INGOT.getDefaultInstance(), ModItems.BRONZE_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.RAW_COPPER.getDefaultInstance(), ModItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_NUGGET.getDefaultInstance(), ModItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.RAW_GOLD.getDefaultInstance(), Items.NETHERITE_SCRAP.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.ROSE_GOLD_APPLE);
            event.accept(ModItems.ROSE_GOLD_BEETROOT);
            event.getEntries().putAfter(Items.GOLDEN_APPLE.getDefaultInstance(), ModItems.ROSE_GOLD_APPLE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), ModItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.BRONZE_SHEARS);
            event.getEntries().putAfter(Items.IRON_HOE.getDefaultInstance(), ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SHEARS.getDefaultInstance(), ModItems.BRONZE_SHEARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_AXE.get().getDefaultInstance(), ModItems.BRONZE_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            if(event.getTabKey() == CreativeModeTabs.COMBAT) {
                event.accept(ModItems.BRONZE_SWORD);
                event.accept(ModItems.BRONZE_AXE);
                event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(), ModItems.BRONZE_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_SWORD.get().getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
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
