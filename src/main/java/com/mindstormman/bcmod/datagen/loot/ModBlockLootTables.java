package com.mindstormman.bcmod.datagen.loot;

import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModBlockLootTables extends BlockLootSubProvider {

        public ModBlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

    @Override
    protected void generate() {



        //Rhodonite

        this.add(ModBlocks.RHODONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.RHODONITE_ORE.get(), ModItems.RHODONITE.get()));
        this.dropSelf(ModBlocks.RHODONITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RHODONITE_BLOCK.get());

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

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        List<Block> knownBlocks = new ArrayList<>();

        // Add CedarWood blocks to the list of known blocks
        for (RegistryObject<Block> block : CedarWood.BLOCKS.getEntries()) {
            knownBlocks.add(block.get());
        }

        // Add all registered blocks from ModBlocks
        knownBlocks.addAll(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList()));

        return knownBlocks;
    }




}
