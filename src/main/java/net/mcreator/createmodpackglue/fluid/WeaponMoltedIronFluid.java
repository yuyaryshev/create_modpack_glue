
package net.mcreator.createmodpackglue.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModItems;
import net.mcreator.createmodpackglue.init.CreateModpackGlueModFluids;
import net.mcreator.createmodpackglue.init.CreateModpackGlueModBlocks;

public abstract class WeaponMoltedIronFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateModpackGlueModFluids.WEAPON_MOLTED_IRON,
			CreateModpackGlueModFluids.FLOWING_WEAPON_MOLTED_IRON,
			FluidAttributes.builder(new ResourceLocation("create_modpack_glue:blocks/anim_molten_still_block"),
					new ResourceLocation("create_modpack_glue:blocks/anim_molten_flowing_block"))

	).explosionResistance(100f)

			.bucket(CreateModpackGlueModItems.WEAPON_MOLTED_IRON_BUCKET)
			.block(() -> (LiquidBlock) CreateModpackGlueModBlocks.WEAPON_MOLTED_IRON.get());

	private WeaponMoltedIronFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WeaponMoltedIronFluid {
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

	public static class Flowing extends WeaponMoltedIronFluid {
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
