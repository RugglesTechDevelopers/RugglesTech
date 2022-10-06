package me.rugglestech.datagen;

import me.rugglestech.RugglesTech;
import me.rugglestech.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class RTRecipes extends RecipeProvider {

    public RTRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.MYSTERIOUS_ORE_ITEM),
                        Registration.MYSTERIOUS_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.MYSTERIOUS_ORE_ITEM))
                .save(consumer, "mysterious_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_MYSTERIOUS_CHUNK.get()),
                        Registration.MYSTERIOUS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_MYSTERIOUS_CHUNK.get()))
                .save(consumer, "mysterious_ingot2");
        ShapedRecipeBuilder.shaped(Registration.MYSTERIOUS_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.MYSTERIOUS_INGOT.get())
                .group("rugglestech")
                .unlockedBy("mysterious", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MYSTERIOUS_INGOT.get()))
                .save(consumer);
    }
}
