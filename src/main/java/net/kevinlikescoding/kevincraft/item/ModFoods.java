package net.kevinlikescoding.kevincraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties IRON_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0F).alwaysEat().build();
    public static final FoodProperties IRON_GOLD_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1), 1.0F).alwaysEat().build();
}
