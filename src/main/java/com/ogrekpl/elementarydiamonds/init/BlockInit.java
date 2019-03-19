package com.ogrekpl.elementarydiamonds.init;

import java.util.ArrayList;
import java.util.List;

import com.ogrekpl.elementarydiamonds.blocks.BlockEarthDiamondOre;
import com.ogrekpl.elementarydiamonds.blocks.BlockElementaryDiamondBlock;
import com.ogrekpl.elementarydiamonds.blocks.BlockFireDiamondOre;
import com.ogrekpl.elementarydiamonds.blocks.BlockWaterDiamondOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COMPRESED_FLINT = new BlockElementaryDiamondBlock("block_compresed_flint", Material.IRON);
	public static final Block BLOCK_EARTH_DIAMOND = new BlockElementaryDiamondBlock("block_earth_diamond", Material.IRON);
	public static final Block BLOCK_FIRE_DIAMOND = new BlockElementaryDiamondBlock("block_fire_diamond", Material.IRON);
	public static final Block BLOCK_WATER_DIAMOND = new BlockElementaryDiamondBlock("block_water_diamond", Material.IRON);
	public static final Block BLOCK_EARTH_DIAMOND_ORE = new BlockEarthDiamondOre("block_earth_diamond_ore", Material.IRON);
	public static final Block BLOCK_FIRE_DIAMOND_ORE = new BlockFireDiamondOre("block_fire_diamond_ore", Material.IRON);
	public static final Block BLOCK_WATER_DIAMOND_ORE = new BlockWaterDiamondOre("block_water_diamond_ore", Material.IRON);
	
}
