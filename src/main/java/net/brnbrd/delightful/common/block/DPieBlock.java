package net.brnbrd.delightful.common.block;

import java.util.Objects;
import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class DPieBlock extends PieBlock {
	private final ResourceLocation pie;

	public DPieBlock(Supplier<Item> pieSlice, ResourceLocation pie) {
		super(Block.Properties.copy(ModBlocks.APPLE_PIE.get()), pieSlice);
		this.pie = pie;
	}

	@Override
	public @NotNull Item asItem() {
		if (ForgeRegistries.ITEMS.containsKey(this.pie)) {
			return Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(this.pie));
		}
		return super.asItem();
	}

	public @NotNull ItemStack getStack() {
		if (ForgeRegistries.ITEMS.containsKey(this.pie)) {
			return new ItemStack(this.asItem());
		}
		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, Player player) {
		ItemStack stack = this.getStack();
		return !stack.isEmpty() ? stack : super.getCloneItemStack(state, target, level, pos, player);
	}
}
