package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class TinBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.TIN_ORE.get();
	}
}
