
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.ddraig.suprememiningdimension.item.ZincIngotItem;
import net.ddraig.suprememiningdimension.item.WitheringRodItem;
import net.ddraig.suprememiningdimension.item.WitheringFireballItem;
import net.ddraig.suprememiningdimension.item.WitheredFireballItem;
import net.ddraig.suprememiningdimension.item.WeakWitheringFireballItem;
import net.ddraig.suprememiningdimension.item.WeakWitheredFireballItem;
import net.ddraig.suprememiningdimension.item.UndergroundDimensionItem;
import net.ddraig.suprememiningdimension.item.TungstenIngotItem;
import net.ddraig.suprememiningdimension.item.TinIngotItem;
import net.ddraig.suprememiningdimension.item.StrangeForestsItem;
import net.ddraig.suprememiningdimension.item.StoneOutpostWallingItem;
import net.ddraig.suprememiningdimension.item.SpruceOutpostFlooringItem;
import net.ddraig.suprememiningdimension.item.SilverIngotItem;
import net.ddraig.suprememiningdimension.item.RawZincItem;
import net.ddraig.suprememiningdimension.item.RawTungstenItem;
import net.ddraig.suprememiningdimension.item.RawTinItem;
import net.ddraig.suprememiningdimension.item.RawSilverItem;
import net.ddraig.suprememiningdimension.item.RawPlatinumItem;
import net.ddraig.suprememiningdimension.item.RawNickelItem;
import net.ddraig.suprememiningdimension.item.RawLeadItem;
import net.ddraig.suprememiningdimension.item.PlatinumIngotItem;
import net.ddraig.suprememiningdimension.item.NickelIngotItem;
import net.ddraig.suprememiningdimension.item.NetherIslandItem;
import net.ddraig.suprememiningdimension.item.MinersBellRightHalfItem;
import net.ddraig.suprememiningdimension.item.MinersBellLeftHalfItem;
import net.ddraig.suprememiningdimension.item.MinersBellItem;
import net.ddraig.suprememiningdimension.item.MinersBellClapperItem;
import net.ddraig.suprememiningdimension.item.LeadIngotItem;
import net.ddraig.suprememiningdimension.item.HoneyItem;
import net.ddraig.suprememiningdimension.item.FaultyExplosiveItem;
import net.ddraig.suprememiningdimension.item.FalseOverworldDimensionItem;
import net.ddraig.suprememiningdimension.item.ExplosiveThrownItem;
import net.ddraig.suprememiningdimension.item.EnderCavesItem;
import net.ddraig.suprememiningdimension.item.DeepCavernsItem;
import net.ddraig.suprememiningdimension.item.CavernsItem;
import net.ddraig.suprememiningdimension.item.CavernPortalOutpostItem;
import net.ddraig.suprememiningdimension.item.AmberChunkItem;
import net.ddraig.suprememiningdimension.item.AluminumRawItem;
import net.ddraig.suprememiningdimension.item.AluminumIngotItem;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<Item> IRON_REINFORCED_OBSIDIAN = block(SupremeMiningDimensionModBlocks.IRON_REINFORCED_OBSIDIAN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> FALSE_OVERWORLD_DIMENSION = REGISTRY.register("false_overworld_dimension", () -> new FalseOverworldDimensionItem());
	public static final RegistryObject<Item> NETHER_ISLAND = REGISTRY.register("nether_island", () -> new NetherIslandItem());
	public static final RegistryObject<Item> GOLD_REINFORCED_OBSIDIAN = block(SupremeMiningDimensionModBlocks.GOLD_REINFORCED_OBSIDIAN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> UNDERGROUND_DIMENSION = REGISTRY.register("underground_dimension", () -> new UndergroundDimensionItem());
	public static final RegistryObject<Item> CAVERNS = REGISTRY.register("caverns", () -> new CavernsItem());
	public static final RegistryObject<Item> DEEP_CAVERNS = REGISTRY.register("deep_caverns", () -> new DeepCavernsItem());
	public static final RegistryObject<Item> LIGHT_OBSIDIAN_BRICKS = block(SupremeMiningDimensionModBlocks.LIGHT_OBSIDIAN_BRICKS, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> ENDER_CAVES = REGISTRY.register("ender_caves", () -> new EnderCavesItem());
	public static final RegistryObject<Item> ETCHED_WOOD = block(SupremeMiningDimensionModBlocks.ETCHED_WOOD, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> STRANGE_FORESTS = REGISTRY.register("strange_forests", () -> new StrangeForestsItem());
	public static final RegistryObject<Item> DENSE_DIAMOND_ORE = block(SupremeMiningDimensionModBlocks.DENSE_DIAMOND_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_IRON_ORE = block(SupremeMiningDimensionModBlocks.DENSE_IRON_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_REDSTONE_ORE = block(SupremeMiningDimensionModBlocks.DENSE_REDSTONE_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_COPPER_ORE = block(SupremeMiningDimensionModBlocks.DENSE_COPPER_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_COAL_ORE = block(SupremeMiningDimensionModBlocks.DENSE_COAL_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> QUARTZ_ORE = block(SupremeMiningDimensionModBlocks.QUARTZ_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_LAPIS_ORE = block(SupremeMiningDimensionModBlocks.DENSE_LAPIS_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_GOLD_ORE = block(SupremeMiningDimensionModBlocks.DENSE_GOLD_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> EXTINGUISHED_LAMP = block(SupremeMiningDimensionModBlocks.EXTINGUISHED_LAMP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> RELIT_LAMP = block(SupremeMiningDimensionModBlocks.RELIT_LAMP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_EMERALD_ORE = block(SupremeMiningDimensionModBlocks.DENSE_EMERALD_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MINERS_BELL = REGISTRY.register("miners_bell", () -> new MinersBellItem());
	public static final RegistryObject<Item> SILVER_ORE = block(SupremeMiningDimensionModBlocks.SILVER_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> SILVER_BLOCK = block(SupremeMiningDimensionModBlocks.SILVER_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> TIN_ORE = block(SupremeMiningDimensionModBlocks.TIN_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> TIN_BLOCK = block(SupremeMiningDimensionModBlocks.TIN_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> TUNGSTEN_ORE = block(SupremeMiningDimensionModBlocks.TUNGSTEN_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(SupremeMiningDimensionModBlocks.TUNGSTEN_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> LEAD_ORE = block(SupremeMiningDimensionModBlocks.LEAD_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> LEAD_BLOCK = block(SupremeMiningDimensionModBlocks.LEAD_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DENSE_ANDESITE = block(SupremeMiningDimensionModBlocks.DENSE_ANDESITE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> NICKEL_ORE = block(SupremeMiningDimensionModBlocks.NICKEL_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> NICKEL_BLOCK = block(SupremeMiningDimensionModBlocks.NICKEL_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> PLATINUM_ORE = block(SupremeMiningDimensionModBlocks.PLATINUM_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> PLATINUM_BLOCK = block(SupremeMiningDimensionModBlocks.PLATINUM_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> ALUMINUM_ORE = block(SupremeMiningDimensionModBlocks.ALUMINUM_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(SupremeMiningDimensionModBlocks.ALUMINUM_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> ZINC_ORE = block(SupremeMiningDimensionModBlocks.ZINC_ORE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> ZINC_BLOCK = block(SupremeMiningDimensionModBlocks.ZINC_BLOCK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> AMBER_SOLID = block(SupremeMiningDimensionModBlocks.AMBER_SOLID, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> DUCK_SPAWN_EGG = REGISTRY.register("duck_spawn_egg",
			() -> new ForgeSpawnEggItem(SupremeMiningDimensionModEntities.DUCK, -13408768, -6724096, new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS)));
	public static final RegistryObject<Item> CHICKSHROOM_SPAWN_EGG = REGISTRY.register("chickshroom_spawn_egg",
			() -> new ForgeSpawnEggItem(SupremeMiningDimensionModEntities.CHICKSHROOM, -26164, -1, new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS)));
	public static final RegistryObject<Item> BLUESHROOM_CAP = block(SupremeMiningDimensionModBlocks.BLUESHROOM_CAP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> BLUESHROOM_CAP_GLOWING = block(SupremeMiningDimensionModBlocks.BLUESHROOM_CAP_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> CYANSHROOM_CAP = block(SupremeMiningDimensionModBlocks.CYANSHROOM_CAP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> CYANSHROOM_CAP_GLOWING = block(SupremeMiningDimensionModBlocks.CYANSHROOM_CAP_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> GREYSHROOM_CAP = block(SupremeMiningDimensionModBlocks.GREYSHROOM_CAP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> GREYSHROOM_CAP_GLOWING = block(SupremeMiningDimensionModBlocks.GREYSHROOM_CAP_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> GHOSTLYSHROOM_CAP = block(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> GHOSTLYSHROOM_CAP_GLOWING = block(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> PURPLESHROOM_CAP = block(SupremeMiningDimensionModBlocks.PURPLESHROOM_CAP, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> PURPLESHROOM_CAP_GLOWING = block(SupremeMiningDimensionModBlocks.PURPLESHROOM_CAP_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLUE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLUE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLUE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLUE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_CYAN = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_CYAN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_CYAN_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_CYAN_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_GREEN = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_GREEN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_GREEN_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_GREEN_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_PURPLE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_PURPLE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_PURPLE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_PURPLE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_BLUE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_BLUE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_BLUE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_BLUE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_CYAN = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_CYAN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_CYAN_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_CYAN_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_DARK_GREEN = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_DARK_GREEN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_DARK_GREEN_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_DARK_GREEN_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_GREEN = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GREEN, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_GREEN_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GREEN_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_ORANGE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_ORANGE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_ORANGE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_ORANGE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_PURPLE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_PURPLE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_PURPLE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_PURPLE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_WHITE = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_WHITE, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> MUSHROOM_STALK_BLACK_WHITE_GLOWING = block(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_WHITE_GLOWING, SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS);
	public static final RegistryObject<Item> WITHERING_ROD = REGISTRY.register("withering_rod", () -> new WitheringRodItem());
	public static final RegistryObject<Item> CAVERN_PORTAL_OUTPOST = REGISTRY.register("cavern_portal_outpost", () -> new CavernPortalOutpostItem());
	public static final RegistryObject<Item> STONE_OUTPOST_WALLING = REGISTRY.register("stone_outpost_walling", () -> new StoneOutpostWallingItem());
	public static final RegistryObject<Item> SPRUCE_OUTPOST_FLOORING = REGISTRY.register("spruce_outpost_flooring", () -> new SpruceOutpostFlooringItem());
	public static final RegistryObject<Item> MINERS_BELL_CLAPPER = REGISTRY.register("miners_bell_clapper", () -> new MinersBellClapperItem());
	public static final RegistryObject<Item> MINERS_BELL_LEFT_HALF = REGISTRY.register("miners_bell_left_half", () -> new MinersBellLeftHalfItem());
	public static final RegistryObject<Item> MINERS_BELL_RIGHT_HALF = REGISTRY.register("miners_bell_right_half", () -> new MinersBellRightHalfItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TUNGSTEN_INGOT = REGISTRY.register("tungsten_ingot", () -> new TungstenIngotItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> ALUMINUM_RAW = REGISTRY.register("aluminum_raw", () -> new AluminumRawItem());
	public static final RegistryObject<Item> RAW_TUNGSTEN = REGISTRY.register("raw_tungsten", () -> new RawTungstenItem());
	public static final RegistryObject<Item> RAW_ZINC = REGISTRY.register("raw_zinc", () -> new RawZincItem());
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> RAW_PLATINUM = REGISTRY.register("raw_platinum", () -> new RawPlatinumItem());
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
	public static final RegistryObject<Item> RAW_NICKEL = REGISTRY.register("raw_nickel", () -> new RawNickelItem());
	public static final RegistryObject<Item> HONEY_BUCKET = REGISTRY.register("honey_bucket", () -> new HoneyItem());
	public static final RegistryObject<Item> WITHERED_BLAZE_SPAWN_EGG = REGISTRY.register("withered_blaze_spawn_egg",
			() -> new ForgeSpawnEggItem(SupremeMiningDimensionModEntities.WITHERED_BLAZE, -13421773, -3381760, new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS)));
	public static final RegistryObject<Item> AMBER_CHUNK = REGISTRY.register("amber_chunk", () -> new AmberChunkItem());
	public static final RegistryObject<Item> RED_SLIME_SPAWN_EGG = REGISTRY.register("red_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(SupremeMiningDimensionModEntities.RED_SLIME, -52429, -10092544, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> FAULTY_EXPLOSIVE = REGISTRY.register("faulty_explosive", () -> new FaultyExplosiveItem());
	public static final RegistryObject<Item> EXPLOSIVE_THROWN = REGISTRY.register("explosive_thrown", () -> new ExplosiveThrownItem());
	public static final RegistryObject<Item> WITHERED_FIREBALL = REGISTRY.register("withered_fireball", () -> new WitheredFireballItem());
	public static final RegistryObject<Item> WITHERING_FIREBALL = REGISTRY.register("withering_fireball", () -> new WitheringFireballItem());
	public static final RegistryObject<Item> BLAZING_WITHER_MASTER_SPAWN_EGG = REGISTRY.register("blazing_wither_master_spawn_egg",
			() -> new ForgeSpawnEggItem(SupremeMiningDimensionModEntities.BLAZING_WITHER_MASTER, -13421773, -3381760, new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS)));
	public static final RegistryObject<Item> WEAK_WITHERING_FIREBALL = REGISTRY.register("weak_withering_fireball", () -> new WeakWitheringFireballItem());
	public static final RegistryObject<Item> WEAK_WITHERED_FIREBALL = REGISTRY.register("weak_withered_fireball", () -> new WeakWitheredFireballItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
