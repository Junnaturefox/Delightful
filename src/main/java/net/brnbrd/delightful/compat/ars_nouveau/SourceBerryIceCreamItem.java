package net.brnbrd.delightful.compat.ars_nouveau;

import net.brnbrd.delightful.common.item.ICompat;
import net.brnbrd.delightful.common.item.food.IceCreamItem;
import net.brnbrd.delightful.compat.Mods;

public class SourceBerryIceCreamItem extends IceCreamItem implements ICompat {
	public SourceBerryIceCreamItem(Properties properties) {
		super(properties);
	}

	@Override
	public String[] getModid() {
		return new String[]{Mods.AN};
	}
}