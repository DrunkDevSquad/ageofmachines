package ru.drunkdevsquad.ageofmachines.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import ru.drunkdevsquad.ageofmachines.init.AOM_Armor;
import ru.drunkdevsquad.ageofmachines.init.AOM_Blocks;
import ru.drunkdevsquad.ageofmachines.init.AOM_Items;
import ru.drunkdevsquad.ageofmachines.init.AOM_Recipes;
import ru.drunkdevsquad.ageofmachines.tabs.AOM_Tab_Armor;
import ru.drunkdevsquad.ageofmachines.tabs.AOM_Tab_Blocks;
import ru.drunkdevsquad.ageofmachines.tabs.AOM_Tab_Items;
import ru.drunkdevsquad.ageofmachines.tabs.AOM_Tab_Tools;

@Mod (modid = AOM_Reference.MODID, name = AOM_Reference.NAME, version = AOM_Reference.VERSION)
public class AOM_Core {
	
	public static CreativeTabs tabaomarmor = new AOM_Tab_Armor("aomtabarmor");
	public static CreativeTabs tabaomblocks = new AOM_Tab_Blocks("aomtabblocks");
	public static CreativeTabs tabaomitems = new AOM_Tab_Items("aomtabitems");
	public static CreativeTabs tabaomtools = new AOM_Tab_Tools("aomtabtools");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		AOM_Armor.init();
		AOM_Armor.register();
		
	    AOM_Blocks.init();
	    AOM_Blocks.register();
	    
	    AOM_Items.init();
	    AOM_Items.register();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		AOM_Recipes.ShapelessCraftingRecipes();
		AOM_Recipes.ShapedCraftingRecipes();
		AOM_Recipes.FurnaceRecipes();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)//
	{
	    
	}
}
