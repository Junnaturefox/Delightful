package net.brnbrd.delightful.common.item;

import joptsimple.internal.Strings;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import java.util.List;

public interface ICompat extends IConfigured {
	default Strategy getStrategy() {
		return Strategy.OR;
	}

	String[] getModid();

	default boolean isLoaded() {
		return (this.getStrategy() == Strategy.AND) ?
				Mods.loaded(this.getModid()) :
				Mods.orLoaded(this.getModid());
	}

	@Override
	default boolean enabled() {
		return this.isLoaded() && IConfigured.super.enabled();
	}

	@Override
	default boolean enabledText(List<Component> comps) {
		if (!this.isLoaded()) {
			comps.add(Component.translatable("tooltip.requires_modid"));
			comps.add(Component.literal(Strings.join(this.getModid(), ", ")).withStyle(ChatFormatting.UNDERLINE));
			return false;
		}
		return IConfigured.super.enabledText(comps);
	}

	enum Strategy {AND, OR}
}