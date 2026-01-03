package net.keencriptid.agriculture.item;

import net.keencriptid.agriculture.Agriculture;
import net.keencriptid.agriculture.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Agriculture.MOD_ID);

    public static final Supplier<CreativeModeTab> AGRICULTURE_ITEMS_TAB = CREATIVE_MODE_TAB.register("agriculture_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUCUMBER.get()))
                    .title(Component.translatable("creativetab.agriculture.agriculture_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CUCUMBER);
                        output.accept(ModItems.CUCUMBER_SLICE);
                        output.accept(ModItems.WATERING_CAN);
                    }).build());

    public static final Supplier<CreativeModeTab> AGRICULTURE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("agriculture_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlock.COOKING_POT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Agriculture.MOD_ID, "agriculture_items_tab"))
                    .title(Component.translatable("creativetab.agriculture.agriculture_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlock.COOKING_POT);
                        output.accept(ModBlock.NUTRIENT_SOIL_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
