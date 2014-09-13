package net.survivaladditions;

import net.minecraft.item.ItemStack;
import net.survivaladditions.blocks.SABlocks;
import net.survivaladditions.items.SAItems;
import cpw.mods.fml.common.registry.GameRegistry;

public final class SASmelting {

	public static void init() {
		
		GameRegistry.addSmelting(SABlocks.blockCopperOre, new ItemStack(SAItems.copperIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockTinOre, new ItemStack(SAItems.tinIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockZincOre, new ItemStack(SAItems.zincIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockNickelOre, new ItemStack(SAItems.nickelIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockManganeseOre, new ItemStack(SAItems.manganeseIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockVanadiumOre, new ItemStack(SAItems.vanadiumIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockRhodiumOre, new ItemStack(SAItems.rhodiumIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockAluminumOre, new ItemStack(SAItems.aluminumIngot), 0);
		GameRegistry.addSmelting(SABlocks.blockSilverOre, new ItemStack(SAItems.silverIngot), 0);


	}
}
