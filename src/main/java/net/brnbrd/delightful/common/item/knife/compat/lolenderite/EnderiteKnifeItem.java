package net.brnbrd.delightful.common.item.knife.compat.lolenderite;

import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class EnderiteKnifeItem extends CompatKnifeItem {

	public EnderiteKnifeItem(Properties properties) {
		super(Mods.LE, DelightfulItems.ingot("enderite"), DelightfulTiers.ENDERITE, properties);
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}
}