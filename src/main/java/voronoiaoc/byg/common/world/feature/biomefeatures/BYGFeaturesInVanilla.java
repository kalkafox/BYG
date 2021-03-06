package voronoiaoc.byg.common.world.feature.biomefeatures;//package voronoiaoc.byg.common.world.feature.biomefeatures;
//

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BuiltInBiomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import voronoiaoc.byg.core.byglists.BYGConfiguredFeatures;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class BYGFeaturesInVanilla {
    public static void addFeatures() {

        for (Biome biome : BuiltinRegistries.BIOME) {
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStep.Feature.UNDERGROUND_ORES, BYGConfiguredFeatures.ORE_ROCKY_STONE);
                addFeatureToBiome(biome, GenerationStep.Feature.UNDERGROUND_ORES, BYGConfiguredFeatures.ORE_SCORIA_STONE);
                addFeatureToBiome(biome, GenerationStep.Feature.UNDERGROUND_ORES, BYGConfiguredFeatures.ORE_SOAP_STONE);
            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.FOREST) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.PLAINS)) {

                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ROSE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ANGELICA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));

            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.TAIGA) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.TAIGA_MOUNTAINS)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUEBERRY_BUSH_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.JUNGLE) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.JUNGLE_HILLS)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEGONIA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BISTORT_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GUZMANIA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.INCAN_LILY_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LAZARUS_BELLFLOWER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TORCH_GINGER_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RICHEA_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
            }

//            if (biome == BuiltInBiomes.JUNGLE) {
//                biome.add//StructureFeature(BYGFeatureList.BYGVILLAGE.configure(new VillageConfig("byg:village/jungle/town_centers"), 6));
//                //biome.addFeature(GenerationStep.Feature.SURFACE_STRUCTURES, BYGFeatureList.BYGVILLAGE.configure(new VillageConfig("byg:village/jungle/town_centers", 6)).decorate(Decorator.NOPE.configure(DecoratorConfig.DEFAULT)));
//
//            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.DESERT) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.DESERT_HILLS)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MINI_CACTUS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.SWAMP) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.SWAMP_HILLS)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TINY_LILYPAD_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WILTED_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
            }

            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.BEACH)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEACH_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_BEACH_GRASS_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
            }
            if (biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.DARK_FOREST) || biome == BuiltinRegistries.BIOME.get(BuiltInBiomes.FOREST)) {
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LEAF_PILE_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GREEN_MUSHROOM_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WOOD_BLEWIT_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WEEPING_MILKCAP_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
                //biome.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLACK_PUFF_CONFIG).decorate(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));

            }
        }
    }


    //Use these to add our features to vanilla's biomes.
    public static void addFeatureToBiome(Biome biome, GenerationStep.Feature feature, ConfiguredFeature<?, ?> configuredFeature) {
        ConvertImmutableFeatures(biome);
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = biome.getGenerationSettings().features;
        while (biomeFeatures.size() <= feature.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        biomeFeatures.get(feature.ordinal()).add(() -> configuredFeature);

    }

    private static void ConvertImmutableFeatures(Biome biome) {
        if (biome.getGenerationSettings().features instanceof ImmutableList) {
            biome.getGenerationSettings().features = biome.getGenerationSettings().features.stream().map(Lists::newArrayList).collect(Collectors.toList());
        }
    }
}
