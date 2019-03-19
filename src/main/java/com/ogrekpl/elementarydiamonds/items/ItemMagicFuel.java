package com.ogrekpl.elementarydiamonds.items;

import net.minecraft.item.ItemStack;

public class ItemMagicFuel extends ItemBase
{
	public ItemMagicFuel(String name) 
	{
		super(name);
		
	}
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 19200;
	}
}
