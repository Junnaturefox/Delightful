package net.brnbrd.delightful.common.item.knife.compat.twilightforest;

import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SteeleafKnifeItem extends CompatKnifeItem {
	public SteeleafKnifeItem(Properties properties) {
		super("twilightforest", DelightfulItems.ingot("steeleaf"), DelightfulTiers.STEELEAF, properties, ChatFormatting.AQUA);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{"twilightdelight"};
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return null;
	}

	@Override
	public @NotNull ItemStack getCreativeItem() {
		return Util.enchant(super.getCreativeItem(), Enchantments.SMITE, 2);
	}
}