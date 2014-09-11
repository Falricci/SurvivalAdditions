package net.survivaladditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreBlock extends Block {

	//public String name = "default_ore";
	
	public OreBlock(String name, float hardness, float resistance) {
		super(Material.rock);
		
		//properties
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeStone);
				
		setBlockName(Constants.MODID + "_" + name); //MODID_BLOCKNAME
		setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);
	}

}

