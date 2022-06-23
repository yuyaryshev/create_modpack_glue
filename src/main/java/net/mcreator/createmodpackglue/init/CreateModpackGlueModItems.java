
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

import net.mcreator.createmodpackglue.item.WeaponMoltedSteelItem;
import net.mcreator.createmodpackglue.item.WeaponMoltedIronItem;
import net.mcreator.createmodpackglue.item.WeaponMoltedDiamondItem;
import net.mcreator.createmodpackglue.item.SteelWeaponIngotItem;
import net.mcreator.createmodpackglue.item.SmallFoodPackItem;
import net.mcreator.createmodpackglue.item.SmallCogwheelPackItem;
import net.mcreator.createmodpackglue.item.RawPoorIronOreItem;
import net.mcreator.createmodpackglue.item.RawIronNuggetItem;
import net.mcreator.createmodpackglue.item.MoltenCleanerItem;
import net.mcreator.createmodpackglue.item.IronWeaponIngotItem;
import net.mcreator.createmodpackglue.item.IronGrainItem;
import net.mcreator.createmodpackglue.item.InpureNetheriteDustItem;
import net.mcreator.createmodpackglue.item.DiamondWeaponIngotItem;
import net.mcreator.createmodpackglue.item.DiamondWeaponCompositeItem;
import net.mcreator.createmodpackglue.item.CopperGrainItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
