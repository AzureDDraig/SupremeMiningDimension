package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class EnderCavesCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.ENDER_CAVES.get();
	}
}
