package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class DiamondSandGenBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.DIAMOND_SAND_ORE.get();
	}
}
