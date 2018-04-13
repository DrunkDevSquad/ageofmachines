package ru.drunkdevsquad.ageofmachines.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;
import ru.drunkdevsquad.ageofmachines.init.AOM_Blocks;

public class Tin_Ore_Cluster extends Block {
	
	public Tin_Ore_Cluster() {
		
		super(Material.rock);
		this.setCreativeTab(AOM_Core.tabaomblocks);
		this.setBlockName("TinOreCluster");
		this.setBlockTextureName("ageofmachines:tinorecluster");
		this.setHardness(15F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return Item.getItemFromBlock(AOM_Blocks.tinore);
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 5;
    }

}
