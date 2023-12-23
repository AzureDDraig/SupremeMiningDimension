package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

public class LockedBricksOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_DIAMOND.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_DIAMOND.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_EMERALD.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_EMERALD.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_LAPIS.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_LAPIS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_AMETHYST.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_AMETHYST.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_RUBY.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_RUBY.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if (SupremeMiningDimensionModBlocks.LOCKED_BRICKS_TOPAZ.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (SupremeMiningDimensionModItems.IRON_KEY_TOPAZ.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
