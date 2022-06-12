
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
import net.mcreator.createmodpackglue.fluid.attributes.AdvMoltenCleanerFluidAttributes;

public abstract class AdvMoltenCleanerFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateModpackGlueModFluids.ADV_MOLTEN_CLEANER,
			CreateModpackGlueModFluids.FLOWING_ADV_MOLTEN_CLEANER,
			AdvMoltenCleanerFluidAttributes
					.builder(new ResourceLocation("create_modpack_glue:blocks/anim_molten_still_block"),
							new ResourceLocation("create_modpack_glue:blocks/anim_molten_flowing_block"))

					.color(-12012264))
			.explosionResistance(100f)

			.bucket(CreateModpackGlueModItems.ADV_MOLTEN_CLEANER_BUCKET)
			.block(() -> (LiquidBlock) CreateModpackGlueModBlocks.ADV_MOLTEN_CLEANER.get());

	private AdvMoltenCleanerFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AdvMoltenCleanerFluid {
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

	public static class Flowing extends AdvMoltenCleanerFluid {
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
