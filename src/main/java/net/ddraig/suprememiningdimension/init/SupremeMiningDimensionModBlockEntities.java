
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.ddraig.suprememiningdimension.block.entity.BenitoiteCrystalSmallBlockEntity;
import net.ddraig.suprememiningdimension.block.entity.BenitoiteCrystalMediumBlockEntity;
import net.ddraig.suprememiningdimension.block.entity.BenitoiteCrystalLargeBlockEntity;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BENITOITE_CRYSTAL_SMALL = register("benitoite_crystal_small", SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_SMALL, BenitoiteCrystalSmallBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BENITOITE_CRYSTAL_MEDIUM = register("benitoite_crystal_medium", SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_MEDIUM, BenitoiteCrystalMediumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BENITOITE_CRYSTAL_LARGE = register("benitoite_crystal_large", SupremeMiningDimensionModBlocks.BENITOITE_CRYSTAL_LARGE, BenitoiteCrystalLargeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
