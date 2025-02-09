package net.brnbrd.delightful.common.item.knife;

import net.brnbrd.delightful.common.item.ICompat;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class CompatKnifeItem extends DelightfulKnifeItem implements ICompat {
	private final String[] modid;
	private final ChatFormatting[] formatting;

	public CompatKnifeItem(String modid, @Nullable TagKey<Item> tag, Tier tier, Properties properties, ChatFormatting... formatting) {
		super(tag, tier, properties);
		this.modid = new String[]{modid};
		this.formatting = formatting;
	}

	public CompatKnifeItem(String[] modid, @Nullable TagKey<Item> tag, Tier tier, Properties properties, ChatFormatting... formatting) {
		super(tag, tier, properties);
		this.modid = modid;
		this.formatting = formatting;
	}


	@Override
	public String[] getModid() {
		return this.modid;
	}

	@Override
	public boolean enabled() {
		return ICompat.super.enabled() && this.isTag();
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> comps, @NotNull TooltipFlag pIsAdvanced) {
		super.appendHoverText(stack, level, comps, pIsAdvanced);
		if (this.enabled() && !this.getTools().isEmpty()) {
			comps.addAll(this.getTools());
		}
	}

	@Override
	public @NotNull Component getName(@NotNull ItemStack stack) {
		Component name = super.getName(stack);
		return (this.enabled() && this.formatting.length > 0) ?
				name.copy().withStyle(this.formatting) : name;
	}
}