
package net.ddraig.suprememiningdimension.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModParticleTypes;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModItems;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModFluids;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModFluidTypes;
import net.ddraig.suprememiningdimension.init.SupremeMiningDimensionModBlocks;

public abstract class HoneyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SupremeMiningDimensionModFluidTypes.HONEY_TYPE.get(), () -> SupremeMiningDimensionModFluids.HONEY.get(),
			() -> SupremeMiningDimensionModFluids.FLOWING_HONEY.get()).explosionResistance(100f).tickRate(30).slopeFindDistance(1).bucket(() -> SupremeMiningDimensionModItems.HONEY_BUCKET.get())
			.block(() -> (LiquidBlock) SupremeMiningDimensionModBlocks.HONEY.get());

	private HoneyFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (SupremeMiningDimensionModParticleTypes.HONEY_DRIP.get());
	}

	public static class Source extends HoneyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HoneyFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
