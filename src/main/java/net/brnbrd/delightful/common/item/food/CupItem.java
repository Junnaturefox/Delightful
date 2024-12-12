package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.world.item.Items;

public class CupItem extends CompatConsumableItem {

	public CupItem(Properties properties, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
		super(
				properties.stacksTo(16).craftRemainder(Util.item(Util.rl(Mods.MD, "copper_cup"), Items.BOWL)),
				hasFoodEffectTooltip,
				hasCustomTooltip,
				Mods.MD
		);
	}
}