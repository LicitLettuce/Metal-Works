package net.lettuce.metalworks;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.block.ModBlocks;
import net.lettuce.metalworks.item.custom.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
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
        ModBlocks.BLOCKS.register(modEventBus);

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
            event.getEntries().putBefore(Items.IRON_INGOT.getDefaultInstance(), ModItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_INGOT.getDefaultInstance(), ModItems.BRONZE_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.RAW_IRON.getDefaultInstance(), ModItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), ModItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.RAW_GOLD.getDefaultInstance(), Items.NETHERITE_SCRAP.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.ROSE_GOLD_APPLE);
            event.accept(ModItems.ROSE_GOLD_BEETROOT);
            event.getEntries().putAfter(Items.GOLDEN_APPLE.getDefaultInstance(), ModItems.ROSE_GOLD_APPLE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), ModItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.TIN_SHOVEL);
            event.accept(ModItems.TIN_PICKAXE);
            event.accept(ModItems.TIN_AXE);
            event.accept(ModItems.TIN_HOE);

            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.BRONZE_SHEARS);

            event.accept(ModItems.ROSE_GOLD_SHOVEl);
            event.accept(ModItems.ROSE_GOLD_PICKAXE);
            event.accept(ModItems.ROSE_GOLD_AXE);
            event.accept(ModItems.ROSE_GOLD_HOE);

            event.getEntries().putAfter(Items.IRON_HOE.getDefaultInstance(), ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SHEARS.getDefaultInstance(), ModItems.BRONZE_SHEARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_AXE.get().getDefaultInstance(), ModItems.BRONZE_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.STONE_HOE.getDefaultInstance(), ModItems.TIN_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_SHOVEL.get().getDefaultInstance(), ModItems.TIN_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_PICKAXE.get().getDefaultInstance(), ModItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_AXE.get().getDefaultInstance(), ModItems.TIN_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GOLDEN_HOE.getDefaultInstance(), ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


        }

            if(event.getTabKey() == CreativeModeTabs.COMBAT) {
                event.accept(ModItems.TIN_SWORD);
                event.accept(ModItems.TIN_AXE);

                event.accept(ModItems.BRONZE_SWORD);
                event.accept(ModItems.BRONZE_AXE);

                event.accept(ModItems.ROSE_GOLD_SWORD);
                event.accept(ModItems.ROSE_GOLD_AXE);

                event.accept(ModItems.ROSE_GOLD_HORSE_ARMOR);
                event.accept(ModItems.BRONZE_HORSE_ARMOR);

                event.getEntries().putAfter(Items.STONE_SWORD.getDefaultInstance(), ModItems.TIN_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.STONE_AXE.getDefaultInstance(), ModItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(), ModItems.BRONZE_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_AXE.getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                event.getEntries().putAfter(Items.GOLDEN_SWORD.getDefaultInstance(), ModItems.ROSE_GOLD_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLDEN_AXE.getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                event.getEntries().putAfter(Items.IRON_HORSE_ARMOR.getDefaultInstance(), ModItems.BRONZE_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLDEN_HORSE_ARMOR.getDefaultInstance(), ModItems.ROSE_GOLD_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }

            if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

                event.accept(ModBlocks.GABBRO);
                event.accept(ModBlocks.POLISHED_GABBRO);
                event.accept(ModBlocks.TIN_BLOCK);
                event.accept(ModBlocks.BRONZE_BLOCK);
                event.accept(ModBlocks.ROSE_GOLD_BLOCK);

                event.getEntries().putAfter(Items.POLISHED_ANDESITE_SLAB.getDefaultInstance(), ModItems.GABBRO.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.GABBRO.get().getDefaultInstance(), ModItems.POLISHED_GABBRO.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.AMETHYST_BLOCK.getDefaultInstance(), ModItems.TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), ModItems.BRONZE_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLD_BLOCK.getDefaultInstance(), ModItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }

            if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

                event.accept(ModBlocks.GABBRO);

                event.getEntries().putAfter(Items.ANDESITE.getDefaultInstance(), ModItems.GABBRO.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

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
