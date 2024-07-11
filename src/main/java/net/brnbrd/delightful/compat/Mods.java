package net.brnbrd.delightful.compat;

import net.brnbrd.delightful.Util;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.Optional;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public class Mods {
	public static final String AA = "additionaladditions";
	public static final String AD = "abnormals_delight";
	public static final String AE = "aether";
	public static final String AE2 = "ae2";
	public static final String AN = "ars_nouveau";
	public static final String AS = "appleskin";
	public static final String BB = "buzzier_bees";
	public static final String BOP = "biomesoplenty";
	public static final String BTA = "botania";
	public static final String BYG = "byg";
	public static final String C = "create";
	public static final String CCK = "create_central_kitchen";
	public static final String CD = "culturaldelights";
	public static final String CR = "collectorsreap";
	public static final String DD = "deeperdarker";
	public static final String ECO = "ecologics";
	public static final String EP = "phantasm";
	public static final String EN = "enlightened_end";
	public static final String FA = "forbidden_arcanus";
	public static final String FR = "farmersrespite";
	public static final String FRD = "fruitsdelight";
	public static final String FU = "frozenup";
	public static final String FUD = "frozen_delight";
	public static final String FUS = "fusion";
	public static final String IN = "incubation";
	public static final String LE = "lolenderite";
	public static final String MEKT = "mekanismtools";
	public static final String MD = "miners_delight";
	public static final String MND = "mynethersdelight";
	public static final String MOD = "moredelight";
	public static final String N = "neapolitan";
	public static final String NA = "naturalist";
	public static final String ND = "nethersdelight";
	public static final String Q = "quark";
	public static final String RC = "rootsclassic";
	public static final String RF = "respiteful";
	public static final String RL = "rottenleather";
	public static final String SAS = "some_assembly_required";
	public static final String SO = "simpleores";
	public static final String SUP = "supplementaries";
	public static final String TF = "twilightforest";
	public static final String UG = "undergarden";
	public static final String UGD = "undergardendelight";
	public static final String VD = "vintagedelight";
	public static final String WB = "wildberries";
	public static final String YH = "youkaishomecoming";

	public static boolean loaded(@NotNull String modid) {
		return ModList.get().isLoaded(modid);
	}

	// All must be loaded
	public static boolean loaded(@NotNull String... modids) {
		if (modids.length < 1) {
			return true;
		} else if (modids.length == 1) {
			return loaded(modids[0]);
		} else {
			for (String mod : modids) {
				if (!loaded(mod)) {
					return false;
				}
			}
		}
		return true;
	}

	// One must be loaded
	public static boolean orLoaded(@NotNull String... modids) {
		if (modids.length < 1) {
			return false;
		} else if (modids.length == 1) {
			return loaded(modids[0]);
		} else {
			for (String mod : modids) {
				if (loaded(mod)) {
					return true;
				}
			}
		}
		return false;
	}

	public static Supplier<MobEffect> getManaRegen() {
		if (loaded(AN)) {
			Optional<Holder<MobEffect>> manaRegen = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.AN, "mana_regen"));
			if (manaRegen.isPresent()) {
				return manaRegen.get();
			}
		}
		return () -> MobEffects.ABSORPTION;
	}

	public static Supplier<MobEffect> getGreenTeaEffect() {
		if (loaded(RF)) {
			Optional<Holder<MobEffect>> vitality = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.RF, "vitality"));
			if (vitality.isPresent()) {
				return vitality.get();
			}
		} else if (loaded(Mods.YH)) {
			Optional<Holder<MobEffect>> polyphenols = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.YH, "tea_polyphenols"));
			if (polyphenols.isPresent()) {
				return polyphenols.get();
			}
		}
		return () -> MobEffects.REGENERATION;
	}

	public static Supplier<MobEffect> getCaffeinated() {
		if (loaded(FR)) {
			Optional<Holder<MobEffect>> caffeinated = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.FR, "caffeinated"));
			if (caffeinated.isPresent()) {
				return caffeinated.get();
			}
		} else if (loaded(Mods.YH)) {
			Optional<Holder<MobEffect>> sober = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.YH, "sober"));
			if (sober.isPresent()) {
				return sober.get();
			}
		}
		return () -> MobEffects.DIG_SPEED;
	}

	public static Supplier<MobEffect> getVirulentResistance() {
		if (loaded(UG)) {
			Optional<Holder<MobEffect>> virulent = ForgeRegistries.MOB_EFFECTS.getHolder(Util.rl(Mods.UG, "virulent_resistance"));
			if (virulent.isPresent()) {
				return virulent.get();
			}
		}
		return () -> MobEffects.FIRE_RESISTANCE;
	}
}
