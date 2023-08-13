package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class ZincBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.ZINC_ENABLED.get();
	}
}
