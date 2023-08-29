
package net.ddraig.suprememiningdimension.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

import java.util.List;
import java.util.Collections;

public class EndGrassBlock extends Block {
	public EndGrassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(SupremeMiningDimensionModBlocks.END_SOIL.get()));
	}
}
