package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.DItem;

public class PumpkinPieSliceItem extends DItem {
	public PumpkinPieSliceItem(Properties prop) {
		super(prop, false);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{"create_central_kitchen"};
	}
}