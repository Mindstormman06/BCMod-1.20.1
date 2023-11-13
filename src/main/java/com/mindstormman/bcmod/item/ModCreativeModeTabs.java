package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ArbutusWood;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.YellowCedarWood;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BCMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> BCMOD_TAB = CREATIVE_MODE_TABS.register("bcmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOOSE_EGG.get()))
                    .title(Component.translatable("creativetab.bcmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Items
                        pOutput.accept(ModItems.GOOSE_EGG.get());
                        pOutput.accept(ModItems.GOOSE_FEATHER.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());


                        //Rhodonite
                        pOutput.accept(ModItems.RAW_RHODONITE.get());
                        pOutput.accept(ModItems.RHODONITE.get());
                        pOutput.accept(ModItems.RHODONITE_HEART.get());


                        //Food
                        pOutput.accept(ModItems.SASKATOON_BERRY.get());
                        pOutput.accept(ModItems.SNOWBERRY.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BCMOD_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("bcmod_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RHODONITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.bcmod_building_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        //Wood

                        //Cedar Wood
                        pOutput.accept(CedarWood.CEDAR_LOG.get());
                        pOutput.accept(CedarWood.CEDAR_WOOD.get());
                        pOutput.accept(CedarWood.STRIPPED_CEDAR_LOG.get());
                        pOutput.accept(CedarWood.STRIPPED_CEDAR_WOOD.get());
                        pOutput.accept(CedarWood.CEDAR_PLANKS.get());
                        pOutput.accept(CedarWood.CEDAR_STAIRS.get());
                        pOutput.accept(CedarWood.CEDAR_SLAB.get());
                        pOutput.accept(CedarWood.CEDAR_FENCE.get());
                        pOutput.accept(CedarWood.CEDAR_FENCE_GATE.get());
                        pOutput.accept(CedarWood.CEDAR_DOOR.get());
                        pOutput.accept(CedarWood.CEDAR_TRAPDOOR.get());
                        pOutput.accept(CedarWood.CEDAR_PRESSURE_PLATE.get());
                        pOutput.accept(CedarWood.CEDAR_BUTTON.get());



                        //Yellow Cedar Wood
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_LOG.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_WOOD.get());
                        pOutput.accept(YellowCedarWood.STRIPPED_YELLOW_CEDAR_LOG.get());
                        pOutput.accept(YellowCedarWood.STRIPPED_YELLOW_CEDAR_WOOD.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_PLANKS.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_STAIRS.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_SLAB.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_FENCE.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_FENCE_GATE.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_DOOR.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_TRAPDOOR.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_BUTTON.get());

                        //Arbutus
                        pOutput.accept(ArbutusWood.ARBUTUS_LOG.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_WOOD.get());
                        pOutput.accept(ArbutusWood.STRIPPED_ARBUTUS_LOG.get());
                        pOutput.accept(ArbutusWood.STRIPPED_ARBUTUS_WOOD.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_PLANKS.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_STAIRS.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_SLAB.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_FENCE.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_FENCE_GATE.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_DOOR.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_TRAPDOOR.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_PRESSURE_PLATE.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_BUTTON.get());

                        pOutput.accept(ModBlocks.RHODONITE_BLOCK.get());


                    })
                            .build());

    public static final RegistryObject<CreativeModeTab> BCMOD_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("bcmod_natural_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CedarWood.CEDAR_LOG.get()))
                    .title(Component.translatable("creativetab.bcmod_natural_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.RHODONITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_RHODONITE_BLOCK.get());
                        pOutput.accept(CedarWood.CEDAR_LOG.get());
                        pOutput.accept(YellowCedarWood.YELLOW_CEDAR_LOG.get());
                        pOutput.accept(ArbutusWood.ARBUTUS_LOG.get());




                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
