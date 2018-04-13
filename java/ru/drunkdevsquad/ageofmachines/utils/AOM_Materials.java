package ru.drunkdevsquad.ageofmachines.utils;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AOM_Materials {
	
	public static ArmorMaterial Light_Armor_Material = EnumHelper.addArmorMaterial("LIGHTARMORMATERIAL", 10, new int[] {2, 4, 3, 1}, 10);
	public static ArmorMaterial Heavy_Armor_Material = EnumHelper.addArmorMaterial("HEAVYARMORMATERIAL", 20, new int[] {4, 8, 6, 2}, 20);
	public static ArmorMaterial Power_Armor_Material = EnumHelper.addArmorMaterial("POWERARMORMATERIAL", 50, new int[] {8, 16, 12, 4}, 40);

}
