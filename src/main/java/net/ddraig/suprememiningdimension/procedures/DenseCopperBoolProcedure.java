package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseCopperBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_COPPER_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
