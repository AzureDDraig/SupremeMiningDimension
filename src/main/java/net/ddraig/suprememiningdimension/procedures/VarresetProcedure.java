package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class VarresetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (BiomesConfiguration.CAN_RESET_FIRST_JOIN.get()) {
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitUnderground = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitCaverns = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitDeep = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitEnder = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitFalseOverworld = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitStrangeForests = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Try checking the Config to see if you can reset SMD variables"), false);
		}
	}
}
