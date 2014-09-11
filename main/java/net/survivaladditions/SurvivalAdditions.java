package net.survivaladditions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.survivaladditions.blocks.SABlocks;
import net.survivaladditions.items.SAItems;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class SurvivalAdditions {
	
	public static CreativeTabs tabSurvivalAdditions;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		tabSurvivalAdditions = new CreativeTabs("tab" + Constants.MODID) {		
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(SABlocks.blockCopperOre);
			}
		};
		
		SABlocks.init();
		SAItems.init();

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		//Recipes
		GameRegistry.addRecipe(new ItemStack(SABlocks.blockCopperBlock), new Object[]{"CCC", "CCC", "CCC", 'C', SAItems.copperIngot});
		
		//Smelting
		GameRegistry.addSmelting(SABlocks.blockCopperOre, new ItemStack(SAItems.copperIngot), 0);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
