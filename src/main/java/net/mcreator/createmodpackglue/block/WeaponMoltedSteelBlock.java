
package net.mcreator.createmodpackglue.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModFluids;

public class WeaponMoltedSteelBlock extends LiquidBlock {
	public WeaponMoltedSteelBlock() {
		super(() -> (FlowingFluid) CreateModpackGlueModFluids.WEAPON_MOLTED_STEEL.get(),
				BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.COLOR_GREEN).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
