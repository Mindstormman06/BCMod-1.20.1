package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BCMod.MOD_ID);

    public static final RegistryObject<Item> GOOSE_EGG = ITEMS.register("goose_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOOSE_FEATHER = ITEMS.register("goose_feather",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
