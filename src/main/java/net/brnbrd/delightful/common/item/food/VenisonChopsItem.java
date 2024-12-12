package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.DItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;

public class VenisonChopsItem extends DItem {
	public VenisonChopsItem(Properties prop, boolean hasFoodEffectTooltip) {
		super(prop, hasFoodEffectTooltip, DelightfulItemTags.RAW_VENISON_COMPAT, DelightfulItemTags.RAW_VENISON_CHOP_COMPAT);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{Mods.TFD};
	}
}