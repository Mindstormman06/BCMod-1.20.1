package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ArbutusWood;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.YellowCedarWood;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BCMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Rhodonite
        blockWithItem(ModBlocks.RHODONITE_BLOCK);
        blockWithItem(ModBlocks.RHODONITE_ORE);
        blockWithItem(ModBlocks.RAW_RHODONITE_BLOCK);

        //Cedar
        blockItem(CedarWood.CEDAR_LOG);
        blockItem(CedarWood.CEDAR_WOOD);
        blockItem(CedarWood.STRIPPED_CEDAR_LOG);
        blockItem(CedarWood.STRIPPED_CEDAR_WOOD);
        blockWithItem(CedarWood.CEDAR_PLANKS);

        logBlock(((RotatedPillarBlock) CedarWood.CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) CedarWood.CEDAR_WOOD.get()), blockTexture(CedarWood.CEDAR_LOG.get()), blockTexture(CedarWood.CEDAR_LOG.get()));

        axisBlock(((RotatedPillarBlock) CedarWood.STRIPPED_CEDAR_LOG.get()), blockTexture(CedarWood.STRIPPED_CEDAR_LOG.get()),
                new ResourceLocation(BCMod.MOD_ID, "block/stripped_cedar_log_top"));
        axisBlock(((RotatedPillarBlock) CedarWood.STRIPPED_CEDAR_WOOD.get()), blockTexture(CedarWood.STRIPPED_CEDAR_LOG.get()),
                blockTexture(CedarWood.STRIPPED_CEDAR_LOG.get()));

        stairsBlock(((StairBlock) CedarWood.CEDAR_STAIRS.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        slabBlock(((SlabBlock) CedarWood.CEDAR_SLAB.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        buttonBlock(((ButtonBlock) CedarWood.CEDAR_BUTTON.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) CedarWood.CEDAR_PRESSURE_PLATE.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        fenceBlock(((FenceBlock) CedarWood.CEDAR_FENCE.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) CedarWood.CEDAR_FENCE_GATE.get()), blockTexture(CedarWood.CEDAR_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) CedarWood.CEDAR_DOOR.get()), modLoc("block/cedar_door_bottom"), modLoc("block/cedar_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) CedarWood.CEDAR_TRAPDOOR.get()), modLoc("block/cedar_trapdoor"), true, "cutout");

        //Yellow Cedar
        blockItem(YellowCedarWood.YELLOW_CEDAR_LOG);
        blockItem(YellowCedarWood.YELLOW_CEDAR_WOOD);
        blockItem(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG);
        blockItem(YellowCedarWood.STRIPPED_YELLOW_CEDAR_WOOD);
        blockWithItem(YellowCedarWood.YELLOW_CEDAR_PLANKS);

        logBlock(((RotatedPillarBlock) YellowCedarWood.YELLOW_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) YellowCedarWood.YELLOW_CEDAR_WOOD.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_LOG.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_LOG.get()));

        axisBlock(((RotatedPillarBlock) YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get()), blockTexture(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get()),
                new ResourceLocation(BCMod.MOD_ID, "block/stripped_yellow_cedar_log_top"));
        axisBlock(((RotatedPillarBlock) YellowCedarWood.STRIPPED_YELLOW_CEDAR_WOOD.get()), blockTexture(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get()),
                blockTexture(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get()));

        stairsBlock(((StairBlock) YellowCedarWood.YELLOW_CEDAR_STAIRS.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        slabBlock(((SlabBlock) YellowCedarWood.YELLOW_CEDAR_SLAB.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        buttonBlock(((ButtonBlock) YellowCedarWood.YELLOW_CEDAR_BUTTON.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        fenceBlock(((FenceBlock) YellowCedarWood.YELLOW_CEDAR_FENCE.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) YellowCedarWood.YELLOW_CEDAR_FENCE_GATE.get()), blockTexture(YellowCedarWood.YELLOW_CEDAR_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) YellowCedarWood.YELLOW_CEDAR_DOOR.get()), modLoc("block/cedar_door_bottom"), modLoc("block/cedar_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) YellowCedarWood.YELLOW_CEDAR_TRAPDOOR.get()), modLoc("block/cedar_trapdoor"), true, "cutout");


        //Arbutus
        blockItem(ArbutusWood.ARBUTUS_LOG);
        blockItem(ArbutusWood.ARBUTUS_WOOD);
        blockItem(ArbutusWood.STRIPPED_ARBUTUS_LOG);
        blockItem(ArbutusWood.STRIPPED_ARBUTUS_WOOD);
        blockWithItem(ArbutusWood.ARBUTUS_PLANKS);

        logBlock(((RotatedPillarBlock) ArbutusWood.ARBUTUS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ArbutusWood.ARBUTUS_WOOD.get()), blockTexture(ArbutusWood.ARBUTUS_LOG.get()), blockTexture(ArbutusWood.ARBUTUS_LOG.get()));

        axisBlock(((RotatedPillarBlock) ArbutusWood.STRIPPED_ARBUTUS_LOG.get()), blockTexture(ArbutusWood.STRIPPED_ARBUTUS_LOG.get()),
                new ResourceLocation(BCMod.MOD_ID, "block/stripped_arbutus_log_top"));
        axisBlock(((RotatedPillarBlock) ArbutusWood.STRIPPED_ARBUTUS_WOOD.get()), blockTexture(ArbutusWood.STRIPPED_ARBUTUS_LOG.get()),
                blockTexture(ArbutusWood.STRIPPED_ARBUTUS_LOG.get()));

        stairsBlock(((StairBlock) ArbutusWood.ARBUTUS_STAIRS.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        slabBlock(((SlabBlock) ArbutusWood.ARBUTUS_SLAB.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        buttonBlock(((ButtonBlock) ArbutusWood.ARBUTUS_BUTTON.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ArbutusWood.ARBUTUS_PRESSURE_PLATE.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        fenceBlock(((FenceBlock) ArbutusWood.ARBUTUS_FENCE.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ArbutusWood.ARBUTUS_FENCE_GATE.get()), blockTexture(ArbutusWood.ARBUTUS_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ArbutusWood.ARBUTUS_DOOR.get()), modLoc("block/arbutus_door_bottom"), modLoc("block/arbutus_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ArbutusWood.ARBUTUS_TRAPDOOR.get()), modLoc("block/arbutus_trapdoor"), true, "cutout");


    }


    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(BCMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }




}




