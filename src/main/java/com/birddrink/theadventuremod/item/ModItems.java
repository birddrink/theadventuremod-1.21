package com.birddrink.theadventuremod.item;

import com.birddrink.theadventuremod.AdventureMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdventureMod.MOD_ID);

    public static final DeferredItem<Item> BLUE_AMETHYST_SHARD = ITEMS.register("blue_amethyst_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
