
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
import net.mcreator.createmodpackglue.block.RichZincOreBlock;
import net.mcreator.createmodpackglue.block.RichSilverOreBlock;
import net.mcreator.createmodpackglue.block.RichRedstoneOreBlock;
import net.mcreator.createmodpackglue.block.RichIronOreBlock;
import net.mcreator.createmodpackglue.block.RichGoldOreBlock;
import net.mcreator.createmodpackglue.block.RichEmeraldOreBlock;
import net.mcreator.createmodpackglue.block.RichDiamondOreBlock;
import net.mcreator.createmodpackglue.block.RichCopperOreBlock;
import net.mcreator.createmodpackglue.block.RichCobaltOreBlock;
import net.mcreator.createmodpackglue.block.PoorZincOreBlock;
import net.mcreator.createmodpackglue.block.PoorSilverOreBlock;
import net.mcreator.createmodpackglue.block.PoorRedstoneOreBlock;
import net.mcreator.createmodpackglue.block.PoorIronOreBlock;
import net.mcreator.createmodpackglue.block.PoorGoldOreBlock;
import net.mcreator.createmodpackglue.block.PoorEmeraldOreBlock;
import net.mcreator.createmodpackglue.block.PoorDiamondOreBlock;
import net.mcreator.createmodpackglue.block.PoorCopperOreBlock;
import net.mcreator.createmodpackglue.block.PoorCobaltOreBlock;
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
	public static final RegistryObject<Block> POOR_COPPER_ORE = REGISTRY.register("poor_copper_ore", () -> new PoorCopperOreBlock());
	public static final RegistryObject<Block> RICH_COPPER_ORE = REGISTRY.register("rich_copper_ore", () -> new RichCopperOreBlock());
	public static final RegistryObject<Block> POOR_ZINC_ORE = REGISTRY.register("poor_zinc_ore", () -> new PoorZincOreBlock());
	public static final RegistryObject<Block> RICH_ZINC_ORE = REGISTRY.register("rich_zinc_ore", () -> new RichZincOreBlock());
	public static final RegistryObject<Block> POOR_GOLD_ORE = REGISTRY.register("poor_gold_ore", () -> new PoorGoldOreBlock());
	public static final RegistryObject<Block> RICH_GOLD_ORE = REGISTRY.register("rich_gold_ore", () -> new RichGoldOreBlock());
	public static final RegistryObject<Block> POOR_COBALT_ORE = REGISTRY.register("poor_cobalt_ore", () -> new PoorCobaltOreBlock());
	public static final RegistryObject<Block> RICH_COBALT_ORE = REGISTRY.register("rich_cobalt_ore", () -> new RichCobaltOreBlock());
	public static final RegistryObject<Block> POOR_SILVER_ORE = REGISTRY.register("poor_silver_ore", () -> new PoorSilverOreBlock());
	public static final RegistryObject<Block> RICH_SILVER_ORE = REGISTRY.register("rich_silver_ore", () -> new RichSilverOreBlock());
	public static final RegistryObject<Block> POOR_REDSTONE_ORE = REGISTRY.register("poor_redstone_ore", () -> new PoorRedstoneOreBlock());
	public static final RegistryObject<Block> RICH_REDSTONE_ORE = REGISTRY.register("rich_redstone_ore", () -> new RichRedstoneOreBlock());
	public static final RegistryObject<Block> POOR_DIAMOND_ORE = REGISTRY.register("poor_diamond_ore", () -> new PoorDiamondOreBlock());
	public static final RegistryObject<Block> RICH_DIAMOND_ORE = REGISTRY.register("rich_diamond_ore", () -> new RichDiamondOreBlock());
	public static final RegistryObject<Block> POOR_EMERALD_ORE = REGISTRY.register("poor_emerald_ore", () -> new PoorEmeraldOreBlock());
	public static final RegistryObject<Block> RICH_EMERALD_ORE = REGISTRY.register("rich_emerald_ore", () -> new RichEmeraldOreBlock());
}
