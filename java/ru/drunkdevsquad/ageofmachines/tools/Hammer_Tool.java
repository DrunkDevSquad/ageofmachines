package ru.drunkdevsquad.ageofmachines.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;

public class Hammer_Tool extends Item {
	
	public Hammer_Tool() {
			
		this.setCreativeTab(AOM_Core.tabaomtools);
		this.setUnlocalizedName("Hammer");
		this.setTextureName("ageofmachines:hammertool");
		this.setMaxDamage(800);
		this.setMaxStackSize(1);
		this.setNoRepair();
		
	}
	
	@Override
	 public ItemStack getContainerItem(ItemStack is) {
		 if (is.getItemDamage() >= 0) {
		 is.setItemDamage(is.getItemDamage() + 1);
		 return is;
		 }
		 return super.getContainerItem(is);
		 }

}
