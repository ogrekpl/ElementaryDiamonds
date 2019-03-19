package com.ogrekpl.elementarydiamonds.items.tools;

import com.ogrekpl.elementarydiamonds.Main;
import com.ogrekpl.elementarydiamonds.init.ItemInit;
import com.ogrekpl.elementarydiamonds.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
