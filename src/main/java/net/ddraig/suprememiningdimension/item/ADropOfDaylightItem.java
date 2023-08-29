
package net.ddraig.suprememiningdimension.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ADropOfDaylightItem extends RecordItem {
	public ADropOfDaylightItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("supreme_mining_dimension:smd.record.adropofdaylight")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3660);
	}
}
