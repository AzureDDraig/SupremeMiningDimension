package net.ddraig.suprememiningdimension.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class MiningDimEntranceAdditionalGenerationConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:underground_dimension"))) == (entity.level.dimension())) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "miningdimensionentrance"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 8, y - 4, z - 8), new BlockPos(x - 8, y - 4, z - 8), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:caverns"))) == (entity.level.dimension())) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "miningdimensionentrance"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 8, y - 4, z - 8), new BlockPos(x - 8, y - 4, z - 8), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("supreme_mining_dimension:deep_caverns"))) == (entity.level.dimension())) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("supreme_mining_dimension", "miningdimensionentrance"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 8, y - 4, z - 8), new BlockPos(x - 8, y - 4, z - 8), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
