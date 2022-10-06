package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import me.rugglestech.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RTBlockStates extends BlockStateProvider {

    public RTBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, RugglesTech.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.MYSTERIOUS_ORE_OVERWORLD.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_NETHER.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_END.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
        simpleBlock(Registration.MYSTERIOUS_BLOCK.get());
        simpleBlock(Registration.LV_MACHINE_HULL.get());
    }


}
