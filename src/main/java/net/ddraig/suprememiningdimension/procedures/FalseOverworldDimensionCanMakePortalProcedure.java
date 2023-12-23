package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class FalseOverworldDimensionCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.FALSE_OW.get();
	}
}
