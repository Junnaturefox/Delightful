package net.brnbrd.delightful.data.tags;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.knife.Knives;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.FarmersDelight;

public class DelightfulItemTags {

	// Delightful
	public static final TagKey<Item> COMPAT_PIES = Util.it(Delightful.MODID, "compat_pies");
	public static final TagKey<Item> FIRE_KNIVES = Util.it(Delightful.MODID, "fire_knives");

	// Minecraft
	public static final TagKey<Item> FLOWERS_AZALEA = Util.it("minecraft", "flowers/azalea");

	// Forge
	public static final TagKey<Item> FRUITS = forge("fruits");
	public static final TagKey<Item> FRUITS_APPLE = forge("fruits/apple");
	public static final TagKey<Item> FRUITS_KIWI = forge("fruits/kiwi");
	public static final TagKey<Item> FRUITS_MELON = forge("fruits/melon");
	public static final TagKey<Item> FRUITS_CANTALOUPE = forge("fruits/cantaloupe");
	public static final TagKey<Item> FRUITS_HAMIMELON = forge("fruits/hamimelon");
	public static final TagKey<Item> FRUITS_CHORUS = forge("fruits/chorus");
	public static final TagKey<Item> FRUITS_SWEET_BERRIES = forge("fruits/sweet_berries");
	public static final TagKey<Item> FRUITS_GLOW_BERRIES = forge("fruits/glow_berries");
	public static final TagKey<Item> FRUITS_SALMONBERRIES = forge("fruits/salmonberries");
	public static final TagKey<Item> FRUITS_STRAWBERRIES = forge("fruits/strawberries");
	public static final TagKey<Item> FRUITS_TORCHBERRIES = forge("fruits/torchberries");
	public static final TagKey<Item> FRUITS_SOURCEBERRY = forge("fruits/sourceberry");
	public static final TagKey<Item> FRUITS_ELDERBERRY = forge("fruits/elderberry");
	public static final TagKey<Item> FRUITS_GEARO_BERRY = forge("fruits/gearo_berry");
	public static final TagKey<Item> FRUITS_REDCURRANT = forge("fruits/redcurrant");
	public static final TagKey<Item> FRUITS_BLACKCURRANT = forge("fruits/blackcurrant");
	public static final TagKey<Item> FRUITS_WHITECURRANT = forge("fruits/whitecurrant");
	public static final TagKey<Item> FRUITS_BLUEBERRIES = forge("fruits/blueberries");
	public static final TagKey<Item> FRUITS_RASPBERRIES = forge("fruits/raspberries");
	public static final TagKey<Item> FRUITS_BLACKBERRIES = forge("fruits/blackberries");
	public static final TagKey<Item> FRUITS_CRANBERRIES = forge("fruits/cranberries");
	public static final TagKey<Item> FRUITS_WILD_BERRIES = forge("fruits/wild_berries");
	public static final TagKey<Item> FRUITS_GREEN_APPLE = forge("fruits/green_apple");
	public static final TagKey<Item> FRUITS_YUCCA = forge("fruits/yucca");
	public static final TagKey<Item> FRUITS_BAOBAB = forge("fruits/baobab");
	public static final TagKey<Item> FRUITS_BANANA = forge("fruits/banana");
	public static final TagKey<Item> FRUITS_MANDARIN = forge("fruits/mandarin");
	public static final TagKey<Item> FRUITS_ORANGE = forge("fruits/orange");
	public static final TagKey<Item> FRUITS_LEMON = forge("fruits/lemon");
	public static final TagKey<Item> FRUITS_LIME = forge("fruits/lime");
	public static final TagKey<Item> FRUITS_GRAPEFRUIT = forge("fruits/grapefruit");
	public static final TagKey<Item> FRUITS_POMELO = forge("fruits/pomelo");
	public static final TagKey<Item> FRUITS_CHERRY = forge("fruits/cherry");
	public static final TagKey<Item> FRUITS_CITRON = forge("fruits/citron");
	public static final TagKey<Item> FRUITS_PITAYA = forge("fruits/pitaya");
	public static final TagKey<Item> FRUITS_RAMBUTAN = forge("fruits/rambutan");
	public static final TagKey<Item> FRUITS_JABUTICABA = forge("fruits/jabuticaba");
	public static final TagKey<Item> FRUITS_KIWANO = forge("fruits/kiwano");
	public static final TagKey<Item> FRUITS_SWEET = forge("fruits/sweet");
	public static final TagKey<Item> FRUITS_PRICKLY_PEAR = forge("fruits/prickly_pear");
	public static final TagKey<Item> FRUITS_CITRUS = forge("fruits/citrus");
	public static final TagKey<Item> FRUITS_BASTION = forge("fruits/bastion");
	public static final TagKey<Item> FRUITS_MENDOSTEEN = forge("fruits/mendosteen");
	public static final TagKey<Item> FRUITS_FROSTAYA = forge("fruits/frostaya");
	public static final TagKey<Item> FRUITS_BOMBEGRANATE = forge("fruits/bomegranate");
	public static final TagKey<Item> VEGETABLES_CORN = forge("vegetables/corn");
	public static final TagKey<Item> VEGETABLES_GINGER = forge("vegetables/ginger");
	public static final TagKey<Item> VEGETABLES_CUCUMBER = forge("vegetables/cucumber");
	public static final TagKey<Item> CUCUMBER = forge("cucumber");
	public static final TagKey<Item> VEGETABLES_SPICY = forge("vegetables/spicy");
	public static final TagKey<Item> CROPS_CARROT = forge("crops/carrot");
	public static final TagKey<Item> CROPS_BEETROOT = forge("crops/beetroot");
	public static final TagKey<Item> CROPS_GINGER = forge("crops/ginger");
	public static final TagKey<Item> HOT_SPICE = forge("hot_spice");
	public static final TagKey<Item> PUMPKINS = forge("pumpkins");
	public static final TagKey<Item> PUMPKINS_CARVED = forge("pumpkins/carved");
	public static final TagKey<Item> CHOCOLATE = forge("chocolate");
	public static final TagKey<Item> CHEESE = forge("cheese");
	public static final TagKey<Item> RAW_CRAB = forge("raw_crab");
	public static final TagKey<Item> COOKED_CRAB = forge("cooked_crab");
	public static final TagKey<Item> CRAB_LEGS = forge("crab_legs");
	public static final TagKey<Item> CRAB_MEAT = forge("crab_meat");
	public static final TagKey<Item> CRAB_CLAW = forge("crab_claw");
	public static final TagKey<Item> CRAB_CLAW_COOKED = forge("crab_claw/cooked");
	public static final TagKey<Item> COCONUT = forge("coconut");
	public static final TagKey<Item> NUTS = forge("nuts");
	public static final TagKey<Item> NUTS_WALNUT = forge("nuts/walnut");
	public static final TagKey<Item> NUTS_PEANUT = forge("nuts/peanut");
	public static final TagKey<Item> NUTS_ACORN = forge("nuts/acorn");
	public static final TagKey<Item> COOKED_NUTS = forge("cooked_nuts");
	public static final TagKey<Item> SUGAR = forge("sugar");
	public static final TagKey<Item> WATER = forge("water");
	public static final TagKey<Item> TEA_LEAVES = forge("tea_leaves");
	public static final TagKey<Item> TEA_LEAVES_GREEN = forge("tea_leaves/green");
	public static final TagKey<Item> JAMS = forge("jams");
	public static final TagKey<Item> PEANUT_BUTTER = forge("peanut_butter");
	public static final TagKey<Item> NUT_BUTTER = forge("nut_butter");
	public static final TagKey<Item> RAW_FISHES_KOI = forge("raw_fishes/koi");
	public static final TagKey<Item> RAW_FISHES_TUNA = forge("raw_fishes/tuna");
	public static final TagKey<Item> COOKED_FISHES_TUNA = forge("cooked_fishes/tuna");
	public static final TagKey<Item> TD_VENISON_RAW = Util.it("twilightdelight", "venison_raw"); // Twilight Delight
	public static final TagKey<Item> TD_VENISON_COOKED = Util.it("twilightdelight", "venison_cooked"); // Twilight Delight
	public static final TagKey<Item> RAW_VENISON = forge("raw_venison");
	public static final TagKey<Item> RAW_VENISON_COMPAT = forge("raw_venison_compat");
	public static final TagKey<Item> COOKED_VENISON = forge("cooked_venison");
	public static final TagKey<Item> COOKED_VENISON_COMPAT = forge("cooked_venison_compat");
	public static final TagKey<Item> RAW_GOAT_COMPAT = forge("raw_goat_compat");
	public static final TagKey<Item> RAW_GOAT = forge("raw_goat");
	public static final TagKey<Item> COOKED_GOAT = forge("cooked_goat");
	public static final TagKey<Item> RAW_MEAT = forge("raw_meat");
	public static final TagKey<Item> COOKED_MEAT = forge("cooked_meat");
	public static final TagKey<Item> FOOD_MEAT = forge("food/meat");
	public static final TagKey<Item> PROTEIN_PATTY = forge("protein_patty");
	public static final TagKey<Item> COOKED_BEEF_OR_VEGAN = forge("cooked_beef_or_vegan");
	public static final TagKey<Item> CATTAIL = forge("cattail");
	public static final TagKey<Item> ICE_CUBES = forge("ice_cubes");
	public static final TagKey<Item> TORTILLA = forge("tortilla");
	public static final TagKey<Item> SYRUP = forge("syrup");
	public static final TagKey<Item> LAVENDER = forge("lavender");
	public static final TagKey<Item> CLOVER = forge("clover");
	public static final TagKey<Item> CACTI = forge("cacti");
	public static final TagKey<Item> SMALL_CACTI = forge("small_cacti");
	public static final TagKey<Item> MATCHA = forge("matcha");
	public static final TagKey<Item> GEMS_ROSE_QUARTZ = forge("gems/rose_quartz");
	public static final TagKey<Item> GEMS_ZANITE = forge("gems/zanite");
	public static final TagKey<Item> INGOTS_STEEL = DelightfulItems.ingot("steel");
	public static final TagKey<Item> INGOTS_ZINC = DelightfulItems.ingot("zinc");
	public static final TagKey<Item> TOOLS_SCAVENGING = forge("tools/scavenging");
	public static final TagKey<Item> TOOLS_MACHETES = forge("tools/machetes");
	public static final TagKey<Item> SEEDS_SALMONBERRY = forge("seeds/salmonberry");
	public static final TagKey<Item> SEEDS_CANTALOUPE = forge("seeds/cantaloupe");
	public static final TagKey<Item> BONES = forge("bones");
	public static final TagKey<Item> DOUGH_CORN = forge("dough/corn");
	public static final TagKey<Item> DOUGH_NUT = forge("dough/nut");
	public static final TagKey<Item> BREAD_CORN = forge("bread/corn");
	public static final TagKey<Item> BREAD_SLICES = forge("bread_slices");
	public static final TagKey<Item> BREAD_SLICES_TOASTED = forge("bread_slices/toasted");
	public static final TagKey<Item> BURGER_BUN = forge("burger_bun");
	public static final TagKey<Item> BREAD_OR_BUN = forge("bread_or_bun");
	public static final TagKey<Item> COOKIES = forge("cookies");
	public static final TagKey<Item> ROPES = forge("ropes");
	public static final TagKey<Item> FEATHERS = forge("feathers");

