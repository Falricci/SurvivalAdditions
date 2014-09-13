package net.survivaladditions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.survivaladditions.blocks.SABlocks;
import net.survivaladditions.items.SAItems;
import net.survivaladditions.items.tools.SATools;
import cpw.mods.fml.common.registry.GameRegistry;

public final class SARecipies {

	public static void init() {
		
		//Ingot Blocks
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockCopperBlock), new Object[]{"CCC", "CCC", "CCC", 'C', SAItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockTinBlock), new Object[]{"TTT", "TTT", "TTT", 'T', SAItems.tinIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockZincBlock), new Object[]{"ZZZ", "ZZZ", "ZZZ", 'Z', SAItems.zincIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockNickelBlock), new Object[]{"NNN", "NNN", "NNN", 'N', SAItems.nickelIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockManganeseBlock), new Object[]{"MMM", "MMM", "MMM", 'M', SAItems.manganeseIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockVanadiumBlock), new Object[]{"VVV", "VVV", "VVV", 'V', SAItems.vanadiumIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockRhodiumBlock), new Object[]{"RRR", "RRR", "RRR", 'R', SAItems.rhodiumIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockAluminumBlock), new Object[]{"AAA", "AAA", "AAA", 'A', SAItems.aluminumIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockTitaniumBlock), new Object[]{"TTT", "TTT", "TTT", 'T', SAItems.titaniumIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockBrassBlock), new Object[]{"BBB", "BBB", "BBB", 'B', SAItems.brassIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockBronzeBlock), new Object[]{"BBB", "BBB", "BBB", 'B', SAItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockSilverBlock), new Object[]{"SSS", "SSS", "SSS", 'S', SAItems.silverIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockInvarBlock), new Object[]{"III", "III", "III", 'I', SAItems.invarIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockPalladiumBlock), new Object[]{"PPP", "PPP", "PPP", 'P', SAItems.palladiumIngot});
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockSteelBlock), new Object[]{"SSS", "SSS", "SSS", 'S', SAItems.steelIngot});
		
		//Pickaxes
		GameRegistry.addRecipe(new ItemStack(SATools.bronzePickaxe), new Object[]{"BBB", " S ", " S ", 'B', SAItems.bronzeIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(SATools.invarPickaxe), new Object[]{"III", " S ", " S ", 'I', SAItems.invarIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(SATools.steelPickaxe), new Object[]{"SSS", " S ", " S ", 'S', SAItems.steelIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(SATools.titaniumPickaxe), new Object[]{"TTT", " S ", " S ", 'T', SAItems.titaniumIngot, 'S', Items.stick});


	}
}
