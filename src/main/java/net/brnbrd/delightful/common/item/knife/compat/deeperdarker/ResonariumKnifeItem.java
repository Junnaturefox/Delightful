package net.brnbrd.delightful.common.item.knife.compat.deeperdarker;

import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;

public class ResonariumKnifeItem extends CompatKnifeItem {

	public ResonariumKnifeItem(Properties properties) {
		super(Mods.DD, DelightfulItemTags.RESONARIUM_PLATE, DelightfulTiers.RESONARIUM, properties);
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}
}