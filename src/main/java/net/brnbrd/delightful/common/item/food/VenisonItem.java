package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.ReverseTagItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;

public class VenisonItem extends ReverseTagItem {
	public VenisonItem(Properties prop) {
		super(prop, DelightfulItemTags.RAW_VENISON_COMPAT);
	}

	@Override
	public boolean enabled() {
		return !Mods.loaded("twilightdelight") && super.enabled();
	}
}