	// Farmers Delight
	public static final TagKey<Item> CABINETS_STONE = Util.it(FarmersDelight.MODID, "cabinets/stone");
	public static final TagKey<Item> STRAW_PLANTS = Util.it(FarmersDelight.MODID, "straw_plants");

	// Collector's Reap
	public static final TagKey<Item> GUMMIES = Util.it(Mods.CR, "gummies");

	// Nethers Delight
	public static final TagKey<Item> MEAL_ITEM = Util.it(Mods.ND, "meal_item");

	// Ecologics
	public static final TagKey<Item> COOKED_PRICKLY_PEAR = Util.it(Mods.ECO, "cooked_prickly_pear");

	// Forbidden and Arcanus
	public static final TagKey<Item> DRAGON_SCALE = Util.it("forbidden_arcanus", "dragon_scale");
	public static final TagKey<Item> DRACO_ARCANUS_STAFF = Util.it("forbidden_arcanus", "draco_arcanus_staff");

	// Allthemodium
	public static final TagKey<Item> PLATES_ALLTHEMODIUM = forge("plates/allthemodium");
	public static final TagKey<Item> RODS_ALLTHEMODIUM = forge("rods/allthemodium");

	// Deeper and Darker
	public static final TagKey<Item> REINFORCED_ECHO_SHARD = Util.it("deeperdarker", "reinforced_echo_shard");

