package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.compat.Mods;

public class NutButterBottleItem extends DConsumableItem {
	public NutButterBottleItem(Properties properties) {
		super(properties, false, false);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{Mods.VD};
	}
}