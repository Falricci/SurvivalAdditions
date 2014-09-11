package net.survivaladditions.blocks;

import net.minecraft.block.Block;

public final class SABlocks {

	public static Block blockCopperOre;
	public static Block blockTinOre;
	public static Block blockZincOre;
	public static Block blockCopperBlock;
	
	public static void init() {
		
		blockCopperOre = new BlockCopperOre();
		blockCopperBlock = new BlockCopperBlock();

	}

}
