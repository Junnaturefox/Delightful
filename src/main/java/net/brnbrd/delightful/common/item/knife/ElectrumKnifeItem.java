package net.brnbrd.delightful.common.item.knife;

import net.brnbrd.delightful.common.item.DelightfulTiers;

public class ElectrumKnifeItem extends DelightfulKnifeItem {
	public ElectrumKnifeItem(Properties properties) {
		super(Knives.ingot("electrum"), DelightfulTiers.ELECTRUM, properties);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{"oreganized"};
	}
}