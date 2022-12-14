package net.kevinlikescoding.kevincraft.item;

import net.kevinlikescoding.kevincraft.KevinCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KevinCraft.MOD_ID);
    public static final RegistryObject<Item> IRON_GOLD_INGOT = ITEMS.register("iron_gold_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_PICKAXE = ITEMS.register("iron_gold_pickaxe", () -> new PickaxeItem(ModTiers.IRON_GOLD_INGOT, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_AXE = ITEMS.register("iron_gold_axe", () -> new AxeItem(ModTiers.IRON_GOLD_INGOT, 4, 0f, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_SHOVEL = ITEMS.register("iron_gold_shovel", () -> new ShovelItem(ModTiers.IRON_GOLD_INGOT, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_HOE = ITEMS.register("iron_gold_hoe", () -> new HoeItem(ModTiers.IRON_GOLD_INGOT, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_SWORD = ITEMS.register("iron_gold_sword", () -> new SwordItem(ModTiers.IRON_GOLD_INGOT, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
