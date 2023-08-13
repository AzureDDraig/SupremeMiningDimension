package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseEmeraldBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_EMERALD_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
