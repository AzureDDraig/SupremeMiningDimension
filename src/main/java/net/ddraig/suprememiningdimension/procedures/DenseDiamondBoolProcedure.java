package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseDiamondBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_DIAMOND_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
