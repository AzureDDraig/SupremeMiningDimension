package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class LeadBoolProcedure {
	public static boolean execute() {
		return BiomesConfiguration.LEAD_ENABLED.get();
	}
}
