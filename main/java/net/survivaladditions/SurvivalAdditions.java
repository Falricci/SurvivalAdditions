package net.survivaladditions;

import java.lang.reflect.Field;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.survivaladditions.blocks.SABlocks;
import net.survivaladditions.items.SAItems;
import net.survivaladditions.items.toolmaterials.SAToolMaterials;
import net.survivaladditions.items.tools.SATools;
import net.survivaladditions.lib.Constants;
import net.survivaladditions.worldGen.SurvivalAdditionsWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class SurvivalAdditions {
	
	SurvivalAdditionsWorldGen eventWorldGent = new SurvivalAdditionsWorldGen();
	public static CreativeTabs tabSurvivalAdditions;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
//		Field[] fieldList = ToolMaterial.class.getDeclaredFields(); 
//		for (int i = 0; i < fieldList.length; i++) {
//		 System.out.println("[" + i + "] " + fieldList[ i ]);
//		}
		
		
		tabSurvivalAdditions = new CreativeTabs("tab" + Constants.MODID) {		
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(SABlocks.blockCopperOre);
			}
		};
		
		SABlocks.init();
		SAItems.init();
		SAToolMaterials.init();
		SATools.init();
		GameRegistry.registerWorldGenerator(eventWorldGent, 0);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		//Recipes
		SARecipies.init();
		
		//Smelting
		SASmelting.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
