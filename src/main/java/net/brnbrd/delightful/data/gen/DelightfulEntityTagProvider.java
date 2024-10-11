package net.brnbrd.delightful.data.gen;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulEntityTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class DelightfulEntityTagProvider extends EntityTypeTagsProvider {
	public DelightfulEntityTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper existingFileHelper) {
		super(output, provider, Delightful.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.@NotNull Provider provider) {
		// Delightful
		this.tag(DelightfulEntityTags.FATTY_ANIMALS)
				.add(EntityType.CAT)
				.add(EntityType.WOLF)
				.add(EntityType.COD)
				.add(EntityType.SALMON)
				.add(EntityType.COW)
				.add(EntityType.DOLPHIN)
				.add(EntityType.DONKEY)
				.add(EntityType.FOX)
				.add(EntityType.GLOW_SQUID)
				.add(EntityType.SQUID)
				.add(EntityType.GOAT)
				.add(EntityType.HOGLIN)
				.add(EntityType.HORSE)
				.add(EntityType.LLAMA)
				.add(EntityType.MOOSHROOM)
				.add(EntityType.MULE)
				.add(EntityType.OCELOT)
				.add(EntityType.PANDA)
				.add(EntityType.PIG)
				.add(EntityType.PIGLIN)
				.add(EntityType.PIGLIN_BRUTE)
				.add(EntityType.POLAR_BEAR)
				.add(EntityType.PUFFERFISH)
				.add(EntityType.RABBIT)
				.add(EntityType.SHEEP)
				.add(EntityType.TROPICAL_FISH)
				.add(EntityType.TURTLE)
				.addOptional(Util.rl(Mods.ECO, "camel"))
				.addOptional(Util.rl(Mods.ECO, "penguin"))
				.addOptional(Util.rl(Mods.ECO, "squirrel"))
				.addOptional(Util.rl(Mods.ECO, "coconut_crab"))
				.addOptional(Util.rl("autumnity", "turkey"))
				.addOptional(Util.rl("upgrade_aquatic", "thrasher"))
				.addOptional(Util.rl("upgrade_aquatic", "great_thrasher"))
				.addOptional(Util.rl("upgrade_aquatic", "lionfish"))
				.addOptional(Util.rl("upgrade_aquatic", "perch"))
				.addOptional(Util.rl("upgrade_aquatic", "pike"))
				.addOptional(Util.rl(Mods.AN, "starbuncle"))
				.addOptional(Util.rl("aqcaracal", "caracal"))
				.addOptional(Util.rl("babyfat", "ranchu"))
				.addOptional(Util.rl("bettas", "betta_fish"))
				.addOptional(Util.rl("farmlife", "domestic_tribull"))
				.addOptional(Util.rl(Mods.BB, "moobloom"))
				.addOptional(Util.rl(Mods.BB, "grizzly_bear"))
				.addOptional(Util.rl("crittersandcompanions", "dumbo_octopus"))
				.addOptional(Util.rl("crittersandcompanions", "ferret"))
				.addOptional(Util.rl("crittersandcompanions", "koi_fish"))
				.addOptional(Util.rl("crittersandcompanions", "otter"))
				.addOptional(Util.rl("crittersandcompanions", "red_panda"))
				.addOptional(Util.rl("duckling", "duck"))
				.addOptional(Util.rl("duckling", "quackling"))
				.addOptional(Util.rl("environmental", "deer"))
				.addOptional(Util.rl("environmental", "duck"))
				.addOptional(Util.rl("environmental", "fennec_fox"))
				.addOptional(Util.rl("environmental", "koi"))
				.addOptional(Util.rl("environmental", "slabfish"))
				.addOptional(Util.rl("environmental", "tapir"))
				.addOptional(Util.rl("environmental", "yak"))
				.addOptional(Util.rl("friendsandfoes", "moobloom"))
				.addOptional(Util.rl(Mods.FU, "chilloo"))
				.addOptional(Util.rl(Mods.FU, "penguin"))
				.addOptional(Util.rl(Mods.FU, "reindeer"))
				.addOptional(Util.rl("fishofthieves", "ancientscale"))
				.addOptional(Util.rl("fishofthieves", "battlegill"))
				.addOptional(Util.rl("fishofthieves", "devilfish"))
				.addOptional(Util.rl("fishofthieves", "islehopper"))
				.addOptional(Util.rl("fishofthieves", "plentifin"))
				.addOptional(Util.rl("fishofthieves", "pondie"))
				.addOptional(Util.rl("fishofthieves", "splashtail"))
				.addOptional(Util.rl("fishofthieves", "stormfish"))
				.addOptional(Util.rl("fishofthieves", "wildsplash"))
				.addOptional(Util.rl("fishofthieves", "wrecker"))
				.addOptional(Util.rl("sullysmod", "lanternfish"))
				.addOptional(Util.rl("sullysmod", "tortoise"))
				.addOptional(Util.rl("goodall", "deer"))
				.addOptional(Util.rl("goodall", "dumbo_octopus"))
				.addOptional(Util.rl("goodall", "fennec_fox"))
				.addOptional(Util.rl("goodall", "grizzly_bear"))
				.addOptional(Util.rl("goodall", "manatee"))
				.addOptional(Util.rl("goodall", "red_deer"))
				.addOptional(Util.rl("goodall", "seal"))
				.addOptional(Util.rl("goodall", "white_tailed_deer"))
				.addOptional(Util.rl("goodall", "rhino"))
				.addOptional(Util.rl("goodall", "river_turtle"))
				.addOptional(Util.rl("goodall", "tortoise"))
				.addOptional(Util.rl("hedgehog", "hedgehog"))
				.addOptional(Util.rl(Mods.NA, "alligator"))
				.addOptional(Util.rl(Mods.NA, "bass"))
				.addOptional(Util.rl(Mods.NA, "bear"))
				.addOptional(Util.rl(Mods.NA, "boar"))
				.addOptional(Util.rl(Mods.NA, "catfish"))
				.addOptional(Util.rl(Mods.NA, "deer"))
				.addOptional(Util.rl(Mods.NA, "duck"))
				.addOptional(Util.rl(Mods.NA, "elephant"))
				.addOptional(Util.rl(Mods.NA, "giraffe"))
				.addOptional(Util.rl(Mods.NA, "hippo"))
				.addOptional(Util.rl(Mods.NA, "lion"))
				.addOptional(Util.rl(Mods.NA, "rhino"))
				.addOptional(Util.rl(Mods.NA, "zebra"))
				.addOptional(Util.rl(Mods.N, "chimpanzee"))
				.addOptional(Util.rl(Mods.Q, "crab"))
				.addOptional(Util.rl(Mods.Q, "foxhound"))
				.addOptional(Util.rl(Mods.Q, "shiba"))
				.addOptional(Util.rl("goated", "geep"))
				.addOptional(Util.rl("snowpig", "snow_pig"))
				.addOptional(Util.rl("sprout", "elephant"))
				.addOptional(Util.rl("wandering_trapper", "trapper_dog"));
		this.tag(DelightfulEntityTags.DROPS_ACORN).addOptional(Util.rl(Mods.ECO, "squirrel"));
		this.tag(DelightfulEntityTags.DROPS_CRAB_LEGS).addOptional(Util.rl(Mods.ECO, "coconut_crab"));
		this.tag(DelightfulEntityTags.DROPS_RAW_GOAT).add(EntityType.GOAT);
	}
}