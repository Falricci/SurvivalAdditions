package net.survivaladditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class IngotItem extends Item {
	
	public IngotItem(String name) {
		setUnlocalizedName(Constants.MODID + "_" + name);
		setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerItem(this, name);
		setTextureName(Constants.MODID + ":" + name);
	}
}
