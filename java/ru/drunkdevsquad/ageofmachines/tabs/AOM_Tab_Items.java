package ru.drunkdevsquad.ageofmachines.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.init.AOM_Items;

public class AOM_Tab_Items extends CreativeTabs {
	
	public AOM_Tab_Items(String lable) {
		 super(lable);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
		 return AOM_Items.circuitmki;
		}
		
}
