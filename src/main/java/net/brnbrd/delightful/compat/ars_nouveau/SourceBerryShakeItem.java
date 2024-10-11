package net.brnbrd.delightful.compat.ars_nouveau;

import net.brnbrd.delightful.common.item.ICompat;
import net.brnbrd.delightful.common.item.food.ShakeItem;
import net.brnbrd.delightful.compat.Mods;

public class SourceBerryShakeItem extends ShakeItem implements ICompat {
	public SourceBerryShakeItem(Properties properties) {
		super(properties);
	}

	@Override
	public String[] getModid() {
		return new  String[]{Mods.AN};
	}
}