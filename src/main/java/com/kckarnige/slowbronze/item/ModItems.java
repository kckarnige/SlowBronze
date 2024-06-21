package com.kckarnige.slowbronze.item;

import com.kckarnige.slowbronze.SlowBronze;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BRONZE_PLATE = registerItem("bronze_plate", new Item(new Item.Settings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BRONZE_PLATE);
    }

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SlowBronze.MOD_ID, name), item);
    }

    public static void registerModItems () {
        SlowBronze.LOGGER.info("Registering Bronze Plate item... - " + SlowBronze.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
    }
}
