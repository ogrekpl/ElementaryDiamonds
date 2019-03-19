package com.ogrekpl.elementarydiamonds.blocks;

import java.util.Random;
import com.ogrekpl.elementarydiamonds.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockWaterDiamondOre extends BlockBase
{

	public BlockWaterDiamondOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setHardness(5.0F);
		setResistance(15.0F);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.ITEM_WATER_DIAMOND;
	}
	
	@Override
	public int quantityDropped(Random random) 
	{
		int max = 2;
		int min = 1;
		return random.nextInt(max) + min;
	}
}
