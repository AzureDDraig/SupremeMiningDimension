
package net.ddraig.suprememiningdimension.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ddraig.suprememiningdimension.procedures.SetLevelMaxAugmentProcedure;

import java.util.List;

public class WaterBreathingAugmentItem extends Item {
	public WaterBreathingAugmentItem() {
		super(new Item.Properties().stacksTo(12).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Apply with the Augment Station"));
		list.add(Component.literal("Max Level: 5"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SetLevelMaxAugmentProcedure.execute(itemstack);
	}
}
