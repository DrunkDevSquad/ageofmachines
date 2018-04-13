package ru.drunkdevsquad.ageofmachines.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.init.AOM_Armor;

public class AOM_Tab_Armor extends CreativeTabs {
	
	public AOM_Tab_Armor(String lable) {
		 super(lable);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
		 return AOM_Armor.powerarmorhelmet;
		}

}
