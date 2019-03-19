package com.ogrekpl.elementarydiamonds.word;

import java.util.Random;

import com.ogrekpl.elementarydiamonds.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(BlockInit.BLOCK_WATER_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 17, random.nextInt(6) + 1, 5);
		generateOre(BlockInit.BLOCK_FIRE_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 17, random.nextInt(6) + 1, 5);
		generateOre(BlockInit.BLOCK_EARTH_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 17, random.nextInt(6) + 1, 5);	
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
