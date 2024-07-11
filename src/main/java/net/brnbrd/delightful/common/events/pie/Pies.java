package net.brnbrd.delightful.common.events.pie;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.block.PieBlock;
import org.jetbrains.annotations.Nullable;

public class Pies {

	public static boolean enabled(ItemStack stack) {
		return (
			stack.is(DelightfulItemTags.COMPAT_PIES) &&
			!(stack.is(Items.PUMPKIN_PIE) && Mods.loaded(Mods.CCK)) &&
			Util.enabled(Util.name(stack.getItem()) + "_slice")
		);
	}

	@Nullable public static PieBlock get(ItemStack stack) {
		if (Util.block(Delightful.MODID, Util.name(stack.getItem())) instanceof PieBlock pie) {
			return pie;
		}
		return null;
	}
}
