package net.survivaladditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class IngotBlock extends Block {
	
	public IngotBlock(String name, float hardness, float resistance) {
		super(Material.iron);
		
		//properties
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeMetal);
		
		setBlockName(Constants.MODID + "_" + name); 
		setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);

	}
}
