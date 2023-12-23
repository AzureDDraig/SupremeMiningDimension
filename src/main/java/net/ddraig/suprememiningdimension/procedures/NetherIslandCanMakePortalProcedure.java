package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class NetherIslandCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.NETHER_ISLES.get();
	}
}
