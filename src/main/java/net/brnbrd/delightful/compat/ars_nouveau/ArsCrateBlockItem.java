package net.brnbrd.delightful.compat.ars_nouveau;

import net.brnbrd.delightful.common.item.CompatBlockItem;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.world.level.block.Block;

public class ArsCrateBlockItem extends CompatBlockItem {
	public ArsCrateBlockItem(Block block, Properties props) {
		super(block, props, Mods.AN);
	}

	@Override
	public boolean enabled() {
		return super.enabled() && !Mods.loaded(Mods.AND);
	}
}