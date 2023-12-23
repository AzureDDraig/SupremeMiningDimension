package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DenseGoldBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DENSE_GOLD_ORE.get() && SMDOresConfiguration.DENSE_ORES_ENABLED.get();
	}
}
