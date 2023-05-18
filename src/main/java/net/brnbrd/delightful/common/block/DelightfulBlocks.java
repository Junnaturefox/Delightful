package net.brnbrd.delightful.common.block;

import net.brnbrd.delightful.Delightful;
import net.brnbrd.delightful.common.item.DelightfulItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;
import java.util.function.Supplier;

public class DelightfulBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Delightful.MODID);

    public static final RegistryObject<Block> QUARTZ_CABINET = registerBlock("quartz_cabinet",
      () -> new DelightfulCabinetBlock(DelightfulItems.getGem("quartz"), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> BASALT_CABINET = registerBlock("basalt_cabinet",
      () -> new DelightfulCabinetBlock(Ingredient.of(Items.BASALT), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> WILD_SALMONBERRIES = BLOCKS.register("wild_salmonberries",
        WildSalmonberriesBlock::new);
    public static final RegistryObject<Block> SALMONBERRY_BUSH = BLOCKS.register("salmonberry_bush", () -> new SalmonberryBushBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> MINI_MELON = BLOCKS.register("mini_melon",
      () -> new MiniMelonBlock(BlockBehaviour.Properties.copy(Blocks.MELON).noOcclusion()));
    public static final RegistryObject<Block> SLICED_MINI_MELON = BLOCKS.register("sliced_mini_melon",
        () -> new SlicedMiniMelonBlock(BlockBehaviour.Properties.copy(MINI_MELON.get()).noOcclusion(), () -> Items.MELON_SLICE, ModItems.MELON_JUICE));
    public static final RegistryObject<Block> CANTALOUPE = BLOCKS.register("cantaloupe",
        () -> new CantaloupeBlock(BlockBehaviour.Properties.copy(MINI_MELON.get()).noOcclusion()));
    public static final RegistryObject<Block> SLICED_CANTALOUPE = BLOCKS.register("sliced_cantaloupe",
        () -> new SlicedMiniMelonBlock(BlockBehaviour.Properties.copy(SLICED_MINI_MELON.get()).noOcclusion(), DelightfulItems.CANTALOUPE_SLICE, null));
    public static final RegistryObject<Block> SLICED_MELON = BLOCKS.register("sliced_melon",
        () -> new SlicedMelonBlock(BlockBehaviour.Properties.copy(Blocks.MELON), () -> Items.MELON_SLICE, ModItems.MELON_JUICE));
    public static final RegistryObject<Block> SLICED_PUMPKIN = BLOCKS.register("sliced_pumpkin",
        () -> new SlicedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.PUMPKIN), ModItems.PUMPKIN_SLICE));
    public static final RegistryObject<Block> SALMONBERRY_SACK = BLOCKS.register("salmonberry_sack",
      () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE).strength(.5f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> SALMONBERRY_PIE = BLOCKS.register("salmonberry_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.SALMONBERRY_PIE_SLICE));
    public static final RegistryObject<Block> PUMPKIN_PIE = BLOCKS.register("pumpkin_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.PUMPKIN_PIE_SLICE));
    public static final RegistryObject<Block> SOURCE_BERRY_PIE = BLOCKS.register("source_berry_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.SOURCE_BERRY_PIE_SLICE));
    public static final RegistryObject<Block> BLUEBERRY_PIE = BLOCKS.register("blueberry_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.BLUEBERRY_PIE_SLICE));
    public static final RegistryObject<Block> GREEN_APPLE_PIE = BLOCKS.register("green_apple_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.GREEN_APPLE_PIE_SLICE));
    public static final RegistryObject<Block> NIGHTSHADE_BERRY_PIE = BLOCKS.register("nightshade_berry_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.NIGHTSHADE_BERRY_PIE_SLICE));
    public static final RegistryObject<Block> CRIMSON_BERRY_PIE = BLOCKS.register("crimson_berry_pie",
        () -> new PieBlock(BlockBehaviour.Properties.copy(ModBlocks.APPLE_PIE.get()), DelightfulItems.CRIMSON_BERRY_PIE_SLICE));
    public static final RegistryObject<Block> ACORN_SACK = BLOCKS.register("acorn_sack",
        () ->  new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN).strength(.5f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> SALMONBERRY_ICE_CREAM_BLOCK = BLOCKS.register("salmonberry_ice_cream_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.COLOR_ORANGE).strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> MATCHA_ICE_CREAM_BLOCK = BLOCKS.register("matcha_ice_cream_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.COLOR_LIGHT_GREEN).strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> GREEN_APPLE_CRATE = BLOCKS.register("green_apple_crate",
        () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JOSHUA_FRUIT_CRATE = BLOCKS.register("joshua_fruit_crate",
        () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }

    public static void create(IEventBus bus) {
        BLOCKS.register(bus);
    }
}