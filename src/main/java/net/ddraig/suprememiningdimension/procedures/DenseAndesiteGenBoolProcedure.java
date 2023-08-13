package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DenseAndesiteGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DENSE_ANDESITE_ENABLED.get() && BiomesConfiguration.DENSE_ORES_ENABLED.get();
	}
}
