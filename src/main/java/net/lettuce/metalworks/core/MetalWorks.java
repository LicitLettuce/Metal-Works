package net.lettuce.metalworks.core;

import com.mojang.logging.LogUtils;
import net.lettuce.metalworks.client.events.tin.TarnishingChain;
import net.lettuce.metalworks.registry.*;
import net.lettuce.metalworks.client.renderer.MageGolemRenderer;
import net.lettuce.metalworks.client.events.tin.WaxingEvent;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
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
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import static net.lettuce.metalworks.registry.ModBlocks.*;

@Mod(MetalWorks.MOD_ID)
public class MetalWorks  {
    public static final String MOD_ID = "metal_works";
    public static final Logger LOGGER = LogUtils.getLogger();
    public MetalWorks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ModConfig.COMMON_SPEC);
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModParticles.PARTICLES.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntities.register();
        ModPaintings.REGISTRY.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModEntities.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModStructures.STRUCTURE_TYPES.register(modEventBus);
        ModStructurePieces.STRUCTURE_PIECES.register(modEventBus);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            TarnishingChain.registerWeatheringChain();
            WaxingEvent.initWaxables();
            var type = ModEntities.MAGE_GOLEM.get();
            var key = ForgeRegistries.ENTITY_TYPES.getKey(type);
            MetalWorks.LOGGER.info("Mage Golem registered with ID: {}", key);

        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

                event.getEntries().putAfter(Items.POLISHED_ANDESITE_SLAB.getDefaultInstance(), ModItems.CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE.get().getDefaultInstance(), ModItems.CASSITERITE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_STAIRS.get().getDefaultInstance(), ModItems.CASSITERITE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_SLAB.get().getDefaultInstance(), ModItems.CASSITERITE_WALL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_WALL.get().getDefaultInstance(), ModItems.POLISHED_CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.POLISHED_CASSITERITE.get().getDefaultInstance(), ModItems.POLISHED_CASSITERITE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.POLISHED_CASSITERITE_STAIRS.get().getDefaultInstance(), ModItems.POLISHED_CASSITERITE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.POLISHED_CASSITERITE_SLAB.get().getDefaultInstance(), ModItems.POLISHED_CASSITERITE_WALL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.POLISHED_CASSITERITE_WALL.get().getDefaultInstance(), ModItems.CASSITERITE_BRICKS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_BRICKS.get().getDefaultInstance(), ModItems.CRACKED_CASSITERITE_BRICKS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CRACKED_CASSITERITE_BRICKS.get().getDefaultInstance(), ModItems.CASSITERITE_BRICK_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_BRICK_STAIRS.get().getDefaultInstance(), ModItems.CASSITERITE_BRICK_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CASSITERITE_BRICK_SLAB.get().getDefaultInstance(), ModItems.CASSITERITE_BRICK_WALL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.COAL_BLOCK.getDefaultInstance(), ModItems.TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_BLOCK.get().getDefaultInstance(), ModItems.CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CHISELED_TIN.get().getDefaultInstance(), ModItems.TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_GRATE.get().getDefaultInstance(), ModItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_GRATE_DRAIN.get().getDefaultInstance(), ModItems.CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CUT_TIN.get().getDefaultInstance(), ModItems.CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CUT_TIN_STAIRS.get().getDefaultInstance(), ModItems.CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CUT_TIN_SLAB.get().getDefaultInstance(), ModItems.TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_TILES.get().getDefaultInstance(), ModItems.TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_TILE_STAIRS.get().getDefaultInstance(), ModItems.TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_TILE_SLAB.get().getDefaultInstance(), ModItems.TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_SHINGLES.get().getDefaultInstance(), ModItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.TIN_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_DOOR.get().getDefaultInstance(), ModItems.TIN_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_TRAPDOOR.get().getDefaultInstance(), ModItems.TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_BARS.get().getDefaultInstance(), ModItems.TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_CHAIN.get().getDefaultInstance(), ModItems.TARNISHED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN.get().getDefaultInstance(), ModItems.TARNISHED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_CHISELED_TIN.get().getDefaultInstance(), ModItems.TARNISHED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_GRATE.get().getDefaultInstance(), ModItems.TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), ModItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_CUT_TIN.get().getDefaultInstance(), ModItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), ModItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), ModItems.TARNISHED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_TILES.get().getDefaultInstance(), ModItems.TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), ModItems.TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), ModItems.TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.TARNISHED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_BARS.get().getDefaultInstance(), ModItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_CHAIN.get().getDefaultInstance(), ModItems.WAXED_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_BLOCK.get().getDefaultInstance(), ModItems.WAXED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_CHISELED_TIN.get().getDefaultInstance(), ModItems.WAXED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_GRATE.get().getDefaultInstance(), ModItems.WAXED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_GRATE_DRAIN.get().getDefaultInstance(), ModItems.WAXED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_CUT_TIN.get().getDefaultInstance(), ModItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_CUT_TIN_STAIRS.get().getDefaultInstance(), ModItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_CUT_TIN_SLAB.get().getDefaultInstance(), ModItems.WAXED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_TILES.get().getDefaultInstance(), ModItems.WAXED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_TILE_STAIRS.get().getDefaultInstance(), ModItems.WAXED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_TILE_SLAB.get().getDefaultInstance(), ModItems.WAXED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_SHINGLES.get().getDefaultInstance(), ModItems.WAXED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.WAXED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.WAXED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_BARS.get().getDefaultInstance(), ModItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_CHAIN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_CHISELED_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_CHISELED_TIN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_GRATE.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_GRATE_DRAIN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_CUT_TIN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_CUT_TIN_STAIRS.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_CUT_TIN_SLAB.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_TILES.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_TILE_STAIRS.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_TILE_SLAB.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_SHINGLES.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_BARS.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_CHAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.CHAIN.getDefaultInstance(), ModItems.BRONZE_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_BLOCK.get().getDefaultInstance(), ModItems.BRONZE_GRATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_GRATE.get().getDefaultInstance(), ModItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_GRATE_DRAIN.get().getDefaultInstance(), ModItems.BRONZE_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_TILES.get().getDefaultInstance(), ModItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_TILE_STAIRS.get().getDefaultInstance(), ModItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_TILE_SLAB.get().getDefaultInstance(), ModItems.BRONZE_SHINGLES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_SHINGLES.get().getDefaultInstance(), ModItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_SHINGLE_STAIRS.get().getDefaultInstance(), ModItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_SHINGLE_SLAB.get().getDefaultInstance(), ModItems.BRONZE_DOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_DOOR.get().getDefaultInstance(), ModItems.BRONZE_TRAPDOOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_TRAPDOOR.get().getDefaultInstance(), ModItems.BRONZE_BARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), ModItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_BLOCK.get().getDefaultInstance(), ModItems.ROSE_GOLD_MOSAIC.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_MOSAIC.get().getDefaultInstance(), ModItems.ROSE_GOLD_MOSAIC_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_MOSAIC_STAIRS.get().getDefaultInstance(), ModItems.ROSE_GOLD_MOSAIC_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_MOSAIC_SLAB.get().getDefaultInstance(), ModItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), ModItems.ROSE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.RED_NETHER_BRICK_WALL.getDefaultInstance(), Items.SOUL_SOIL.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_SOIL.getDefaultInstance(), Items.SOUL_SAND.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_SAND.getDefaultInstance(), ModItems.SOUL_BRICKS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.SOUL_BRICKS.get().getDefaultInstance(), ModItems.CRACKED_SOUL_BRICKS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.CRACKED_SOUL_BRICKS.get().getDefaultInstance(), ModItems.SOUL_BRICK_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.SOUL_BRICK_STAIRS.get().getDefaultInstance(), ModItems.SOUL_BRICK_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.SOUL_BRICK_SLAB.get().getDefaultInstance(), ModItems.SOUL_TILES.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.SOUL_TILES.get().getDefaultInstance(), ModItems.SOUL_TILE_STAIRS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.SOUL_TILE_STAIRS.get().getDefaultInstance(), ModItems.SOUL_TILE_SLAB.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

                event.getEntries().putAfter(Items.ANDESITE.getDefaultInstance(), ModItems.CASSITERITE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.RAW_IRON_BLOCK.getDefaultInstance(), ModItems.RAW_TIN_BLOCK.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.DEEPSLATE_COAL_ORE.getDefaultInstance(), ModItems.TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_ORE.get().getDefaultInstance(), ModItems.DEEPSLATE_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.NETHER_GOLD_ORE.getDefaultInstance(), ModItems.SOUL_TIN_ORE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
                event.getEntries().putAfter(Items.SOUL_TORCH.getDefaultInstance(), ModItems.MAGE_TORCH.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_LANTERN.getDefaultInstance(), ModItems.MAGE_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.MAGE_LANTERN.get().getDefaultInstance(), ModItems.TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_LANTERN.get().getDefaultInstance(), ModItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_SOUL_LANTERN.get().getDefaultInstance(), ModItems.TARNISHED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_LANTERN.get().getDefaultInstance(), ModItems.TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), ModItems.WAXED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_LANTERN.get().getDefaultInstance(), ModItems.WAXED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TIN_SOUL_LANTERN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.WAXED_TARNISHED_TIN_LANTERN.get().getDefaultInstance(), ModItems.WAXED_TARNISHED_TIN_SOUL_LANTERN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SOUL_CAMPFIRE.getDefaultInstance(), ModItems.MAGE_CAMPFIRE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

                event.getEntries().putAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), ModItems.MEDIUM_WEIGHTED_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.HEAVY_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), ModItems.LOOPING_PRESSURE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

                    event.getEntries().putAfter(Items.BEETROOT.getDefaultInstance(), ModItems.ROSE_GOLD_BEETROOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

                event.getEntries().putAfter(Items.IRON_HOE.getDefaultInstance(), ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_SHOVEL.get().getDefaultInstance(), ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_PICKAXE.get().getDefaultInstance(), ModItems.BRONZE_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_AXE.get().getDefaultInstance(), ModItems.BRONZE_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.SHEARS.getDefaultInstance(), ModItems.BRONZE_SHEARS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.STONE_HOE.getDefaultInstance(), ModItems.TIN_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_SHOVEL.get().getDefaultInstance(), ModItems.TIN_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_PICKAXE.get().getDefaultInstance(), ModItems.TIN_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.TIN_AXE.get().getDefaultInstance(), ModItems.TIN_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLDEN_HOE.getDefaultInstance(), ModItems.ROSE_GOLD_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_SHOVEL.get().getDefaultInstance(), ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_PICKAXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_AXE.get().getDefaultInstance(), ModItems.ROSE_GOLD_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.MUSIC_DISC_PIGSTEP.getDefaultInstance(), ModItems.MUSIC_DISC_ANCIENTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.MUSIC_DISC_ANCIENTS.get().getDefaultInstance(), ModItems.MUSIC_DISC_UNDERWORLD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.COMBAT) {

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
                event.getEntries().putBefore(Items.IRON_HORSE_ARMOR.getDefaultInstance(), ModItems.TIN_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_BOOTS.getDefaultInstance(), ModItems.BRONZE_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_HELMET.get().getDefaultInstance(), ModItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_CHESTPLATE.get().getDefaultInstance(), ModItems.BRONZE_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.BRONZE_LEGGINGS.get().getDefaultInstance(), ModItems.BRONZE_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLDEN_BOOTS.getDefaultInstance(), ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_HELMET.get().getDefaultInstance(), ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_CHESTPLATE.get().getDefaultInstance(), ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(ModItems.ROSE_GOLD_LEGGINGS.get().getDefaultInstance(), ModItems.ROSE_GOLD_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

                event.getEntries().putBefore(Items.RAW_IRON.getDefaultInstance(), ModItems.RAW_TIN.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), ModItems.TIN_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_NUGGET.getDefaultInstance(), ModItems.BRONZE_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLD_NUGGET.getDefaultInstance(), ModItems.ROSE_GOLD_NUGGET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(Items.IRON_INGOT.getDefaultInstance(), ModItems.TIN_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.IRON_INGOT.getDefaultInstance(), ModItems.BRONZE_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.GOLD_INGOT.getDefaultInstance(), ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.BLAZE_POWDER.getDefaultInstance(), ModItems.MAGE_POWDER.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(ModItems.BRONZE_INGOT.get().getDefaultInstance(), ModItems.CRUDE_BRONZE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(ModItems.ROSE_GOLD_INGOT.get().getDefaultInstance(), ModItems.CRUDE_ROSE_GOLD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE.getDefaultInstance(), ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putBefore(ModItems.ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE.get().getDefaultInstance(), ModItems.TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }
        }
        if (ModConfig.COMMON.populateVanillaTabs.get()) {
            if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
                event.getEntries().putAfter(Items.LLAMA_SPAWN_EGG.getDefaultInstance(), ModItems.MAGE_GOLEM_SPAWN_EGG.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class MetalWorksClient {

        @SubscribeEvent
        public static void registerParticles(RegisterParticleProvidersEvent event) {
            event.registerSpriteSet(ModParticles.MAGE_FLAME.get(), FlameParticle.Provider::new);
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
            EntityRenderers.register(ModEntities.MAGE_GOLEM.get(), MageGolemRenderer::new);
        }
    }
}
