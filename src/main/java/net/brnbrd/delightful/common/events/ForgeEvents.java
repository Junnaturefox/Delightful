package net.brnbrd.delightful.common.events;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.block.DelightfulBlocks;
import net.brnbrd.delightful.common.block.SlicedGourdBlock;
import net.brnbrd.delightful.common.block.SlicedMelonBlock;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.compat.CasualnessDelightCompat;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import java.util.List;
import java.util.Objects;

public class ForgeEvents {

	@SubscribeEvent
	void onEatRotten(LivingEntityUseItemEvent.Finish e) {
		if (
			e.getResult() != Event.Result.DENY &&
			Mods.loaded(Mods.CAD) &&
			e.getItem().is(DelightfulItemTags.ROTTEN) &&
			e.getEntity().getRandom().nextBoolean() // 50% chance
		) {
			MobEffect rotten = CasualnessDelightCompat.getRotten();
			if (rotten != null) {
				int duration = 160;
				if (e.getItem().is(Util.item(Mods.RL, "rotten_chunk"))) {
					duration = 1800;
				}
				Util.addEffect(e.getEntity(), rotten, duration, 0);
			}
		}
	}

	@SubscribeEvent
	public static void onMissingMappings(MissingMappingsEvent e) {
		if (e.getRegistry() == ForgeRegistries.ITEMS) {
			for (var map : e.getMappings(ForgeRegistries.ITEMS.getRegistryKey(), Delightful.MODID)) {
				var remap = Util.rl(map.getKey().getNamespace(), map.getKey().getPath()
						.replace("jelly_bottle", "jam_jar")
						.replace("jelly", "jam"));
				if (ForgeRegistries.ITEMS.containsKey(remap)) {
					map.remap(ForgeRegistries.ITEMS.getValue(remap));
				} else {
					map.warn();
				}
			}
		}
	}

	@SubscribeEvent
	void onWanderingTrader(WandererTradesEvent e) {
		List<VillagerTrades.ItemListing> trades = e.getGenericTrades();
		if (Util.enabled(DelightfulItems.SALMONBERRIES) && Util.enabled(DelightfulItems.SALMONBERRY_PIPS)) {
			trades.add((ent, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), Util.gs(DelightfulItems.SALMONBERRY_PIPS), 5, 1, 1));
		}
		if (Util.enabled(DelightfulItems.CANTALOUPE) && Util.enabled(DelightfulItems.CANTALOUPE_SLICE)) {
			trades.add((ent, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), Util.gs(DelightfulItems.CANTALOUPE_SLICE, 8), 5, 1, 1));
		}
	}

	// Right slick slicing an Item from a Block
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	void onInteract(PlayerInteractEvent.RightClickBlock e) {
		Level world = e.getLevel();
		BlockPos pos = e.getPos();
		if (e.getItemStack().is(ForgeTags.TOOLS_KNIVES)) {
			BlockState current = world.getBlockState(pos);
			boolean client = world.isClientSide();
			if (current.getBlock() == Blocks.MELON) {
				SlicedMelonBlock sliced = (SlicedMelonBlock) DelightfulBlocks.SLICED_MELON.get();
				slice(sliced.defaultBlockState(), sliced.getSliceItem(), world, pos, SoundEvents.BAMBOO_BREAK, e, client);
			} else if (current.getBlock() == Blocks.PUMPKIN && !e.getEntity().isCrouching()) {
				SlicedGourdBlock sliced = (SlicedGourdBlock) DelightfulBlocks.SLICED_PUMPKIN.get();
				slice(sliced.defaultBlockState(), sliced.getSliceItem(), world, pos, SoundEvents.BAMBOO_BREAK, e, client);
			} else if (
					Mods.loaded(Mods.UGD) &&
							Objects.equals(ForgeRegistries.BLOCKS.getKey(current.getBlock()), Util.rl(Mods.UG, "gloomgourd"))
			) {
				SlicedGourdBlock sliced = (SlicedGourdBlock) DelightfulBlocks.SLICED_GLOOMGOURD.get();
				slice(sliced.defaultBlockState(), sliced.getSliceItem(), world, pos, SoundEvents.BAMBOO_BREAK, e, client);
			} else if (
					Mods.loaded(Mods.FU, Mods.FUD) &&
							Util.name(current.getBlock()).equals("truffle_cake") &&
							ForgeRegistries.ITEMS.containsKey(Util.rl(Mods.FUD, "truffle_cake_slice"))
			) {
				int currentBites = current.getValue(BlockStateProperties.BITES);
				ItemStack slice = new ItemStack(Objects.requireNonNull(Util.item(Mods.FUD, "truffle_cake_slice")));
				if (currentBites >= 3) {
					world.removeBlock(pos, false);
					world.gameEvent(e.getEntity(), GameEvent.BLOCK_DESTROY, pos);
					Util.dropOrGive(slice, world, pos, e.getEntity());
					world.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.PLAYERS, 0.8F, 0.8F);
					e.getEntity().getItemInHand(e.getHand()).hurtAndBreak(1, e.getEntity(), onBroken -> {
					});
					e.setCancellationResult(InteractionResult.sidedSuccess(client));
					e.setCanceled(true);
					return;
				}
				slice(current.setValue(BlockStateProperties.BITES, currentBites + 1), slice, world, pos, SoundEvents.WOOL_PLACE, e, client);
			}
		}
	}

	// Replaces Block in world, drops Item, cancels interaction event
	void slice(BlockState block, ItemStack slice, Level world, BlockPos pos, SoundEvent sound, PlayerInteractEvent.RightClickBlock e, boolean client) {
		if (!client) {
			world.setBlock(pos, block, 2);
			Util.dropOrGive(slice, world, pos, e.getEntity());
			world.playSound(null, pos, sound, SoundSource.PLAYERS, 0.8F, 0.8F);
			e.getEntity().getItemInHand(e.getHand()).hurtAndBreak(1, e.getEntity(), onBroken -> {
			});
		}
		e.setCancellationResult(InteractionResult.sidedSuccess(client));
		e.setCanceled(true);
	}
}