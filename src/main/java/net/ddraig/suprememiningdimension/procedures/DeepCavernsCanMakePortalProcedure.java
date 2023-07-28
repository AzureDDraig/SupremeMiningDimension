package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DeepCavernsCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DEEP_CAVERNS.get();
	}
}
