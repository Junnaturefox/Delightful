package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.TagItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;

public class GoatMeatItem extends TagItem {
	public GoatMeatItem(Properties prop) {
		super(prop, DelightfulItemTags.RAW_GOAT_COMPAT);
	}

	@Override
	public boolean enabled() {
		return !Mods.orLoaded("goated", "dropthemeat") && super.enabled();
	}
}
