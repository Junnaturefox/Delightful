package net.brnbrd.delightful.common.item.knife.compat.ae2;

import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class FluixKnifeItem extends CompatKnifeItem {
	public FluixKnifeItem(Properties properties) {
		super(Mods.AE2, DelightfulItemTags.FLUIX_BLOCK, DelightfulTiers.FLUIX, properties);
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}

	@Override
	public int getEnchantmentLevel(ItemStack stack, Enchantment enchantment) {
		if (enchantment.equals(Enchantments.MOB_LOOTING)) {
			return Math.max(1, super.getEnchantmentLevel(stack, Enchantments.MOB_LOOTING));
		}
		return super.getEnchantmentLevel(stack, enchantment);
	}

	@Override
	public List<Component> getTools() {
		return List.of(Component.literal("Always has at least ").append(Enchantments.MOB_LOOTING.getFullname(1)));
	}
}