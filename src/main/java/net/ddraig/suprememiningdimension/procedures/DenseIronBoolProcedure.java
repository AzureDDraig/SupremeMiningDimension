package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseIronBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_IRON_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
