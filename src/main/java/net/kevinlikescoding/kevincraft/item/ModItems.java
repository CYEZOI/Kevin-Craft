package net.kevinlikescoding.kevincraft.item;

import net.kevinlikescoding.kevincraft.KevinCraft;
import net.minecraft.world.entity.EquipmentSlot;
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
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB).food(ModFoods.IRON_APPLE)));
    public static final RegistryObject<Item> IRON_GOLD_APPLE = ITEMS.register("iron_gold_apple", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB).food(ModFoods.IRON_GOLD_APPLE)));
    public static final RegistryObject<Item> IRON_GOLD_HELMET = ITEMS.register("iron_gold_helmet", () -> new ArmorItem(ModArmorMaterials.IRON_GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_CHESTPLATE = ITEMS.register("iron_gold_chestplate", () -> new ArmorItem(ModArmorMaterials.IRON_GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_LEGGINGS = ITEMS.register("iron_gold_leggings", () -> new ArmorItem(ModArmorMaterials.IRON_GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static final RegistryObject<Item> IRON_GOLD_BOOTS = ITEMS.register("iron_gold_boots", () -> new ArmorItem(ModArmorMaterials.IRON_GOLD, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.KEVINCRAFT_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
