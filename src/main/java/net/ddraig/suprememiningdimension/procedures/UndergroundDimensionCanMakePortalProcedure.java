package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class UndergroundDimensionCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.UNDERGROUND.get();
	}
}
