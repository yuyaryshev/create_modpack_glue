
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmodpackglue.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.createmodpackglue.fluid.WeaponMoltedSteelFluid;
import net.mcreator.createmodpackglue.fluid.WeaponMoltedIronFluid;
import net.mcreator.createmodpackglue.fluid.WeaponMoltedDiamondFluid;
import net.mcreator.createmodpackglue.fluid.MoltenCleanerFluid;
import net.mcreator.createmodpackglue.fluid.AdvMoltenCleanerFluid;
import net.mcreator.createmodpackglue.CreateModpackGlueMod;

public class CreateModpackGlueModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateModpackGlueMod.MODID);
	public static final RegistryObject<Fluid> MOLTEN_CLEANER = REGISTRY.register("molten_cleaner", () -> new MoltenCleanerFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MOLTEN_CLEANER = REGISTRY.register("flowing_molten_cleaner",
			() -> new MoltenCleanerFluid.Flowing());
	public static final RegistryObject<Fluid> ADV_MOLTEN_CLEANER = REGISTRY.register("adv_molten_cleaner", () -> new AdvMoltenCleanerFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ADV_MOLTEN_CLEANER = REGISTRY.register("flowing_adv_molten_cleaner",
			() -> new AdvMoltenCleanerFluid.Flowing());
	public static final RegistryObject<Fluid> WEAPON_MOLTED_DIAMOND = REGISTRY.register("weapon_molted_diamond",
			() -> new WeaponMoltedDiamondFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WEAPON_MOLTED_DIAMOND = REGISTRY.register("flowing_weapon_molted_diamond",
			() -> new WeaponMoltedDiamondFluid.Flowing());
	public static final RegistryObject<Fluid> WEAPON_MOLTED_IRON = REGISTRY.register("weapon_molted_iron", () -> new WeaponMoltedIronFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WEAPON_MOLTED_IRON = REGISTRY.register("flowing_weapon_molted_iron",
			() -> new WeaponMoltedIronFluid.Flowing());
	public static final RegistryObject<Fluid> WEAPON_MOLTED_STEEL = REGISTRY.register("weapon_molted_steel",
			() -> new WeaponMoltedSteelFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WEAPON_MOLTED_STEEL = REGISTRY.register("flowing_weapon_molted_steel",
			() -> new WeaponMoltedSteelFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_CLEANER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_CLEANER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ADV_MOLTEN_CLEANER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ADV_MOLTEN_CLEANER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WEAPON_MOLTED_DIAMOND.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WEAPON_MOLTED_DIAMOND.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WEAPON_MOLTED_IRON.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WEAPON_MOLTED_IRON.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WEAPON_MOLTED_STEEL.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WEAPON_MOLTED_STEEL.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
