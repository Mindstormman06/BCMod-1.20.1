package com.mindstormman.bcmod.util;

import com.mindstormman.bcmod.BCMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> CEDAR_LOGS = tag("cedar_logs");
        public static final TagKey<Block> YELLOW_CEDAR_LOGS = tag("yellow_cedar_logs");
        public static final TagKey<Block> ARBUTUS_LOGS = tag("arbutus_logs");

        public static final TagKey<Block> BC_LOGS = tag("bc_logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BCMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BCMod.MOD_ID, name));
        }
    }
}
