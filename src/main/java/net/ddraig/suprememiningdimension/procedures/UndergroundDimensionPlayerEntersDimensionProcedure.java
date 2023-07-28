package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.block.UndergroundDimensionPortalBlock;

public class UndergroundDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		x = entity.getX();
		z = entity.getZ();
		if (120 <= entity.getY() && BiomesConfiguration.UNDERGROUND_NICE_PLACE.get()) {
			if (true == (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).FirstVisitUnderground) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "goldport"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x, 64, z), new BlockPos(x, 64, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				if (world instanceof Level _level)
					UndergroundDimensionPortalBlock.portalSpawn(_level, new BlockPos(x, 64, z));
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 66, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 66, z, _ent.getYRot(), _ent.getXRot());
				}
				{
					boolean _setval = false;
					entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FirstVisitUnderground = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (120 <= entity.getY()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, 124, z), new BlockPos(x, 124, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "goldport"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, 124, z), new BlockPos(x, 124, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitUnderground = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
