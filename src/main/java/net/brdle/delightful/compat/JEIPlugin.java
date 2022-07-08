package net.brdle.delightful.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.brdle.delightful.Delightful;
import net.brdle.delightful.common.config.DelightfulConfig;
import net.brdle.delightful.common.item.CompatKnifeItem;
import net.brdle.delightful.common.item.DelightfulItems;
import net.brdle.delightful.common.item.TaggedKnifeItem;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.utility.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@JeiPlugin
@ParametersAreNonnullByDefault
@SuppressWarnings("unused")
public class JEIPlugin implements IModPlugin
{
    private static final ResourceLocation ID = new ResourceLocation(FarmersDelight.MODID, "jei_plugin");
    private static final Minecraft MC = Minecraft.getInstance();

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        DelightfulItems.knives.stream()
            .map(RegistryObject::get)
            .filter(k -> {
                boolean isEnabled = DelightfulConfig.CONFIG.knives.get(k.getRegistryName().getPath()).get();
                Delightful.getLogger().warn(k.getRegistryName().getPath() + " enabledDD: " + isEnabled);
                if (k instanceof TaggedKnifeItem tki) {
                    Delightful.getLogger().warn(k.getRegistryName().getPath() + " tag: " + tki.isTag());
                    return isEnabled && tki.isTag();
                } else if (k instanceof CompatKnifeItem cki) {
                    Delightful.getLogger().warn(k.getRegistryName().getPath() + " load: " + cki.isLoaded());
                    return isEnabled && cki.isLoaded();
                }
                return isEnabled;
            })
            .map(ItemStack::new)
            .forEach((k -> registration.addIngredientInfo(k, VanillaTypes.ITEM_STACK, TextUtils.getTranslation("jei.info.knife"))));
    }

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }
}