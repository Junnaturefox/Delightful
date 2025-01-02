package net.brnbrd.delightful;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.brnbrd.delightful.common.DelightfulConfig;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.brnbrd.delightful.common.item.IConfigured;
import net.brnbrd.delightful.compat.Mods;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.tags.ITagManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class Util {

	public static final String LOADER = "forge";

	public static ResourceLocation rl(String modid, String path) {
		return new ResourceLocation(modid, path);
	}

	public static ResourceLocation rl(String separated) {
		return new ResourceLocation(separated);
	}

	public static TagKey<Item> it(String modid, String path) {
		return ItemTags.create(rl(modid, path));
	}

	public static TagKey<EntityType<?>> et(String modid, String path) {
		return TagKey.create(Registries.ENTITY_TYPE, rl(modid, path));
	}

	// Returns true if tag is empty or null
	public static boolean tagEmpty(@Nullable TagKey<Item> tag) {
		if (tag == null) {
			return true;
		}
		ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
		return tags != null && (!tags.isKnownTagName(tag) || tags.getTag(tag).isEmpty());
	}

	// Returns true if tag has an entry or is null
	public static boolean tagPopulated(@Nullable TagKey<Item> tag) {
		if (tag == null) {
			return true;
		}
		ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
		return tags != null && tags.isKnownTagName(tag) && !tags.getTag(tag).isEmpty();
	}

	public static ObjectArrayList<ItemStack> with(ObjectArrayList<ItemStack> before, ItemStack addition) {
		before.add(addition);
		return before.clone();
	}

	public static ObjectArrayList<ItemStack> with(ObjectArrayList<ItemStack> before, Item addition, int count) {
		return (count < 1) ? before : with(before, new ItemStack(addition, count));
	}

	public static ObjectArrayList<ItemStack> with(ObjectArrayList<ItemStack> before, Item addition, RandomSource rand, int min, int max) {
		return (max <= min) ? before : with(before, addition, rand.nextIntBetweenInclusive(min, max));
	}

	public static ObjectArrayList<ItemStack> with(ObjectArrayList<ItemStack> before, Item addition) {
		return with(before, addition, 1);
	}

	@Nullable
	public static Item item(ResourceLocation rl) {
		return ForgeRegistries.ITEMS.getValue(rl);
	}

	@Nullable
	public static Item item(String modid, String path) {
		return item(rl(modid, path));
	}

	@NotNull
	public static Item item(ResourceLocation rl, @NotNull Item backup) {
		return ForgeRegistries.ITEMS.containsKey(rl) ? Objects.requireNonNull(item(rl)) : backup;
	}

	@NotNull
	public static Item item(ResourceLocation rl, @NotNull Supplier<Item> backup) {
		return item(rl, backup.get());
	}

	@Nullable
	public static Block block(String modid, String path) {
		return block(rl(modid, path));
	}

	@Nullable
	public static Block block(ResourceLocation rl) {
		return ForgeRegistries.BLOCKS.getValue(rl);
	}

	@NotNull
	public static MobEffect effect(String modid, String name, MobEffect backup) {
		ResourceLocation effLocation = Util.rl(modid, name);
		if (Mods.loaded(modid) && ForgeRegistries.MOB_EFFECTS.containsKey(effLocation)) {
			return Objects.requireNonNull(ForgeRegistries.MOB_EFFECTS.getValue(effLocation));
		}
		return backup;
	}

	public static ItemStack gs(RegistryObject<Item> r, int count) {
		return new ItemStack(r.get(), count);
	}

	public static ItemStack gs(RegistryObject<Item> r) {
		return gs(r, 1);
	}

	public static String name(Item item) {
		return (ForgeRegistries.ITEMS.containsValue(item)) ?
				Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).getPath() : "";
	}

	public static String name(Block block) {
		return (ForgeRegistries.BLOCKS.containsValue(block)) ?
				Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath() : "";
	}

	public static String name(RegistryObject<?> reg) {
		return reg.getId().getPath();
	}

	public static Ingredient ing(Supplier<? extends ItemLike> i) {
		return Ingredient.of(i.get());
	}

	public static ItemStack enchant(ItemStack stack, Enchantment enchantment, int level) {
		ItemStack enchanted = stack.copy();
		enchanted.enchant(enchantment, level);
		return enchanted;
	}

	public static void dropOrGive(ItemStack stack, Level world, BlockPos drop, Player give) {
		if (DelightfulConfig.GIVE_SLICED_DIRECTLY.get()) {
			ItemHandlerHelper.giveItemToPlayer(give, stack, 0);
		} else {
			Containers.dropItemStack(world, drop.getX(), drop.getY() + 0.25F, drop.getZ(), stack);
		}
	}

	public static boolean hasTagString(ItemStack stack, String key, String value) {
		if (stack.hasTag()) {
			CompoundTag tag = stack.getTag();
			return tag != null && tag.contains(key) && tag.getString(key).equals(value);
		}
		return false;
	}

	public static boolean configEnabled(String item) {
		return DelightfulConfig.CONFIG.verify(item);
	}

	public static boolean configEnabled(Item item) {
		return configEnabled(Util.name(item));
	}

	public static boolean enabled(Item item) {
		return (item instanceof IConfigured conf) ? conf.enabled() : configEnabled(item);
	}

	public static boolean enabled(RegistryObject<Item> item) {
		return enabled(item.get());
	}

	public static boolean enabled(String item) {
		List<Item> found = DelightfulItems.ITEMS.getEntries()
				.stream()
				.filter(reg -> Objects.equals(reg.getId(), Util.rl(Delightful.MODID, item)))
				.map(RegistryObject::get)
				.toList();
		return found.isEmpty() ? configEnabled(item) : enabled(found.get(0));
	}
}