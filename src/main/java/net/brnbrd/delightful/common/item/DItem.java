package net.brnbrd.delightful.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.Configuration;
import vectorwing.farmersdelight.common.utility.TextUtils;
import java.util.List;

public class DItem extends Item implements IConfigured {
	private final boolean hasFoodEffectTooltip;
	private final @Nullable TagKey<Item> dependencyTag; // This tag must be populated (or null)
	private final @Nullable TagKey<Item> emptyTag; // This tag must be empty (or null)

	public DItem(Item.Properties prop) {
		super(prop);
		this.hasFoodEffectTooltip = false;
		this.emptyTag = null;
		this.dependencyTag = null;
	}

	public DItem(Item.Properties properties, boolean hasFoodEffectTooltip) {
		super(properties);
		this.hasFoodEffectTooltip = hasFoodEffectTooltip;
		this.emptyTag = null;
		this.dependencyTag = null;
	}

	public DItem(Item.Properties properties, boolean hasFoodEffectTooltip, @NotNull TagKey<Item> dependencyTag) {
		super(properties);
		this.hasFoodEffectTooltip = hasFoodEffectTooltip;
		this.dependencyTag = dependencyTag;
		this.emptyTag = null;
	}

	public DItem(Item.Properties properties, boolean hasFoodEffectTooltip, @Nullable TagKey<Item> dependencyTag, @NotNull TagKey<Item> emptyTag) {
		super(properties);
		this.hasFoodEffectTooltip = hasFoodEffectTooltip;
		this.dependencyTag = dependencyTag;
		this.emptyTag = emptyTag;
	}

	public boolean isEmptyTag() {
		if (this.emptyTag == null) {
			return true;
		}
		var tags = ForgeRegistries.ITEMS.tags();
		return tags != null && (!tags.isKnownTagName(this.emptyTag) || tags.getTag(this.emptyTag).isEmpty());
	}

	public boolean isDependencyTag() {
		if (this.dependencyTag == null) {
			return true;
		}
		var tags = ForgeRegistries.ITEMS.tags();
		return tags != null && tags.isKnownTagName(this.dependencyTag) && !tags.getTag(this.dependencyTag).isEmpty();
	}

	public boolean isTag() {
		return this.isEmptyTag() && this.isDependencyTag();
	}

	@Override
	public boolean enabled() {
		return this.isTag() && IConfigured.super.enabled();
	}

	@Override
	public boolean enabledText(List<Component> comps) {
		final boolean emp = this.isEmptyTag();
		final boolean dep = this.isDependencyTag();
		if (!emp && this.emptyTag != null) {
			comps.add(Component.translatable("tooltip.requires_empty_tag"));
			comps.add(Component.literal(this.emptyTag.location().toString()).withStyle(ChatFormatting.UNDERLINE));
		} if (!dep && this.dependencyTag != null) {
			comps.add(Component.translatable("tooltip.requires_tag"));
			comps.add(Component.literal(this.dependencyTag.location().toString()).withStyle(ChatFormatting.UNDERLINE));
		}
		if (emp && dep) {
			return IConfigured.super.enabledText(comps);
		}
		return false;
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> comps, @NotNull TooltipFlag pIsAdvanced) {
		if (this.enabledText(comps)) {
			if (Configuration.FOOD_EFFECT_TOOLTIP.get()) {
				if (this.hasFoodEffectTooltip) {
					TextUtils.addFoodEffectTooltip(stack, comps, 1.0F);
				}
			}
			super.appendHoverText(stack, level, comps, pIsAdvanced);
		}
	}
}