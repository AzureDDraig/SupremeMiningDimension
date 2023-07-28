package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class FalseOverworldDimensionCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.FALSE_OVERWORLD.get();
	}
}
