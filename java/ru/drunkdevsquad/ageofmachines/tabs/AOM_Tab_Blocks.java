package ru.drunkdevsquad.ageofmachines.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.init.AOM_Blocks;

public class AOM_Tab_Blocks extends CreativeTabs {
	
	public AOM_Tab_Blocks(String lable) {
		 super(lable);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
		 return Item.getItemFromBlock(AOM_Blocks.uraniumore);
		}
		
}
