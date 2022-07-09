package net.mcreator.createmodpackglue.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.createmodpackglue.network.CreateModpackGlueModVariables;

import java.util.HashMap;

public class CmdSetMapDisabledCommandExecuteProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		CreateModpackGlueModVariables.WorldVariables.get(world).allMapDisabled = (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "")
				.equals("1");
		CreateModpackGlueModVariables.WorldVariables.get(world).syncData(world);
	}
}
