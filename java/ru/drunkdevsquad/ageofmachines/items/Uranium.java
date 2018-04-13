package ru.drunkdevsquad.ageofmachines.items;

import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Uranium extends Item {
	
	public Uranium() {
		
		this.setCreativeTab(AOM_Core.tabaomitems);
		this.setUnlocalizedName("Uranium");
		this.setTextureName("ageofmachines:uranium");
		
	}

}
