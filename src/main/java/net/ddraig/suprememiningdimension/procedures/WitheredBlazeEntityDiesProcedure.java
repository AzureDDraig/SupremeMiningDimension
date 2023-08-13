package net.ddraig.suprememiningdimension.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;
import net.ddraig.suprememiningdimension.configuration.BiomesConfiguration;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class WitheredBlazeEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ASH, x, y, z, 45, 3, 3, 3, 1);
		world.setBlock(new BlockPos(x, y, z), Blocks.CHEST.defaultBlockState(), 3);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, (y + 1), z, 60));
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(SupremeMiningDimensionModItems.MINERS_BELL_LEFT_HALF.get()));
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent != null) {
				final int _slotid = 0;
				final ItemStack _setstack = new ItemStack(SupremeMiningDimensionModItems.MINERS_BELL_LEFT_HALF.get());
				_setstack.setCount(1);
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
		if (BiomesConfiguration.DEATH_EXPLOSION.get()) {
			SupremeMiningDimensionMod.queueServerWork((int) ((double) BiomesConfiguration.DEATH_EXPLOSION_DELAY_SECONDS.get() * 20), () -> {
				if (BiomesConfiguration.DEATH_EXPLOSION_BREAK_BLOCKS.get()) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, (float) (double) BiomesConfiguration.DEATH_EXPLOSION_POWER.get(), Explosion.BlockInteraction.BREAK);
				} else {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, (float) (double) BiomesConfiguration.DEATH_EXPLOSION_POWER.get(), Explosion.BlockInteraction.NONE);
				}
			});
		}
	}
}
