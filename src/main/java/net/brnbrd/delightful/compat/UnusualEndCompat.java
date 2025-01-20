package net.brnbrd.delightful.compat;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class UnusualEndCompat {
	public static final String chorus_pie = "chorus_pie";

	public static final FoodProperties CHORUS_PIE_SLICE = (new FoodProperties.Builder())
			.nutrition(3).saturationMod(0.3F).fast()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1.0F).build();
	public static final FoodProperties CHORUS_MUFFIN = (new FoodProperties.Builder())
			.nutrition(8).saturationMod(0.6F).build();
}