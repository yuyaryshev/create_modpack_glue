package net.mcreator.createmodpackglue.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModBlocks;

public class GenBlockTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
			world.setBlock(new BlockPos(x, y + 1, z), CreateModpackGlueModBlocks.POOR_IRON_ORE.get().defaultBlockState(), 3);
		}
	}
}
