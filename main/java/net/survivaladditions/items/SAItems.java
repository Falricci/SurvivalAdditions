package net.survivaladditions.items;

import net.minecraft.item.Item;

public final class SAItems extends Item {
	
	public static Item copperIngot;
	
	public static void init() {
		copperIngot = new ItemCopperIngot();
		
	}
}
