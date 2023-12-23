package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseEmeraldBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_EMERALD_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
