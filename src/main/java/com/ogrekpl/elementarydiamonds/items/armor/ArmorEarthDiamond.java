package com.ogrekpl.elementarydiamonds.items.armor;

import com.ogrekpl.elementarydiamonds.Main;
import com.ogrekpl.elementarydiamonds.init.ItemInit;
import com.ogrekpl.elementarydiamonds.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorEarthDiamond extends ArmorBase implements IHasModel
{
	public ArmorEarthDiamond(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(1) != null &&
				player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(3) != null)
		{
			if (player.inventory.armorItemInSlot(0).getItem() == ItemInit.EARTH_DIAMOND_BOOTS &&
					player.inventory.armorItemInSlot(1).getItem() == ItemInit.EARTH_DIAMOND_LEGGINS &&
					player.inventory.armorItemInSlot(2).getItem() == ItemInit.EARTH_DIAMOND_CHESTPLATE &&
					player.inventory.armorItemInSlot(3).getItem() == ItemInit.EARTH_DIAMOND_HELMET)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 5));
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5));
			}
			
		}
	}
	
}
