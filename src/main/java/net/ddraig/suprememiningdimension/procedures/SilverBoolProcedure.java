package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class SilverBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.SILVER_ORE.get();
	}
}
