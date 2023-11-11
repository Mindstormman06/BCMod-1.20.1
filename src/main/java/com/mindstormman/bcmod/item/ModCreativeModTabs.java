package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BCMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> BCMOD_TAB = CREATIVE_MODE_TABS.register("bcmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOOSE_EGG.get()))
                    .title(Component.translatable("creativetab.bcmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Items
                        pOutput.accept(ModItems.GOOSE_EGG.get());
                        pOutput.accept(ModItems.GOOSE_FEATHER.get());
                        pOutput.accept(ModItems.RHODONITE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.RHODONITE_HEART.get());

                        //Blocks
                        pOutput.accept(ModBlocks.CEDAR_LOG.get());
                        pOutput.accept(ModBlocks.CEDAR_PLANKS.get());
                        pOutput.accept(ModBlocks.RHODONITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RHODONITE_ORE.get());

                        //Food
                        pOutput.accept(ModItems.SASKATOON_BERRY.get());
                        pOutput.accept(ModItems.SNOWBERRY.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
