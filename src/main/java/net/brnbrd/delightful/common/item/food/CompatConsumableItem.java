package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.common.item.ICompat;

public class CompatConsumableItem extends DConsumableItem implements ICompat {
	private final String[] modid;

	public CompatConsumableItem(Properties properties, boolean hasPotionEffectTooltip, boolean hasCustomTooltip, String... modid) {
		super(properties, hasPotionEffectTooltip, hasCustomTooltip);
		this.modid = modid;
	}

	@Override
	public String[] getModid() {
		return modid;
	}
}