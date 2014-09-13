package net.survivaladditions.items.toolmaterials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.ReflectionHelper;

public final class SAToolMaterials {

	public static ToolMaterial bronzeMaterial;
	public static ToolMaterial invarMaterial;
	public static ToolMaterial steelMaterial;
	public static ToolMaterial titaniumMaterial;
	
	public static void init() {
		//change vanilla values
		ReflectionHelper.setPrivateValue(ToolMaterial.class, ToolMaterial.WOOD, 0, 5);
		ReflectionHelper.setPrivateValue(ToolMaterial.class, ToolMaterial.STONE, 1, 5);
		ReflectionHelper.setPrivateValue(ToolMaterial.class, ToolMaterial.GOLD, 1, 5);
		ReflectionHelper.setPrivateValue(ToolMaterial.class, ToolMaterial.IRON, 3, 5);
		ReflectionHelper.setPrivateValue(ToolMaterial.class, ToolMaterial.EMERALD, 7, 5);
		
//		System.out.println("Wood -- Harvest: " + ToolMaterial.WOOD.getHarvestLevel() 
//						   + "\n        Max Uses:       " + ToolMaterial.WOOD.getMaxUses()
//						   + "\n        Efficiency:     " + ToolMaterial.WOOD.getEfficiencyOnProperMaterial()
//						   + "\n        Damage:         " + ToolMaterial.WOOD.getDamageVsEntity()
//						   + "\n        Enchantability: " + ToolMaterial.WOOD.getEnchantability());
//		
//		System.out.println("Gold -- Harvest: " + ToolMaterial.GOLD.getHarvestLevel() 
//				   + "\n        Max Uses:       " + ToolMaterial.GOLD.getMaxUses()
//				   + "\n        Efficiency:     " + ToolMaterial.GOLD.getEfficiencyOnProperMaterial()
//				   + "\n        Damage:         " + ToolMaterial.GOLD.getDamageVsEntity()
//				   + "\n        Enchantability: " + ToolMaterial.GOLD.getEnchantability());
//		
//		System.out.println("Stone -- Harvest: " + ToolMaterial.STONE.getHarvestLevel() 
//				   + "\n         Max Uses:       " + ToolMaterial.STONE.getMaxUses()
//				   + "\n         Efficiency:     " + ToolMaterial.STONE.getEfficiencyOnProperMaterial()
//				   + "\n         Damage:         " + ToolMaterial.STONE.getDamageVsEntity()
//				   + "\n         Enchantability: " + ToolMaterial.STONE.getEnchantability());
//		
//		System.out.println("Iron -- Harvest: " + ToolMaterial.IRON.getHarvestLevel() 
//				   + "\n        Max Uses:       " + ToolMaterial.IRON.getMaxUses()
//				   + "\n        Efficiency:     " + ToolMaterial.IRON.getEfficiencyOnProperMaterial()
//				   + "\n        Damage:         " + ToolMaterial.IRON.getDamageVsEntity()
//				   + "\n        Enchantability: " + ToolMaterial.IRON.getEnchantability());
//		
//		System.out.println("Diamond -- Harvest: " + ToolMaterial.EMERALD.getHarvestLevel() 
//				   + "\n           Max Uses:       " + ToolMaterial.EMERALD.getMaxUses()
//				   + "\n           Efficiency:     " + ToolMaterial.EMERALD.getEfficiencyOnProperMaterial()
//				   + "\n           Damage:         " + ToolMaterial.EMERALD.getDamageVsEntity()
//				   + "\n           Enchantability: " + ToolMaterial.EMERALD.getEnchantability());
		
		
		//add new materials
		bronzeMaterial = new EnumHelper().addToolMaterial("bronze_material", 2, 193, 5.0f, 1.5f, 8);
		invarMaterial = new EnumHelper().addToolMaterial("invar_material", 4, 521, 6.5f, 2.25f, 18);
		steelMaterial = new EnumHelper().addToolMaterial("steel_material", 5, 554, 7.0f, 2.5f, 12);
		titaniumMaterial = new EnumHelper().addToolMaterial("titanium_material", 6, 1098, 7.5f, 2.75f, 15);
		
	}
}
