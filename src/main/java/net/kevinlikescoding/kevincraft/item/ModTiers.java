package net.kevinlikescoding.kevincraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier IRON_GOLD_INGOT = new ForgeTier(2, 500, 15f, 3f, 30, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.IRON_GOLD_INGOT.get()));
}
