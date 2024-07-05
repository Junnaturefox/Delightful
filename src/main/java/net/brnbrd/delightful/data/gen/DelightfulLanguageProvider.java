package net.brnbrd.delightful.data.gen;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.common.block.DelightfulBlocks;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.knife.DelightfulKnifeItem;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class DelightfulLanguageProvider extends LanguageProvider {
    public DelightfulLanguageProvider(PackOutput output) {
        super(output, Delightful.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        DelightfulItems.ITEMS.getEntries().stream()
            .filter(reg -> reg.get() instanceof DelightfulKnifeItem)
            .forEach(knife -> addItem(knife, ((DelightfulKnifeItem) knife.get()).getTranslation()));
        addItems();
    }
    
    private void addItems() {
        addItem(DelightfulItems.CHEESEBURGER, "Cheeseburger");
        addItem(DelightfulItems.DELUXE_CHEESEBURGER, "Deluxe Cheeseburger");
        addItem(DelightfulItems.MARSHMALLOW_STICK, "Marshmallow on a Stick");
        addItem(DelightfulItems.COOKED_MARSHMALLOW_STICK, "Roasted Marshmallow on a Stick");
        addItem(DelightfulItems.SMORE, "S'more");
        addItem(DelightfulItems.CRAB_RANGOON, "Crab Rangoon");
        addItem(DelightfulItems.PRICKLY_PEAR_JUICE, "Prickly Pear Juice");
        addItem(DelightfulItems.CHUNKWICH, "Chunkwich");
        addItem(DelightfulItems.CHUNK_NUGGET, "Chunk Nugget");
        addItem(DelightfulItems.JELLY_BOTTLE, "Jam Jar");
        addItem(DelightfulItems.GLOW_JELLY_BOTTLE, "Glow Jam Jar");
        addItem(DelightfulItems.NUT_BUTTER_BOTTLE, "Nut Butter Bottle");
        addItem(DelightfulItems.NUT_BUTTER_AND_JELLY_SANDWICH, "Nut Butter and Jam Sandwich");
        addItem(DelightfulItems.ENDER_NECTAR, "Ender Nectar");
        addItem(DelightfulItems.AZALEA_TEA, "Azalea Tea");
        addItem(DelightfulItems.LAVENDER_TEA, "Lavender Tea");
        addItem(DelightfulItems.HONEY_GLAZED_WALNUT, "Honey Glazed Walnut");
        addItem(DelightfulItems.MATCHA_LATTE, "Matcha Latte");
        addItem(DelightfulItems.BERRY_MATCHA_LATTE, "Iced Berry Matcha Latte");
        addItem(DelightfulItems.GREEN_TEA_LEAF, "Green Tea Leaves");
        addItem(DelightfulItems.SALMONBERRIES, "Salmonberries");
        addItem(DelightfulItems.SALMONBERRY_PIPS, "Salmonberry Pips");
        addItem(DelightfulItems.SALMONBERRY_PIE_SLICE, "Slice of Salmonberry Pie");
        addItem(DelightfulItems.PUMPKIN_PIE_SLICE, "Slice of Pumpkin Pie");
        addItem(DelightfulItems.SOURCE_BERRY_PIE_SLICE, "Slice of Source Berry Pie");
        addItem(DelightfulItems.GLOOMGOURD_PIE_SLICE, "Slice of Gloomgourd Pie");
        addItem(DelightfulItems.GREEN_APPLE_PIE_SLICE, "Slice of Green Apple Pie");
        addItem(DelightfulItems.BLUEBERRY_PIE_SLICE, "Slice of Blueberry Pie");
        addItem(DelightfulItems.NIGHTSHADE_BERRY_PIE_SLICE, "Slice of Nightshade Berry Pie");
        addItem(DelightfulItems.CRIMSON_BERRY_PIE_SLICE, "Slice of Crimson Berry Pie");
        addItem(DelightfulItems.CANTALOUPE_SLICE, "Cantaloupe Slice");
        addItem(DelightfulItems.CANTALOUPE_SEEDS, "Cantaloupe Seeds");
        addItem(DelightfulItems.CANTALOUPE_BREAD, "Cantaloupe Bread");
        addItem(DelightfulItems.WRAPPED_CANTALOUPE, "Wrapped Cantaloupe");
        addItem(DelightfulItems.CANTALOUPE_POPSICLE, "Cantaloupe Popsicle");
        addItem(DelightfulItems.STUFFED_CANTALOUPE_BLOCK, "Stuffed Cantaloupe");
        addItem(DelightfulItems.STUFFED_CANTALOUPE, "Bowl of Stuffed Cantaloupe");
        addItem(DelightfulItems.MATCHA, "Matcha");
        addItem(DelightfulItems.MATCHA_ICE_CREAM, "Matcha Ice Cream");
        addItem(DelightfulItems.MATCHA_MILKSHAKE, "Matcha Milkshake");
        addItem(DelightfulItems.SALMONBERRY_ICE_CREAM, "Salmonberry Ice Cream");
        addItem(DelightfulItems.SALMONBERRY_MILKSHAKE, "Salmonberry Milkshake");
        addItem(DelightfulItems.ACORN, "Acorn");
        addItem(DelightfulItems.ROASTED_ACORN, "Roasted Acorn");
        addItem(DelightfulItems.NUT_DOUGH, "Nut Dough");
        addItem(DelightfulItems.ANIMAL_FAT, "Animal Fat");
        addItem(DelightfulItems.ANIMAL_OIL_BOTTLE, "Animal Oil Bottle");
        addItem(DelightfulItems.CHOPPED_CLOVER, "Chopped Clover");
        addItem(DelightfulItems.CACTUS_FLESH, "Cactus Chunk");
        addItem(DelightfulItems.CACTUS_STEAK, "Cactus Steak");
        addItem(DelightfulItems.FIELD_SALAD, "Field Salad");
        addItem(DelightfulItems.ROCK_CANDY, "Rock Candy");
        addItem(DelightfulItems.VENISON_CHOPS, "Raw Venison Chops");
        addItem(DelightfulItems.COOKED_VENISON_CHOPS, "Cooked Venison Chops");
        addItem(DelightfulItems.RAW_GOAT, "Raw Chevon");
        addItem(DelightfulItems.COOKED_GOAT, "Cooked Chevon");
        addItem(DelightfulItems.COCONUT_CURRY, "Coconut Curry");
        addItem(DelightfulItems.SINIGANG, "Sinigang");
        addItem(DelightfulItems.SALMONBERRY_GUMMY, "Salmonberry Gummy");
        addItem(DelightfulItems.MATCHA_GUMMY, "Matcha Gummy");
        addItem(DelightfulItems.CANTALOUPE_GUMMY, "Cantaloupe Gummy");
        addBlock(DelightfulBlocks.MINI_MELON, "Mini Melon");
        addBlock(DelightfulBlocks.SLICED_MINI_MELON, "Sliced Mini Melon");
        addBlock(DelightfulBlocks.CANTALOUPE, "Cantaloupe");
        addBlock(DelightfulBlocks.CANTALOUPE_PLANT, "Cantaloupe Plant");
        addBlock(DelightfulBlocks.SLICED_CANTALOUPE, "Sliced Cantaloupe");
        addBlock(DelightfulBlocks.SLICED_MELON, "Sliced Melon");
        addBlock(DelightfulBlocks.SLICED_PUMPKIN, "Sliced Pumpkin");
        addBlock(DelightfulBlocks.SLICED_GLOOMGOURD, "Sliced Gloomgourd");
        addBlock(DelightfulBlocks.PUMPKIN_PIE, "Pumpkin Pie");
        addBlock(DelightfulBlocks.SOURCE_BERRY_PIE, "Source Berry Pie");
        addBlock(DelightfulBlocks.GLOOMGOURD_PIE, "Gloomgourd Pie");
        addBlock(DelightfulBlocks.GREEN_APPLE_PIE, "Green Apple Pie");
        addBlock(DelightfulBlocks.BLUEBERRY_PIE, "Blueberry Pie");
        addBlock(DelightfulBlocks.NIGHTSHADE_BERRY_PIE, "Nightshade Berry Pie");
        addBlock(DelightfulBlocks.CRIMSON_BERRY_PIE, "Crimson Berry Pie");
        addBlock(DelightfulBlocks.SALMONBERRY_PIE, "Salmonberry Pie");
        addBlock(DelightfulBlocks.SALMONBERRY_BUSH, "Salmonberry Bush");
        addBlock(DelightfulBlocks.WILD_SALMONBERRIES, "Wild Salmonberries");
        addBlock(DelightfulBlocks.QUARTZ_CABINET, "Quartz Cabinet");
        addBlock(DelightfulBlocks.BASALT_CABINET, "Basalt Cabinet");
        addBlock(DelightfulBlocks.SALMONBERRY_ICE_CREAM_BLOCK, "Salmonberry Ice Cream Block");
        addBlock(DelightfulBlocks.SALMONBERRY_MILKSHAKE_CAULDRON, "Salmonberry Milkshake Cauldron");
        addBlock(DelightfulBlocks.MATCHA_ICE_CREAM_BLOCK, "Matcha Ice Cream Block");
        addBlock(DelightfulBlocks.MATCHA_MILKSHAKE_CAULDRON, "Matcha Milkshake Cauldron");
        addBlock(DelightfulBlocks.ACORN_SACK, "Acorn Sack");
        addBlock(DelightfulBlocks.SALMONBERRY_SACK, "Salmonberry Sack");
        addBlock(DelightfulBlocks.BLUEBERRY_SACK, "Blueberry Sack");
        addBlock(DelightfulBlocks.MENDOSTEEN_CRATE, "Mendosteen Crate");
        addBlock(DelightfulBlocks.BASTION_FRUIT_CRATE, "Bastion Fruit Crate");
        addBlock(DelightfulBlocks.FROSTAYA_CRATE, "Frostaya Crate");
        addBlock(DelightfulBlocks.BOMBEGRANATE_CRATE, "Bombegranate Crate");
        addBlock(DelightfulBlocks.CRIMSON_BERRY_SACK, "Crimson Berry Sack");
        addBlock(DelightfulBlocks.NIGHTSHADE_BERRY_SACK, "Nightshade Berry Sack");
        addBlock(DelightfulBlocks.GREEN_APPLE_CRATE, "Green Apple Crate");
        addBlock(DelightfulBlocks.JOSHUA_FRUIT_CRATE, "Joshua Fruit Crate");
        addBlock(DelightfulBlocks.BAOBAB_FRUIT_CRATE, "Baobab Fruit Crate");
        add("farmersdelight.tooltip.matcha_latte", "Minor Instant Health");
        add("farmersdelight.tooltip.berry_matcha_latte", "Minor Instant Health");
        add("farmersdelight.tooltip.ender_nectar", "Otherworldly");
        add("delightful.matcha.desc", "Green Tea Powder");
        add("delightful.green_tea_leaf.desc", "Get lucky using a Knife on any Leaves block.");
        add("delightful.animal_fat.desc", "Can be scavenged from some dead animals.");
        add("delightful.animal_oil_bottle.desc", "Use on any furnace for a small amount of heat.");
        add("delightful.acorn.desc", "Acorns are tough nuts that drop from Oak Leaves or Squirrels.");
        add("delightful.salmonberries.desc", "Salmonberries can be commonly found as a wild plant in forests.");
        add("delightful.mini_melon.desc", "Mini Melons can be commonly found in plains. Can grow into a big Melon or be sliced with a Knife.");
        add("delightful.cantaloupe.desc", "Cantaloupes can be commonly found on beaches.");
        add("delightful.cantaloupe_seeds.desc", "Cantaloupe Seeds will sprout when planted in sand.");
        add("delightful.sliceable.desc", "Can be sliced with a Knife.");
        add("delightful.placeable.desc", "Placeable");
        add("tooltip.config_disabled", "Disabled");
        add("tooltip.requires_tag", "Requires non-empty tag:");
        add("tooltip.requires_modid", "Requires modid:");
        add("tooltip.sneak_right", "Sneak R-Click for:");
        add("tooltip.furnace_fuel_burn_time", "s of burn time");
        add("tooltip.jade.age", "Age: %s");
        add("config.jade.plugin_delightful.crop_progress", "Crop Progress");
        add("config.jade.plugin_delightful.pie_icons", "Pie Icons");
    }
}
