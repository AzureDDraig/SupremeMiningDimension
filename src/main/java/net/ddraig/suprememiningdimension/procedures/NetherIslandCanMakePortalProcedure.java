package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class NetherIslandCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.NETHER_ISLANDS.get();
	}
}
