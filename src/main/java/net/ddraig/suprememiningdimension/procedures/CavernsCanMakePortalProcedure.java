package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class CavernsCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.CAVERNS.get();
	}
}
