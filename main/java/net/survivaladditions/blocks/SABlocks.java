package net.survivaladditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public final class SABlocks {

	//ores
	public static Block blockCopperOre;
	public static Block blockTinOre;
	public static Block blockZincOre;
	public static Block blockNickelOre;
	public static Block blockManganeseOre;
	public static Block blockVanadiumOre;
	public static Block blockRhodiumOre;
	public static Block blockAluminumOre;
	public static Block blockSilverOre;

	
	
	//blocks of ingots
	public static Block blockCopperBlock;
	public static Block blockTinBlock;
	public static Block blockZincBlock;
	public static Block blockNickelBlock;
	public static Block blockManganeseBlock;
	public static Block blockVanadiumBlock;
	public static Block blockRhodiumBlock;
	public static Block blockAluminumBlock;
	public static Block blockBrassBlock;
	public static Block blockBronzeBlock;
	public static Block blockTitaniumBlock;
	public static Block blockSilverBlock;
	public static Block blockInvarBlock;
	public static Block blockPalladiumBlock;
	public static Block blockSteelBlock;


	
	public static void init() {
		
		/*harvest levels
		 * 
		 * ----Ore--------lowest Pick--------harvest
		 * Aluminum			wood				0
		 * Copper			stone				1
		 * Tin				stone				1
		 * Zinc				stone				1
		 * Iron				bronze				2
		 * Nickel			iron				3
		 * Manganese		iron				3
		 * Gold				invar				4
		 * Vanadium			invar				4
		 * Lapis			invar				4
		 * Rhodium			steel				5
		 * Silver			steel				5
		 * Redstone			steel				5
		 * Emerald		 	titanium			6
		 * Diamond 			titanium			6
		 * Obsidian			diamond				7
		 * 
		 */
		
		//adjusts existing ore harvest levels
		Blocks.iron_ore.setHarvestLevel("pickaxe", 2);
		Blocks.lapis_ore.setHarvestLevel("pickaxe", 4);
		Blocks.gold_ore.setHarvestLevel("pickaxe", 4);
		Blocks.redstone_ore.setHarvestLevel("pickaxe", 5);
		Blocks.emerald_ore.setHarvestLevel("pickaxe", 6);
		Blocks.diamond_ore.setHarvestLevel("pickaxe", 6);
		Blocks.obsidian.setHarvestLevel("pickaxe", 7);
		
		System.out.println("IRON: " + Blocks.iron_ore.getHarvestLevel(0));
		System.out.println("LAPIS: " + Blocks.lapis_ore.getHarvestLevel(0));
		System.out.println("GOLD: " + Blocks.gold_ore.getHarvestLevel(0));
		System.out.println("REDSTONE: " + Blocks.redstone_ore.getHarvestLevel(0));
		System.out.println("EMERALD: " + Blocks.emerald_ore.getHarvestLevel(0));
		System.out.println("DIAMOND: " + Blocks.diamond_ore.getHarvestLevel(0));
		System.out.println("OBSIDIAN: " + Blocks.obsidian.getHarvestLevel(0));
		
		//ores
		blockAluminumOre = new OreBlock("aluminum_ore", 3, 15, 0);
		blockCopperOre = new OreBlock("copper_ore", 3, 15, 1);
		blockTinOre = new OreBlock("tin_ore", 3, 15, 1);
		blockZincOre = new OreBlock("zinc_ore", 3, 15, 1);
		blockNickelOre = new OreBlock("nickel_ore", 3, 15, 3);
		blockManganeseOre = new OreBlock("manganese_ore", 3, 15, 3);
		blockVanadiumOre = new OreBlock("vanadium_ore", 3, 15, 4);
		blockRhodiumOre = new OreBlock("rhodium_ore", 3, 15, 5);
		blockSilverOre = new OreBlock("silver_ore", 3, 15, 5);

		
		//blocks of ingots
		blockCopperBlock = new IngotBlock("copper_block", 3, 30);
		blockTinBlock = new IngotBlock("tin_block", 3, 30);
		blockZincBlock = new IngotBlock("zinc_block", 3, 30);
		blockNickelBlock = new IngotBlock("nickel_block", 3, 30);
		blockManganeseBlock = new IngotBlock("manganese_block", 3, 30);
		blockVanadiumBlock = new IngotBlock("vanadium_block", 3, 30);
		blockRhodiumBlock = new IngotBlock("rhodium_block", 3, 30);
		blockAluminumBlock = new IngotBlock("aluminum_block", 3, 30);
		blockBrassBlock = new IngotBlock("brass_block", 3, 30);
		blockBronzeBlock = new IngotBlock("bronze_block", 3, 30);
		blockSilverBlock = new IngotBlock("silver_block", 3, 30);
		blockTitaniumBlock = new IngotBlock("titanium_block", 3, 30);
		blockInvarBlock = new IngotBlock("invar_block", 3, 30);
		blockPalladiumBlock = new IngotBlock("palladium_block", 3, 30);
		blockSteelBlock = new IngotBlock("steel_block", 3, 30);




	}

}
