package net.brnbrd.delightful.common.item.knife.compat.oresabovediamonds;

import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.common.item.knife.Knives;
import net.minecraft.ChatFormatting;

public class BlackOpalKnifeItem extends CompatKnifeItem {
	public BlackOpalKnifeItem(Properties properties) {
		super("oresabovediamonds", Knives.gem("black_opal"), DelightfulTiers.BLACK_OPAL, properties, ChatFormatting.DARK_PURPLE);
	}
}