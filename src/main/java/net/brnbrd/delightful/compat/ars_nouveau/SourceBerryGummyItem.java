package net.brnbrd.delightful.compat.ars_nouveau;

import net.brnbrd.delightful.common.item.ICompat;
import net.brnbrd.delightful.common.item.food.GummyItem;
import net.brnbrd.delightful.compat.Mods;

public class SourceBerryGummyItem extends GummyItem implements ICompat {
	public SourceBerryGummyItem(Properties prop) {
		super(prop);
	}

	@Override
	public String[] getModid() {
		return new String[]{Mods.AN};
	}
}