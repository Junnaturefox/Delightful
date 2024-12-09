package net.brnbrd.delightful.data.gen;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.knife.DelightfulKnifeItem;
import net.brnbrd.delightful.common.item.knife.Knives;
import net.brnbrd.delightful.common.item.knife.compat.additionaladditions.GildedNetheriteKnifeItem;
import net.brnbrd.delightful.common.item.knife.compat.additionaladditions.RoseGoldKnifeItem;
import net.brnbrd.delightful.common.item.knife.compat.lolenderite.EnderiteKnifeItem;
import net.brnbrd.delightful.common.item.knife.compat.undergarden.ForgottenKnifeItem;
import net.brnbrd.delightful.compat.BWGCompat;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.common.tag.ModTags;
import java.util.concurrent.CompletableFuture;

public class DelightfulItemTagProvider extends ItemTagsProvider {
	public DelightfulItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, provider, blockTagProvider, Delightful.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.@NotNull Provider provider) {

		// Delightful
		this.tag(DelightfulItemTags.COMPAT_PIES)
				.add(Items.PUMPKIN_PIE)
				.addOptional(Util.rl(Mods.AN, "source_berry_pie"))
				.addOptional(Util.rl(Mods.UG, "gloomgourd_pie"))
				.addOptional(Util.rl(Mods.BWG, BWGCompat.blueberry_pie))
				.addOptional(Util.rl(Mods.BWG, BWGCompat.green_apple_pie));
		this.tag(DelightfulItemTags.FIRE_KNIVES)
				.add(Knives.FIERY.get())
				.add(Knives.KIWANO.get())
				.add(Knives.BLAZING.get());
		this.tag(DelightfulItemTags.STRAW_PLANTS)
				.add(Items.GRASS)
				.add(Items.TALL_GRASS)
				.add(ModItems.SANDY_SHRUB.get())
				.addOptional(Util.rl("upgrade_aquatic", "beachgrass"))
				.addOptional(Util.rl("upgrade_aquatic", "tall_beachgrass"));

		// Farmer's Delight
		this.tag(ModTags.WOODEN_CABINETS)
				.add(ModItems.MANGROVE_CABINET.get())
				.addOptional(Util.rl("windswept", "holly_cabinet"))
				.addOptional(Util.rl("windswept", "chestnut_cabinet"))
				.addOptional(Util.rl("fruittrees", "citrus_cabinet"))
				.addOptional(Util.rl("fruittrees", "cherry_cabinet"));
		this.tag(ModTags.CABINETS)
				.addTag(DelightfulItemTags.CABINETS_STONE);
		this.tag(DelightfulItemTags.CABINETS_STONE)
				.add(DelightfulItems.BASALT_CABINET.get())
				.add(DelightfulItems.QUARTZ_CABINET.get());
		this.tag(ModTags.WILD_CROPS_ITEM)
				.add(DelightfulItems.WILD_SALMONBERRIES.get());
		this.tag(ForgeTags.VEGETABLES_POTATO)
				.addOptional(Util.rl(Mods.MOD, "diced_potatoes"));
		this.tag(ForgeTags.VEGETABLES_TOMATO)
				.addOptional(Util.rl(Mods.SAS, "tomato_slices"));
		this.tag(ForgeTags.CROPS_ONION)
				.addOptional(Util.rl(Mods.BWG, "oddion_bulb"));
		this.tag(ForgeTags.VEGETABLES_ONION)
				.addTag(ForgeTags.CROPS_ONION)
				.addOptional(Util.rl(Mods.SAS, "sliced_onion"));
		this.tag(DelightfulItemTags.CROPS_CARROT)
				.add(Items.CARROT);
		this.tag(ForgeTags.VEGETABLES_CARROT)
				.addOptional(Util.rl(Mods.SAS, "chopped_carrot"));
		this.tag(DelightfulItemTags.CROPS_BEETROOT)
				.add(Items.BEETROOT);
		this.tag(ForgeTags.VEGETABLES_BEETROOT)
				.addOptional(Util.rl(Mods.SAS, "chopped_beetroot"));

		// Collector's Reap
		this.tag(DelightfulItemTags.GUMMIES)
				.add(DelightfulItems.SALMONBERRY_GUMMY.get())
				.add(DelightfulItems.MATCHA_GUMMY.get())
				.add(DelightfulItems.CANTALOUPE_GUMMY.get())
				.add(DelightfulItems.SOURCE_BERRY_GUMMY.get());

		// Forge
		this.tag(DelightfulItemTags.LAVENDER)
				.addOptionalTag(Util.rl(Util.LOADER, "flowers/lavender"))
				.addOptional(Util.rl(Mods.BOP, "lavender"))
				.addOptional(Util.rl(Mods.BOP, "tall_lavender"));
		this.tag(DelightfulItemTags.CLOVER)
				.addOptional(Util.rl(Mods.BOP, "clover"))
				.addOptional(Util.rl(Mods.BWG, "clover_patch"))
				.addOptional(Util.rl(Mods.TF, "clover_patch"))
				.addOptional(Util.rl(Mods.BB, "four_leaf_clover"));
		this.tag(DelightfulItemTags.CACTI)
				.add(Items.CACTUS)
				.addOptional(Util.rl(Mods.BWG, "barrel_cactus"))
				.addOptional(Util.rl(Mods.BWG, "flowering_barrel_cactus"))
				.addOptional(Util.rl(Mods.BWG, "prickly_pear_cactus"))
				.addOptional(Util.rl(Mods.BWG, "golden_spined_cactus"));
		this.tag(DelightfulItemTags.SMALL_CACTI)
				.addOptionalTag(Util.rl("habitat", "ball_cacti"))
				.addOptional(Util.rl(Mods.BWG, "mini_cactus"));
		this.tag(DelightfulItemTags.MATCHA)
				.add(DelightfulItems.MATCHA.get());
		this.tag(ForgeTags.EGGS)
				.add(Items.TURTLE_EGG)
				.addOptional(Util.rl(Mods.NA, "duck_egg"))
				.addOptional(Util.rl(Mods.Q, "egg_parrot_red_blue"))
				.addOptional(Util.rl(Mods.Q, "egg_parrot_blue"))
				.addOptional(Util.rl(Mods.Q, "egg_parrot_green"))
				.addOptional(Util.rl(Mods.Q, "egg_parrot_yellow_blue"))
				.addOptional(Util.rl(Mods.Q, "egg_parrot_grey"))
				.addOptional(Util.rl("autumnity", "turkey_egg"))
				.addOptional(Util.rl("deep_aether", "quail_egg"))
				.addOptional(Util.rl("farmlife", "galliraptor_egg"))
				.addOptional(Util.rl("etcetera", "eggple"));
		this.tag(ForgeTags.COOKED_EGGS)
				.addOptional(Util.rl(Mods.AA, "fried_egg"))
				.addOptional(Util.rl(Mods.IN, "fried_egg"))
				.addOptional(Util.rl(Mods.NA, "cooked_egg"));
		this.tag(DelightfulItemTags.DOUGH_CORN)
				.addOptional(Util.rl(Mods.CD, "corn_dough"));
		this.tag(DelightfulItemTags.DOUGH_NUT)
				.add(DelightfulItems.NUT_DOUGH.get());
		this.tag(ForgeTags.DOUGH)
				.addTag(DelightfulItemTags.DOUGH_NUT)
				.addTag(DelightfulItemTags.DOUGH_CORN);
		this.tag(DelightfulItemTags.BREAD_CORN)
				.addOptional(Util.rl("corn_delight", "cornbread"))
				.addOptional(Util.rl("hauntedharvest", "cornbread"));
		this.tag(ForgeTags.BREAD)
				.addTag(DelightfulItemTags.BREAD_CORN);
		this.tag(DelightfulItemTags.BREAD_SLICES_TOASTED)
				.addOptional(Util.rl(Mods.SAS, "toasted_bread_slice"))
				.addOptional(Util.rl(Mods.MOD, "toast"));
		this.tag(DelightfulItemTags.BREAD_SLICES)
				.addTag(DelightfulItemTags.BREAD_SLICES_TOASTED)
				.addOptional(Util.rl(Mods.SAS, "bread_slice"))
				.addOptional(Util.rl(Mods.MOD, "bread_slice"));
		this.tag(DelightfulItemTags.SANDWICH_BREAD)
				.addTag(DelightfulItemTags.BREAD_SLICES);
		this.tag(DelightfulItemTags.BURGER_BUN)
				.addOptional(Util.rl(Mods.SAS, "burger_bun"));
		this.tag(DelightfulItemTags.BREAD_OR_BUN)
				.addTag(ForgeTags.BREAD)
				.addTag(DelightfulItemTags.BURGER_BUN);
		this.tag(DelightfulItemTags.TOOLS_MACHETES)
				.addOptionalTag(Util.rl(Mods.ND, "tools/machetes"));
		this.tag(DelightfulItemTags.TOOLS_SCAVENGING)
				.addTag(ForgeTags.TOOLS_KNIVES)
				.addOptionalTag(Util.rl(Mods.ND, "scavenging_tools"));
		this.tag(DelightfulItemTags.CROPS_GINGER).addOptional(Util.rl("snowyspirit", "ginger"));
		this.tag(DelightfulItemTags.FRUITS_APPLE).add(Items.APPLE);
		this.tag(DelightfulItemTags.FRUITS_MELON).add(Items.MELON_SLICE);
		this.tag(DelightfulItemTags.FRUITS_CHORUS).add(Items.CHORUS_FRUIT);
		this.tag(DelightfulItemTags.FRUITS_SWEET_BERRIES).add(Items.SWEET_BERRIES);
		this.tag(DelightfulItemTags.FRUITS_GLOW_BERRIES).add(Items.GLOW_BERRIES);
		this.tag(DelightfulItemTags.FRUITS_CANTALOUPE).add(DelightfulItems.CANTALOUPE_SLICE.get());
		this.tag(DelightfulItemTags.FRUITS_SALMONBERRIES).add(DelightfulItems.SALMONBERRIES.get());
		this.tag(DelightfulItemTags.FRUITS_KIWI)
				.addOptional(Util.rl(Mods.FRD, "kiwi"))
				.addOptional(Util.rl("hedgehog", "kiwi"));
		this.tag(DelightfulItemTags.FRUITS_HAMIMELON).addOptional(Util.rl(Mods.FRD, "hamimelon_slice"));
		this.tag(DelightfulItemTags.FRUITS_GREEN_APPLE).addOptional(Util.rl(Mods.BWG, BWGCompat.green_apple));
		this.tag(DelightfulItemTags.FRUITS_YUCCA).addOptional(Util.rl(Mods.BWG, BWGCompat.yucca));
		this.tag(DelightfulItemTags.FRUITS_BAOBAB).addOptional(Util.rl(Mods.BWG, BWGCompat.baobab));
		this.tag(DelightfulItemTags.FRUITS_PRICKLY_PEAR).addOptional(Util.rl(Mods.ECO, "prickly_pear"));
		this.tag(DelightfulItemTags.FRUITS_TORCHBERRIES).addOptional(Util.rl(Mods.TF, "torchberries"));
		this.tag(DelightfulItemTags.FRUITS_SOURCEBERRY).addOptional(Util.rl(Mods.AN, "sourceberry_bush"));
		this.tag(DelightfulItemTags.FRUITS_ELDERBERRY).addOptional(Util.rl(Mods.RC, "elderberry"));
		this.tag(DelightfulItemTags.FRUITS_BLACKCURRANT).addOptional(Util.rl(Mods.RC, "blackcurrant"));
		this.tag(DelightfulItemTags.FRUITS_REDCURRANT).addOptional(Util.rl(Mods.RC, "redcurrant"));
		this.tag(DelightfulItemTags.FRUITS_WHITECURRANT).addOptional(Util.rl(Mods.RC, "whitecurrant"));
		this.tag(DelightfulItemTags.FRUITS_GEARO_BERRY).addOptional(Util.rl(Mods.VD, "gearo_berry"));
		this.tag(DelightfulItemTags.FRUITS_BLUEBERRIES)
				.addOptional(Util.rl(Mods.BWG, "blueberries"))
				.addOptional(Util.rl(Mods.WB, "blueberries"))
				.addOptional(Util.rl("nutritious_feast", "blueberries"));
		this.tag(DelightfulItemTags.FRUITS_RASPBERRIES)
				.addOptional(Util.rl(Mods.WB, "raspberry"));
		this.tag(DelightfulItemTags.FRUITS_BLACKBERRIES)
				.addOptional(Util.rl(Mods.WB, "blackberry"));
		this.tag(DelightfulItemTags.FRUITS_CRANBERRIES)
				.addOptional(Util.rl(Mods.WB, "cranberries"));
		this.tag(DelightfulItemTags.FRUITS_WILD_BERRIES)
				.addOptional(Util.rl("windswept", "wild_berries"));
		this.tag(DelightfulItemTags.FRUITS_STRAWBERRIES)
				.addOptional(Util.rl(Mods.N, "strawberries"))
				.addOptional(Util.rl(Mods.N, "white_strawberries"));
		this.tag(DelightfulItemTags.FRUITS_BANANA)
				.addOptional(Util.rl(Mods.N, "banana"));
		this.tag(DelightfulItemTags.FRUITS_CHERRY)
				.addOptional(Util.rl(Mods.FA, "cherry_peach"));
		this.tag(DelightfulItemTags.FRUITS_MENDOSTEEN)
				.addOptional(Util.rl(Mods.AN, "mendosteen_pod"));
		this.tag(DelightfulItemTags.FRUITS_BOMBEGRANATE)
				.addOptional(Util.rl(Mods.AN, "bombegranate_pod"));
		this.tag(DelightfulItemTags.FRUITS_FROSTAYA)
				.addOptional(Util.rl(Mods.AN, "frostaya_pod"));
		this.tag(DelightfulItemTags.FRUITS_BASTION)
				.addOptional(Util.rl(Mods.AN, "bastion_pod"));
		this.tag(DelightfulItemTags.FRUITS).replace(false)
				.addTag(DelightfulItemTags.FRUITS_SWEET)
				.addTag(DelightfulItemTags.FRUITS_CITRUS)
				.addTag(DelightfulItemTags.FRUITS_CHORUS)
				.addTag(DelightfulItemTags.FRUITS_GREEN_APPLE)
				.addTag(DelightfulItemTags.FRUITS_YUCCA)
				.addTag(DelightfulItemTags.FRUITS_MENDOSTEEN)
				.addTag(DelightfulItemTags.FRUITS_BOMBEGRANATE)
				.addTag(DelightfulItemTags.FRUITS_FROSTAYA)
				.addTag(DelightfulItemTags.FRUITS_BASTION)
				.addOptional(Util.rl(Mods.UG, "droopvine_item"))
				.addOptional(Util.rl(Mods.EP, "oblifruit"));
		this.tag(ForgeTags.BERRIES).replace(false)
				.addTag(DelightfulItemTags.FRUITS_SWEET_BERRIES)
				.addTag(DelightfulItemTags.FRUITS_GLOW_BERRIES)
				.addTag(DelightfulItemTags.FRUITS_SALMONBERRIES)
				.addTag(DelightfulItemTags.FRUITS_TORCHBERRIES)
				.addTag(DelightfulItemTags.FRUITS_SOURCEBERRY)
				.addTag(DelightfulItemTags.FRUITS_ELDERBERRY)
				.addTag(DelightfulItemTags.FRUITS_BLACKCURRANT)
				.addTag(DelightfulItemTags.FRUITS_REDCURRANT)
				.addTag(DelightfulItemTags.FRUITS_WHITECURRANT)
				.addTag(DelightfulItemTags.FRUITS_BLUEBERRIES)
				.addTag(DelightfulItemTags.FRUITS_RASPBERRIES)
				.addTag(DelightfulItemTags.FRUITS_BLACKBERRIES)
				.addTag(DelightfulItemTags.FRUITS_CRANBERRIES)
				.addTag(DelightfulItemTags.FRUITS_CHERRY)
				.addTag(DelightfulItemTags.FRUITS_STRAWBERRIES)
				.addTag(DelightfulItemTags.FRUITS_WILD_BERRIES)
				.addTag(DelightfulItemTags.FRUITS_GEARO_BERRY)
				.addOptionalTag(Util.rl(Util.LOADER, "fruits/mulberry"))
				.addOptionalTag(Util.rl(Util.LOADER, "fruits/hawberry"))
				.addOptionalTag(Util.rl(Util.LOADER, "fruits/bayberry"))
				.addOptional(Util.rl(Mods.UG, "blisterberry"))
				.addOptional(Util.rl(Mods.EN, "zure_berry"))
				.addOptional(Util.rl(Mods.EP, "pream_berry"))
				.addOptional(Util.rl(Mods.UE, "warped_berries"))
				.addOptional(Util.rl("deep_aether", "goldenleaf_berries"))
				.addOptional(Util.rl(Mods.AER, "zanberry"));
		this.tag(DelightfulItemTags.FRUITS_CITRUS).replace(false)
				.addTag(DelightfulItemTags.FRUITS_CITRON)
				.addOptionalTag(DelightfulItemTags.FRUITS_MANDARIN.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_ORANGE.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_LEMON.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_LIME.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_GRAPEFRUIT.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_POMELO.location());
		this.tag(DelightfulItemTags.FRUITS_SWEET).replace(false)
				.addTag(DelightfulItemTags.FRUITS_APPLE)
				.addTag(DelightfulItemTags.FRUITS_MELON)
				.addTag(DelightfulItemTags.FRUITS_SWEET_BERRIES)
				.addTag(DelightfulItemTags.FRUITS_SALMONBERRIES)
				.addTag(DelightfulItemTags.FRUITS_CANTALOUPE)
				.addTag(DelightfulItemTags.FRUITS_KIWI)
				.addTag(DelightfulItemTags.FRUITS_PRICKLY_PEAR)
				.addTag(DelightfulItemTags.FRUITS_BANANA)
				.addTag(DelightfulItemTags.FRUITS_STRAWBERRIES)
				.addTag(DelightfulItemTags.FRUITS_CHERRY)
				.addTag(DelightfulItemTags.FRUITS_BLUEBERRIES)
				.addTag(DelightfulItemTags.FRUITS_RASPBERRIES)
				.addTag(DelightfulItemTags.FRUITS_BLACKBERRIES)
				.addTag(DelightfulItemTags.FRUITS_CRANBERRIES)
				.addTag(DelightfulItemTags.FRUITS_WILD_BERRIES)
				.addTag(DelightfulItemTags.FRUITS_RAMBUTAN)
				.addTag(DelightfulItemTags.FRUITS_PITAYA)
				.addTag(DelightfulItemTags.FRUITS_JABUTICABA)
				.addTag(DelightfulItemTags.FRUITS_KIWANO)
				.addTag(DelightfulItemTags.FRUITS_HAMIMELON)
				.addTag(DelightfulItemTags.FRUITS_BAOBAB)
				.addOptionalTag(DelightfulItemTags.FRUITS_ORANGE.location())
				.addOptionalTag(DelightfulItemTags.FRUITS_MANDARIN.location())
				.addOptionalTag(Util.rl(Util.LOADER, "fruits/redlove"));
		this.tag(DelightfulItemTags.VEGETABLES_SPICY)
				.addOptionalTag(Util.rl(Util.LOADER, "chilipepper"))
				.addOptionalTag(Util.rl(Util.LOADER, "vegetables/ghost_pepper"))
				.addOptionalTag(Util.rl(Mods.CR, "hot_nether_fruit"))
				.addOptional(Util.rl(Mods.MND, "bullet_pepper"));
		this.tag(DelightfulItemTags.VEGETABLES_CORN)
				.addOptionalTag(Util.rl(Util.LOADER, "grain/corn"))
				.addOptional(Util.rl("hauntedharvest", "corn"))
				.addOptional(Util.rl("corn_delight", "corn"));
		this.tag(DelightfulItemTags.VEGETABLES_GINGER)
				.addTag(DelightfulItemTags.CROPS_GINGER);
		this.tag(DelightfulItemTags.VEGETABLES_CUCUMBER)
				.addOptional(Util.rl(Mods.CD, "cucumber"));
		this.tag(DelightfulItemTags.CUCUMBER).addTag(DelightfulItemTags.VEGETABLES_CUCUMBER);
		this.tag(DelightfulItemTags.HOT_SPICE)
				.add(Items.BLAZE_POWDER)
				.addTag(DelightfulItemTags.VEGETABLES_SPICY)
				.addOptionalTag(Util.rl(Mods.MND, "hot_spice"));
		this.tag(DelightfulItemTags.PUMPKINS_CARVED)
				.add(Items.CARVED_PUMPKIN)
				.addOptional(Util.rl("autumnity", "carved_large_pumpkin_slice"));
		this.tag(DelightfulItemTags.PUMPKINS)
				.addTag(DelightfulItemTags.PUMPKINS_CARVED)
				.add(Items.PUMPKIN)
				.addOptional(Util.rl("autumnity", "large_pumpkin_slice"));
		this.tag(DelightfulItemTags.COCONUT).addOptional(Util.rl(Mods.ECO, "coconut_slice"));
		this.tag(DelightfulItemTags.NUTS_WALNUT)
				.addOptional(Util.rl(Mods.ECO, "walnut"))
				.addOptional(Util.rl("caupona", "walnut"));
		this.tag(DelightfulItemTags.NUTS_PEANUT)
				.addOptionalTag(Util.rl(Util.LOADER, "peanut"))
				.addOptional(Util.rl("sprout", "peanut"));
		this.tag(DelightfulItemTags.NUTS_ACORN)
				.add(DelightfulItems.ACORN.get());
		this.tag(DelightfulItemTags.NUTS)
				.addTag(DelightfulItemTags.NUTS_ACORN)
				.addTag(DelightfulItemTags.NUTS_WALNUT)
				.addTag(DelightfulItemTags.NUTS_PEANUT)
				.addOptional(Util.rl("windswept", "chestnuts"))
				.addOptional(Util.rl("alexscaves", "pine_nuts"));
		this.tag(DelightfulItemTags.COOKED_NUTS)
				.add(DelightfulItems.ROASTED_ACORN.get())
				.addOptional(Util.rl(Mods.VD, "roasted_peanut"));
		this.tag(DelightfulItemTags.INGOTS_STEEL).addOptional(Util.rl("simplysteel", "steel_ingot"));
		this.tag(DelightfulItemTags.WATER).add(Items.WATER_BUCKET);
		this.tag(DelightfulItemTags.JAMS)
				.add(DelightfulItems.JAM_JAR.get())
				.add(DelightfulItems.GLOW_JAM_JAR.get())
				.addOptionalTag(Util.rl(Util.LOADER, "jam"))
				.addOptionalTag(Util.rl(Util.LOADER, "jam_bottles"))
				.addOptionalTag(Util.rl(Mods.WB, "berry_jams"))
				.addOptionalTag(Util.rl(Mods.VD, "sweet_jam_bottles"))
				.addOptional(Util.rl("upgrade_aquatic", "mulberry_jam_bottle"));
		this.tag(DelightfulItemTags.PEANUT_BUTTER)
				.addOptional(Util.rl("thermal", "peanut_butter"))
				.addOptional(Util.rl("croptopia", "peanut_butter"));
		this.tag(DelightfulItemTags.NUT_BUTTER)
				.addTag(DelightfulItemTags.PEANUT_BUTTER)
				.add(DelightfulItems.NUT_BUTTER_BOTTLE.get())
				.addOptional(Util.rl(Mods.VD, "nut_mash_bottle"));
		this.tag(DelightfulItemTags.SUGAR).add(Items.SUGAR);
		this.tag(DelightfulItemTags.RAW_CRAB) // Whole Crab
				.addOptional(Util.rl(Mods.CRAB, "crab"))
				.addOptionalTag(Util.rl("finsandtails", "spindly_gem_crabs"));
		this.tag(DelightfulItemTags.COOKED_CRAB) // Whole Crab
				.addOptional(Util.rl(Mods.CRAB, "cooked_crab"));
		this.tag(DelightfulItemTags.CRAB_MEAT)
				.addOptional(Util.rl(Mods.ECO, "crab_meat"));
		this.tag(DelightfulItemTags.CRAB_CLAW_COOKED)
				.addOptional(Util.rl(Mods.CR, "chieftain_claw"))
				.addOptional(Util.rl("finsandtails", "cooked_bull_crab_claw"));
		this.tag(DelightfulItemTags.CRAB_CLAW)
				.addTag(DelightfulItemTags.CRAB_CLAW_COOKED)
				.addOptional(Util.rl(Mods.CRAB, "crab_claw"))
				.addOptional(Util.rl(Mods.ECO, "crab_claw"))
				.addOptional(Util.rl("finsandtails", "red_bull_crab_claw"))
				.addOptional(Util.rl("finsandtails", "white_bull_crab_claw"));
		this.tag(DelightfulItemTags.CHEESE)
				.addOptionalTag(Util.rl(Util.LOADER, "cheeses"))
				.addOptional(Util.rl("brewinandchewin", "flaxen_cheese_wedge"))
				.addOptional(Util.rl("farmlife", "tribull_cheese_wedge"))
				.addOptional(Util.rl("croptopia", "cheese"))
				.addOptional(Util.rl("thermal", "cheese_wedge"))
				.addOptional(Util.rl("casualness_delight", "cheese_wheel_slice"));
		this.tag(ForgeTags.MILK)
				.addOptional(Util.rl(Mods.AE, "skyroot_milk_bucket"))
				.addOptional(Util.rl("farmlife", "tribull_milk"))
				.addOptional(Util.rl("dracovitadelight", "tribull_milk"));
		this.tag(DelightfulItemTags.TEA_LEAVES_GREEN)
				.add(DelightfulItems.GREEN_TEA_LEAF.get())
				.addOptional(Util.rl(Mods.FR, "green_tea_leaves"))
				.addOptional(Util.rl("croptopia", "tea_leaves"));
		this.tag(DelightfulItemTags.TEA_LEAVES)
				.addTag(DelightfulItemTags.TEA_LEAVES_GREEN)
				.addOptionalTag(Util.rl(Mods.FR, "tea_leaves"));
		this.tag(DelightfulItemTags.RAW_FISHES_KOI)
				.addOptional(Util.rl("environmental", "koi"))
				.addOptional(Util.rl("crittersandcompanions", "koi_fish"));
		this.tag(DelightfulItemTags.RAW_FISHES_TUNA)
				.addOptional(Util.rl("spawn", "tuna_chunk"));
		this.tag(DelightfulItemTags.COOKED_FISHES_TUNA)
				.addOptional(Util.rl("spawn", "cooked_tuna_chunk"));
		this.tag(ForgeTags.RAW_FISHES)
				.addTag(DelightfulItemTags.RAW_FISHES_KOI)
				.addTag(DelightfulItemTags.RAW_FISHES_TUNA)
				.addOptional(Util.rl("biomemakeover", "glowfish"))
				.addOptional(Util.rl("deep_aether", "raw_aerglow_fish"))
				.addOptional(Util.rl("spawn", "angler_fish"))
				.addOptional(Util.rl("bettas", "betta_fish"));
		this.tag(ForgeTags.COOKED_FISHES)
				.addTag(DelightfulItemTags.COOKED_FISHES_TUNA)
				.addOptional(Util.rl("biomemakeover", "cooked_glowfish"))
				.addOptional(Util.rl("deep_aether", "cooked_aerglow_fish"));
		this.tag(DelightfulItemTags.TD_VENISON_RAW)
				.addOptional(Util.rl(Mods.TF, "raw_venison"))
				.addOptional(Util.rl(Mods.NA, "venison"))
				.addOptional(Util.rl("goodall", "raw_venison"))
				.addOptional(Util.rl("blue_skies", "venison"));
		this.tag(DelightfulItemTags.RAW_VENISON_COMPAT)
				.addTag(DelightfulItemTags.TD_VENISON_RAW);
		this.tag(DelightfulItemTags.RAW_VENISON)
				.add(DelightfulItems.VENISON_CHOPS.get())
				.addTag(DelightfulItemTags.RAW_VENISON_COMPAT);
		this.tag(DelightfulItemTags.TD_VENISON_COOKED)
				.addOptional(Util.rl(Mods.TF, "cooked_venison"))
				.addOptional(Util.rl(Mods.NA, "cooked_venison"))
				.addOptional(Util.rl("goodall", "cooked_venison"))
				.addOptional(Util.rl("blue_skies", "cooked_venison"));
		this.tag(DelightfulItemTags.COOKED_VENISON_COMPAT)
				.addTag(DelightfulItemTags.TD_VENISON_COOKED);
		this.tag(DelightfulItemTags.COOKED_VENISON)
				.add(DelightfulItems.COOKED_VENISON_CHOPS.get())
				.addTag(DelightfulItemTags.COOKED_VENISON_COMPAT);
		this.tag(DelightfulItemTags.RAW_GOAT)
				.add(DelightfulItems.RAW_GOAT.get());
		this.tag(DelightfulItemTags.COOKED_GOAT)
				.add(DelightfulItems.COOKED_GOAT.get());
		this.tag(DelightfulItemTags.RAW_MEAT)
				.addTag(ForgeTags.RAW_FISHES)
				.addTag(ForgeTags.RAW_CHICKEN)
				.addTag(ForgeTags.RAW_BEEF)
				.addTag(ForgeTags.RAW_PORK)
				.addTag(ForgeTags.RAW_MUTTON)
				.addTag(DelightfulItemTags.RAW_VENISON)
				.addTag(DelightfulItemTags.RAW_CRAB)
				.addTag(DelightfulItemTags.RAW_GOAT)
				.addOptional(Util.rl("frog_legs", "frog_legs"));
		this.tag(DelightfulItemTags.COOKED_MEAT)
				.addTag(ForgeTags.COOKED_FISHES)
				.addTag(ForgeTags.COOKED_CHICKEN)
				.addTag(ForgeTags.COOKED_BEEF)
				.addTag(ForgeTags.COOKED_PORK)
				.addTag(ForgeTags.COOKED_MUTTON)
				.addTag(DelightfulItemTags.COOKED_VENISON)
				.addTag(DelightfulItemTags.COOKED_CRAB)
				.addTag(DelightfulItemTags.COOKED_GOAT)
				.addOptional(Util.rl("frog_legs", "cooked_frog_legs"));
		this.tag(DelightfulItemTags.FOOD_MEAT)
				.addTag(DelightfulItemTags.RAW_MEAT)
				.addTag(DelightfulItemTags.COOKED_MEAT);
		this.tag(DelightfulItemTags.PROTEIN_PATTY)
				.add(ModItems.BEEF_PATTY.get())
				.addOptional(Util.rl(Mods.MD, "vegan_patty"));
		this.tag(DelightfulItemTags.COOKED_BEEF_OR_VEGAN)
				.addTag(ForgeTags.COOKED_BEEF)
				.addTag(DelightfulItemTags.PROTEIN_PATTY);
		this.tag(DelightfulItemTags.CATTAIL)
				.addOptional(Util.rl("sprout", "cattail"))
				.addOptional(Util.rl(Mods.BOP, "cattail"))
				.addOptional(Util.rl("biomemakeover", "cattail"));
		this.tag(DelightfulItemTags.GEMS_ROSE_QUARTZ)
				.addOptional(Util.rl(Mods.BOP, "rose_quartz_chunk"))
				.addOptional(Util.rl(Mods.C, "rose_quartz"));
		this.tag(DelightfulItemTags.GEMS_ZANITE).addOptional(Util.rl(Mods.AE, "zanite_gemstone"));
		this.tag(DelightfulItemTags.CHOCOLATE)
				.addOptionalTag(Util.rl(Util.LOADER, "chocolates"))
				.addOptionalTag(Util.rl(Util.LOADER, "bars/chocolate"))
				.addOptionalTag(Util.rl(Util.LOADER, "chocolatebar"))
				.addOptional(Util.rl(Mods.N, "chocolate_bar"))
				.addOptional(Util.rl(Mods.C, "bar_of_chocolate"));
		this.tag(ForgeTags.SALAD_INGREDIENTS)
				.add(DelightfulItems.CHOPPED_CLOVER.get())
				.addOptional(Util.rl("babyfat", "water_lettuce"));
		this.tag(DelightfulItemTags.SEEDS_SALMONBERRY)
				.add(DelightfulItems.SALMONBERRY_PIPS.get());
		this.tag(DelightfulItemTags.SEEDS_CANTALOUPE)
				.add(DelightfulItems.CANTALOUPE_SEEDS.get());
		this.tag(ForgeTags.SEEDS)
				.addTag(DelightfulItemTags.SEEDS_SALMONBERRY)
				.addTag(DelightfulItemTags.SEEDS_CANTALOUPE)
				.addOptional(Util.rl(Mods.FR, "tea_seeds"));
		this.tag(DelightfulItemTags.TORTILLA)
				.addOptional(Util.rl(Mods.CD, "tortilla"));
		this.tag(Tags.Items.SEEDS)
				.addOptional(Util.rl(Mods.VD, "oat_seeds"))
				.addOptional(Util.rl(Mods.VD, "ghost_pepper_seeds"))
				.addOptional(Util.rl(Mods.VD, "cucumber_seeds"))
				.addOptional(Util.rl(Mods.FRD, "lemon_seeds"))
				.addOptional(Util.rl(Mods.FRD, "hamimelon_seeds"));
		this.tag(DelightfulItemTags.BONES)
				.addOptional(Util.rl(Mods.DD, "sculk_bone"))
				.addOptional(Util.rl("alexscaves", "heavy_bone"));
		this.tag(DelightfulItemTags.SYRUP)
				.addOptionalTag(Util.rl(Mods.SUP, "pancake_syrup"))
				.addOptional(Util.rl("autumnity", "syrup_bottle"));
		this.tag(DelightfulItemTags.COOKIES)
				.add(Items.COOKIE)
				.add(DelightfulItems.SOURCE_BERRY_COOKIE.get())
				.add(ModItems.HONEY_COOKIE.get())
				.add(ModItems.SWEET_BERRY_COOKIE.get())
				.addOptional(Util.rl(Mods.FR, "green_tea_cookie"))
				.addOptional(Util.rl("snowyspirit", "gingerbread_cookie"))
				.addOptional(Util.rl(Mods.AD, "mulberry_cookie"))
				.addOptional(Util.rl(Mods.AD, "maple_cookie"))
				.addOptional(Util.rl("exquisito", "chorus_cookie"))
				.addOptional(Util.rl("ends_delight", "chorus_cookie"))
				.addOptional(Util.rl(Mods.MD, "bat_cookie"))
				.addOptional(Util.rl("sunflowerdelight", "shortbread_cookie"))
				.addOptional(Util.rl(Mods.VD, "oatmeal_cookie"))
				.addOptional(Util.rl(Mods.FRD, "persimmon_cookie"))
				.addOptional(Util.rl(Mods.FRD, "lemon_cookie"))
				.addOptional(Util.rl(Mods.FRD, "cranberry_cookie"))
				.addOptional(Util.rl(Mods.FRD, "bayberry_cookie"))
				.addOptional(Util.rl("vampiresdelight", "orchid_cookie"));
		this.tag(Util.it(Mods.SUP, "cookies"))
				.addTag(DelightfulItemTags.COOKIES)
				.addTag(DelightfulItemTags.BREAD_SLICES);
		this.tag(DelightfulItemTags.ROPES)
				.add(ModItems.ROPE.get())
				.addOptionalTag(Util.rl(Mods.SUP, "ropes"))
				.addOptional(Util.rl(Mods.AA, "rope"));
		this.tag(DelightfulItemTags.FEATHERS)
				.addOptional(Util.rl(Mods.ECO, "penguin_feather"));

		// Minecraft
		this.tag(ItemTags.SMALL_FLOWERS)
				.addTag(DelightfulItemTags.FLOWERS_AZALEA);
		this.tag(DelightfulItemTags.FLOWERS_AZALEA)
				.addOptional(Util.rl(Mods.ECO, "azalea_flower"))
				.addOptional(Util.rl("twigs", "azalea_flowers"));
		this.tag(ItemTags.FOX_FOOD)
				.addTag(ForgeTags.BERRIES);
		this.tag(ItemTags.SMALL_FLOWERS)
				.add(DelightfulItems.WILD_SALMONBERRIES.get());
		this.tag(ItemTags.PIGLIN_LOVED).add(Knives.REFINED_GLOWSTONE.get());
		this.tag(ForgeTags.TOOLS_KNIVES)
				.addTag(ModTags.KNIVES)
				.addOptional(Util.rl("occultism", "butcher_knife"));
		var build = tag(ModTags.KNIVES);
		DelightfulItems.ITEMS.getEntries().stream()
				.map(RegistryObject::get)
				.filter(item -> item instanceof DelightfulKnifeItem)
				.forEach(build::add);

		// Nether's Delight
		this.tag(DelightfulItemTags.MEAL_ITEM)
				.add(DelightfulItems.STUFFED_CANTALOUPE.get())
				.addOptional(Util.rl(Mods.MD, "bowl_of_stuffed_squid"));

		// Ecologics
		this.addSelf(DelightfulItemTags.COOKED_PRICKLY_PEAR);

		// Forbidden and Arcanus
		this.addSelf(DelightfulItemTags.DRACO_ARCANUS_STAFF);
		this.addSelf(DelightfulItemTags.DRAGON_SCALE);

		// Deeper and Darker
		this.addSelf(DelightfulItemTags.REINFORCED_ECHO_SHARD);
		this.addSelf(DelightfulItemTags.RESONARIUM);
		this.addSelf(DelightfulItemTags.RESONARIUM_PLATE);

		// Create
		this.addSelf(DelightfulItemTags.POLISHED_ROSE_QUARTZ);
		this.addSelf(DelightfulItemTags.ZINC_HANDLE);
		this.addSelf(DelightfulItemTags.HEAP_EXPERIENCE);

		// Seeds
		this.addSelf(DelightfulItemTags.SHARP_LEAF);

		// Nether's Exoticism
		this.addSelf(DelightfulItemTags.KIWANO_PEEL);
		this.tag(DelightfulItemTags.FRUITS_CITRON).addOptional(Util.rl("nethers_exoticism", "bouddha_s_hand"));
		this.tag(DelightfulItemTags.FRUITS_JABUTICABA).addOptional(Util.rl("nethers_exoticism", "jaboticaba"));
		this.tag(DelightfulItemTags.FRUITS_PITAYA).addOptional(Util.rl("nethers_exoticism", "pitaya"));
		this.tag(DelightfulItemTags.FRUITS_RAMBUTAN).addOptional(Util.rl("nethers_exoticism", "ramboutan"));
		this.tag(DelightfulItemTags.FRUITS_KIWANO).addOptional(Util.rl("nethers_exoticism", "kiwano"));

		// Create
		this.tag(DelightfulItemTags.UPRIGHT_ON_BELT)
				.addTag(DelightfulItemTags.JAMS)
				.add(DelightfulItems.NUT_BUTTER_BOTTLE.get())
				.add(DelightfulItems.PRICKLY_PEAR_JUICE.get())
				.add(DelightfulItems.ENDER_NECTAR.get())
				.add(DelightfulItems.AZALEA_TEA.get())
				.add(DelightfulItems.LAVENDER_TEA.get())
				.add(DelightfulItems.MATCHA_LATTE.get())
				.add(DelightfulItems.BERRY_MATCHA_LATTE.get())
				.add(DelightfulItems.ANIMAL_OIL_BOTTLE.get())
				.add(DelightfulItems.SALMONBERRY_PIE.get())
				.addOptional(Util.rl(Mods.FR, "green_tea"))
				.addOptional(Util.rl(Mods.FR, "yellow_tea"))
				.addOptional(Util.rl(Mods.FR, "black_tea"))
				.addOptional(Util.rl(Mods.FR, "rose_hip_tea"))
				.addOptional(Util.rl(Mods.FR, "dandelion_tea"))
				.addOptional(Util.rl(Mods.FR, "purulent_tea"))
				.addOptional(Util.rl(Mods.FR, "gamblers_tea"));

		// Serene Seasons
		this.tag(DelightfulItemTags.SUMMER_CROPS)
				.addTag(DelightfulItemTags.SEEDS_SALMONBERRY)
				.addTag(DelightfulItemTags.SEEDS_CANTALOUPE);

		// Phantasm
		this.addSelf(DelightfulItemTags.VOID_CRYSTAL_BLOCK);
		this.tag(DelightfulItemTags.CRYSTAL_SPIKE_TIPS)
				.addOptional(Util.rl(Mods.EP, "crystal_spike_tip"))
				.addOptional(Util.rl(Mods.EP, "void_crystal_spike_tip"));
		this.tag(DelightfulItemTags.XP_BOOSTED)
				.add(Knives.CRYSTALLINE.get());

		this.tag(DelightfulItemTags.SOUL_STEEL_INGOT)
				.addOptional(Util.rl("spirit", "soul_steel_ingot"));
		this.tag(DelightfulItemTags.SOUL_STEEL_MAINHAND).add(Knives.SOUL_STEEL.get());

		// Botania
		this.addSelf(DelightfulItemTags.LIVINGWOOD_TWIG);
		this.addSelf(DelightfulItemTags.DREAMWOOD_TWIG);
		this.tag(DelightfulItemTags.MANA_ITEMS)
				.add(Knives.MANASTEEL.get())
				.add(Knives.ELEMENTIUM.get())
				.add(Knives.TERRA.get());
		this.tag(DelightfulItems.ingot("alfsteel"))
				.addOptional(Util.rl("mythicbotany", "alfsteel_ingot"));

		// Additional Additions
		this.addSelf(DelightfulItemTags.ROSE_GOLD_ALLOY);
		this.addSelf(DelightfulItemTags.GOLD_RING);
		this.addSelf(GildedNetheriteKnifeItem.upgrade);
		this.addSelf(RoseGoldKnifeItem.upgrade);

		// Enderite
		this.addSelf(EnderiteKnifeItem.upgrade);

		// Nourished Nether
		this.tag(DelightfulItemTags.NECRONIUM_INGOT)
				.addOptional(Util.rl("nourished_nether", "necronium_ingot"));
		this.tag(DelightfulItemTags.NECRONIUM_TOOLS).add(Knives.NECRONIUM.get());

		// Undergarden
		this.tag(DelightfulItemTags.CLOGGRUM_ITEMS).add(Knives.CLOGGRUM.get());
		this.tag(DelightfulItemTags.FROSTSTEEL_ITEMS).add(Knives.FROSTSTEEL.get());
		this.tag(DelightfulItemTags.UTHERIUM_ITEMS).add(Knives.UTHERIUM.get());
		this.addSelf(ForgottenKnifeItem.upgrade);

		// Aether
		this.addSelf(DelightfulItemTags.ENCHANTED_GRAVITITE);
		this.addSelf(DelightfulItemTags.HOLYSTONE);

		// Aether Redux
		this.tag(Util.it(Mods.AER, "veridium_advancement_infusable"))
				.add(Knives.VERIDIUM.get());
		this.tag(Util.it(Mods.AER, "infused_veridium_items"))
				.add(Knives.INFUSED_VERIDIUM.get());
		this.tag(DelightfulItemTags.INGOTS_VERIDIUM)
				.addOptional(Util.rl(Mods.AER, "veridium_ingot"));
		this.tag(DelightfulItemTags.INGOTS_GRAVITITE)
				.addOptional(Util.rl(Mods.AER, "gravitite_ingot"));

		// Deep Aether
		this.tag(DelightfulItemTags.GEMS_SKYJADE)
				.addOptionalTag(Util.rl("deep_aether", "skyjade_repairing"));
		this.tag(DelightfulItemTags.INGOTS_STRATUS)
				.addOptionalTag(Util.rl("deep_aether", "stratus_repairing"));
		this.addSelf(DelightfulItemTags.STRATUS_UPGRADE);

		// Ancient Aether
		this.addSelf(Util.it("ancient_aether", "valkyrum"));

		// Aether: Lost Content Addon
		this.tag(Util.it("lost_aether_content", "phoenix_tools")).add(Knives.PHOENIX.get());

		// AE2
		this.addSelf(DelightfulItemTags.FLUIX_BLOCK);
		this.addSelf(DelightfulItemTags.FLUIX_UPGRADE_SMITHING_TEMPLATE);
		this.tag(DelightfulItemTags.QUARTZ_KNIFE)
				.add(Knives.NETHER_QUARTZ.get())
				.add(Knives.CERTUS_QUARTZ.get());

		// Neapolitan
		this.tag(Util.it(Mods.N, "ice_cream"))
				.add(DelightfulItems.MATCHA_ICE_CREAM.get())
				.add(DelightfulItems.SALMONBERRY_ICE_CREAM.get())
				.add(DelightfulItems.SOURCE_BERRY_ICE_CREAM.get());

		// Ars Nouveau
		this.tag(Util.it(Mods.AN, "magic_food"))
				.add(DelightfulItems.SOURCE_BERRY_PIE_SLICE.get())
				.add(DelightfulItems.SOURCE_BERRY_COOKIE.get())
				.add(DelightfulItems.SOURCE_BERRY_GUMMY.get())
				.add(DelightfulItems.SOURCE_BERRY_ICE_CREAM.get())
				.add(DelightfulItems.SOURCE_BERRY_MILKSHAKE.get());

		// Naturalist
		this.tag(Util.it(Mods.NA, "bird_food_items")).addTag(Tags.Items.SEEDS);
		this.tag(Util.it(Mods.NA, "tortoise_tempt_items")).add(DelightfulItems.CACTUS_FLESH.get());

		// Sully's Mod
		this.tag(Util.it("sullysmod", "tortoise_food"))
				.addTag(ForgeTags.BERRIES)
				.add(DelightfulItems.CACTUS_FLESH.get())
				.add(ModItems.PUMPKIN_SLICE.get())
				.add(DelightfulItems.CANTALOUPE_SLICE.get())
				.addOptionalTag(Util.rl(Util.LOADER, "fruits/hamimelon"))
				.addOptional(Util.rl(Mods.UGD, "gloomgourd_slice"));

	}

	/**
	 * Gets a name for this provider, to use in logging.
	 */
	@Override
	public @NotNull String getName() {
		return Delightful.MODID;
	}

	private void addSelf(TagKey<Item> item) {
		this.tag(item).addOptional(item.location());
	}
}