package com.ogrekpl.elementarydiamonds.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ItemInit.ITEM_RAW_COAL_CHUNK, new ItemStack(ItemInit.ITEM_COAL_CHUNK, 1), 1.5f);
	}
}
