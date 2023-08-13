package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseGoldBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_GOLD_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
