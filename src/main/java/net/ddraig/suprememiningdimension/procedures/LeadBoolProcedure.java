package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDOresConfiguration;

public class LeadBoolProcedure {
	public static boolean execute() {
		return SMDOresConfiguration.LEAD_ORE.get();
	}
}
