package net.brnbrd.delightful.common.item.knife;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.ICompat;
import net.brnbrd.delightful.common.item.IConfigured;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.util.Lazy;
import org.codehaus.plexus.util.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.item.KnifeItem;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DelightfulKnifeItem extends KnifeItem implements IConfigured {
	private final TagKey<Item> tag;

	public DelightfulKnifeItem(TagKey<Item> tag, Tier tier, Properties properties) {
		super(tier, 0.5F, -2.0F, properties);
		this.tag = tag;
	}

	@Override
	public boolean isValidRepairItem(@NotNull ItemStack pToRepair, @NotNull ItemStack pRepair) {
		return this.enabled() && super.isValidRepairItem(pToRepair, pRepair);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> comps, @NotNull TooltipFlag pIsAdvanced) {
		if (
				this.enabledText(comps) &&
						!(this instanceof ICompat) &&
						this.enabled() &&
						!this.isTag() &&
						this.getTag() != null
		) {
			comps.add(Component.translatable("tooltip.requires_tag"));
			comps.add(Component.literal(this.getTag().location().toString()).withStyle(ChatFormatting.UNDERLINE));
		}
		super.appendHoverText(stack, level, comps, pIsAdvanced);
	}

	@Nullable
	public TagKey<Item> getTag() {
		return this.tag;
	}

	// Returns true if there is an entry within the tag
	public boolean isTag() {
		return Util.tagPopulated(this.getTag());
	}

	@Override
	public boolean enabled() {
		return IConfigured.super.enabled() && this.isTag();
	}

	public Ingredient getRod() {
		return Ingredient.of(Tags.Items.RODS_WOODEN);
	}

	public @NotNull ItemStack getCreativeItem() {
		return new ItemStack(this);
	}

	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.CRAFTING;
	}

	@Nullable
	public Lazy<Multimap<Attribute, AttributeModifier>> getModifiers(EquipmentSlot slot, ItemStack stack) {
		return null;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
		Multimap<Attribute, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
		Lazy<Multimap<Attribute, AttributeModifier>> additional = this.getModifiers(slot, stack);
		if (this.enabled() && slot == EquipmentSlot.MAINHAND && additional != null) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			if (!mods.isEmpty()) {
			builder.putAll(mods);
			}
			builder.putAll(additional.get());
			return builder.build();
		}
		return mods;
	}

	public String getTranslation() {
		return StringUtils.capitaliseAllWords(this.getDescriptionId().toLowerCase(Locale.ROOT)
				.replace("item." + Delightful.MODID.toLowerCase(Locale.ROOT) + ".", "").replace("_", " ")
		);
	}

	public List<Component> getTools() {
		return Collections.emptyList();
	}
}