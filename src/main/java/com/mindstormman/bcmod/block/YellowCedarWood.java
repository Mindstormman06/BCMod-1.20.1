package com.mindstormman.bcmod.block;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.custom.ModFlammableRotatedPillarBlock;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class YellowCedarWood {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BCMod.MOD_ID);

    public static final RegistryObject<Block> YELLOW_CEDAR_PLANKS = registerBlock("yellow_cedar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> YELLOW_CEDAR_LOG = registerBlock("yellow_cedar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_CEDAR_LOG = registerBlock("stripped_yellow_cedar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CEDAR_WOOD = registerBlock("yellow_cedar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_CEDAR_WOOD = registerBlock("stripped_yellow_cedar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final RegistryObject<Block> YELLOW_CEDAR_STAIRS = registerBlock("yellow_cedar_stairs",
            () -> new StairBlock(() -> YellowCedarWood.YELLOW_CEDAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> YELLOW_CEDAR_SLAB = registerBlock("yellow_cedar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> YELLOW_CEDAR_PRESSURE_PLATE = registerBlock("yellow_cedar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_CEDAR_BUTTON = registerBlock("yellow_cedar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> YELLOW_CEDAR_FENCE = registerBlock("yellow_cedar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> YELLOW_CEDAR_FENCE_GATE = registerBlock("yellow_cedar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.BAMBOO_WOOD_FENCE_GATE_OPEN,
                    SoundEvents.BAMBOO_WOOD_FENCE_GATE_CLOSE
            ));
    public static final RegistryObject<Block> YELLOW_CEDAR_DOOR = registerBlock("yellow_cedar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_CEDAR_TRAPDOOR = registerBlock("yellow_cedar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR),
                    BlockSetType.OAK));




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
