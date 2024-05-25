package com.mindstormman.bcmod.datagen.loot;

import com.mindstormman.bcmod.block.ArbutusWood;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.YellowCedarWood;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootSubProvider {

        public ModBlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

    @Override
    protected void generate() {



        //Rhodonite

        this.add(ModBlocks.RHODONITE_ORE.get(), block -> createOreDrop(ModBlocks.RHODONITE_ORE.get(), ModItems.RHODONITE.get()));
        this.dropSelf(ModBlocks.RHODONITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RHODONITE_BLOCK.get());
        this.add(ModBlocks.JADE_ORE.get(), block -> createOreDrop(ModBlocks.JADE_ORE.get(), ModItems.JADE.get()));
        this.dropSelf(ModBlocks.JADE_BLOCK.get());

        //WOOD

        //Cedar
        this.dropSelf(CedarWood.CEDAR_LOG.get());
        this.dropSelf(CedarWood.CEDAR_WOOD.get());
        this.dropSelf(CedarWood.STRIPPED_CEDAR_LOG.get());
        this.dropSelf(CedarWood.STRIPPED_CEDAR_WOOD.get());
        this.dropSelf(CedarWood.CEDAR_PLANKS.get());
        this.dropSelf(CedarWood.CEDAR_STAIRS.get());
        this.dropSelf(CedarWood.CEDAR_BUTTON.get());
        this.dropSelf(CedarWood.CEDAR_PRESSURE_PLATE.get());
        this.dropSelf(CedarWood.CEDAR_FENCE.get());
        this.dropSelf(CedarWood.CEDAR_FENCE_GATE.get());
        this.dropSelf(CedarWood.CEDAR_TRAPDOOR.get());
        this.add(CedarWood.CEDAR_SLAB.get(),
                block -> createSlabItemTable(CedarWood.CEDAR_SLAB.get()));
        this.add(CedarWood.CEDAR_DOOR.get(),
                block -> createDoorTable(CedarWood.CEDAR_DOOR.get()));

        //Yellow Cedar
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_LOG.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_WOOD.get());
        this.dropSelf(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get());
        this.dropSelf(YellowCedarWood.STRIPPED_YELLOW_CEDAR_WOOD.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_PLANKS.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_STAIRS.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_BUTTON.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_FENCE.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_FENCE_GATE.get());
        this.dropSelf(YellowCedarWood.YELLOW_CEDAR_TRAPDOOR.get());
        this.add(YellowCedarWood.YELLOW_CEDAR_SLAB.get(),
                block -> createSlabItemTable(YellowCedarWood.YELLOW_CEDAR_SLAB.get()));
        this.add(YellowCedarWood.YELLOW_CEDAR_DOOR.get(),
                block -> createDoorTable(YellowCedarWood.YELLOW_CEDAR_DOOR.get()));

        //Arbutus
        this.dropSelf(ArbutusWood.ARBUTUS_LOG.get());
        this.dropSelf(ArbutusWood.ARBUTUS_WOOD.get());
        this.dropSelf(ArbutusWood.STRIPPED_ARBUTUS_LOG.get());
        this.dropSelf(ArbutusWood.STRIPPED_ARBUTUS_WOOD.get());
        this.dropSelf(ArbutusWood.ARBUTUS_PLANKS.get());
        this.dropSelf(ArbutusWood.ARBUTUS_STAIRS.get());
        this.dropSelf(ArbutusWood.ARBUTUS_BUTTON.get());
        this.dropSelf(ArbutusWood.ARBUTUS_PRESSURE_PLATE.get());
        this.dropSelf(ArbutusWood.ARBUTUS_FENCE.get());
        this.dropSelf(ArbutusWood.ARBUTUS_FENCE_GATE.get());
        this.dropSelf(ArbutusWood.ARBUTUS_TRAPDOOR.get());
        this.add(ArbutusWood.ARBUTUS_SLAB.get(),
                block -> createSlabItemTable(ArbutusWood.ARBUTUS_SLAB.get()));
        this.add(ArbutusWood.ARBUTUS_DOOR.get(),
                block -> createDoorTable(ArbutusWood.ARBUTUS_DOOR.get()));





    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        List<Block> knownBlocks = new ArrayList<>();

        // Add CedarWood blocks to the list of known blocks
        for (RegistryObject<Block> block : CedarWood.BLOCKS.getEntries()) {
            knownBlocks.add(block.get());
        }

        // Add YellowCedarWood blocks to the list of known blocks
        for (RegistryObject<Block> block : YellowCedarWood.BLOCKS.getEntries()) {
            knownBlocks.add(block.get());
        }

        // Add ArbutusWood blocks to the list of known blocks
        for (RegistryObject<Block> block : ArbutusWood.BLOCKS.getEntries()) {
            knownBlocks.add(block.get());
        }

        // Add all registered blocks from ModBlocks
        knownBlocks.addAll(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList()));

        return knownBlocks;
    }




}
