package net.brnbrd.delightful.compat;

import com.sammy.minersdelight.setup.MDItems;
import net.minecraft.world.item.Item;
import java.util.function.Supplier;

public class MinersDelightCompat {

	public static Supplier<? extends Item> copperCup() {
		return MDItems.COPPER_CUP;
	}
}
