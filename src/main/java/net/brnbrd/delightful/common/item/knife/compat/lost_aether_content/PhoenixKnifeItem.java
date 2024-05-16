package net.brnbrd.delightful.common.item.knife.compat.lost_aether_content;

import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.compat.aether.AetherKnifeItem;
import net.minecraft.ChatFormatting;

public class PhoenixKnifeItem extends AetherKnifeItem {
	public PhoenixKnifeItem(Properties properties) {
		super("lost_aether_content", null, DelightfulTiers.PHOENIX, properties, ChatFormatting.GREEN);
	}
}