package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

import java.util.Map;

public class BlightwoodSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double giant = 0;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		if (6 < world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			yy = y;
			for (int index0 = 0; index0 < (int) (4); index0++) {
				{
					BlockPos _bp = new BlockPos(x, yy, z);
					BlockState _bs = SupremeMiningDimensionModBlocks.BLIGHTWOOD_LOG.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				yy = yy + 1;
			}
			for (int index1 = 0; index1 < (int) (2); index1++) {
				xx = x - 2;
				for (int index2 = 0; index2 < (int) (5); index2++) {
					zz = z - 2;
					for (int index3 = 0; index3 < (int) (5); index3++) {
						{
							BlockPos _bp = new BlockPos(xx, yy, zz);
							BlockState _bs = SupremeMiningDimensionModBlocks.BLIGHTWOOD_LEAVES.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						zz = zz + 1;
					}
					xx = xx + 1;
				}
				yy = yy + 1;
			}
			for (int index4 = 0; index4 < (int) (2); index4++) {
				xx = x - 1;
				for (int index5 = 0; index5 < (int) (3); index5++) {
					zz = z - 1;
					for (int index6 = 0; index6 < (int) (3); index6++) {
						{
							BlockPos _bp = new BlockPos(xx, yy, zz);
							BlockState _bs = SupremeMiningDimensionModBlocks.BLIGHTWOOD_LEAVES.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						zz = zz + 1;
					}
					xx = xx + 1;
				}
				yy = yy + 1;
			}
		}
	}
}
