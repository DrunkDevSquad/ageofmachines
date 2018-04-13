package ru.drunkdevsquad.ageofmachines.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;
import ru.drunkdevsquad.ageofmachines.init.AOM_Blocks;

public class Quartz_Ore_Cluster extends Block {
	
	public Quartz_Ore_Cluster() {
		
		super(Material.rock);
		this.setCreativeTab(AOM_Core.tabaomblocks);
		this.setBlockName("QuartzOreCluster");
		this.setBlockTextureName("ageofmachines:quartzorecluster");
		this.setHardness(15F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 0);
	}
	
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return Item.getItemFromBlock(Blocks.quartz_ore);
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 5;
    }

}
