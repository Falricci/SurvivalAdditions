package net.survivaladditions.worldGen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.survivaladditions.blocks.SABlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class SurvivalAdditionsWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch (world.provider.dimensionId) {
		case 0:
			//Generate our surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
		case -1:
			//Generate our surface world
			generateNether(world, random, chunkX*16, chunkZ*16);
		case 1:
			//Generate our surface world
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		//this.addOreSpawn(SABlocks.blockOre, world, random, i=blockXPos, j=blockZPos, maxX, maxZ, maxVeinSize, chanceToSpawn, minYSpawn, maxYSpawn);
		this.addOreSpawn(SABlocks.blockAluminumOre, world, random, x, z, 16, 16, 4 + random.nextInt(8), 23, 38, 100);
		
		this.addOreSpawn(SABlocks.blockCopperOre, world, random, x, z, 16, 16, 4 + random.nextInt(7), 20, 30, 75);
		this.addOreSpawn(SABlocks.blockTinOre, world, random, x, z, 16, 16, 4 + random.nextInt(7), 20, 30, 75);
		this.addOreSpawn(SABlocks.blockZincOre, world, random, x, z, 16, 16, 4 + random.nextInt(7), 20, 30, 75);
		
		this.addOreSpawn(SABlocks.blockNickelOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 9, 1, 55);
		this.addOreSpawn(SABlocks.blockManganeseOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 9, 1, 55);
		
		this.addOreSpawn(SABlocks.blockVanadiumOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 5, 1, 40);
		this.addOreSpawn(SABlocks.blockRhodiumOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 5, 1, 40);
		
		this.addOreSpawn(SABlocks.blockSilverOre, world, random, x, z, 16, 16, 4 + random.nextInt(4), 2, 0, 32);


		
	}


	private void generateNether(World world, Random random, int x, int z) {
		
		
		
	}

	private void generateEnd(World world, Random random, int x, int z) {
		
		
		
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}
}
