package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.Entity;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;

public class UndoVoidIDProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).PlayerOldVoidID;
			entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerVoidID = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
