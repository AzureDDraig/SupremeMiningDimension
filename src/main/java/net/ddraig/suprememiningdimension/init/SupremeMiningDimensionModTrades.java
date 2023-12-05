
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SupremeMiningDimensionModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == SupremeMiningDimensionModVillagerProfessions.VILLAGER_MUSHROOM_DISC_JOCKEY.get()) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 2), new ItemStack(SupremeMiningDimensionModItems.ZINC_INGOT.get(), 2), new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), 50, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(SupremeMiningDimensionModBlocks.MUSIC_STATION.get()), 5, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.JUKEBOX), 5, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.AMBER_CHUNK.get()),
					new ItemStack(SupremeMiningDimensionModItems.STRINGS_OF_FATE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.AMBER_CHUNK.get()),
					new ItemStack(SupremeMiningDimensionModItems.WE_ARE_GOING_UNDER.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.SCULK), new ItemStack(SupremeMiningDimensionModItems.TUNNEL_TALKING.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.SCULK), new ItemStack(SupremeMiningDimensionModItems.IT_CAME_FROM_DEEPER.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.SCULK), new ItemStack(SupremeMiningDimensionModItems.LOITER_ON_STARS.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.SPHALERITE.get()),
					new ItemStack(SupremeMiningDimensionModItems.FLAME_IN_MY_HEAD.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.SPHALERITE.get()),
					new ItemStack(SupremeMiningDimensionModItems.FLAME_OF_HOPE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.HEATED_MAGMA_BLOCK.get()),
					new ItemStack(SupremeMiningDimensionModItems.MY_DARKENED_LIGHT.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.HEATED_MAGMA_BLOCK.get()),
					new ItemStack(SupremeMiningDimensionModItems.FLAMES_IN_MY_EYE.get()), 10, 5, 0.05f));
			event.getTrades().get(2)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Items.AMETHYST_SHARD), new ItemStack(SupremeMiningDimensionModItems.AMETHYST_DROPLETS.get()), 10, 5, 0.05f));
			event.getTrades().get(2)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Items.AMETHYST_SHARD), new ItemStack(SupremeMiningDimensionModItems.LOST_OUT_THERE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Items.AMETHYST_SHARD), new ItemStack(SupremeMiningDimensionModItems.EMPTY_WARMTH.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.HONEY_BUCKET.get()),
					new ItemStack(SupremeMiningDimensionModItems.THE_LIGHT_IN_THE_STONE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.HONEY_BUCKET.get()),
					new ItemStack(SupremeMiningDimensionModItems.THE_CLOCK_STRIKES_13.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.HONEY_BUCKET.get()),
					new ItemStack(SupremeMiningDimensionModItems.FAES_WELCOME.get()), 10, 5, 0.05f));
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.DRIPSTONE_BLOCK), new ItemStack(SupremeMiningDimensionModItems.BALUSTERS_BELOW.get()), 10, 5, 0.05f));
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.DRIPSTONE_BLOCK), new ItemStack(SupremeMiningDimensionModItems.ELATED_PILLAR.get()), 10, 5, 0.05f));
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.DRIPSTONE_BLOCK), new ItemStack(SupremeMiningDimensionModItems.DIGITAL_SMILES.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP_GLOWING.get()),
					new ItemStack(SupremeMiningDimensionModItems.FUNGUS_TALKING.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP_GLOWING.get()),
					new ItemStack(SupremeMiningDimensionModItems.MUSHROOMATICS.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.GHOSTLYSHROOM_CAP_GLOWING.get()),
					new ItemStack(SupremeMiningDimensionModItems.ELEVEN_PM.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.SHADE_COBBLESTONE.get()),
					new ItemStack(SupremeMiningDimensionModItems.HOLDING_ON_TENTERHOOKS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.SHADE_COBBLESTONE.get()),
					new ItemStack(SupremeMiningDimensionModItems.MY_DARKENED_LIGHT_SLOW.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.SHADE_COBBLESTONE.get()),
					new ItemStack(SupremeMiningDimensionModItems.THE_ROT_REJECTS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.SHADE_COBBLESTONE.get()),
					new ItemStack(SupremeMiningDimensionModItems.THE_BLIGHT_CONSUMES.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.ANCIENT_MOSS.get()),
					new ItemStack(SupremeMiningDimensionModItems.ARE_WE_GOING_ANYWHERE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.ANCIENT_MOSS.get()),
					new ItemStack(SupremeMiningDimensionModItems.ON_MY_SHOULDERS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.ANCIENT_MOSS.get()),
					new ItemStack(SupremeMiningDimensionModItems.STANDING_TALL.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.SMOKED_DUCK.get()),
					new ItemStack(SupremeMiningDimensionModItems.EMERALD_MORNINGS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.SMOKED_DUCK.get()),
					new ItemStack(SupremeMiningDimensionModItems.FLIPPED_HIATUS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModItems.SMOKED_DUCK.get()),
					new ItemStack(SupremeMiningDimensionModItems.A_DROP_OF_DAYLIGHT.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(SupremeMiningDimensionModBlocks.END_SOIL.get()),
					new ItemStack(SupremeMiningDimensionModItems.STARTING_AGAIN.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.PACKED_ICE), new ItemStack(SupremeMiningDimensionModItems.SUBWOOFER_ALARM.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.PACKED_ICE), new ItemStack(SupremeMiningDimensionModItems.TWEETER_HELLO.get()), 10, 5, 0.05f));
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.PACKED_ICE), new ItemStack(SupremeMiningDimensionModItems.DRIFTING_UPWARDS.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.PACKED_ICE), new ItemStack(SupremeMiningDimensionModItems.HILL_OF_STONE.get()), 10, 5, 0.05f));
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(SupremeMiningDimensionModItems.BLANK_MUSIC_DISC.get()), new ItemStack(Blocks.PACKED_ICE), new ItemStack(SupremeMiningDimensionModItems.JUST_A_LITTE_TIME.get()), 10, 5, 0.05f));
		}
	}
}
