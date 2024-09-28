package net.brnbrd.delightful.compat;

import net.brnbrd.delightful.common.events.pie.Pies;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import squeek.appleskin.api.event.TooltipOverlayEvent;

public class AppleSkinEventHandler {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onPreTooltipEvent(TooltipOverlayEvent.Pre e) {
		e.setCanceled(Pies.enabled(e.itemStack));
	}
}