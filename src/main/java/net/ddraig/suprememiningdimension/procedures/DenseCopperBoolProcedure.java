package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseCopperBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_COPPER_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
