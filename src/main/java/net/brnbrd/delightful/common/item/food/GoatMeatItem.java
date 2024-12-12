package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.DItem;

public class GoatMeatItem extends DItem {
	public GoatMeatItem(Properties prop, boolean hasFoodEffectTooltip) {
		super(prop, hasFoodEffectTooltip);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{"goated", "dropthemeat"};
	}
}