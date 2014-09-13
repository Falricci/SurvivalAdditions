package net.survivaladditions.items;

import net.minecraft.item.Item;

public final class SAItems extends Item {
	
	//ingots
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item zincIngot;
	public static Item nickelIngot;
	public static Item manganeseIngot;
	public static Item vanadiumIngot;
	public static Item rhodiumIngot;
	public static Item bronzeIngot;
	public static Item brassIngot;
	public static Item aluminumIngot;
	public static Item silverIngot;
	public static Item invarIngot;
	public static Item titaniumIngot;
	public static Item palladiumIngot;
	public static Item steelIngot;


	
	public static void init() {
		
		//ingots
		copperIngot = new IngotItem("copper_ingot");
		tinIngot = new IngotItem("tin_ingot");
		zincIngot = new IngotItem("zinc_ingot");
		nickelIngot = new IngotItem("nickel_ingot");
		manganeseIngot = new IngotItem("manganese_ingot");
		vanadiumIngot = new IngotItem("vanadium_ingot");
		rhodiumIngot = new IngotItem("rhodium_ingot");
		bronzeIngot  = new IngotItem("bronze_ingot");
		brassIngot  = new IngotItem("brass_ingot");
		aluminumIngot  = new IngotItem("aluminum_ingot");
		silverIngot  = new IngotItem("silver_ingot");
		invarIngot  = new IngotItem("invar_ingot");
		titaniumIngot  = new IngotItem("titanium_ingot");
		palladiumIngot  = new IngotItem("palladium_ingot");
		steelIngot = new IngotItem("steel_ingot");

	}
}
