package net.brnbrd.delightful.compat.jade;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import vectorwing.farmersdelight.common.block.MushroomColonyBlock;

public enum DMushroomColonyAge implements IBlockComponentProvider {
	INSTANCE;

	@Override
	public void appendTooltip(ITooltip tooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
		BlockState state = blockAccessor.getBlockState();
		Block block = state.getBlock();
		if (block instanceof MushroomColonyBlock mush) {
			int age = state.getValue(mush.getAgeProperty());
			int maxAge = mush.getMaxAge();
			MutableComponent ageComp = Component.literal(age + "/" + maxAge);
			tooltip.add(Component.translatable("tooltip.jade.age",
					ageComp.withStyle(age == maxAge ? ChatFormatting.GREEN : ChatFormatting.WHITE)
			));
		}
	}

	@Override
	public ResourceLocation getUid() {
		return Util.rl(Delightful.MODID, "mushroom_colony");
	}
}
