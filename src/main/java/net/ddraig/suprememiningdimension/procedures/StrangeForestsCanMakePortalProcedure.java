package net.ddraig.suprememiningdimension.procedures;

import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;

public class StrangeForestsCanMakePortalProcedure {
	public static boolean execute() {
		return SMDDimensionsConfiguration.STRANGE_FORESTS.get();
	}
}
