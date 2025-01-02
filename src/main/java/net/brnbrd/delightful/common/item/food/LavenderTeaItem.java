package net.brnbrd.delightful.common.item.food;

import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class LavenderTeaItem extends DrinkItem {
	public LavenderTeaItem(Properties properties, float heal, boolean hasPotionEffectTooltip, boolean hasCustomTooltip) {
		super(properties, heal, hasPotionEffectTooltip, hasCustomTooltip);
	}

	@Override
	public boolean enabled() {
		return this.isTag() && super.enabled();
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> comps, @NotNull TooltipFlag pIsAdvanced) {
		if (super.enabled() && !this.isTag()) {
			comps.add(Component.translatable("tooltip.requires_tag"));
			comps.add(Component.literal(DelightfulItemTags.LAVENDER.location().toString()).withStyle(ChatFormatting.UNDERLINE));
		} else {
			super.appendHoverText(stack, level, comps, pIsAdvanced);
		}
	}

	public boolean isTag() {
		return Util.tagPopulated(DelightfulItemTags.LAVENDER);
	}
}