
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class SupremeMiningDimensionModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == SupremeMiningDimensionModBlocks.HEATED_MAGMA_BLOCK.get().asItem())
			event.setBurnTime(18000);
		else if (itemstack.getItem() == SupremeMiningDimensionModBlocks.ANCIENT_MOSS.get().asItem())
			event.setBurnTime(1200);
	}
}
