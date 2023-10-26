package net.brnbrd.delightful.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class FurnaceFuelItem extends DItem {

  private final int fuelTime;

  public FurnaceFuelItem(Properties pProperties, int fuelTime) {
    super(pProperties);
    this.fuelTime = fuelTime;
  }

  public int getFuelTime() {
    return this.fuelTime;
  }

  @Override
  public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, List<Component> comps, @NotNull TooltipFlag pIsAdvanced) {
    comps.add(Component.literal("Sneak Right Click:").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.UNDERLINE));
    comps.add(Component.literal("Applies " + (this.getFuelTime() / 20) + "s of burn time"));
  }

  @Override
  public @NotNull InteractionResult useOn(UseOnContext con) {
    return useFuel(con.getItemInHand(),
      con.getLevel().getExistingBlockEntity(con.getClickedPos()),
      con.getPlayer());
  }

  public static InteractionResult useFuel(ItemStack stack, BlockEntity entity, Player player) {
    if (stack.getItem() instanceof FurnaceFuelItem fuel &&
      entity instanceof AbstractFurnaceBlockEntity furnace) {
      ContainerData data = furnace.dataAccess;
      int newTime = data.get(0) + fuel.getFuelTime() + 1;
      data.set(0, newTime);
      data.set(1, newTime);
      furnace.setChanged();
      shrinkAdd(player, stack);
      return InteractionResult.CONSUME_PARTIAL;
    }
    return InteractionResult.FAIL;
  }

  private static void shrinkAdd(Player p, ItemStack i) {
    if (i.hasCraftingRemainingItem()) {
      p.addItem(i.getCraftingRemainingItem());
    }
    i.shrink(1);
  }
}
