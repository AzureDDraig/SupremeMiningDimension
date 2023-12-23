package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class CavernsCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.CAVERNS.get();
	}
}
