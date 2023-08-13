package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class DiamondGravelGenBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.DIAMOND_GRAVEL_ENABLED.get();
	}
}
