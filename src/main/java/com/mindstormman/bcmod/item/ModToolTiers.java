package com.mindstormman.bcmod.item;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier JADE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5, 4, 25, ModTags.Blocks.NEEDS_JADE_TOOL, () -> Ingredient.of(ModItems.JADE.get())),
            new ResourceLocation(BCMod.MOD_ID, "jade"), List.of(Tiers.NETHERITE), List.of());

}
