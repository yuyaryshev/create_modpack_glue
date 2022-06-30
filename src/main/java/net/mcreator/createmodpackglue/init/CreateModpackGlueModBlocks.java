
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
import net.mcreator.createmodpackglue.block.PistonBlockerBlock;
import net.mcreator.createmodpackglue.block.MoltenCleanerBlock;
import net.mcreator.createmodpackglue.block.GenZincRichBlock;
import net.mcreator.createmodpackglue.block.GenZincPoorBlock;
import net.mcreator.createmodpackglue.block.GenSilverRichBlock;
import net.mcreator.createmodpackglue.block.GenSilverPoorBlock;
import net.mcreator.createmodpackglue.block.GenRedstoneRichBlock;
import net.mcreator.createmodpackglue.block.GenRedstonePoorBlock;
import net.mcreator.createmodpackglue.block.GenIronRichBlock;
import net.mcreator.createmodpackglue.block.GenIronPoorBlock;
import net.mcreator.createmodpackglue.block.GenGoldRichBlock;
import net.mcreator.createmodpackglue.block.GenGoldPoorBlock;
import net.mcreator.createmodpackglue.block.GenEmeraldRichBlock;
import net.mcreator.createmodpackglue.block.GenEmeraldPoorBlock;
import net.mcreator.createmodpackglue.block.GenDiamondRichBlock;
import net.mcreator.createmodpackglue.block.GenDiamondPoorBlock;
import net.mcreator.createmodpackglue.block.GenCopperPoorBlock;
import net.mcreator.createmodpackglue.block.GenCooperRichBlock;
import net.mcreator.createmodpackglue.block.GenCobaltRichBlock;
import net.mcreator.createmodpackglue.block.GenCobaltPoorBlock;
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
	public static final RegistryObject<Block> GEN_IRON_POOR = REGISTRY.register("gen_iron_poor", () -> new GenIronPoorBlock());
	public static final RegistryObject<Block> PISTON_BLOCKER = REGISTRY.register("piston_blocker", () -> new PistonBlockerBlock());
	public static final RegistryObject<Block> GEN_IRON_RICH = REGISTRY.register("gen_iron_rich", () -> new GenIronRichBlock());
	public static final RegistryObject<Block> GEN_COPPER_POOR = REGISTRY.register("gen_copper_poor", () -> new GenCopperPoorBlock());
	public static final RegistryObject<Block> GEN_COOPER_RICH = REGISTRY.register("gen_cooper_rich", () -> new GenCooperRichBlock());
	public static final RegistryObject<Block> GEN_ZINC_POOR = REGISTRY.register("gen_zinc_poor", () -> new GenZincPoorBlock());
	public static final RegistryObject<Block> GEN_ZINC_RICH = REGISTRY.register("gen_zinc_rich", () -> new GenZincRichBlock());
	public static final RegistryObject<Block> GEN_GOLD_POOR = REGISTRY.register("gen_gold_poor", () -> new GenGoldPoorBlock());
	public static final RegistryObject<Block> GEN_GOLD_RICH = REGISTRY.register("gen_gold_rich", () -> new GenGoldRichBlock());
	public static final RegistryObject<Block> GEN_COBALT_POOR = REGISTRY.register("gen_cobalt_poor", () -> new GenCobaltPoorBlock());
	public static final RegistryObject<Block> GEN_COBALT_RICH = REGISTRY.register("gen_cobalt_rich", () -> new GenCobaltRichBlock());
	public static final RegistryObject<Block> GEN_SILVER_POOR = REGISTRY.register("gen_silver_poor", () -> new GenSilverPoorBlock());
	public static final RegistryObject<Block> GEN_SILVER_RICH = REGISTRY.register("gen_silver_rich", () -> new GenSilverRichBlock());
	public static final RegistryObject<Block> GEN_REDSTONE_POOR = REGISTRY.register("gen_redstone_poor", () -> new GenRedstonePoorBlock());
	public static final RegistryObject<Block> GEN_REDSTONE_RICH = REGISTRY.register("gen_redstone_rich", () -> new GenRedstoneRichBlock());
	public static final RegistryObject<Block> GEN_DIAMOND_POOR = REGISTRY.register("gen_diamond_poor", () -> new GenDiamondPoorBlock());
	public static final RegistryObject<Block> GEN_DIAMOND_RICH = REGISTRY.register("gen_diamond_rich", () -> new GenDiamondRichBlock());
	public static final RegistryObject<Block> GEN_EMERALD_POOR = REGISTRY.register("gen_emerald_poor", () -> new GenEmeraldPoorBlock());
	public static final RegistryObject<Block> GEN_EMERALD_RICH = REGISTRY.register("gen_emerald_rich", () -> new GenEmeraldRichBlock());
}
