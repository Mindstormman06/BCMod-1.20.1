package com.mindstormman.bcmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Supplier;

public class ModFoods {
    public static final FoodProperties SASKATOON_BERRY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .fast()
            .build();


    public static final FoodProperties SNOWBERRY = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(2)
            .saturationMod(0.1f)
            .fast()
            .effect((Supplier<MobEffectInstance>) () -> new MobEffectInstance(MobEffects.POISON, 200), 1F)
            .effect((Supplier<MobEffectInstance>) () -> new MobEffectInstance(MobEffects.HARM, 20), 1F)
            .build();

}

//EFFECT
// .effect((Supplier<MobEffectInstance>) () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1F)
