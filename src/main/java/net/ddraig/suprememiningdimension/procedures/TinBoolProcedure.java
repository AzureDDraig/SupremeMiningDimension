package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class TinBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.TIN_ENABLED.get();
	}
}
