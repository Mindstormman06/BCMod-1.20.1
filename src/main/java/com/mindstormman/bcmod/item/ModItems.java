package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.NoLootTableBlocks;
import com.mindstormman.bcmod.item.custom.MetalDetectorItem;
import com.mindstormman.bcmod.item.custom.RhodoniteHeartItem;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
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


    //Tools
    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ModToolTiers.JADE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JADE, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ModToolTiers.JADE, 7, 3, new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ModToolTiers.JADE, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ModToolTiers.JADE, 2, 2, new Item.Properties()));

    //Armour
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(ModArmourMaterials.JADE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(ModArmourMaterials.JADE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new ArmorItem(ModArmourMaterials.JADE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(ModArmourMaterials.JADE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
