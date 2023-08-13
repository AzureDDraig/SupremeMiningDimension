package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DiamondSandGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DIAMOND_SAND_ENABLED.get();
	}
}
