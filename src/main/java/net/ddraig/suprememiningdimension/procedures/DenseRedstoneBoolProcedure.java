package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseRedstoneBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_REDSTONE_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
