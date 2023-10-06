package net.brnbrd.delightful.compat;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.fml.ModList;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class Mods {
	public static final String AN = "ars_nouveau";
	public static final String BOP = "biomesoplenty";
	public static final String BTA = "botania";
	public static final String BYG = "byg";
	public static final String DD = "deeperdarker";
	public static final String ECO = "ecologics";
	public static final String EP = "phantasm";
	public static final String EN = "enlightened_end";
	public static final String FA = "forbidden_arcanus";
	public static final String FR = "farmersrespite";
	public static final String FU = "frozenup";
	public static final String FUD = "frozen_delight";
	public static final String FUS = "fusion";
	public static final String LE = "lolenderite";
	public static final String MEKT = "mekanismtools";
	public static final String N = "neapolitan";
	public static final String RC = "rootsclassic";
	public static final String RF = "respiteful";
	public static final String RL = "rottenleather";
	public static final String SO = "simpleores";
	public static final String TF = "twilightforest";
	public static final String UG = "undergarden";
	public static final String WB = "wildberries";

	public static boolean loaded(@NotNull String modid) {
		return ModList.get().isLoaded(modid);
	}

	public static boolean loaded(@NotNull String... modids) {
		for (String mod : modids) {
			if (!loaded(mod)) {
				return false;
			}
		}
		return true;
	}

	public static boolean orLoaded(@NotNull String... modids) {
		for (String mod : modids) {
			if (loaded(mod)) {
				return true;
			}
		}
		return false;
	}

	public static Supplier<MobEffect> getVitality() {
		if (loaded(RF)) {
			return RFCompat.VITALITY;
		}
		return () -> MobEffects.DIG_SPEED;
	}

	public static Supplier<MobEffect> getCaffeinated() {
		if (loaded(FR)) {
			return FRCompat.CAFFEINATED;
		}
		return () -> MobEffects.DIG_SPEED;
	}
}
