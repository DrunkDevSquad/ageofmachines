package ru.drunkdevsquad.ageofmachines.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.drunkdevsquad.ageofmachines.core.AOM_Core;
import ru.drunkdevsquad.ageofmachines.utils.AOM_Materials;

public class Heavy_Armor extends ItemArmor{
	
	private String texturePath = "mybestmod:textures/model/armor/";
	
	public Heavy_Armor(int id, int armorType) {
		super(AOM_Materials.Heavy_Armor_Material, id, armorType);
		this.setCreativeTab(AOM_Core.tabaomarmor);
		this.setMaxStackSize(1);
		this.setTextureName();
	}

	public void setTextureName ()
	{
		if(armorType == 0||armorType == 1||armorType == 3){
			this.texturePath += "Heavy_Armor_" + 1 + ".png";
		}
		else {
			this.texturePath += "Heavy_Armor_" + 2 + ".png";
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		return this.texturePath;
	}

}
