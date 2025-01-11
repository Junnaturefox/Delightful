package net.brnbrd.delightful.common.item.knife.compat.unusualend;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.common.item.DelightfulTiers;
import net.brnbrd.delightful.common.item.knife.CompatKnifeItem;
import net.brnbrd.delightful.compat.Mods;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeMod;
import org.apache.commons.lang3.tuple.ImmutablePair;
import vectorwing.farmersdelight.common.registry.ModItems;
import java.util.UUID;

public class PearlescentKnifeItem extends CompatKnifeItem {
	private static final UUID BLOCK = UUID.fromString("c18598a9-f66a-44e7-9ce1-99b1ee178678");
	private static final UUID ENTITY = UUID.fromString("61f992e6-276f-4d2b-88a7-823cb64ba459");
	private final Multimap<Attribute, AttributeModifier> attributes;
	public final static TagKey<Item> upgrade = Util.it("unusualend", "pearlescent_upgrade_smithing_template");

	public PearlescentKnifeItem(Properties properties) {
		super(Mods.DD, DelightfulItemTags.INGOTS_PEARLESCENT, DelightfulTiers.PEARLESCENT, properties);
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(BLOCK,
			"Reach modifier", 1.5, AttributeModifier.Operation.ADDITION
		));
		builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(ENTITY,
			"Reach modifier", 0.5, AttributeModifier.Operation.ADDITION
		));
		this.attributes = builder.build();
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
		Multimap<Attribute, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
		if (slot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(mods);
			builder.putAll(this.attributes);
			return builder.build();
		}
		return mods;
	}

	@Override
	public ImmutablePair<Ingredient, Ingredient> getSmithing() {
		return new ImmutablePair<>(Ingredient.of(upgrade), Util.ing(ModItems.DIAMOND_KNIFE));
	}
}