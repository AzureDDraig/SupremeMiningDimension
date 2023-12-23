package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

public class DefinedVoidPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		xx = (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).PlayerVoidID * 640;
		zz = (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).PlayerVoidID * 640;
		yy = 12;
		{
			Entity _ent = entity;
			_ent.teleportTo(xx, yy, zz);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(xx, yy, zz, _ent.getYRot(), _ent.getXRot());
		}
		sx = xx - 3;
		for (int index0 = 0; index0 < 6; index0++) {
			sz = zz - 3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = sz + 1;
				world.setBlock(BlockPos.containing(sx, yy - 1, sz), Blocks.BEDROCK.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(xx, yy + 2, zz), SupremeMiningDimensionModBlocks.DEFINED_VOID_PORTAL.get().defaultBlockState(), 3);
			}
			sx = sx + 1;
		}
	}
}
