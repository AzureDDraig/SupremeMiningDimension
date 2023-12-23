package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class TungstenOreBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.TUNGSTEN_ORE.get();
	}
}
