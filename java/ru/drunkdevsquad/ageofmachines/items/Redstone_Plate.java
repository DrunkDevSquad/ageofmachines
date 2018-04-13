package ru.drunkdevsquad.ageofmachines.items;

import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Redstone_Plate extends Item {
	
	public Redstone_Plate() {
		
		this.setCreativeTab(AOM_Core.tabaomitems);
		this.setUnlocalizedName("RedstonePlate");
		this.setTextureName("ageofmachines:redstoneplate");
		
	}

}
