package net.brnbrd.delightful.compat;

import net.brnbrd.delightful.Util;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ArsNouveauCompat {

	public static MobEffect getManaRegen() {
		return Util.effect(Mods.AN, "mana_regen", MobEffects.ABSORPTION);
	}

	public static final FoodProperties SOURCE_BERRY_PIE_SLICE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).fast()
			.effect(() -> new MobEffectInstance(getManaRegen(), 200, 1), 1.0F).build();

	public static final FoodProperties SOURCE_BERRY_CAKE_SLICE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).fast()
			.effect(() -> new MobEffectInstance(getManaRegen(), 300, 0), 1.0F).build();
}