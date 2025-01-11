package net.brnbrd.delightful.common.item.knife.compat.oresabovediamonds;

import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.Nullable;

public class NetheriteOpalKnifeItem extends CompatKnifeItem {
	public NetheriteOpalKnifeItem(Properties properties) {
		super("oresabovediamonds", Tags.Items.INGOTS_NETHERITE, DelightfulTiers.NETHERITE_OPAL, properties, ChatFormatting.DARK_PURPLE);
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}
}