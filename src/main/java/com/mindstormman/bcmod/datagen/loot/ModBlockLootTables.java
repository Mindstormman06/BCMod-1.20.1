package com.mindstormman.bcmod.datagen.loot;

import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

        public ModBlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RHODONITE_BLOCK.get());
        this.dropSelf(ModBlocks.CEDAR_LOG.get());
        this.dropSelf(ModBlocks.CEDAR_PLANKS.get());

        this.add(ModBlocks.RHODONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.RHODONITE_ORE.get(), ModItems.RHODONITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
