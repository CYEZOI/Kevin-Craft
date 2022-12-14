package net.kevinlikescoding.kevincraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab KEVINCRAFT_TAB = new CreativeModeTab("kevincraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IRON_GOLD_INGOT.get());
        }
    };
}
