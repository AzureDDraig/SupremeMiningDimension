package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseCoalBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_COAL_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
