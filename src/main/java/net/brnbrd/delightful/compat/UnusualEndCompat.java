package net.brnbrd.delightful.compat;

import net.brnbrd.delightful.Util;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class UnusualEndCompat {
	public static final String chorus_pie = "chorus_pie";

	public static MobEffect getSwiftStrikes() {
		return Util.effect(Mods.UE, "swift_strikes", MobEffects.DIG_SPEED);
	}

	public static MobEffect getEnderInfection() {
		return Util.effect(Mods.UE, "ender_infection", MobEffects.CONFUSION);
	}

	public static final FoodProperties CHORUS_PIE_SLICE = (new FoodProperties.Builder())
			.nutrition(3).saturationMod(0.3F).fast()
			.effect(() -> new MobEffectInstance(getSwiftStrikes(), 300, 1), 1.0F).build();
	public static final FoodProperties CHORUS_MUFFIN = (new FoodProperties.Builder())
			.nutrition(8).saturationMod(0.6F)
			.effect(() -> new MobEffectInstance(getSwiftStrikes(), 400, 0), 1.0F).build();
}