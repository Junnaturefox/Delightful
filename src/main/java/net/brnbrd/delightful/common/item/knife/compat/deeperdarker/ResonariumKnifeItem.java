package net.brnbrd.delightful.common.item.knife.compat.deeperdarker;

import org.apache.commons.lang3.tuple.ImmutablePair;
import vectorwing.farmersdelight.common.registry.ModItems;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.world.item.crafting.Ingredient;

public class ResonariumKnifeItem extends CompatKnifeItem {

	public ResonariumKnifeItem(Properties properties) {
		super(Mods.DD, DelightfulItemTags.RESONARIUM_PLATE, DelightfulTiers.RESONARIUM, properties);
	}

	@Override
	public ImmutablePair<Ingredient, Ingredient> getSmithing() {
		return new ImmutablePair<>(
				null,
				Util.ing(ModItems.IRON_KNIFE)
		);
	}
}