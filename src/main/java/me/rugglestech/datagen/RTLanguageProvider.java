package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import me.rugglestech.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static me.rugglestech.setup.ModSetup.TAB_NAME;

public class RTLanguageProvider extends LanguageProvider {

    public RTLanguageProvider(DataGenerator gen, String locale) {
        super(gen, RugglesTech.MODID, locale);
        add(Registration.RAW_MYSTERIOUS_CHUNK.get(), "Mysterious Raw Chunk");
        add(Registration.MYSTERIOUS_INGOT.get(), "Mysterious Ingot");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");
        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_BLOCK.get(), "Mysterious Block");
        add(Registration.LV_MACHINE_HULL.get(), "LV Machine Hull");
    }
}
