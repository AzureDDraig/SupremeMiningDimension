package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class UndergroundDimensionCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.UNDERGROUND.get();
	}
}
