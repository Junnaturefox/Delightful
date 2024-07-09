package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.compat.MinersDelightCompat;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class CupItem extends CompatConsumableItem {
	private static final Item COPPER_CUP = Mods.loaded(Mods.MD) ? MinersDelightCompat.copperCup().get() : Items.BOWL;

	public CupItem(Properties properties, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
		super(properties.craftRemainder(COPPER_CUP).stacksTo(16), hasFoodEffectTooltip, hasCustomTooltip, Mods.MD);
	}
}
