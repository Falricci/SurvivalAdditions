package net.survivaladditions.items.tools;

import net.minecraft.item.Item;
import net.survivaladditions.items.toolmaterials.SAToolMaterials;

public final class SATools {

	public static Item bronzePickaxe;
	public static Item invarPickaxe;
	public static Item steelPickaxe;
	public static Item titaniumPickaxe;
	
	public static void init() {
		
		bronzePickaxe = new PickaxeItem(SAToolMaterials.bronzeMaterial, "bronze_pickaxe");
		invarPickaxe = new PickaxeItem(SAToolMaterials.invarMaterial, "invar_pickaxe");
		steelPickaxe = new PickaxeItem(SAToolMaterials.steelMaterial, "steel_pickaxe");
		titaniumPickaxe = new PickaxeItem(SAToolMaterials.titaniumMaterial, "titanium_pickaxe");

	}
}
