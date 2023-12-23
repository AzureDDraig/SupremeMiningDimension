package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class NickelBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.NICKEL_ORE.get();
	}
}
