
package net.ddraig.suprememiningdimension.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModFluids;

public class HoneyBlock extends LiquidBlock {
	public HoneyBlock() {
		super(() -> SupremeMiningDimensionModFluids.HONEY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
