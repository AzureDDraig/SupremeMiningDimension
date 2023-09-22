package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class StrangeForestsRuinedPortalPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction rotation = Direction.NORTH;
		double rotationrand = 0;
		double sizerand = 0;
		rotationrand = Mth.nextInt(RandomSource.create(), 1, 4);
		sizerand = Mth.nextInt(RandomSource.create(), 1, 3);
		if (1 == sizerand) {
			if (1 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (2 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (3 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (4 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (2 == sizerand) {
			if (1 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (2 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (3 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (4 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (3 == sizerand) {
			if (1 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (2 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (3 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (4 == rotationrand) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "airey"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
