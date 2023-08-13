package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseIronBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_IRON_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
