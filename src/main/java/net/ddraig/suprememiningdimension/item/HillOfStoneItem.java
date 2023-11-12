
package net.ddraig.suprememiningdimension.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class HillOfStoneItem extends RecordItem {
	public HillOfStoneItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("supreme_mining_dimension:smd.record.hillofstone")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3840);
	}
}
