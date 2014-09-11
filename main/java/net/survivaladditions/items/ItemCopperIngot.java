package net.survivaladditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCopperIngot extends Item {

	private String name = "copper_ingot";
	
	public ItemCopperIngot() {
		setUnlocalizedName(Constants.MODID + "_" + name);
		setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerItem(this, name);
		setTextureName(Constants.MODID + ":" + name);
	}
}
