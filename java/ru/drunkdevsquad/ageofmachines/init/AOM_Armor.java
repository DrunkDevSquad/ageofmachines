package ru.drunkdevsquad.ageofmachines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.armor.Heavy_Armor;
import ru.drunkdevsquad.ageofmachines.armor.Light_Armor;
import ru.drunkdevsquad.ageofmachines.armor.Power_Armor;

public class AOM_Armor {
	
	public static Item lightarmorhelmet;
	public static Item lightarmorplate;
	public static Item lightarmorpants;
	public static Item lightarmorboots;
	
	public static Item heavyarmorhelmet;
	public static Item heavyarmorplate;
	public static Item heavyarmorpants;
	public static Item heavyarmorboots;
	
	public static Item powerarmorhelmet;
	public static Item powerarmorplate;
	public static Item powerarmorpants;
	public static Item powerarmorboots;
	
	public static void init() {
		
		lightarmorhelmet = new Light_Armor(0, 0).setUnlocalizedName("LightArmorHelmet").setTextureName("ageofmachines:LightArmorHelmet");
		lightarmorplate = new Light_Armor(0, 1).setUnlocalizedName("LightArmorChestplate").setTextureName("ageofmachines:LightArmorPlate");
		lightarmorpants = new Light_Armor(0, 2).setUnlocalizedName("LightArmorLeggings").setTextureName("ageofmachines:LightArmorPants");
		lightarmorboots = new Light_Armor(0, 3).setUnlocalizedName("LightArmorBoots").setTextureName("ageofmachines:LightArmorBoots");
		
		heavyarmorhelmet = new Heavy_Armor(0, 0).setUnlocalizedName("HeavyArmorHelmet").setTextureName("ageofmachines:HeavyArmorHelmet");
		heavyarmorplate = new Heavy_Armor(0, 1).setUnlocalizedName("HeavyArmorChestplate").setTextureName("ageofmachines:HeavyArmorPlate");
		heavyarmorpants = new Heavy_Armor(0, 2).setUnlocalizedName("HeavyArmorLeggings").setTextureName("ageofmachines:HeavyArmorPants");
		heavyarmorboots = new Heavy_Armor(0, 3).setUnlocalizedName("HeavyArmorBoots").setTextureName("ageofmachines:HeavyArmorBoots");
		
		powerarmorhelmet = new Power_Armor(0, 0).setUnlocalizedName("PowerArmorHelmet").setTextureName("ageofmachines:PowerArmorHelmet");
		powerarmorplate = new Power_Armor(0, 1).setUnlocalizedName("PowerArmorChestplate").setTextureName("ageofmachines:PowerArmorPlate");
		powerarmorpants = new Power_Armor(0, 2).setUnlocalizedName("PowerArmorLeggings").setTextureName("ageofmachines:PowerArmorPants");
		powerarmorboots = new Power_Armor(0, 3).setUnlocalizedName("PowerArmorBoots").setTextureName("ageofmachines:PowerArmorBoots");
		
	}
	public static void register() {
		
		GameRegistry.registerItem(lightarmorhelmet, "LightArmorHelmet");
		GameRegistry.registerItem(lightarmorplate, "LightArmorChestplate");
		GameRegistry.registerItem(lightarmorpants, "LightArmorLeggings");
		GameRegistry.registerItem(lightarmorboots, "LightArmorBoots");
		
		GameRegistry.registerItem(heavyarmorhelmet, "HeavyArmorHelmet");
		GameRegistry.registerItem(heavyarmorplate, "HeavyArmorChestplate");
		GameRegistry.registerItem(heavyarmorpants, "HeavyArmorLeggings");
		GameRegistry.registerItem(heavyarmorboots, "HeavyArmorBoots");
		
		GameRegistry.registerItem(powerarmorhelmet, "PowerArmorHelmet");
		GameRegistry.registerItem(powerarmorplate, "PowerArmorChestplate");
		GameRegistry.registerItem(powerarmorpants, "PowerArmorLeggings");
		GameRegistry.registerItem(powerarmorboots, "PowerArmorBoots");
		
	}

}
