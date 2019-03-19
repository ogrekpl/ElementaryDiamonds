package com.ogrekpl.elementarydiamonds.items;

import com.ogrekpl.elementarydiamonds.Main;
import com.ogrekpl.elementarydiamonds.init.ItemInit;
import com.ogrekpl.elementarydiamonds.proxy.ClientProxy;
import com.ogrekpl.elementarydiamonds.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ELEMENTARY_DIAMONDS_TAB);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
