package ru.drunkdevsquad.ageofmachines.tools;

import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Configurator_Tool extends Item {
	
	public Configurator_Tool() {
		
		this.setCreativeTab(AOM_Core.tabaomtools);
		this.setUnlocalizedName("Configurator");
		this.setTextureName("ageofmachines:configuratortool");
		
	}

}
