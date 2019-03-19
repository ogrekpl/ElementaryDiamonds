package com.ogrekpl.elementarydiamonds.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockElementaryDiamondBlock extends BlockBase
{

	public BlockElementaryDiamondBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 3);
		setHardness(5.0F);
		setResistance(15.0F);
	}

}