	// Create
	public static final TagKey<Item> POLISHED_ROSE_QUARTZ = Util.it(Mods.C, "polished_rose_quartz");

	// MCreator mods
	public static final TagKey<Item> HEAP_EXPERIENCE = Util.it("create_sa", "heap_of_experience");
	public static final TagKey<Item> ZINC_HANDLE = Util.it("create_sa", "zinc_handle");
	public static final TagKey<Item> SHARP_LEAF = Util.it("seeds", "sharp_leaf");
	public static final TagKey<Item> KIWANO_PEEL = Util.it("nethers_exoticism", "kiwano_peel");

	// SAS
	public static final TagKey<Item> SANDWICH_BREAD = Util.it(Mods.SAS, "sandwich_bread");

	// Create
	public static final TagKey<Item> UPRIGHT_ON_BELT = Util.it(Mods.C, "upright_on_belt");

	// Serene Seasons
	public static final TagKey<Item> WINTER_CROPS = Util.it("sereneseasons", "winter_crops");
	public static final TagKey<Item> SUMMER_CROPS = Util.it("sereneseasons", "summer_crops");
	public static final TagKey<Item> AUTUMN_CROPS = Util.it("sereneseasons", "autumn_crops");
	public static final TagKey<Item> SPRING_CROPS = Util.it("sereneseasons", "spring_crops");

