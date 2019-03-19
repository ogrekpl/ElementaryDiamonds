package com.ogrekpl.elementarydiamonds.tab;

import com.ogrekpl.elementarydiamonds.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ElementaryDiamondsTab extends CreativeTabs
{

	public ElementaryDiamondsTab(String label) 
	{
		super("elementary_diamonds_tab");
		//this.setBackgroundImageName("test.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.ITEM_WATER_DIAMOND);
	}

}
