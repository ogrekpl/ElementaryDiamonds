package com.ogrekpl.elementarydiamonds;

import com.ogrekpl.elementarydiamonds.init.SmeltingRecipes;
import com.ogrekpl.elementarydiamonds.proxy.CommonProxy;
import com.ogrekpl.elementarydiamonds.tab.ElementaryDiamondsTab;
import com.ogrekpl.elementarydiamonds.util.Reference;
import com.ogrekpl.elementarydiamonds.word.ModWorldGeneration;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION )
public class Main 
{
	public static final CreativeTabs ELEMENTARY_DIAMONDS_TAB = new ElementaryDiamondsTab("elementary_diamonds_tab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		SmeltingRecipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
