package net.mcreator.createmodpackglue.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModBlocks;

import java.util.Random;

public class GenIronPoorAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double c = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x + 1, y, z))) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
			c = c + 10;
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x, y, z + 1))) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x - 1, y, z))) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x, y - 1, z))) {
			c = c + 1;
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.IRON_ORE) {
			c = c + 100;
		} else if (!world.isEmptyBlock(new BlockPos(x, y, z - 1))) {
			c = c + 1;
		}
		if (c >= 12 && Mth.nextInt(new Random(), 1, 100) <= 100) {
			c = c + 100;
		}
		if (c >= 100) {
			world.setBlock(new BlockPos(x, y, z), CreateModpackGlueModBlocks.GEN_IRON_POOR.get().defaultBlockState(), 3);
		}
		return false;
	}
}
