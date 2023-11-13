package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.YellowCedarWood;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RHODONITE_SMELTABLES = List.of(ModItems.RHODONITE.get(),
    ModBlocks.RHODONITE_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, RHODONITE_SMELTABLES, RecipeCategory.MISC, ModItems.RHODONITE.get(), 0.25f, 100, "rhodonite");
        oreSmelting(pWriter, RHODONITE_SMELTABLES, RecipeCategory.MISC, ModItems.RHODONITE.get(), 0.25f, 200, "rhodonite");


        //Rhodonite
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHODONITE_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RHODONITE.get())
                .unlockedBy(getHasName(ModItems.RHODONITE.get()), has(ModItems.RHODONITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RHODONITE_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RAW_RHODONITE.get())
                .unlockedBy(getHasName(ModItems.RAW_RHODONITE.get()), has(ModItems.RAW_RHODONITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODONITE_HEART.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern(" R ")
                .define('R', ModItems.RAW_RHODONITE.get())
                .unlockedBy(getHasName(ModItems.RAW_RHODONITE.get()), has(ModItems.RAW_RHODONITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHODONITE.get(), 9)
                .requires(ModBlocks.RHODONITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RHODONITE_BLOCK.get()), has(ModBlocks.RHODONITE_BLOCK.get()))
                .save(pWriter);

        //Wood

        //Yellow Cedar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_PLANKS.get(), 9)
                .requires(YellowCedarWood.YELLOW_CEDAR_LOG.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_LOG.get()), has(YellowCedarWood.YELLOW_CEDAR_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_SLAB.get(), 3)
                .pattern("###")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_BUTTON.get())
                .requires(YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE.get())
                .pattern("## ")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_FENCE.get(), 3)
                .pattern("#S#")
                .pattern("#S#")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_FENCE_GATE.get())
                .pattern("S#S")
                .pattern("S#S")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_DOOR.get(), 3)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, YellowCedarWood.YELLOW_CEDAR_TRAPDOOR.get(), 3)
                .pattern("###")
                .pattern("###")
                .define('#', YellowCedarWood.YELLOW_CEDAR_PLANKS.get())
                .unlockedBy(getHasName(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), has(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()))
                .save(pWriter);

        //Cedar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CedarWood.CEDAR_PLANKS.get(), 9)
                .requires(CedarWood.CEDAR_LOG.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_LOG.get()), has(CedarWood.CEDAR_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_SLAB.get(), 3)
                .pattern("###")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CedarWood.CEDAR_BUTTON.get())
                .requires(CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_PRESSURE_PLATE.get())
                .pattern("## ")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_FENCE.get(), 3)
                .pattern("#S#")
                .pattern("#S#")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_FENCE_GATE.get())
                .pattern("S#S")
                .pattern("S#S")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_DOOR.get(), 3)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CedarWood.CEDAR_TRAPDOOR.get(), 3)
                .pattern("###")
                .pattern("###")
                .define('#', CedarWood.CEDAR_PLANKS.get())
                .unlockedBy(getHasName(CedarWood.CEDAR_PLANKS.get()), has(CedarWood.CEDAR_PLANKS.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, BCMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
