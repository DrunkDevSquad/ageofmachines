package ru.drunkdevsquad.ageofmachines.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Copper_Ore extends Block {
	
	public Copper_Ore(){
		
		super(Material.rock);
		this.setCreativeTab(AOM_Core.tabaomblocks);
		this.setBlockName("CopperOre");
		this.setBlockTextureName("ageofmachines:copperore");
		this.setHardness(3F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
		
	}
	
}
