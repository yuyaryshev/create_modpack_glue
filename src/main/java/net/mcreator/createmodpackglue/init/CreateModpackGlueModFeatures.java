
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmodpackglue.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.createmodpackglue.world.features.ores.GenZincRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenZincPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenSilverRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenSilverPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenRedstoneRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenRedstonePoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenIronRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenIronPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenGoldRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenGoldPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenEmeraldRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenEmeraldPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenDiamondRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenDiamondPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenCopperPoorFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenCooperRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenCobaltRichFeature;
import net.mcreator.createmodpackglue.world.features.ores.GenCobaltPoorFeature;
import net.mcreator.createmodpackglue.CreateModpackGlueMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CreateModpackGlueModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CreateModpackGlueMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> GEN_IRON_POOR = register("gen_iron_poor", GenIronPoorFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenIronPoorFeature.GENERATE_BIOMES, GenIronPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_IRON_RICH = register("gen_iron_rich", GenIronRichFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenIronRichFeature.GENERATE_BIOMES, GenIronRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_COPPER_POOR = register("gen_copper_poor", GenCopperPoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenCopperPoorFeature.GENERATE_BIOMES,
					GenCopperPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_COOPER_RICH = register("gen_cooper_rich", GenCooperRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenCooperRichFeature.GENERATE_BIOMES,
					GenCooperRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_ZINC_POOR = register("gen_zinc_poor", GenZincPoorFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenZincPoorFeature.GENERATE_BIOMES, GenZincPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_ZINC_RICH = register("gen_zinc_rich", GenZincRichFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenZincRichFeature.GENERATE_BIOMES, GenZincRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_GOLD_POOR = register("gen_gold_poor", GenGoldPoorFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenGoldPoorFeature.GENERATE_BIOMES, GenGoldPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_GOLD_RICH = register("gen_gold_rich", GenGoldRichFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GenGoldRichFeature.GENERATE_BIOMES, GenGoldRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_COBALT_POOR = register("gen_cobalt_poor", GenCobaltPoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenCobaltPoorFeature.GENERATE_BIOMES,
					GenCobaltPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_COBALT_RICH = register("gen_cobalt_rich", GenCobaltRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenCobaltRichFeature.GENERATE_BIOMES,
					GenCobaltRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_SILVER_POOR = register("gen_silver_poor", GenSilverPoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenSilverPoorFeature.GENERATE_BIOMES,
					GenSilverPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_SILVER_RICH = register("gen_silver_rich", GenSilverRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenSilverRichFeature.GENERATE_BIOMES,
					GenSilverRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_REDSTONE_POOR = register("gen_redstone_poor", GenRedstonePoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenRedstonePoorFeature.GENERATE_BIOMES,
					GenRedstonePoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_REDSTONE_RICH = register("gen_redstone_rich", GenRedstoneRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenRedstoneRichFeature.GENERATE_BIOMES,
					GenRedstoneRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_DIAMOND_POOR = register("gen_diamond_poor", GenDiamondPoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenDiamondPoorFeature.GENERATE_BIOMES,
					GenDiamondPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_DIAMOND_RICH = register("gen_diamond_rich", GenDiamondRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenDiamondRichFeature.GENERATE_BIOMES,
					GenDiamondRichFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_EMERALD_POOR = register("gen_emerald_poor", GenEmeraldPoorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenEmeraldPoorFeature.GENERATE_BIOMES,
					GenEmeraldPoorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEN_EMERALD_RICH = register("gen_emerald_rich", GenEmeraldRichFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GenEmeraldRichFeature.GENERATE_BIOMES,
					GenEmeraldRichFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
