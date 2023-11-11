package com.mindstormman.bcmod.block;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
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

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BCMod.MOD_ID);

    public static final RegistryObject<Block> RHODONITE_ORE = registerBlock("rhodonite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> RHODONITE_BLOCK = registerBlock("rhodonite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));


    //WOODS

    //Cedar
    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CEDAR_PLANKS = registerBlock("cedar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CEDAR_STAIRS = registerBlock("cedar_stairs",
            () -> new StairBlock(() -> ModBlocks.CEDAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CEDAR_SLAB = registerBlock("cedar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CEDAR_PRESSURE_PLATE = registerBlock("cedar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> CEDAR_BUTTON = registerBlock("cedar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CEDAR_FENCE = registerBlock("cedar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CEDAR_FENCE_GATE = registerBlock("cedar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.BAMBOO_WOOD_FENCE_GATE_OPEN,
                    SoundEvents.BAMBOO_WOOD_FENCE_GATE_CLOSE
                    ));
    public static final RegistryObject<Block> CEDAR_DOOR = registerBlock("cedar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> CEDAR_TRAPDOOR = registerBlock("cedar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR),
                    BlockSetType.OAK));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
