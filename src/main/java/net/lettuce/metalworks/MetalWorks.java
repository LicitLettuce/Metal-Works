package net.lettuce.metalworks;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.block.ModBlocks;
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

        ModBlocks.BLOCKS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);




    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(ModBlocks.TIN_BLOCK);
            event.accept(ModBlocks.CHISELED_TIN);
            event.accept(ModBlocks.CUT_TIN);
            event.accept(ModBlocks.CUT_TIN_STAIRS);
            event.accept(ModBlocks.CUT_TIN_SLAB);
            event.accept(ModBlocks.CUT_TIN_WALL);
            event.accept(ModBlocks.CUT_TIN_BUTTON);
            event.accept(ModBlocks.CUT_TIN_PRESSURE_PLATE);
            event.accept(ModBlocks.TIN_GRATE_DRAIN);
            event.accept(ModBlocks.TIN_GRATE);
            event.accept(ModBlocks.TIN_BARS);
            event.accept(ModBlocks.TIN_DOOR);
            event.accept(ModBlocks.TIN_TRAPDOOR);
            event.accept(ModBlocks.TIN_CHAIN);

            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.BRONZE_SHINGLES);
            event.accept(ModBlocks.BRONZE_SHINGLE_STAIRS);
            event.accept(ModBlocks.BRONZE_SHINGLE_SLAB);
            event.accept(ModBlocks.BRONZE_BARS);

            event.accept(ModBlocks.ROSE_GOLD_BLOCK);

            event.getEntries().putAfter(Items.COAL_BLOCK.getDefaultInstance(), ModItems.TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_BLOCK.get().getDefaultInstance(), ModItems.CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CHISELED_TIN.get().getDefaultInstance(), ModItems.TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_GRATE.get().getDefaultInstance(), ModItems.CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN.get().getDefaultInstance(), ModItems.CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN_STAIRS.get().getDefaultInstance(), ModItems.CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN_SLAB.get().getDefaultInstance(), ModItems.CUT_TIN_WALL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN_WALL.get().getDefaultInstance(), ModItems.TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_BARS.get().getDefaultInstance(), ModItems.TIN_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_DOOR.get().getDefaultInstance(), ModItems.TIN_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_TRAPDOOR.get().getDefaultInstance(), ModItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), ModItems.CUT_TIN_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN_PRESSURE_PLATE.get().getDefaultInstance(), ModItems.CUT_TIN_BUTTON.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.CUT_TIN_BUTTON.get().getDefaultInstance(), ModItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), ModItems.BRONZE_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_BLOCK.get().getDefaultInstance(), ModItems.BRONZE_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_GRATE.get().getDefaultInstance(), ModItems.BRONZE_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_SHINGLES.get().getDefaultInstance(), ModItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.BRONZE_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_BARS.get().getDefaultInstance(), ModItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), ModItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.RAW_TIN_BLOCK);
            event.getEntries().putBefore(Items.RAW_IRON_BLOCK.getDefaultInstance(), ModItems.RAW_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DEEPSLATE_COAL_ORE.getDefaultInstance(), ModItems.TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_ORE.get().getDefaultInstance(), ModItems.DEEPSLATE_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.accept(ModBlocks.TIN_LANTERN);
            event.accept(ModBlocks.TIN_SOUL_LANTERN);
            event.accept(ModBlocks.TIN_CHAIN);
            event.accept(ModBlocks.ROSE_LAMP);

            event.getEntries().putAfter(Items.SOUL_LANTERN.getDefaultInstance(), ModItems.TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_LANTERN.get().getDefaultInstance(), ModItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), ModItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SEA_LANTERN.getDefaultInstance(), ModItems.ROSE_LAMP.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

            event.accept(ModItems.ROSE_GOLD_BEETROOT);
            event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), ModItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

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
            event.getEntries().putAfter(ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_AXE.get().getDefaultInstance(), ModItems.BRONZE_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SHEARS.getDefaultInstance(), ModItems.BRONZE_SHEARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.getEntries().putAfter(Items.STONE_HOE.getDefaultInstance(), ModItems.TIN_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_SHOVEL.get().getDefaultInstance(), ModItems.TIN_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_PICKAXE.get().getDefaultInstance(), ModItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_AXE.get().getDefaultInstance(), ModItems.TIN_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GOLDEN_HOE.getDefaultInstance(), ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_SHOVEl.get().getDefaultInstance(), ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {

            event.accept(ModItems.TIN_SWORD);
            event.accept(ModItems.TIN_AXE);
            event.accept(ModItems.TIN_HELMET);
            event.accept(ModItems.TIN_CHESTPLATE);
            event.accept(ModItems.TIN_LEGGINGS);
            event.accept(ModItems.TIN_BOOTS);

            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);

            event.accept(ModItems.ROSE_GOLD_SWORD);
            event.accept(ModItems.ROSE_GOLD_AXE);
            event.accept(ModItems.ROSE_GOLD_HELMET);
            event.accept(ModItems.ROSE_GOLD_CHESTPLATE);
            event.accept(ModItems.ROSE_GOLD_LEGGINGS);
            event.accept(ModItems.ROSE_GOLD_BOOTS);

            event.accept(ModItems.BRONZE_HORSE_ARMOR);
            event.accept(ModItems.ROSE_GOLD_HORSE_ARMOR);


            event.getEntries().putAfter(Items.STONE_SWORD.getDefaultInstance(), ModItems.TIN_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.STONE_AXE.getDefaultInstance(), ModItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_SWORD.getDefaultInstance(), ModItems.BRONZE_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_AXE.getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_SWORD.getDefaultInstance(), ModItems.ROSE_GOLD_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_AXE.getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_HORSE_ARMOR.getDefaultInstance(), ModItems.BRONZE_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_HORSE_ARMOR.getDefaultInstance(), ModItems.ROSE_GOLD_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CHAINMAIL_BOOTS.getDefaultInstance(), ModItems.TIN_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_HELMET.get().getDefaultInstance(), ModItems.TIN_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_CHESTPLATE.get().getDefaultInstance(), ModItems.TIN_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.TIN_LEGGINGS.get().getDefaultInstance(), ModItems.TIN_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.IRON_BOOTS.getDefaultInstance(), ModItems.BRONZE_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_HELMET.get().getDefaultInstance(), ModItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), ModItems.BRONZE_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.BRONZE_LEGGINGS.get().getDefaultInstance(), ModItems.BRONZE_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLDEN_BOOTS.getDefaultInstance(), ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), ModItems.ROSE_GOLD_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.TIN_NUGGET);
            event.accept(ModItems.ROSE_GOLD_NUGGET);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.ROSE_GOLD_INGOT);

            event.getEntries().putBefore(Items.RAW_IRON.getDefaultInstance(), ModItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), ModItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_NUGGET.getDefaultInstance(), ModItems.ROSE_GOLD_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(Items.IRON_INGOT.getDefaultInstance(), ModItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.COPPER_INGOT.getDefaultInstance(), ModItems.BRONZE_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.RAW_GOLD.getDefaultInstance(), Items.NETHERITE_SCRAP.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

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
