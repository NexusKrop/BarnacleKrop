package io.github.nexuskrop.barnacle.item;

import io.github.nexuskrop.barnacle.BarnacleKrop;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public final class BarnacleItems {
    private BarnacleItems() {
        throw new IllegalStateException("Yeah yeah");
    }

    public static final Item IRON_STICK = new Item(new FabricItemSettings().group(CreativeModeTab.TAB_MISC));
    public static final Item IRON_DUST = new Item(new FabricItemSettings().group(CreativeModeTab.TAB_MISC));

    public static void registerAll() {
        registerItem("iron_stick", IRON_STICK);
        registerItem("iron_dust", IRON_DUST);
    }

    private static void registerItem(String key, Item item) {
        Registry.register(Registry.ITEM, new ResourceLocation(BarnacleKrop.NAMESPACE, key), item);
    }
}
