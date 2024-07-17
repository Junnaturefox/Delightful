package net.brnbrd.delightful.compat.jade;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.block.CantaloupePlantBlock;
import net.brnbrd.delightful.common.block.SalmonberryBushBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public enum DCropProgress implements IBlockComponentProvider {
	INSTANCE;

	@Override
	public void appendTooltip(ITooltip tooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
		BlockState state = blockAccessor.getBlockState();
		Block block = state.getBlock();
		if (block instanceof SalmonberryBushBlock) {
			addMaturityTooltip(tooltip, state.getValue(SalmonberryBushBlock.AGE), SalmonberryBushBlock.MAX_AGE);
		} else if (block instanceof CantaloupePlantBlock) {
			addMaturityTooltip(tooltip, state.getValue(CantaloupePlantBlock.AGE), CantaloupePlantBlock.MAX_AGE);
		}
	}

	private static void addMaturityTooltip(ITooltip tooltip, int age, int maxAge) {
		tooltip.add(Component.translatable("tooltip.jade.crop_growth", age == maxAge ?
			Component.translatable("tooltip.jade.crop_mature").withStyle(ChatFormatting.GREEN) :
			Component.literal(String.format("%.0f%%", (age / (float) maxAge) * 100.0F)).withStyle(ChatFormatting.WHITE)
		));
	}

	@Override
	public ResourceLocation getUid() {
		return Util.rl(Delightful.MODID, "crop_progress");
	}
}
