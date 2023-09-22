
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupremeMiningDimensionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<CreativeModeTab> SUPREME_MINING_DIMENSIONS = REGISTRY.register("supreme_mining_dimensions", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.supreme_mining_dimension.supreme_mining_dimensions")).icon(() -> new ItemStack(SupremeMiningDimensionModItems.STRANGE_FORESTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SupremeMiningDimensionModBlocks.IRON_REINFORCED_OBSIDIAN.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.FALSE_OVERWORLD_DIMENSION.get());
				tabData.accept(SupremeMiningDimensionModItems.NETHER_ISLAND.get());
				tabData.accept(SupremeMiningDimensionModBlocks.GOLD_REINFORCED_OBSIDIAN.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.UNDERGROUND_DIMENSION.get());
				tabData.accept(SupremeMiningDimensionModItems.CAVERNS.get());
				tabData.accept(SupremeMiningDimensionModItems.DEEP_CAVERNS.get());
				tabData.accept(SupremeMiningDimensionModBlocks.LIGHT_OBSIDIAN_BRICKS.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.ENDER_CAVES.get());
				tabData.accept(SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.STRANGE_FORESTS.get());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_DIAMOND_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_IRON_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_REDSTONE_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_COPPER_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_COAL_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.QUARTZ_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_LAPIS_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_GOLD_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.EXTINGUISHED_LAMP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.RELIT_LAMP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_EMERALD_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.MINERS_BELL.get());
				tabData.accept(SupremeMiningDimensionModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.SILVER_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.TIN_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.TUNGSTEN_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.TUNGSTEN_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.LEAD_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.LEAD_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DENSE_ANDESITE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.NICKEL_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.NICKEL_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.PLATINUM_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.PLATINUM_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.ALUMINUM_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.ALUMINUM_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.ZINC_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.ZINC_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.AMBER_SOLID.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.DUCK_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.CHICKSHROOM_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModBlocks.BLUESHROOM_CAP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLUESHROOM_CAP_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.CYANSHROOM_CAP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.CYANSHROOM_CAP_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.GREYSHROOM_CAP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.GREYSHROOM_CAP_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.PURPLESHROOM_CAP.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.PURPLESHROOM_CAP_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLUE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLUE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_CYAN.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_CYAN_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_GREEN.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_GREEN_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_PURPLE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_PURPLE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_BLUE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_BLUE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_CYAN.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_CYAN_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_DARK_GREEN.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_DARK_GREEN_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GREEN.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_GREEN_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_ORANGE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_ORANGE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_PURPLE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_PURPLE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_WHITE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSHROOM_STALK_BLACK_WHITE_GLOWING.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.WITHERING_ROD.get());
				tabData.accept(SupremeMiningDimensionModItems.STONE_OUTPOST_WALLING.get());
				tabData.accept(SupremeMiningDimensionModItems.SPRUCE_OUTPOST_FLOORING.get());
				tabData.accept(SupremeMiningDimensionModItems.MINERS_BELL_CLAPPER.get());
				tabData.accept(SupremeMiningDimensionModItems.MINERS_BELL_LEFT_HALF.get());
				tabData.accept(SupremeMiningDimensionModItems.MINERS_BELL_RIGHT_HALF.get());
				tabData.accept(SupremeMiningDimensionModItems.TUNNELER_BROTHER_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.QUARRIER_BROTHER_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.PROSPECTOR_BROTHER_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.SILVER_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.TIN_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.TUNGSTEN_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.LEAD_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.NICKEL_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.PLATINUM_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.ALUMINUM_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.ALUMINUM_RAW.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_TUNGSTEN.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_ZINC.get());
				tabData.accept(SupremeMiningDimensionModItems.ZINC_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_PLATINUM.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_TIN.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_LEAD.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_NICKEL.get());
				tabData.accept(SupremeMiningDimensionModItems.WITHERED_BLAZE_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.AMBER_CHUNK.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_SILVER.get());
				tabData.accept(SupremeMiningDimensionModItems.WITHERING_FIREBALL.get());
				tabData.accept(SupremeMiningDimensionModItems.BLAZING_WITHER_MASTER_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.SHROOMBIE_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModBlocks.MUSIC_STATION.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.SLIME_CHOW.get());
				tabData.accept(SupremeMiningDimensionModBlocks.ANTIMONY_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.RAW_ANTIMONY_ORE.get());
				tabData.accept(SupremeMiningDimensionModItems.ANTIMONY_INGOT.get());
				tabData.accept(SupremeMiningDimensionModBlocks.ANTIMONY_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.COBALT_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.RAW_COBALT.get());
				tabData.accept(SupremeMiningDimensionModBlocks.COBALT_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.COBALT_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.SPHALERITE_DUST.get());
				tabData.accept(SupremeMiningDimensionModBlocks.SPHALERITE_ORE.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.SPHALERITE.get());
				tabData.accept(SupremeMiningDimensionModBlocks.DIAMOND_SAND.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.DIAMOND_GRAVEL.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.DIAMOND_DUST.get());
				tabData.accept(SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_SMALL.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_MEDIUM.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_LARGE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_SOLID.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.SHADE_COBBLESTONE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.SHADE_STONE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.SHADE_DIRT.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.SHADE_GRASS.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.BENITOITE_GEM.get());
				tabData.accept(SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_BUDDING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.ANCIENT_MOSS.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.OLIVINE_SAND.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_WOOD.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_LOG.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_PLANKS.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_LEAVES.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_STAIRS.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_SLAB.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_FENCE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_FENCE_GATE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_BUTTON.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.BLIGHTWOOD_SAPLING.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.HEATED_MAGMA_BLOCK.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.SHADOW_CREEPER_SPAWN_EGG.get());
				tabData.accept(SupremeMiningDimensionModBlocks.END_SOIL.get().asItem());
				tabData.accept(SupremeMiningDimensionModBlocks.END_GRASS.get().asItem());
				tabData.accept(SupremeMiningDimensionModItems.AMETHYST_DROPLETS.get());
				tabData.accept(SupremeMiningDimensionModItems.A_DROP_OF_DAYLIGHT.get());
				tabData.accept(SupremeMiningDimensionModItems.STRINGS_OF_FATE.get());
				tabData.accept(SupremeMiningDimensionModItems.WE_ARE_GOING_UNDER.get());
				tabData.accept(SupremeMiningDimensionModItems.TUNNEL_TALKING.get());
				tabData.accept(SupremeMiningDimensionModItems.THE_ROT_REJECTS.get());
				tabData.accept(SupremeMiningDimensionModItems.THE_CLOCK_STRIKES_13.get());
				tabData.accept(SupremeMiningDimensionModItems.THE_BLIGHT_CONSUMES.get());
				tabData.accept(SupremeMiningDimensionModItems.SUBWOOFER_ALARM.get());
				tabData.accept(SupremeMiningDimensionModItems.THE_LIGHT_IN_THE_STONE.get());
				tabData.accept(SupremeMiningDimensionModItems.LOST_OUT_THERE.get());
				tabData.accept(SupremeMiningDimensionModItems.FAES_WELCOME.get());
				tabData.accept(SupremeMiningDimensionModItems.BALUSTERS_BELOW.get());
				tabData.accept(SupremeMiningDimensionModItems.ELATED_PILLAR.get());
				tabData.accept(SupremeMiningDimensionModItems.DIGITAL_SMILES.get());
				tabData.accept(SupremeMiningDimensionModItems.IT_CAME_FROM_DEEPER.get());
				tabData.accept(SupremeMiningDimensionModItems.LOITER_ON_STARS.get());
				tabData.accept(SupremeMiningDimensionModItems.ARE_WE_GOING_ANYWHERE.get());
				tabData.accept(SupremeMiningDimensionModItems.FLAMES_IN_MY_EYE.get());
				tabData.accept(SupremeMiningDimensionModItems.STARTING_AGAIN.get());
				tabData.accept(SupremeMiningDimensionModItems.MUSHROOMATICS.get());
				tabData.accept(SupremeMiningDimensionModItems.ELEVEN_PM.get());
				tabData.accept(SupremeMiningDimensionModItems.FLIPPED_HIATUS.get());
				tabData.accept(SupremeMiningDimensionModItems.EMERALD_MORNINGS.get());
				tabData.accept(SupremeMiningDimensionModItems.JUST_A_LITTE_TIME.get());
				tabData.accept(SupremeMiningDimensionModItems.MY_DARKENED_LIGHT.get());
				tabData.accept(SupremeMiningDimensionModItems.ON_MY_SHOULDERS.get());
				tabData.accept(SupremeMiningDimensionModItems.FUNGUS_TALKING.get());
				tabData.accept(SupremeMiningDimensionModItems.FLAME_OF_HOPE.get());
				tabData.accept(SupremeMiningDimensionModItems.TWEETER_HELLO.get());
				tabData.accept(SupremeMiningDimensionModItems.EMPTY_WARMTH.get());
				tabData.accept(SupremeMiningDimensionModItems.HILL_OF_STONE.get());
				tabData.accept(SupremeMiningDimensionModItems.DRIFTING_UPWARDS.get());
				tabData.accept(SupremeMiningDimensionModItems.STANDING_TALL.get());
				tabData.accept(SupremeMiningDimensionModItems.FLAME_IN_MY_HEAD.get());
				tabData.accept(SupremeMiningDimensionModItems.HOLDING_ON_TENTERHOOKS.get());
				tabData.accept(SupremeMiningDimensionModItems.MY_DARKENED_LIGHT_SLOW.get());
				tabData.accept(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get());
				tabData.accept(SupremeMiningDimensionModItems.TIN_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.PLATINUM_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.SILVER_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_TITANIUM.get());
				tabData.accept(SupremeMiningDimensionModItems.TITANIUM_INGOT.get());
				tabData.accept(SupremeMiningDimensionModItems.ALUMINUM_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.TITANIUM_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.TUNGSTEN_NUGGET.get());
				tabData.accept(SupremeMiningDimensionModItems.RAW_DUCK.get());
				tabData.accept(SupremeMiningDimensionModItems.COOKED_DUCK.get());
				tabData.accept(SupremeMiningDimensionModItems.SMOKED_DUCK.get());
				tabData.accept(SupremeMiningDimensionModItems.DUCK_EGG.get());
				tabData.accept(SupremeMiningDimensionModItems.SHIFTED_SANDS.get());
				tabData.accept(SupremeMiningDimensionModBlocks.STRANGE_FORESTS_RUINED_PORTAL.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SMD_STRUCTURES = REGISTRY.register("smd_structures", () -> CreativeModeTab.builder().title(Component.translatable("item_group.supreme_mining_dimension.smd_structures"))
			.icon(() -> new ItemStack(SupremeMiningDimensionModItems.CAVERN_PORTAL_OUTPOST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SupremeMiningDimensionModItems.CAVERN_PORTAL_OUTPOST.get());
			})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SupremeMiningDimensionModItems.WEAK_WITHERED_FIREBALL.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SupremeMiningDimensionModItems.HONEY_BUCKET.get());
		}
	}
}
