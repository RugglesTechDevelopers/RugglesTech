package me.rugglestech.datagen;

import me.rugglestech.setup.Registration;
import net.minecraft.data.DataGenerator;


public class RTLootTables extends BaseLootTableProvider {

    public RTLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);

    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), createSilkTouchTable("mysterious_ore_overworld", Registration.MYSTERIOUS_ORE_OVERWORLD.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_NETHER.get(), createSilkTouchTable("mysterious_ore_nether", Registration.MYSTERIOUS_ORE_NETHER.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_END.get(), createSilkTouchTable("mysterious_ore_end", Registration.MYSTERIOUS_ORE_END.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), createSilkTouchTable("mysterious_ore_deepslate", Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), Registration.RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(Registration.MYSTERIOUS_BLOCK.get(), createSimpleTable("mysterious_block", Registration.MYSTERIOUS_BLOCK.get()));
        lootTables.put(Registration.LV_MACHINE_HULL.get(), createSimpleTable("lv_machine_hull", Registration.LV_MACHINE_HULL.get()));
    }
}
