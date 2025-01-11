package net.brnbrd.delightful.common.item.knife.compat.unusualend;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.util.Lazy;
import org.jetbrains.annotations.Nullable;
import java.util.UUID;

public class PearlescentKnifeItem extends CompatKnifeItem {
	private static final UUID BLOCK = UUID.fromString("c18598a9-f66a-44e7-9ce1-99b1ee178678");
	private static final UUID ENTITY = UUID.fromString("61f992e6-276f-4d2b-88a7-823cb64ba459");
	private final Lazy<Multimap<Attribute, AttributeModifier>> defaultModifiers;

	public PearlescentKnifeItem(Properties properties) {
		super(Mods.DD, DelightfulItemTags.INGOTS_PEARLESCENT, DelightfulTiers.PEARLESCENT, properties);
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(BLOCK,
				"Reach modifier", 1.5D, AttributeModifier.Operation.ADDITION));
		builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(ENTITY,
				"Reach modifier", 0.5D, AttributeModifier.Operation.ADDITION));
		this.defaultModifiers = Lazy.of(builder::build);
	}

	@Override
	public @Nullable Lazy<Multimap<Attribute, AttributeModifier>> getModifiers(EquipmentSlot slot, ItemStack stack) {
		return defaultModifiers;
	}

	@Override
	public @Nullable RecipeType<?> getRecipeType() {
		return RecipeType.SMITHING;
	}
}