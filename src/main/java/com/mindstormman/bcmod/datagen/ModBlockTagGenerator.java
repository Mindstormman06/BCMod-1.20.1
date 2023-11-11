package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BCMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.RHODONITE_ORE.get()

                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RHODONITE_ORE.get(),
                        ModBlocks.RHODONITE_BLOCK.get(),
                        ModBlocks.RAW_RHODONITE_BLOCK.get()

                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RHODONITE_BLOCK.get(),
                        ModBlocks.RHODONITE_ORE.get(),
                        ModBlocks.RAW_RHODONITE_BLOCK.get()

                );

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add((Block) CedarWood.BLOCKS.getEntries());

        this.tag(BlockTags.LOGS)
                .add(CedarWood.CEDAR_LOG.get()

                );

        this.tag(BlockTags.PLANKS)
                .add(CedarWood.CEDAR_PLANKS.get()

                );

        this.tag(BlockTags.LOGS)
                .add(CedarWood.CEDAR_LOG.get()

                );

        this.tag(BlockTags.PLANKS)
                .add(CedarWood.CEDAR_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(CedarWood.CEDAR_FENCE_GATE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(CedarWood.CEDAR_LOG.get())
                .add(CedarWood.CEDAR_WOOD.get())
                .add(CedarWood.STRIPPED_CEDAR_LOG.get())
                .add(CedarWood.STRIPPED_CEDAR_WOOD.get());





    }
}