	// Phantasm
	public static final TagKey<Item> VOID_CRYSTAL_BLOCK = Util.it(Mods.EP, "void_crystal_block");
	public static final TagKey<Item> CRYSTAL_SPIKE_TIPS = Util.it(Mods.EP, "crystal_spike_tips");
	public static final TagKey<Item> XP_BOOSTED = Util.it(Mods.EP, "gets_xp_speed_boost");

	// AE2
	public static final TagKey<Item> QUARTZ_KNIFE = Util.it(Delightful.MODID, "quartz_knife");
	public static final TagKey<Item> CERTUS_QUARTZ = Knives.gem("certus_quartz");
	public static final TagKey<Item> FLUIX_CRYSTAL = Knives.gem("fluix");
	public static final TagKey<Item> FLUIX_BLOCK = Util.it(Mods.AE2, "fluix_block");
	public static final TagKey<Item> FLUIX_UPGRADE_SMITHING_TEMPLATE = Util.it(Mods.AE2, "fluix_upgrade_smithing_template");

	// Spirit
	public static final TagKey<Item> SOUL_STEEL_INGOT = DelightfulItems.ingot("soul_steel");
	public static final TagKey<Item> SOUL_STEEL_MAINHAND = Util.it("spirit", "soul_steel_mainhand");

	// Botania
	public static final TagKey<Item> LIVINGWOOD_TWIG = Util.it(Mods.BTA, "livingwood_twig");
	public static final TagKey<Item> DREAMWOOD_TWIG = Util.it(Mods.BTA, "dreamwood_twig");
	public static final TagKey<Item> MANA_ITEMS = Util.it(Mods.BTA, "mana_using_items");

	// Additional Additions
	public static final TagKey<Item> ROSE_GOLD_ALLOY = Util.it(Mods.AA, "rose_gold_alloy");
	public static final TagKey<Item> GOLD_RING = Util.it(Mods.AA, "gold_ring");

	// Nourished Nether
	public static final TagKey<Item> NECRONIUM_INGOT = DelightfulItems.ingot("necronium");
	public static final TagKey<Item> NECRONIUM_TOOLS = Util.it("nourished_nether", "necronium_tools");

	// Undergarden
	public static final TagKey<Item> CLOGGRUM_ITEMS = Util.it(Mods.UG, "cloggrum_items");
	public static final TagKey<Item> FROSTSTEEL_ITEMS = Util.it(Mods.UG, "froststeel_items");
	public static final TagKey<Item> UTHERIUM_ITEMS = Util.it(Mods.UG, "utherium_items");

	// Aether
	public static final TagKey<Item> HOLYSTONE = Util.it(Mods.AE, "holystone");
	public static final TagKey<Item> SKYROOT_STICK = Util.it(Mods.AE, "skyroot_stick");
	public static final TagKey<Item> SKYROOT_TOOL_CRAFTING = Util.it(Mods.AE, "skyroot_tool_crafting");
	public static final TagKey<Item> ENCHANTED_GRAVITITE = Util.it(Mods.AE, "enchanted_gravitite");

	// Aether Redux
	public static final TagKey<Item> INGOTS_GRAVITITE = DelightfulItems.ingot("gravitite");
	public static final TagKey<Item> INGOTS_VERIDIUM = DelightfulItems.ingot("veridium");

	// Deep Aether
	public static final TagKey<Item> GEMS_SKYJADE = DelightfulItems.gem("skyjade");
	public static final TagKey<Item> INGOTS_STRATUS = DelightfulItems.ingot("stratus");
	public final static TagKey<Item> STRATUS_UPGRADE = Util.it("deep_aether", "stratus_smithing_template");

	public static TagKey<Item> forge(String name) {
		return Util.it(Util.LOADER, name);
	}
}