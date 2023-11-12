
package net.ddraig.suprememiningdimension.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModFluids;

public class HoneyBlock extends LiquidBlock {
	public HoneyBlock() {
		super(() -> SupremeMiningDimensionModFluids.HONEY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
