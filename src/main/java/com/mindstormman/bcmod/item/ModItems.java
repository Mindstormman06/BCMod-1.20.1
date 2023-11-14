package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ModBlocks;
import com.mindstormman.bcmod.block.NoLootTableBlocks;
import com.mindstormman.bcmod.block.custom.SaskatoonBerryBushBlock;
import com.mindstormman.bcmod.item.custom.MetalDetectorItem;
import com.mindstormman.bcmod.item.custom.RhodoniteHeartItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import static net.minecraft.world.item.Items.registerItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BCMod.MOD_ID);

    public static final RegistryObject<Item> GOOSE_EGG = ITEMS.register("goose_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOOSE_FEATHER = ITEMS.register("goose_feather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RHODONITE = ITEMS.register("rhodonite",
            () -> new Item(new Item.Properties()));




    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> RHODONITE_HEART = ITEMS.register("rhodonite_heart",
            () -> new RhodoniteHeartItem(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RHODONITE = ITEMS.register("raw_rhodonite",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SASKATOON_BERRY = ITEMS.register("saskatoon_berry",
            () -> new ItemNameBlockItem(NoLootTableBlocks.SASKATOON_BERRY_BUSH.get(), new Item.Properties().food(ModFoods.SASKATOON_BERRY)));
    public static final RegistryObject<Item> SNOWBERRY = ITEMS.register("snowberry",
            () -> new ItemNameBlockItem(NoLootTableBlocks.SNOWBERRY_BUSH.get(), new Item.Properties().food(ModFoods.SNOWBERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
