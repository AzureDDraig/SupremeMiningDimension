package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseLapisBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_LAPIS_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
