package net.brnbrd.delightful.compat;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.brnbrd.delightful.common.events.pie.Pies;
import squeek.appleskin.api.event.TooltipOverlayEvent;

public class AppleSkinEventHandler {

	@SubscribeEvent
	public void onPreTooltipEvent(TooltipOverlayEvent.Pre e) {
		if (Pies.enabled(e.itemStack)) {
			e.setCanceled(true);
		}
	}
}
