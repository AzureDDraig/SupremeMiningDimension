
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModFluids;

public class HoneyItem extends BucketItem {
	public HoneyItem() {
		super(SupremeMiningDimensionModFluids.HONEY, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
