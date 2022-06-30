
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmodpackglue.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createmodpackglue.item.ZincGrainItem;
import net.mcreator.createmodpackglue.item.WeaponMoltedSteelItem;
import net.mcreator.createmodpackglue.item.WeaponMoltedIronItem;
import net.mcreator.createmodpackglue.item.WeaponMoltedDiamondItem;
import net.mcreator.createmodpackglue.item.SteelWeaponIngotItem;
import net.mcreator.createmodpackglue.item.SmallFoodPackItem;
import net.mcreator.createmodpackglue.item.SmallCogwheelPackItem;
import net.mcreator.createmodpackglue.item.SilverGrainItem;
import net.mcreator.createmodpackglue.item.RawZincNuggetItem;
import net.mcreator.createmodpackglue.item.RawSilverNuggetItem;
import net.mcreator.createmodpackglue.item.RawPoorZincOreItem;
import net.mcreator.createmodpackglue.item.RawPoorSilverOreItem;
import net.mcreator.createmodpackglue.item.RawPoorRedstoneOreItem;
import net.mcreator.createmodpackglue.item.RawPoorIronOreItem;
import net.mcreator.createmodpackglue.item.RawPoorGoldOreItem;
import net.mcreator.createmodpackglue.item.RawPoorEmeraldOreItem;
import net.mcreator.createmodpackglue.item.RawPoorDiamondOreItem;
import net.mcreator.createmodpackglue.item.RawPoorCopperOreItem;
import net.mcreator.createmodpackglue.item.RawPoorCobaltOreItem;
import net.mcreator.createmodpackglue.item.RawIronNuggetItem;
import net.mcreator.createmodpackglue.item.RawGoldNuggetItem;
import net.mcreator.createmodpackglue.item.RawCopperNuggetItem;
import net.mcreator.createmodpackglue.item.RawCobaltNuggetItem;
import net.mcreator.createmodpackglue.item.MoltenCleanerItem;
import net.mcreator.createmodpackglue.item.IronWeaponIngotItem;
import net.mcreator.createmodpackglue.item.IronGrainItem;
import net.mcreator.createmodpackglue.item.InpureRedstoneDustItem;
import net.mcreator.createmodpackglue.item.InpureNetheriteDustItem;
import net.mcreator.createmodpackglue.item.InpureEmeraldDustItem;
import net.mcreator.createmodpackglue.item.InpureDiamondDustItem;
import net.mcreator.createmodpackglue.item.GoldGrainItem;
import net.mcreator.createmodpackglue.item.EmeraldDustItem;
import net.mcreator.createmodpackglue.item.DiamondWeaponIngotItem;
import net.mcreator.createmodpackglue.item.DiamondWeaponCompositeItem;
import net.mcreator.createmodpackglue.item.DiamondDustItem;
import net.mcreator.createmodpackglue.item.CopperGrainItem;
import net.mcreator.createmodpackglue.item.CobaltGrainItem;
import net.mcreator.createmodpackglue.item.CleaningCompositeItem;
import net.mcreator.createmodpackglue.item.BigFoodPackItem;
import net.mcreator.createmodpackglue.item.BigCogwheelPackItem;
import net.mcreator.createmodpackglue.item.AdvMoltenCleanerItem;
import net.mcreator.createmodpackglue.item.AdvCleaningCompositeItem;
import net.mcreator.createmodpackglue.item.AdvCleaningComponentItem;
import net.mcreator.createmodpackglue.CreateModpackGlueMod;

