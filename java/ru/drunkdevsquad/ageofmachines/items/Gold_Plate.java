package ru.drunkdevsquad.ageofmachines.items;

import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Gold_Plate extends Item {
	
	public Gold_Plate() {
		
		this.setCreativeTab(AOM_Core.tabaomitems);
		this.setUnlocalizedName("GoldPlate");
		this.setTextureName("ageofmachines:goldplate");
		
	}

}
