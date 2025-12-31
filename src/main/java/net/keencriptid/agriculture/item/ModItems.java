package net.keencriptid.agriculture.item;

import net.keencriptid.agriculture.Agriculture;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Agriculture.MOD_ID);

    public static final DeferredItem<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CUCUMBER_SLICE = ITEMS.register("cucumber_slice",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WATERING_CAN = ITEMS.register("watering_can",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
