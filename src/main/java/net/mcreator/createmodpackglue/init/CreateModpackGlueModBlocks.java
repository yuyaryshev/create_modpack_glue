
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmodpackglue.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createmodpackglue.block.WeaponMoltedSteelBlock;
import net.mcreator.createmodpackglue.block.WeaponMoltedIronBlock;
import net.mcreator.createmodpackglue.block.WeaponMoltedDiamondBlock;
import net.mcreator.createmodpackglue.block.RichIronOreBlock;
import net.mcreator.createmodpackglue.block.PoorIronOreBlock;
import net.mcreator.createmodpackglue.block.MoltenCleanerBlock;
import net.mcreator.createmodpackglue.block.AdvMoltenCleanerBlock;
import net.mcreator.createmodpackglue.CreateModpackGlueMod;

public class CreateModpackGlueModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateModpackGlueMod.MODID);
	public static final RegistryObject<Block> MOLTEN_CLEANER = REGISTRY.register("molten_cleaner", () -> new MoltenCleanerBlock());
	public static final RegistryObject<Block> ADV_MOLTEN_CLEANER = REGISTRY.register("adv_molten_cleaner", () -> new AdvMoltenCleanerBlock());
	public static final RegistryObject<Block> WEAPON_MOLTED_DIAMOND = REGISTRY.register("weapon_molted_diamond",
			() -> new WeaponMoltedDiamondBlock());
	public static final RegistryObject<Block> WEAPON_MOLTED_IRON = REGISTRY.register("weapon_molted_iron", () -> new WeaponMoltedIronBlock());
	public static final RegistryObject<Block> WEAPON_MOLTED_STEEL = REGISTRY.register("weapon_molted_steel", () -> new WeaponMoltedSteelBlock());
	public static final RegistryObject<Block> POOR_IRON_ORE = REGISTRY.register("poor_iron_ore", () -> new PoorIronOreBlock());
	public static final RegistryObject<Block> RICH_IRON_ORE = REGISTRY.register("rich_iron_ore", () -> new RichIronOreBlock());
}
