package net.mcreator.createmodpackglue.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GenIronPoorAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double c = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.IRON_ORE) {
			c = c + 1;
		}
		return c >= 1 && x % 2 <= 0 && y % 2 <= 0 && z % 2 <= 0;
	}
}
