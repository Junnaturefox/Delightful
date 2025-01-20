package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.ICompat;
import net.brnbrd.delightful.compat.Mods;

public class ChorusMuffinItem extends DConsumableItem implements ICompat {
	public ChorusMuffinItem(Properties properties) {
		super(properties, false, false);
	}

	@Override
	public String[] getModid() {
		return new String[]{Mods.UE};
	}
}