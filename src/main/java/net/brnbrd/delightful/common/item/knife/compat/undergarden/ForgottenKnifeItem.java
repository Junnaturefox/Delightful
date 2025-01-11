package net.brnbrd.delightful.common.item.knife.compat.undergarden;

import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class ForgottenKnifeItem extends CompatKnifeItem {

	public ForgottenKnifeItem(Properties properties) {
		super(Mods.UG, DelightfulItems.ingot("forgotten_metal"), DelightfulTiers.FORGOTTEN, properties, ChatFormatting.GREEN);
		MinecraftForge.EVENT_BUS.addListener(this::onHurt);
		MinecraftForge.EVENT_BUS.addListener(this::onDig);
	}

	@Override
	public String[] getConflicts() {
		return new String[]{Mods.UGD};
	}

	@Override
	public List<Component> getTools() {
		return List.of(Component.translatable("tooltip.forgotten_sword").withStyle(ChatFormatting.GREEN));
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}

	void onHurt(LivingHurtEvent e) {
		if (
				this.enabled() &&
						e.getSource().getEntity() instanceof Player player &&
						player.getMainHandItem().is(this) &&
						ForgeRegistries.ENTITY_TYPES.getKey(e.getEntity().getType()).getNamespace().equals(Mods.UG) &&
						e.getEntity().canChangeDimensions()
		) {
			e.setAmount(e.getAmount() * 1.5F);
		}
	}

	void onDig(PlayerEvent.BreakSpeed e) {
		BlockState state = e.getState();
		if (
				this.enabled() &&
						e.getEntity().getMainHandItem().is(this) &&
						state != null &&
						ForgeRegistries.BLOCKS.getKey(state.getBlock()).getNamespace().equals(Mods.UG)
		) {
			e.setNewSpeed(e.getOriginalSpeed() * 1.5F);
		}
	}
}