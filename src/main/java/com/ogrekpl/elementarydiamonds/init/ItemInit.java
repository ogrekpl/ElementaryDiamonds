package com.ogrekpl.elementarydiamonds.init;

import java.util.ArrayList;
import java.util.List;
import com.ogrekpl.elementarydiamonds.items.ItemBase;
import com.ogrekpl.elementarydiamonds.items.ItemMagicFuel;
import com.ogrekpl.elementarydiamonds.items.armor.ArmorBase;
import com.ogrekpl.elementarydiamonds.items.armor.ArmorEarthDiamond;
import com.ogrekpl.elementarydiamonds.items.armor.ArmorFireDiamond;
import com.ogrekpl.elementarydiamonds.items.armor.ArmorWaterDiamond;
import com.ogrekpl.elementarydiamonds.items.tools.ToolAxe;
import com.ogrekpl.elementarydiamonds.items.tools.ToolHoe;
import com.ogrekpl.elementarydiamonds.items.tools.ToolPickaxe;
import com.ogrekpl.elementarydiamonds.items.tools.ToolSpade;
import com.ogrekpl.elementarydiamonds.items.tools.ToolSword;
import com.ogrekpl.elementarydiamonds.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ITEM_COAL_CHUNK = new ItemBase("item_coal_chunk"); 
	public static final Item ITEM_RAW_COAL_CHUNK = new ItemBase("item_raw_coal_chunk");
	public static final Item ITEM_DARK_IRON_INGOT = new ItemBase("item_dark_iron_ingot");
	public static final Item ITEM_STONE_BOWL = new ItemBase("item_stone_bowl");
	public static final Item ITEM_GRINDER_BOWL = new ItemBase("item_grinder_bowl");
	public static final Item ITEM_GRINDER = new ItemBase("item_grinder");
	public static final Item ITEM_MAGIC_FUEL= new ItemMagicFuel("item_magic_fuel");
	public static final Item ITEM_MAGIC_STONE = new ItemBase("item_magic_stone");
	public static final Item ITEM_OBSIDIAN_STONE = new ItemBase("item_obsidian_stone");
	public static final Item ITEM_OBSIDIAN_NUGGET = new ItemBase("item_obsidian_nugget");
	public static final Item ITEM_OBSIDIAN_STICK = new ItemBase("item_obsidian_stick");
	public static final Item ITEM_EARTH_DIAMOND = new ItemBase("item_earth_diamond");
	public static final Item ITEM_FIRE_DIAMOND = new ItemBase("item_fire_diamond");
	public static final Item ITEM_WATER_DIAMOND = new ItemBase("item_water_diamond");
	public static final Item ITEM_EARTH_DIAMOND_NUGGET = new ItemBase("item_earth_diamond_nugget");
	public static final Item ITEM_FIRE_DIAMOND_NUGGET = new ItemBase("item_fire_diamond_nugget");
	public static final Item ITEM_WATER_DIAMOND_NUGGET = new ItemBase("item_water_diamond_nugget");
	public static final Item ITEM_DIAMOND_NUGGET = new ItemBase("item_diamond_nugget");
	public static final Item ITEM_EARTH_DIAMOND_DUST = new ItemBase("item_earth_diamond_dust");
	public static final Item ITEM_FIRE_DIAMOND_DUST = new ItemBase("item_fire_diamond_dust");
	public static final Item ITEM_WATER_DIAMOND_DUST = new ItemBase("item_water_diamond_dust");
	
	//Materials
	public static final ToolMaterial MATERIAL_FIRE_DIAMOND = EnumHelper.addToolMaterial("material_fire_diamond", 3, 1821, 9.0F, 3.5F, 14);
	public static final ToolMaterial MATERIAL_WATER_DIAMOND = EnumHelper.addToolMaterial("material_water_diamond", 3, 1221, 11.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_EARTH_DIAMOND = EnumHelper.addToolMaterial("material_earth_diamond", 3, 2221, 7.0F, 2.5F, 25);
	
	public static final ArmorMaterial ARMOR_MATERIAL_FIRE_DIAMOND = EnumHelper.addArmorMaterial("armor_material_fire_diamond", Reference.MOD_ID + ":fire_diamond", 15, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WATER_DIAMOND = EnumHelper.addArmorMaterial("armor_material_water_diamond", Reference.MOD_ID + ":water_diamond", 15, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_EARTH_DIAMOND = EnumHelper.addArmorMaterial("armor_material_earth_diamond", Reference.MOD_ID + ":earth_diamond", 15, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 0.0F);

	//Tools
	public static final ItemSword FIRE_DIAMOND_SWORD = new ToolSword("sword_fire_diamond", MATERIAL_FIRE_DIAMOND);
	public static final ItemSpade FIRE_DIAMOND_SPADE = new ToolSpade("spade_fire_diamond", MATERIAL_FIRE_DIAMOND);
	public static final ItemPickaxe FIRE_DIAMOND_PICKAXE = new ToolPickaxe("pickaxe_fire_diamond", MATERIAL_FIRE_DIAMOND);
	public static final ItemAxe FIRE_DIAMOND_AXE = new ToolAxe("axe_fire_diamond", MATERIAL_FIRE_DIAMOND);
	public static final ItemHoe FIRE_DIAMOND_HOE = new ToolHoe("hoe_fire_diamond", MATERIAL_FIRE_DIAMOND);
	public static final ItemSword EARTH_DIAMOND_SWORD = new ToolSword("sword_earth_diamond", MATERIAL_EARTH_DIAMOND);
	public static final ItemSpade EARTH_DIAMOND_SPADE = new ToolSpade("spade_earth_diamond", MATERIAL_EARTH_DIAMOND);
	public static final ItemPickaxe EARTH_DIAMOND_PICKAXE = new ToolPickaxe("pickaxe_earth_diamond", MATERIAL_EARTH_DIAMOND);
	public static final ItemAxe EARTH_DIAMOND_AXE = new ToolAxe("axe_earth_diamond", MATERIAL_EARTH_DIAMOND);
	public static final ItemHoe EARTH_DIAMOND_HOE = new ToolHoe("hoe_earth_diamond", MATERIAL_EARTH_DIAMOND);
	public static final ItemSword WATER_DIAMOND_SWORD = new ToolSword("sword_water_diamond", MATERIAL_WATER_DIAMOND);
	public static final ItemSpade WATER_DIAMOND_SPADE = new ToolSpade("spade_water_diamond", MATERIAL_WATER_DIAMOND);
	public static final ItemPickaxe WATER_DIAMOND_PICKAXE = new ToolPickaxe("pickaxe_water_diamond", MATERIAL_WATER_DIAMOND);
	public static final ItemAxe WATER_DIAMOND_AXE = new ToolAxe("axe_water_diamond", MATERIAL_WATER_DIAMOND);
	public static final ItemHoe WATER_DIAMOND_HOE = new ToolHoe("hoe_water_diamond", MATERIAL_WATER_DIAMOND);
	
	//Armor 
	
	public static final Item FIRE_DIAMOND_HELMET = new ArmorFireDiamond("helmet_fire_diamond", ARMOR_MATERIAL_FIRE_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item FIRE_DIAMOND_CHESTPLATE = new ArmorFireDiamond("chestplate_fire_diamond", ARMOR_MATERIAL_FIRE_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item FIRE_DIAMOND_LEGGINS = new ArmorFireDiamond("leggins_fire_diamond", ARMOR_MATERIAL_FIRE_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item FIRE_DIAMOND_BOOTS = new ArmorFireDiamond("boots_fire_diamond", ARMOR_MATERIAL_FIRE_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item EARTH_DIAMOND_HELMET = new ArmorEarthDiamond("helmet_earth_diamond", ARMOR_MATERIAL_EARTH_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item EARTH_DIAMOND_CHESTPLATE = new ArmorEarthDiamond("chestplate_earth_diamond", ARMOR_MATERIAL_EARTH_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item EARTH_DIAMOND_LEGGINS = new ArmorEarthDiamond("leggins_earth_diamond", ARMOR_MATERIAL_EARTH_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item EARTH_DIAMOND_BOOTS = new ArmorEarthDiamond("boots_earth_diamond", ARMOR_MATERIAL_EARTH_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item WATER_DIAMOND_HELMET = new ArmorWaterDiamond("helmet_water_diamond", ARMOR_MATERIAL_WATER_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item WATER_DIAMOND_CHESTPLATE = new ArmorWaterDiamond("chestplate_water_diamond", ARMOR_MATERIAL_WATER_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item WATER_DIAMOND_LEGGINS = new ArmorWaterDiamond("leggins_water_diamond", ARMOR_MATERIAL_WATER_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item WATER_DIAMOND_BOOTS = new ArmorWaterDiamond("boots_water_diamond", ARMOR_MATERIAL_WATER_DIAMOND, 1, EntityEquipmentSlot.FEET);

}
