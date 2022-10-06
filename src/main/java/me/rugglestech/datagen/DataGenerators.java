package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RugglesTech.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new RTRecipes(generator));
        generator.addProvider(event.includeServer(), new RTLootTables(generator));
        RTBlockTags blockTags = new RTBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new RTItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new RTBlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new RTItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new RTLanguageProvider(generator, "en_us"));
    }
}
