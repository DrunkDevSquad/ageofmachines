package ru.drunkdevsquad.ageofmachines.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Tin_Ore extends Block {
	
	public Tin_Ore(){
		
		super(Material.rock);
		this.setCreativeTab(AOM_Core.tabaomblocks);
		this.setBlockName("TinOre");
		this.setBlockTextureName("ageofmachines:tinore");
		this.setHardness(3F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
		
	}

}
