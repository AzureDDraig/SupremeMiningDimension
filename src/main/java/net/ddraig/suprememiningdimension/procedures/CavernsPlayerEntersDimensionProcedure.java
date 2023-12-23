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
import net.ddraig.suprememiningdimension.configuration.SMDDimensionsConfiguration;
import net.ddraig.suprememiningdimension.block.CavernsPortalBlock;

public class CavernsPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		if (SMDDimensionsConfiguration.NICE_CAVERNS.get()) {
			if (120 <= entity.getY()) {
				if (true == (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).FirstVisitCaverns) {
					x = entity.getX();
					z = entity.getZ();
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "goldport"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, 64, z), BlockPos.containing(x, 64, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					if (world instanceof Level _level)
						CavernsPortalBlock.portalSpawn(_level, BlockPos.containing(x, 63, z));
					{
						Entity _ent = entity;
						_ent.teleportTo(x, 66, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, 66, z, _ent.getYRot(), _ent.getXRot());
					}
					{
						boolean _setval = false;
						entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FirstVisitCaverns = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else {
			x = entity.getX();
			z = entity.getZ();
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, 124, z), BlockPos.containing(x, 124, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "goldport"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, 124, z), BlockPos.containing(x, 124, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof Level _level)
				CavernsPortalBlock.portalSpawn(_level, BlockPos.containing(x, 64, z));
			{
				boolean _setval = false;
				entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FirstVisitCaverns = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
