package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseCoalBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_COAL_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
