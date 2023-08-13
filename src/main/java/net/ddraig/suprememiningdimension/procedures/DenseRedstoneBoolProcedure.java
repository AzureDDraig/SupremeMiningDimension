package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseRedstoneBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_REDSTONE_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
