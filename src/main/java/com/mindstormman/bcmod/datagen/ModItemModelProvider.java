package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ArbutusWood;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.YellowCedarWood;
import com.mindstormman.bcmod.block.custom.SaskatoonBerryBushBlock;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BCMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GOOSE_EGG);
        simpleItem(ModItems.GOOSE_FEATHER);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.RHODONITE);
        simpleItem(ModItems.RHODONITE_HEART);
        simpleItem(ModItems.RAW_RHODONITE);
        simpleItem(ModItems.SASKATOON_BERRY);
        simpleItem(ModItems.SNOWBERRY);

        //Cedar
        simpleBlockItem(CedarWood.CEDAR_DOOR);
        fenceItem(CedarWood.CEDAR_FENCE, CedarWood.CEDAR_PLANKS);
        buttonItem(CedarWood.CEDAR_BUTTON, CedarWood.CEDAR_PLANKS);
        trapdoorItem(CedarWood.CEDAR_TRAPDOOR);
        evenSimplerBlockItem(CedarWood.CEDAR_STAIRS);
        evenSimplerBlockItem(CedarWood.CEDAR_SLAB);
        evenSimplerBlockItem(CedarWood.CEDAR_PRESSURE_PLATE);
        evenSimplerBlockItem(CedarWood.CEDAR_FENCE_GATE);

        //Yellow Cedar
        simpleBlockItem(YellowCedarWood.YELLOW_CEDAR_DOOR);
        fenceItem(YellowCedarWood.YELLOW_CEDAR_FENCE, YellowCedarWood.YELLOW_CEDAR_PLANKS);
        buttonItem(YellowCedarWood.YELLOW_CEDAR_BUTTON, YellowCedarWood.YELLOW_CEDAR_PLANKS);
        trapdoorItem(YellowCedarWood.YELLOW_CEDAR_TRAPDOOR);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_STAIRS);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_SLAB);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_FENCE_GATE);

        //Arbutus
        simpleBlockItem(ArbutusWood.ARBUTUS_DOOR);
        fenceItem(ArbutusWood.ARBUTUS_FENCE, ArbutusWood.ARBUTUS_PLANKS);
        buttonItem(ArbutusWood.ARBUTUS_BUTTON, ArbutusWood.ARBUTUS_PLANKS);
        trapdoorItem(ArbutusWood.ARBUTUS_TRAPDOOR);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_STAIRS);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_SLAB);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_PRESSURE_PLATE);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_FENCE_GATE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BCMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(BCMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BCMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
