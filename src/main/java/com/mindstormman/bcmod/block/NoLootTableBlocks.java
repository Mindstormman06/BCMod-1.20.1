package com.mindstormman.bcmod.block;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.custom.SaskatoonBerryBushBlock;
import com.mindstormman.bcmod.block.custom.SnowBerryBushBlock;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class NoLootTableBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BCMod.MOD_ID);

    public static final RegistryObject<Block> SNOWBERRY_BUSH = BLOCKS.register("snowberry_bush",
            () -> new SnowBerryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).mapColor(MapColor.PLANT)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .strength(0.2F)
                    .lightLevel((blockState) -> 0)
                    .dynamicShape()
                    .noOcclusion()));

    public static final RegistryObject<Block> SASKATOON_BERRY_BUSH = BLOCKS.register("saskatoon_berry_bush",
            () -> new SaskatoonBerryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).mapColor(MapColor.PLANT)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .strength(0.2F)
                    .lightLevel((blockState) -> 0)
                    .dynamicShape()
                    .noOcclusion()));

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

