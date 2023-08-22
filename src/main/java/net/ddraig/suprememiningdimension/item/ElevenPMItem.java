
package net.ddraig.suprememiningdimension.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModTabs;

public class ElevenPMItem extends RecordItem {
	public ElevenPMItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("supreme_mining_dimension:smd.record.11pm")), new Item.Properties().tab(SupremeMiningDimensionModTabs.TAB_SUPREME_MINING_DIMENSIONS).stacksTo(1).rarity(Rarity.RARE),
				3660);
	}
}
