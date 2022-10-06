package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import me.rugglestech.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RTItemModels extends ItemModelProvider {

    public RTItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, RugglesTech.MODID, existingFileHelper);
        singleTexture(Registration.RAW_MYSTERIOUS_CHUNK.getId().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(Registration.MYSTERIOUS_INGOT.getId().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/mysterious_ingot"));


    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.getId().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(Registration.MYSTERIOUS_ORE_NETHER_ITEM.getId().getPath(), modLoc("block/mysterious_ore_nether"));
        withExistingParent(Registration.MYSTERIOUS_ORE_END_ITEM.getId().getPath(), modLoc("block/mysterious_ore_end"));
        withExistingParent(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.getId().getPath(), modLoc("block/mysterious_ore_deepslate"));
        withExistingParent(Registration.MYSTERIOUS_BLOCK.getId().getPath(), modLoc("block/mysterious_block"));
        withExistingParent(Registration.LV_MACHINE_HULL.getId().getPath(), modLoc("block/lv_machine_hull"));
    }
}