public class CreateModpackGlueModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateModpackGlueMod.MODID);
	public static final RegistryObject<Item> IRON_WEAPON_INGOT = REGISTRY.register("iron_weapon_ingot", () -> new IronWeaponIngotItem());
	public static final RegistryObject<Item> STEEL_WEAPON_INGOT = REGISTRY.register("steel_weapon_ingot", () -> new SteelWeaponIngotItem());
	public static final RegistryObject<Item> INPURE_NETHERITE_DUST = REGISTRY.register("inpure_netherite_dust", () -> new InpureNetheriteDustItem());
	public static final RegistryObject<Item> SMALL_FOOD_PACK = REGISTRY.register("small_food_pack", () -> new SmallFoodPackItem());
	public static final RegistryObject<Item> DIAMOND_WEAPON_INGOT = REGISTRY.register("diamond_weapon_ingot", () -> new DiamondWeaponIngotItem());
	public static final RegistryObject<Item> DIAMOND_WEAPON_COMPOSITE = REGISTRY.register("diamond_weapon_composite",
			() -> new DiamondWeaponCompositeItem());
	public static final RegistryObject<Item> SMALL_COGWHEEL_PACK = REGISTRY.register("small_cogwheel_pack", () -> new SmallCogwheelPackItem());
	public static final RegistryObject<Item> CLEANING_COMPOSITE = REGISTRY.register("cleaning_composite", () -> new CleaningCompositeItem());
	public static final RegistryObject<Item> BIG_FOOD_PACK = REGISTRY.register("big_food_pack", () -> new BigFoodPackItem());
	public static final RegistryObject<Item> BIG_COGWHEEL_PACK = REGISTRY.register("big_cogwheel_pack", () -> new BigCogwheelPackItem());
	public static final RegistryObject<Item> ADV_CLEANING_COMPOSITE = REGISTRY.register("adv_cleaning_composite",
			() -> new AdvCleaningCompositeItem());
	public static final RegistryObject<Item> ADV_CLEANING_COMPONENT = REGISTRY.register("adv_cleaning_component",
			() -> new AdvCleaningComponentItem());
	public static final RegistryObject<Item> MOLTEN_CLEANER_BUCKET = REGISTRY.register("molten_cleaner_bucket", () -> new MoltenCleanerItem());
	public static final RegistryObject<Item> ADV_MOLTEN_CLEANER_BUCKET = REGISTRY.register("adv_molten_cleaner_bucket",
			() -> new AdvMoltenCleanerItem());
	public static final RegistryObject<Item> WEAPON_MOLTED_DIAMOND_BUCKET = REGISTRY.register("weapon_molted_diamond_bucket",
			() -> new WeaponMoltedDiamondItem());
	public static final RegistryObject<Item> WEAPON_MOLTED_IRON_BUCKET = REGISTRY.register("weapon_molted_iron_bucket",
			() -> new WeaponMoltedIronItem());
	public static final RegistryObject<Item> WEAPON_MOLTED_STEEL_BUCKET = REGISTRY.register("weapon_molted_steel_bucket",
			() -> new WeaponMoltedSteelItem());
	public static final RegistryObject<Item> POOR_IRON_ORE = block(CreateModpackGlueModBlocks.POOR_IRON_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_IRON_ORE = block(CreateModpackGlueModBlocks.RICH_IRON_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_IRON_ORE = REGISTRY.register("raw_poor_iron_ore", () -> new RawPoorIronOreItem());
	public static final RegistryObject<Item> IRON_GRAIN = REGISTRY.register("iron_grain", () -> new IronGrainItem());
	public static final RegistryObject<Item> RAW_IRON_NUGGET = REGISTRY.register("raw_iron_nugget", () -> new RawIronNuggetItem());
	public static final RegistryObject<Item> COPPER_GRAIN = REGISTRY.register("copper_grain", () -> new CopperGrainItem());
	public static final RegistryObject<Item> POOR_COPPER_ORE = block(CreateModpackGlueModBlocks.POOR_COPPER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_COPPER_ORE = block(CreateModpackGlueModBlocks.RICH_COPPER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_COPPER_ORE = REGISTRY.register("raw_poor_copper_ore", () -> new RawPoorCopperOreItem());
	public static final RegistryObject<Item> RAW_COPPER_NUGGET = REGISTRY.register("raw_copper_nugget", () -> new RawCopperNuggetItem());
	public static final RegistryObject<Item> POOR_ZINC_ORE = block(CreateModpackGlueModBlocks.POOR_ZINC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_ZINC_ORE = block(CreateModpackGlueModBlocks.RICH_ZINC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_ZINC_ORE = REGISTRY.register("raw_poor_zinc_ore", () -> new RawPoorZincOreItem());
	public static final RegistryObject<Item> ZINC_GRAIN = REGISTRY.register("zinc_grain", () -> new ZincGrainItem());
	public static final RegistryObject<Item> RAW_ZINC_NUGGET = REGISTRY.register("raw_zinc_nugget", () -> new RawZincNuggetItem());
	public static final RegistryObject<Item> POOR_GOLD_ORE = block(CreateModpackGlueModBlocks.POOR_GOLD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_GOLD_ORE = block(CreateModpackGlueModBlocks.RICH_GOLD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_GOLD_ORE = REGISTRY.register("raw_poor_gold_ore", () -> new RawPoorGoldOreItem());
	public static final RegistryObject<Item> GOLD_GRAIN = REGISTRY.register("gold_grain", () -> new GoldGrainItem());
	public static final RegistryObject<Item> RAW_GOLD_NUGGET = REGISTRY.register("raw_gold_nugget", () -> new RawGoldNuggetItem());
	public static final RegistryObject<Item> POOR_COBALT_ORE = block(CreateModpackGlueModBlocks.POOR_COBALT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_COBALT_ORE = block(CreateModpackGlueModBlocks.RICH_COBALT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_COBALT_ORE = REGISTRY.register("raw_poor_cobalt_ore", () -> new RawPoorCobaltOreItem());
	public static final RegistryObject<Item> COBALT_GRAIN = REGISTRY.register("cobalt_grain", () -> new CobaltGrainItem());
	public static final RegistryObject<Item> POOR_SILVER_ORE = block(CreateModpackGlueModBlocks.POOR_SILVER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_SILVER_ORE = block(CreateModpackGlueModBlocks.RICH_SILVER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_SILVER_ORE = REGISTRY.register("raw_poor_silver_ore", () -> new RawPoorSilverOreItem());
	public static final RegistryObject<Item> SILVER_GRAIN = REGISTRY.register("silver_grain", () -> new SilverGrainItem());
	public static final RegistryObject<Item> RAW_SILVER_NUGGET = REGISTRY.register("raw_silver_nugget", () -> new RawSilverNuggetItem());
	public static final RegistryObject<Item> RAW_COBALT_NUGGET = REGISTRY.register("raw_cobalt_nugget", () -> new RawCobaltNuggetItem());
	public static final RegistryObject<Item> POOR_REDSTONE_ORE = block(CreateModpackGlueModBlocks.POOR_REDSTONE_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_REDSTONE_ORE = block(CreateModpackGlueModBlocks.RICH_REDSTONE_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_REDSTONE_ORE = REGISTRY.register("raw_poor_redstone_ore", () -> new RawPoorRedstoneOreItem());
	public static final RegistryObject<Item> INPURE_REDSTONE_DUST = REGISTRY.register("inpure_redstone_dust", () -> new InpureRedstoneDustItem());
	public static final RegistryObject<Item> POOR_DIAMOND_ORE = block(CreateModpackGlueModBlocks.POOR_DIAMOND_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_DIAMOND_ORE = block(CreateModpackGlueModBlocks.RICH_DIAMOND_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_DIAMOND_ORE = REGISTRY.register("raw_poor_diamond_ore", () -> new RawPoorDiamondOreItem());
	public static final RegistryObject<Item> INPURE_DIAMOND_DUST = REGISTRY.register("inpure_diamond_dust", () -> new InpureDiamondDustItem());
	public static final RegistryObject<Item> DIAMOND_DUST = REGISTRY.register("diamond_dust", () -> new DiamondDustItem());
	public static final RegistryObject<Item> POOR_EMERALD_ORE = block(CreateModpackGlueModBlocks.POOR_EMERALD_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RICH_EMERALD_ORE = block(CreateModpackGlueModBlocks.RICH_EMERALD_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_POOR_EMERALD_ORE = REGISTRY.register("raw_poor_emerald_ore", () -> new RawPoorEmeraldOreItem());
	public static final RegistryObject<Item> INPURE_EMERALD_DUST = REGISTRY.register("inpure_emerald_dust", () -> new InpureEmeraldDustItem());
	public static final RegistryObject<Item> EMERALD_DUST = REGISTRY.register("emerald_dust", () -> new EmeraldDustItem());
	public static final RegistryObject<Item> GEN_IRON_POOR = block(CreateModpackGlueModBlocks.GEN_IRON_POOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PISTON_BLOCKER = block(CreateModpackGlueModBlocks.PISTON_BLOCKER, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
