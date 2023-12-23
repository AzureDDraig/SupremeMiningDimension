package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;
import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;
import net.ddraig.suprememiningdimension.block.StrangeForestsPortalBlock;

public class StrangeForestsPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		if (SMDDimensionsConfiguration.NICE_STRANGE_FORESTS.get()) {
			if ((entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).FirstVisitStrangeForests) {
				{
					boolean _setval = false;
					entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FirstVisitStrangeForests = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				xx = entity.getX();
				zz = entity.getZ();
				yy = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) xx, (int) zz);
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(xx, yy, zz))) {
					{
						Entity _ent = entity;
						_ent.teleportTo(xx, yy, zz);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(xx, yy, zz, _ent.getYRot(), _ent.getXRot());
					}
					world.setBlock(BlockPos.containing(xx - 0, yy - 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 1, yy - 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 2, yy - 0, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx + 1, yy - 0, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 2, yy + 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx + 1, yy + 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 2, yy + 2, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx + 1, yy + 2, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 0, yy + 3, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 1, yy - 3, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 2, yy - 3, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx + 1, yy + 3, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx + 1, yy - 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(xx - 2, yy - 1, zz), SupremeMiningDimensionModBlocks.ETCHED_WOOD.get().defaultBlockState(), 3);
					if (world instanceof Level _level)
						StrangeForestsPortalBlock.portalSpawn(_level, BlockPos.containing(xx, yy, zz));
				}
			}
		}
	}
}
