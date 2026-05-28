package net.lettuce.metalworks.registry;

import net.lettuce.metalworks.common.item.GlowingItem;
import net.lettuce.metalworks.core.MetalWorks;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class ClientTooltipHandler {

        @SubscribeEvent
        public static void onItemTooltip(ItemTooltipEvent event) {
            ItemStack stack = event.getItemStack();
            if (stack.is(ModItems.BRONZE_SWORD.get())) {
                event.getToolTip().add(Component.literal("1+ Weakness Infliction").withStyle(ChatFormatting.BLUE));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class BronzeArmorFireProtectionHandler {

        private static final float REDUCTION_PER_PIECE = 0.05f;
        private static final float MAX_REDUCTION = 0.20f;
        private static final int   BURN_TICKS_REDUCTION_PER_PIECE = 20;

        @SubscribeEvent
        public static void onHurt(LivingHurtEvent event) {
            if (!(event.getEntity() instanceof Player player)) return;

            if (!event.getSource().is(net.minecraft.tags.DamageTypeTags.IS_FIRE)) return;

            int pieces = countBronzePieces(player);
            if (pieces <= 0) return;

            float reduction = Math.min(pieces * REDUCTION_PER_PIECE, MAX_REDUCTION);
            event.setAmount(event.getAmount() * (1.0f - reduction));
        }

        @SubscribeEvent
        public static void onTick(LivingEvent.LivingTickEvent event) {
            if (!(event.getEntity() instanceof Player player)) return;

            int pieces = countBronzePieces(player);
            if (pieces <= 0) return;

            if (player.isOnFire()) {
                int ticks = player.getRemainingFireTicks();
                if (ticks > 0) {
                    int reduce = pieces * BURN_TICKS_REDUCTION_PER_PIECE;
                    player.setRemainingFireTicks(Math.max(0, ticks - reduce));
                }
            }
        }

        private static int countBronzePieces(Player player) {
            int count = 0;
            var inv = player.getArmorSlots().iterator();
            for (ItemStack stack : player.getArmorSlots()) {
                if (isBronzePiece(stack)) count++;
            }
            return count;
        }

        private static boolean isBronzePiece(ItemStack stack) {
            return stack.is(ModItems.BRONZE_HELMET.get())
                    || stack.is(ModItems.BRONZE_CHESTPLATE.get())
                    || stack.is(ModItems.BRONZE_LEGGINGS.get())
                    || stack.is(ModItems.BRONZE_BOOTS.get());
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class RoseGoldRadiantWardHandler {

        // Tune these values to taste:
        private static final float REDUCTION_PER_PIECE = 0.15f;
        private static final float MAX_REDUCTION       = 0.60f;

        @SubscribeEvent
        public static void onHurt(LivingHurtEvent event) {
            if (!(event.getEntity() instanceof Player player)) return;

            if (!event.getSource().is(net.minecraft.tags.DamageTypeTags.IS_PROJECTILE)) return;

            int pieces = countRoseGoldPieces(player);
            if (pieces <= 0) return;

            float reduction = Math.min(pieces * REDUCTION_PER_PIECE, MAX_REDUCTION);
            event.setAmount(event.getAmount() * (1.0f - reduction));
        }

        private static int countRoseGoldPieces(Player player) {
            int c = 0;
            for (ItemStack s : player.getArmorSlots()) {
                if (isRoseGoldArmor(s)) c++;
            }
            return c;
        }

        private static boolean isRoseGoldArmor(ItemStack stack) {

            return stack.is(ModItems.ROSE_GOLD_HELMET.get())
                    || stack.is(ModItems.ROSE_GOLD_CHESTPLATE.get())
                    || stack.is(ModItems.ROSE_GOLD_LEGGINGS.get())
                    || stack.is(ModItems.ROSE_GOLD_BOOTS.get());
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class BronzeArmorTooltipHandler {
        @SubscribeEvent
        public static void onItemTooltip(ItemTooltipEvent event) {
            ItemStack stack = event.getItemStack();

            if (stack.is(ModItems.BRONZE_HELMET.get())
                    || stack.is(ModItems.BRONZE_CHESTPLATE.get())
                    || stack.is(ModItems.BRONZE_LEGGINGS.get())
                    || stack.is(ModItems.BRONZE_BOOTS.get())) {

                event.getToolTip().add(Component.literal("+0.5 Fire Damage Reduction").withStyle(ChatFormatting.GOLD));
                event.getToolTip().add(Component.literal("+0.5 Burn Time Reduction").withStyle(ChatFormatting.GOLD));

            }
        }
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class RoseGoldTooltipHandler {
        @SubscribeEvent
        public static void onTooltip(ItemTooltipEvent e) {
            ItemStack s = e.getItemStack();
            if (s.is(ModItems.ROSE_GOLD_HELMET.get())
                    || s.is(ModItems.ROSE_GOLD_CHESTPLATE.get())
                    || s.is(ModItems.ROSE_GOLD_LEGGINGS.get())
                    || s.is(ModItems.ROSE_GOLD_BOOTS.get())) {
                e.getToolTip().add(Component.literal("+0.15 Projectile Protection").withStyle(ChatFormatting.AQUA));
            }
        }
    }

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalWorks.MOD_ID);

        // Casserite Items
    public static final RegistryObject<BlockItem> CASSITERITE = ITEMS.register("cassiterite", () -> new BlockItem
            (ModBlocks.CASSITERITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_STAIRS = ITEMS.register("cassiterite_stairs", () -> new BlockItem
            (ModBlocks.CASSITERITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_SLAB = ITEMS.register("cassiterite_slab", () -> new BlockItem
            (ModBlocks.CASSITERITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_WALL = ITEMS.register("cassiterite_wall", () -> new BlockItem
            (ModBlocks.CASSITERITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE = ITEMS.register("polished_cassiterite", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE_STAIRS = ITEMS.register("polished_cassiterite_stairs", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE_SLAB = ITEMS.register("polished_cassiterite_slab", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_CASSITERITE_WALL = ITEMS.register("polished_cassiterite_wall", () -> new BlockItem
            (ModBlocks.POLISHED_CASSITERITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_BRICKS = ITEMS.register("cassiterite_bricks", () -> new BlockItem
            (ModBlocks.CASSITERITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CRACKED_CASSITERITE_BRICKS = ITEMS.register("cracked_cassiterite_bricks", () -> new BlockItem
            (ModBlocks.CRACKED_CASSITERITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_BRICK_STAIRS = ITEMS.register("cassiterite_brick_stairs", () -> new BlockItem
            (ModBlocks.CASSITERITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_BRICK_SLAB = ITEMS.register("cassiterite_brick_slab", () -> new BlockItem
            (ModBlocks.CASSITERITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CASSITERITE_BRICK_WALL = ITEMS.register("cassiterite_brick_wall", () -> new BlockItem
            (ModBlocks.CASSITERITE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CHISELED_CASSITERITE_BRICKS = ITEMS.register("chiseled_cassiterite_bricks", () -> new BlockItem
            (ModBlocks.CHISELED_CASSITERITE_BRICKS.get(), new Item.Properties()));

        // Citadel Items
    public static final RegistryObject<BlockItem> SOUL_BRICKS = ITEMS.register("soul_bricks", () -> new BlockItem
                (ModBlocks.SOUL_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CRACKED_SOUL_BRICKS = ITEMS.register("cracked_soul_bricks", () -> new BlockItem
            (ModBlocks.CRACKED_SOUL_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_BRICK_STAIRS = ITEMS.register("soul_brick_stairs", () -> new BlockItem
            (ModBlocks.SOUL_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_BRICK_SLAB = ITEMS.register("soul_brick_slab", () -> new BlockItem
            (ModBlocks.SOUL_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SUSPICIOUS_SOUL_SOIL = ITEMS.register("suspicious_soul_soil", () -> new BlockItem
            (ModBlocks.SUSPICIOUS_SOUL_SOIL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_TILES = ITEMS.register("soul_tiles", () -> new BlockItem
            (ModBlocks.SOUL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_TILE_STAIRS = ITEMS.register("soul_tile_stairs", () -> new BlockItem
            (ModBlocks.SOUL_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_TILE_SLAB = ITEMS.register("soul_tile_slab", () -> new BlockItem
            (ModBlocks.SOUL_TILE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> ETHOS_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("ethos_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ModTrimPatterns.ETHOS));
    public static final RegistryObject<Item> TARNISH_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("tarnish_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ModTrimPatterns.TARNISH));

    public static final RegistryObject<Item> MUSIC_DISC_ANCIENTS = ITEMS.register("ancients_music_disc", () -> new RecordItem
            (12, ModSounds.ANCIENTS_MUSIC_DISC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1860));

    public static final RegistryObject<Item> MUSIC_DISC_UNDERWORLD = ITEMS.register("underworld_music_disc", () -> new RecordItem
            (14, ModSounds.UNDERWORLD_MUSIC_DISC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3220));

        // Natural Tin Items
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem
            (ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem
            (ModBlocks.TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem
            (ModBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SOUL_TIN_ORE = ITEMS.register("soul_tin_ore", () -> new BlockItem
            (ModBlocks.SOUL_TIN_ORE.get(), new Item.Properties()));

        // Tin Blocks Items
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem
            (ModBlocks.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN = ITEMS.register("tarnished_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_BLOCK = ITEMS.register("waxed_tin_block", () -> new BlockItem
            (ModBlocks.WAXED_TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN = ITEMS.register("waxed_tarnished_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN.get(), new Item.Properties()));

        // Chiseled Tin Items
    public static final RegistryObject<BlockItem> CHISELED_TIN = ITEMS.register("chiseled_tin", () -> new BlockItem
            (ModBlocks.CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CHISELED_TIN= ITEMS.register("tarnished_chiseled_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_CHISELED_TIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CHISELED_TIN = ITEMS.register("waxed_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_CHISELED_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CHISELED_TIN = ITEMS.register("waxed_tarnished_chiseled_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CHISELED_TIN.get(), new Item.Properties()));

        // Tin Grate Items
    public static final RegistryObject<BlockItem> TIN_GRATE = ITEMS.register("tin_grate", () -> new BlockItem
            (ModBlocks.TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE = ITEMS.register("tarnished_tin_grate", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_GRATE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE = ITEMS.register("waxed_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_TIN_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE = ITEMS.register("waxed_tarnished_tin_grate", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_GRATE.get(), new Item.Properties()));

        // Tin Grate Drain Items
    public static final RegistryObject<BlockItem> TIN_GRATE_DRAIN = ITEMS.register("tin_grate_drain", () -> new BlockItem
            (ModBlocks.TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("tarnished_tin_grate_drain", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_TIN_GRATE_DRAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_GRATE_DRAIN = ITEMS.register("waxed_tarnished_tin_grate_drain", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_GRATE_DRAIN.get(), new Item.Properties()));

        // Cut Tin Items
    public static final RegistryObject<BlockItem> CUT_TIN = ITEMS.register("cut_tin", () -> new BlockItem
            (ModBlocks.CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN= ITEMS.register("tarnished_cut_tin", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN.get(), new Item.Properties()));


    public static final RegistryObject<BlockItem> WAXED_CUT_TIN = ITEMS.register("waxed_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_CUT_TIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN = ITEMS.register("waxed_tarnished_cut_tin", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CUT_TIN.get(), new Item.Properties()));

        // Cut Tin Stair Items
    public static final RegistryObject<BlockItem> CUT_TIN_STAIRS = ITEMS.register("cut_tin_stairs", () -> new BlockItem
            (ModBlocks.CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN_STAIRS = ITEMS.register("tarnished_cut_tin_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN_STAIRS = ITEMS.register("waxed_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_CUT_TIN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN_STAIRS = ITEMS.register("waxed_tarnished_cut_tin_stairs", () -> new BlockItem(
            ModBlocks.WAXED_TARNISHED_CUT_TIN_STAIRS.get(), new Item.Properties()));

        // Cut Tin Slab Items
    public static final RegistryObject<BlockItem> CUT_TIN_SLAB = ITEMS.register("cut_tin_slab", () -> new BlockItem
            (ModBlocks.CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_CUT_TIN_SLAB = ITEMS.register("tarnished_cut_tin_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_CUT_TIN_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_CUT_TIN_SLAB = ITEMS.register("waxed_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_CUT_TIN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_CUT_TIN_SLAB = ITEMS.register("waxed_tarnished_cut_tin_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_CUT_TIN_SLAB.get(), new Item.Properties()));

        // Tin Tile Items
    public static final RegistryObject<BlockItem> TIN_TILES = ITEMS.register("tin_tiles", () -> new BlockItem
            (ModBlocks.TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILES= ITEMS.register("tarnished_tin_tiles", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TILES = ITEMS.register("waxed_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILES = ITEMS.register("waxed_tarnished_tin_tiles", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILES.get(), new Item.Properties()));

        // Tin Tile Stair Items
    public static final RegistryObject<BlockItem> TIN_TILE_STAIRS = ITEMS.register("tin_tile_stairs", () -> new BlockItem
            (ModBlocks.TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILE_STAIRS = ITEMS.register("tarnished_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TILE_STAIRS = ITEMS.register("waxed_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILE_STAIRS = ITEMS.register("waxed_tarnished_tin_tile_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILE_STAIRS.get(), new Item.Properties()));

        // Tin Tile Slab Items
    public static final RegistryObject<BlockItem> TIN_TILE_SLAB = ITEMS.register("tin_tile_slab", () -> new BlockItem
            (ModBlocks.TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TILE_SLAB = ITEMS.register("tarnished_tin_tile_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TILE_SLAB.get(), new Item.Properties()));


    public static final RegistryObject<BlockItem> WAXED_TIN_TILE_SLAB = ITEMS.register("waxed_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TILE_SLAB = ITEMS.register("waxed_tarnished_tin_tile_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TILE_SLAB.get(), new Item.Properties()));

        // Tin Shingle Items
    public static final RegistryObject<BlockItem> TIN_SHINGLES = ITEMS.register("tin_shingles", () -> new BlockItem
            (ModBlocks.TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLES= ITEMS.register("tarnished_tin_shingles", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLES = ITEMS.register("waxed_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLES = ITEMS.register("waxed_tarnished_tin_shingles", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLES.get(), new Item.Properties()));

        // Tin Shingle Stair Items
    public static final RegistryObject<BlockItem> TIN_SHINGLE_STAIRS = ITEMS.register("tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLE_STAIRS = ITEMS.register("tarnished_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLE_STAIRS = ITEMS.register("waxed_tarnished_tin_shingle_stairs", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_STAIRS.get(), new Item.Properties()));

        // Tin Shingle Slab Items
    public static final RegistryObject<BlockItem> TIN_SHINGLE_SLAB = ITEMS.register("tin_shingle_slab", () -> new BlockItem
            (ModBlocks.TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SHINGLE_SLAB = ITEMS.register("tarnished_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SHINGLE_SLAB = ITEMS.register("waxed_tarnished_tin_shingle_slab", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SHINGLE_SLAB.get(), new Item.Properties()));

        // Tin Door Items
    public static final RegistryObject<BlockItem> TIN_DOOR = ITEMS.register("tin_door", () -> new BlockItem
            (ModBlocks.TIN_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_DOOR = ITEMS.register("tarnished_tin_door", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_DOOR.get(), new Item.Properties()));;

    public static final RegistryObject<BlockItem> WAXED_TIN_DOOR = ITEMS.register("waxed_tin_door", () -> new BlockItem
            (ModBlocks.WAXED_TIN_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_DOOR = ITEMS.register("waxed_tarnished_tin_door", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_DOOR.get(), new Item.Properties()));

        // Tin Trapdoor Items
    public static final RegistryObject<BlockItem> TIN_TRAPDOOR = ITEMS.register("tin_trapdoor", () -> new BlockItem
            (ModBlocks.TIN_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_TRAPDOOR = ITEMS.register("tarnished_tin_trapdoor", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_TRAPDOOR.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_TRAPDOOR = ITEMS.register("waxed_tin_trapdoor", () -> new BlockItem
            (ModBlocks.WAXED_TIN_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_TRAPDOOR = ITEMS.register("waxed_tarnished_tin_trapdoor", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_TRAPDOOR.get(), new Item.Properties()));

        // Tin Bar Items
    public static final RegistryObject<BlockItem> TIN_BARS = ITEMS.register("tin_bars", () -> new BlockItem
            (ModBlocks.TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_BARS = ITEMS.register("tarnished_tin_bars", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_BARS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_BARS = ITEMS.register("waxed_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_TIN_BARS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_BARS = ITEMS.register("waxed_tarnished_tin_bars", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_BARS.get(), new Item.Properties()));

        // Tin Chain Items
    public static final RegistryObject<BlockItem> TIN_CHAIN = ITEMS.register("tin_chain", () -> new BlockItem
            (ModBlocks.TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_CHAIN = ITEMS.register("tarnished_tin_chain", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_CHAIN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_CHAIN = ITEMS.register("waxed_tin_chain", () -> new BlockItem
            (ModBlocks.WAXED_TIN_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_CHAIN = ITEMS.register("waxed_tarnished_tin_chain", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_CHAIN.get(), new Item.Properties()));

        // Tin Lantern Items
    public static final RegistryObject<BlockItem> TIN_LANTERN = ITEMS.register("tin_lantern", () -> new BlockItem
            (ModBlocks.TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_LANTERN = ITEMS.register("tarnished_tin_lantern", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_LANTERN = ITEMS.register("waxed_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TIN_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_LANTERN = ITEMS.register("waxed_tarnished_tin_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_LANTERN.get(), new Item.Properties()));

        // Tin Soul Lantern Items
    public static final RegistryObject<BlockItem> TIN_SOUL_LANTERN = ITEMS.register("tin_soul_lantern", () -> new BlockItem
            (ModBlocks.TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("tarnished_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> WAXED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TIN_SOUL_LANTERN.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WAXED_TARNISHED_TIN_SOUL_LANTERN = ITEMS.register("waxed_tarnished_tin_soul_lantern", () -> new BlockItem
            (ModBlocks.WAXED_TARNISHED_TIN_SOUL_LANTERN.get(), new Item.Properties()));

        // Tin Ingredients
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item
            (new Item.Properties()));

        // Tin Gear
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem
            (ModToolTiers.TIN, 3 ,-2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem
            (ModToolTiers.TIN, 1, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem
            (ModToolTiers.TIN,  6.5F, -2.7F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem
            (ModToolTiers.TIN,1.5F, -2.6F, new Item.Properties()));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem
            (ModToolTiers.TIN, -2, -0.6F, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem
            (ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem
            ( 4, "tin", new Item.Properties().stacksTo(1)));

        // Bronze Block Item
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem
            (ModBlocks.BRONZE_BLOCK.get(), new Item.Properties().fireResistant()));

        // Bronze Grate Item
    public static final RegistryObject<BlockItem> BRONZE_GRATE = ITEMS.register("bronze_grate", () -> new BlockItem
            (ModBlocks.BRONZE_GRATE.get(), new Item.Properties().fireResistant()));

        // Bronze Grate Drain Item
    public static final RegistryObject<BlockItem> BRONZE_GRATE_DRAIN = ITEMS.register("bronze_grate_drain", () -> new BlockItem
            (ModBlocks.BRONZE_GRATE_DRAIN.get(), new Item.Properties().fireResistant()));

        // Bronze Tile Items
    public static final RegistryObject<BlockItem> BRONZE_TILES = ITEMS.register("bronze_tiles", () -> new BlockItem
            (ModBlocks.BRONZE_TILES.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_TILE_STAIRS = ITEMS.register("bronze_tile_stairs", () -> new BlockItem
            (ModBlocks.BRONZE_TILE_STAIRS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_TILE_SLAB = ITEMS.register("bronze_tile_slab", () -> new BlockItem
            (ModBlocks.BRONZE_TILE_SLAB.get(), new Item.Properties().fireResistant()));

        // Bronze Shingle Item
    public static final RegistryObject<BlockItem> BRONZE_SHINGLES = ITEMS.register("bronze_shingles", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLES.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_STAIRS = ITEMS.register("bronze_shingle_stairs", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLE_STAIRS.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<BlockItem> BRONZE_SHINGLE_SLAB = ITEMS.register("bronze_shingle_slab", () -> new BlockItem
            (ModBlocks.BRONZE_SHINGLE_SLAB.get(), new Item.Properties().fireResistant()));

        // Bronze Bar Item
    public static final RegistryObject<BlockItem> BRONZE_BARS = ITEMS.register("bronze_bars", () -> new BlockItem
            (ModBlocks.BRONZE_BARS.get(), new Item.Properties().fireResistant()));

        // Bronze Door Item
    public static final RegistryObject<BlockItem> BRONZE_DOOR = ITEMS.register("bronze_door", () -> new BlockItem
            (ModBlocks.BRONZE_DOOR.get(), new Item.Properties().fireResistant()));

        // Bronze Trapdoor Item
    public static final RegistryObject<BlockItem> BRONZE_TRAPDOOR = ITEMS.register("bronze_trapdoor", () -> new BlockItem
            (ModBlocks.BRONZE_TRAPDOOR.get(), new Item.Properties().fireResistant()));

        // Looping Pressure Plate Item
    public static final RegistryObject<BlockItem> LOOPING_PRESSURE_PLATE = ITEMS.register("looping_pressure_plate", () -> new BlockItem
            (ModBlocks.LOOPING_PRESSURE_PLATE.get(), new Item.Properties().fireResistant()));

        // Bronze Ingredients
        public static final RegistryObject<Item> CRUDE_BRONZE = ITEMS.register("crude_bronze", () -> new Item
                (new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item
            (new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item
            (new Item.Properties().fireResistant()));

        // Bronze Gear
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem
            (ModToolTiers.BRONZE,3,-2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem
            (ModToolTiers.BRONZE,1,-2.8F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem
            (ModToolTiers.BRONZE, 6, -3.1F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem
            (ModToolTiers.BRONZE, 1.5F, -3.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem
            (ModToolTiers.BRONZE, -2,-1, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears", () -> new ShearsItem
            (new Item.Properties().stacksTo(1).durability(964).fireResistant()));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem
            (ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem
            ( 9,"bronze", new Item.Properties().stacksTo(1).fireResistant()));

        // Rose Gold Block Item
    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties()));

        // Rose Lantern Item
    public static final RegistryObject<BlockItem> ROSE_LANTERN = ITEMS.register("rose_lantern", () -> new BlockItem
            (ModBlocks.ROSE_LANTERN.get(), new Item.Properties()));

        // Rose Gold Mosaic Items
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC = ITEMS.register("rose_gold_mosaic", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC_STAIRS = ITEMS.register("rose_gold_mosaic_stairs", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> ROSE_GOLD_MOSAIC_SLAB = ITEMS.register("rose_gold_mosaic_slab", () -> new BlockItem
            (ModBlocks.ROSE_GOLD_MOSAIC_SLAB.get(), new Item.Properties()));

        // Medium Weighted Pressure Plate Item
    public static final RegistryObject<BlockItem> MEDIUM_WEIGHTED_PRESSURE_PLATE = ITEMS.register("medium_weighted_pressure_plate", () -> new BlockItem
            (ModBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), new Item.Properties()));

        // Mage Fire Items
    public static final RegistryObject<Item> MAGE_TORCH = ITEMS.register("mage_torch", () -> new StandingAndWallBlockItem
            (ModBlocks.MAGE_TORCH.get(), ModBlocks.MAGE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<BlockItem> MAGE_LANTERN = ITEMS.register("mage_lantern", () -> new BlockItem
            (ModBlocks.MAGE_LANTERN.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> MAGE_CAMPFIRE = ITEMS.register("mage_campfire", () -> new BlockItem
            (ModBlocks.MAGE_CAMPFIRE.get(), new Item.Properties()));

        // Rose Gold Ingredients
        public static final RegistryObject<Item> CRUDE_ROSE_GOLD = ITEMS.register("crude_rose_gold", () -> new Item
                (new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item
            (new Item.Properties()));

    public static final RegistryObject<Item> MAGE_POWDER = ITEMS.register("mage_powder", () -> new Item
            (new Item.Properties()));

        // Rose Gold Food Items
    public static final RegistryObject<Item> ROSE_GOLD_BEETROOT = ITEMS.register("rose_gold_beetroot", () -> new Item
            (new Item.Properties().food(ModFoodProperties.ROSE_GOLD_BEETROOT)));

        // Rose Gold Gear
    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword", () -> new SwordItem
            (ModToolTiers.ROSE_GOLD, 3 ,-2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem
            (ModToolTiers.ROSE_GOLD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe", () -> new AxeItem
            (ModToolTiers.ROSE_GOLD, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel", () -> new ShovelItem
            (ModToolTiers.ROSE_GOLD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe", () -> new HoeItem
            (ModToolTiers.ROSE_GOLD, -2, -1.0F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots", () -> new ArmorItem
            (ModArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HORSE_ARMOR = ITEMS.register("rose_gold_horse_armor", () -> new HorseArmorItem
            ( 8, "rose_gold", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> MAGE_GOLEM_SPAWN_EGG = ITEMS.register("mage_golem_spawn_egg", () -> new ForgeSpawnEggItem
            (ModEntities.MAGE_GOLEM, 0xf25e63, 16382457, new Item.Properties()));

        // GUI Items
        public static final RegistryObject<Item> TAB_ITEM = ITEMS.register("tab_item", () -> new Item
                (new Item.Properties().fireResistant()));

        public static final RegistryObject<Item> MAGE_FIRE_ADVANCEMENT_ITEM = ITEMS.register("mage_fire_advancement_item", () -> new Item
            (new Item.Properties().fireResistant()));

        public static final RegistryObject<Item> REFINED_RADIANCE_ITEM =
            ITEMS.register("refined_radiance_item", () -> new GlowingItem
                    (new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
