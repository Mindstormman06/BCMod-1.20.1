package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BCMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RHODONITE_BLOCK);
        blockWithItem(ModBlocks.RHODONITE_ORE);
        blockWithItem(ModBlocks.CEDAR_LOG);
        blockWithItem(ModBlocks.CEDAR_PLANKS);

        stairsBlock(((StairBlock) ModBlocks.CEDAR_STAIRS.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CEDAR_SLAB.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CEDAR_BUTTON.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CEDAR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CEDAR_FENCE.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CEDAR_FENCE_GATE.get()), blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CEDAR_DOOR.get()), modLoc("block/cedar_door_bottom"), modLoc("block/cedar_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CEDAR_TRAPDOOR.get()), modLoc("block/cedar_trapdoor"), true, "cutout");



    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
