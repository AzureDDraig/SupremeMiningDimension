package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.ddraig.suprememiningdimension.network.SupremeMiningDimensionModVariables;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;

public class FalseOverworldDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String portalcords = "";
		double x = 0;
		double z = 0;
		double y1 = 0;
		double y2 = 0;
		double xx = 0;
		double zz = 0;
		double yy = 0;
		double nx = 0;
		double nz = 0;
		if (BiomesConfiguration.FALSE_OW_NICE_PLACE.get()) {
			x = entity.getX();
			z = entity.getZ();
			y2 = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z);
			y1 = entity.getY();
			if ((entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).FirstVisitFalseOverworld) {
				if (world.canSeeSkyFromBelowWater(new BlockPos(x, y2, z))) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y1, z), new BlockPos(x, y1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "litsurfaceport"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y2, z), new BlockPos(x, y2, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y2 + 2), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y2 + 2), z, _ent.getYRot(), _ent.getXRot());
					}
				}
			} else if (entity.getY() <= 45) {
				if (world.canSeeSkyFromBelowWater(new BlockPos(x, y2, z))) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y1, z), new BlockPos(x, y1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "litsurfaceport"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y2, z), new BlockPos(x, y2, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y2 + 2), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y2 + 2), z, _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		if (BiomesConfiguration.FALSE_OW_AWAY_FROM_PORTAL.get()
				&& (entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SupremeMiningDimensionModVariables.PlayerVariables())).FirstVisitFalseOverworld) {
			nz = Mth.nextInt(RandomSource.create(), 1, 2);
			nx = Mth.nextInt(RandomSource.create(), 1, 2);
			portalcords = "The portal is at X: " + Math.round(x) + " Y: " + Math.round(y2) + " Z: " + Math.round(z);
			xx = Mth.nextInt(RandomSource.create(), (int) (double) BiomesConfiguration.FALSE_OW_MIN_DISTANCE.get(), (int) (double) BiomesConfiguration.FALSE_OW_MAX_DISTANCE.get());
			zz = Mth.nextInt(RandomSource.create(), (int) (double) BiomesConfiguration.FALSE_OW_MIN_DISTANCE.get(), (int) (double) BiomesConfiguration.FALSE_OW_MAX_DISTANCE.get());
			yy = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) xx, (int) zz);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(portalcords), (false));
			if (1 == nx) {
				xx = xx * (-1);
			}
			if (1 == nz) {
				zz = zz * (-1);
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((xx + x), (y2 + 2), (z + zz));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((xx + x), (y2 + 2), (z + zz), _ent.getYRot(), _ent.getXRot());
			}
			if (60 >= entity.getY()) {
				{
					Entity _ent = entity;
					_ent.teleportTo((xx + x), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (xx + x), (int) (z + zz))), (z + zz));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((xx + x), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (xx + x), (int) (z + zz))), (z + zz), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		{
			boolean _setval = false;
			entity.getCapability(SupremeMiningDimensionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FirstVisitFalseOverworld = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
