package ru.drunkdevsquad.ageofmachines.items;

import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Diamond_Plate extends Item {
	
	public Diamond_Plate() {
		
		this.setCreativeTab(AOM_Core.tabaomitems);
		this.setUnlocalizedName("DiamondPlate");
		this.setTextureName("ageofmachines:diamondplate");
		
	}

}
