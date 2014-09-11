package net.survivaladditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.survivaladditions.SurvivalAdditions;
import net.survivaladditions.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockCopperOre extends Block {

	public String name = "copper_ore";
	
	public BlockCopperOre() {
		super(Material.rock);
		
		//properties
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		this.setStepSound(soundTypeStone);
				
		setBlockName(Constants.MODID + "_" + name); //MODID_BLOCKNAME
		setCreativeTab(SurvivalAdditions.tabSurvivalAdditions);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);
	}

}
