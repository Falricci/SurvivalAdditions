package net.survivaladditions.items.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;

public class PickaxeItem extends ItemPickaxe {

	protected PickaxeItem(ToolMaterial material, String name) {
		super(material);

		this.setUnlocalizedName(Constants.MODID + "_" + name);
		this.setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerItem(this, name);
		this.setTextureName(Constants.MODID + ":" + name);
	}

}
