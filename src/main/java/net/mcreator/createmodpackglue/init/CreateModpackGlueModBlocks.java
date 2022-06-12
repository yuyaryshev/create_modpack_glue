
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmodpackglue.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createmodpackglue.block.MoltenCleanerBlock;
import net.mcreator.createmodpackglue.block.AdvMoltenCleanerBlock;
import net.mcreator.createmodpackglue.CreateModpackGlueMod;

public class CreateModpackGlueModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateModpackGlueMod.MODID);
	public static final RegistryObject<Block> MOLTEN_CLEANER = REGISTRY.register("molten_cleaner", () -> new MoltenCleanerBlock());
	public static final RegistryObject<Block> ADV_MOLTEN_CLEANER = REGISTRY.register("adv_molten_cleaner", () -> new AdvMoltenCleanerBlock());
}
