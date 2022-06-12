
package net.mcreator.createmodpackglue.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModItems;
import net.mcreator.createmodpackglue.init.CreateModpackGlueModFluids;
import net.mcreator.createmodpackglue.init.CreateModpackGlueModBlocks;
import net.mcreator.createmodpackglue.fluid.attributes.MoltenCleanerFluidAttributes;

public abstract class MoltenCleanerFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateModpackGlueModFluids.MOLTEN_CLEANER,
			CreateModpackGlueModFluids.FLOWING_MOLTEN_CLEANER,
			MoltenCleanerFluidAttributes
					.builder(new ResourceLocation("create_modpack_glue:blocks/anim_molten_still_block"),
							new ResourceLocation("create_modpack_glue:blocks/anim_molten_flowing_block"))

					.color(-12012264))
			.explosionResistance(100f)

			.bucket(CreateModpackGlueModItems.MOLTEN_CLEANER_BUCKET).block(() -> (LiquidBlock) CreateModpackGlueModBlocks.MOLTEN_CLEANER.get());

	private MoltenCleanerFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenCleanerFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenCleanerFluid {
		public Flowing() {
			super();
		}

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
