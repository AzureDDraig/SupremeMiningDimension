package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DiamondGravelGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DIAMOND_GRAVEL_ORE.get();
	}
}
