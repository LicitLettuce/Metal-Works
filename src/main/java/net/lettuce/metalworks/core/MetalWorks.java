package net.lettuce.metalworks.core;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.common.registry.*;
import net.lettuce.metalworks.client.renderer.MageGolemRenderer;
import net.lettuce.metalworks.client.events.WaxingEvent;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import static net.lettuce.metalworks.common.registry.MWBlocks.*;

@Mod(MetalWorks.MOD_ID)
public class MetalWorks
{
    public static final String MOD_ID = "metal_works";
    private static final Logger LOGGER = LogUtils.getLogger();
    public MetalWorks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MWConfig.COMMON_SPEC);
        MWCreativeModeTabs.register(modEventBus);
        MWItems.register(modEventBus);
        MWParticles.PARTICLES.register(modEventBus);
        MWBlocks.BLOCKS.register(modEventBus);
        MWBlockEntities.register();
        MWPaintings.REGISTRY.register(modEventBus);
        MWSounds.register(modEventBus);
        MWEntities.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MWWeathering.registerWeatheringChain();
            WaxingEvent.initWaxables();
            var type = MWEntities.MAGE_GOLEM.get();
            var key = ForgeRegistries.ENTITY_TYPES.getKey(type);
            MetalWorks.LOGGER.info("Mage Golem registered with ID: {}", key);

        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

                event.getEntries().putAfter(Items.POLISHED_ANDESITE_SLAB.getDefaultInstance(), MWItems.CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CASSITERITE.get().getDefaultInstance(), MWItems.CASSITERITE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CASSITERITE_STAIRS.get().getDefaultInstance(), MWItems.CASSITERITE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CASSITERITE_SLAB.get().getDefaultInstance(), MWItems.CASSITERITE_WALL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CASSITERITE_WALL.get().getDefaultInstance(), MWItems.POLISHED_CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.POLISHED_CASSITERITE.get().getDefaultInstance(), MWItems.POLISHED_CASSITERITE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.POLISHED_CASSITERITE_STAIRS.get().getDefaultInstance(), MWItems.POLISHED_CASSITERITE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.COAL_BLOCK.getDefaultInstance(), MWItems.TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_BLOCK.get().getDefaultInstance(), MWItems.TARNISHED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN.get().getDefaultInstance(), MWItems.CORRODED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN.get().getDefaultInstance(), MWItems.ERODED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN.get().getDefaultInstance(), MWItems.WAXED_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_BLOCK.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN.get().getDefaultInstance(), MWItems.CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CHISELED_TIN.get().getDefaultInstance(), MWItems.TARNISHED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CHISELED_TIN.get().getDefaultInstance(), MWItems.CORRODED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CHISELED_TIN.get().getDefaultInstance(), MWItems.ERODED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CHISELED_TIN.get().getDefaultInstance(), MWItems.WAXED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CHISELED_TIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CHISELED_TIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CHISELED_TIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CHISELED_TIN.get().getDefaultInstance(), MWItems.TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_GRATE.get().getDefaultInstance(), MWItems.TARNISHED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_GRATE.get().getDefaultInstance(), MWItems.CORRODED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_GRATE.get().getDefaultInstance(), MWItems.ERODED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_GRATE.get().getDefaultInstance(), MWItems.WAXED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_GRATE.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_GRATE.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_GRATE.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_GRATE.get().getDefaultInstance(), MWItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.CORRODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.ERODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.WAXED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_GRATE_DRAIN.get().getDefaultInstance(), MWItems.CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN.get().getDefaultInstance(), MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN.get().getDefaultInstance(), MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN_STAIRS.get().getDefaultInstance(), MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.WAXED_ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_CUT_TIN_SLAB.get().getDefaultInstance(), MWItems.TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_TILES.get().getDefaultInstance(), MWItems.TARNISHED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_TILES.get().getDefaultInstance(), MWItems.CORRODED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_TILES.get().getDefaultInstance(), MWItems.ERODED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_TILES.get().getDefaultInstance(), MWItems.WAXED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_TILES.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_TILES.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_TILES.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_TILES.get().getDefaultInstance(), MWItems.TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.CORRODED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.ERODED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_TILE_STAIRS.get().getDefaultInstance(), MWItems.TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.CORRODED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.ERODED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.WAXED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_TILE_SLAB.get().getDefaultInstance(), MWItems.TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_SHINGLES.get().getDefaultInstance(), MWItems.TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.CORRODED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.ERODED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.WAXED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_SHINGLES.get().getDefaultInstance(), MWItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.CORRODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.ERODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.CORRODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.ERODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.WAXED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.TIN_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_DOOR.get().getDefaultInstance(), MWItems.TIN_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_TRAPDOOR.get().getDefaultInstance(), MWItems.TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_BARS.get().getDefaultInstance(), MWItems.TARNISHED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_BARS.get().getDefaultInstance(), MWItems.CORRODED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_BARS.get().getDefaultInstance(), MWItems.ERODED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_BARS.get().getDefaultInstance(), MWItems.WAXED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_BARS.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_BARS.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_BARS.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_BARS.get().getDefaultInstance(), MWItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_CHAIN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), MWItems.CORRODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.ERODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), MWItems.BRONZE_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_BLOCK.get().getDefaultInstance(), MWItems.BRONZE_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_GRATE.get().getDefaultInstance(), MWItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), MWItems.BRONZE_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_TILES.get().getDefaultInstance(), MWItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), MWItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), MWItems.BRONZE_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_SHINGLES.get().getDefaultInstance(), MWItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), MWItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), MWItems.BRONZE_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_DOOR.get().getDefaultInstance(), MWItems.BRONZE_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_TRAPDOOR.get().getDefaultInstance(), MWItems.BRONZE_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), MWItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), MWItems.ROSE_GOLD_MOSAIC.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_MOSAIC.get().getDefaultInstance(), MWItems.ROSE_GOLD_MOSAIC_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_MOSAIC_STAIRS.get().getDefaultInstance(), MWItems.ROSE_GOLD_MOSAIC_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_MOSAIC_SLAB.get().getDefaultInstance(), MWItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), MWItems.ROSE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {


                event.getEntries().putAfter(Items.ANDESITE.getDefaultInstance(), MWItems.CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.RAW_IRON_BLOCK.getDefaultInstance(), MWItems.RAW_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.DEEPSLATE_COAL_ORE.getDefaultInstance(), MWItems.TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_ORE.get().getDefaultInstance(), MWItems.DEEPSLATE_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.NETHER_GOLD_ORE.getDefaultInstance(), MWItems.NETHER_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

                event.getEntries().putAfter(Items.SOUL_TORCH.getDefaultInstance(), MWItems.MAGE_TORCH.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_LANTERN.getDefaultInstance(), MWItems.MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_CAMPFIRE.getDefaultInstance(), MWItems.MAGE_CAMPFIRE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.MAGE_LANTERN.get().getDefaultInstance(), MWItems.TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_LANTERN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_LANTERN.get().getDefaultInstance(), MWItems.CORRODED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_LANTERN.get().getDefaultInstance(), MWItems.ERODED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_LANTERN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_LANTERN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_LANTERN.get().getDefaultInstance(), MWItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.CORRODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.ERODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_SOUL_LANTERN.get().getDefaultInstance(), MWItems.TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.CORRODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.ERODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_ERODED_TIN_MAGE_LANTERN.get().getDefaultInstance(), MWItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TIN_CHAIN.get().getDefaultInstance(), MWItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), MWItems.CORRODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.CORRODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.ERODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ERODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_TARNISHED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_CORRODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.WAXED_CORRODED_TIN_CHAIN.get().getDefaultInstance(), MWItems.WAXED_ERODED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SEA_LANTERN.getDefaultInstance(), MWItems.ROSE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

                event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), MWItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.HEAVY_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), MWItems.LOOPING_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

                    event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), MWItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
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
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
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
                event.getEntries().putBefore(Items.IRON_HORSE_ARMOR.getDefaultInstance(), MWItems.TIN_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_BOOTS.getDefaultInstance(), MWItems.BRONZE_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_HELMET.get().getDefaultInstance(), MWItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), MWItems.BRONZE_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.BRONZE_LEGGINGS.get().getDefaultInstance(), MWItems.BRONZE_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLDEN_BOOTS.getDefaultInstance(), MWItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), MWItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), MWItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(MWItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), MWItems.ROSE_GOLD_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

                event.getEntries().putBefore(Items.RAW_IRON.getDefaultInstance(), MWItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), MWItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLD_NUGGET.getDefaultInstance(), MWItems.ROSE_GOLD_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.IRON_INGOT.getDefaultInstance(), MWItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), MWItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_NUGGET.getDefaultInstance(), MWItems.BRONZE_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (MWConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
                event.getEntries().putAfter(Items.LLAMA_SPAWN_EGG.getDefaultInstance(), MWItems.MAGE_GOLEM_SPAWN_EGG.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class MetalWorksClient {

        @SubscribeEvent
        public static void registerParticles(RegisterParticleProvidersEvent event) {
            event.registerSpriteSet(MWParticles.MAGE_FLAME.get(), FlameParticle.Provider::new);
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
            ItemBlockRenderTypes.setRenderLayer(MAGE_TORCH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MAGE_WALL_TORCH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MAGE_FIRE.get(), RenderType.cutout());
            EntityRenderers.register(MWEntities.MAGE_GOLEM.get(), MageGolemRenderer::new);
        }
    }
}
