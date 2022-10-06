package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import me.rugglestech.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RTBlockTags extends BlockTagsProvider {

    public RTBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, RugglesTech.MODID, helper);
        tag(Registration.MYSTERIOUS_ORE)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());

    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get())
                .add(Registration.LV_MACHINE_HULL.get())
                .add(Registration.MYSTERIOUS_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get())
                .add(Registration.LV_MACHINE_HULL.get())
                .add(Registration.MYSTERIOUS_BLOCK.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "RugglesTech Tags";
    }
}
