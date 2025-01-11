package net.brnbrd.delightful.common.item.knife.compat.additionaladditions;

import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class RoseGoldKnifeItem extends CompatKnifeItem {

	public RoseGoldKnifeItem(Properties properties) {
		super(Mods.AA, DelightfulItemTags.ROSE_GOLD_ALLOY, DelightfulTiers.ROSE_GOLD, properties);
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}
}