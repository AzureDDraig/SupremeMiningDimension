package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class StrangeForestsCanMakePortalProcedure {
	public static boolean execute() {
		return BiomesConfiguration.STRANGE_FORESTS.get();
	}
}
