package ru.drunkdevsquad.ageofmachines.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Uranium_Ore extends Block {
	
	public Uranium_Ore(){
		
		super(Material.rock);
		this.setCreativeTab(AOM_Core.tabaomblocks);
		this.setBlockName("UraniumOre");
		this.setBlockTextureName("ageofmachines:uraniumore");
		this.setHardness(3F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 2);
		
	}

}
