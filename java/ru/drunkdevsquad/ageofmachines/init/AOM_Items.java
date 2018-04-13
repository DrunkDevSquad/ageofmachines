package ru.drunkdevsquad.ageofmachines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.drunkdevsquad.ageofmachines.items.Circuit_MkI;
import ru.drunkdevsquad.ageofmachines.items.Circuit_MkII;
import ru.drunkdevsquad.ageofmachines.items.Circuit_MkIII;
import ru.drunkdevsquad.ageofmachines.items.Coal_Copper_Ingot;
import ru.drunkdevsquad.ageofmachines.items.Coal_Plate;
import ru.drunkdevsquad.ageofmachines.items.Copper_Ingot;
import ru.drunkdevsquad.ageofmachines.items.Copper_Plate;
import ru.drunkdevsquad.ageofmachines.items.Diamond_Plate;
import ru.drunkdevsquad.ageofmachines.items.Emerald_Plate;
import ru.drunkdevsquad.ageofmachines.items.Gold_Plate;
import ru.drunkdevsquad.ageofmachines.items.Iron_Plate;
import ru.drunkdevsquad.ageofmachines.items.Lapis_Plate;
import ru.drunkdevsquad.ageofmachines.items.Quartz_Plate;
import ru.drunkdevsquad.ageofmachines.items.Redstone_Plate;
import ru.drunkdevsquad.ageofmachines.items.Steel_Blank;
import ru.drunkdevsquad.ageofmachines.items.Steel_Ingot;
import ru.drunkdevsquad.ageofmachines.items.Steel_Plate;
import ru.drunkdevsquad.ageofmachines.items.Tin_Ingot;
import ru.drunkdevsquad.ageofmachines.items.Tin_Plate;
import ru.drunkdevsquad.ageofmachines.items.Uranium;
import ru.drunkdevsquad.ageofmachines.items.Uranium_Diamond_Steel_Ingot;
import ru.drunkdevsquad.ageofmachines.items.Uranium_Plate;
import ru.drunkdevsquad.ageofmachines.tools.Configurator_Tool;
import ru.drunkdevsquad.ageofmachines.tools.Hammer_Tool;

public class AOM_Items {
	
	public static Item configuratortool;
	public static Item hammertool;

	public static Item copperingot;
	public static Item tiningot;
	public static Item uranium;
	
	public static Item steelblank;
	public static Item steelingot;
	
	public static Item coalcopperingot;
	public static Item uraniumdiamondsteelingot;
	
	public static Item coalplate;
	public static Item copperplate;
	public static Item diamondplate;
	public static Item emeraldplate;
	public static Item goldplate;
	public static Item ironplate;
	public static Item lapisplate;
	public static Item quartzplate;
	public static Item redstoneplate;
	public static Item steelplate;
	public static Item tinplate;
	public static Item uraniumplate;
	
	public static Item circuitmki;
	public static Item circuitmkii;
	public static Item circuitmkiii;
	
	
	
	public static void init() {
		
		configuratortool = new Configurator_Tool();
		hammertool = new Hammer_Tool();
		
		copperingot = new Copper_Ingot();
		tiningot = new Tin_Ingot();
		uranium = new Uranium();
		
		steelblank = new Steel_Blank();
		steelingot = new Steel_Ingot();
		
		coalcopperingot = new Coal_Copper_Ingot();
		uraniumdiamondsteelingot = new Uranium_Diamond_Steel_Ingot();
		
		coalplate = new Coal_Plate();
		copperplate = new Copper_Plate();
		diamondplate = new Diamond_Plate();
		emeraldplate = new Emerald_Plate();
		goldplate = new Gold_Plate();
		ironplate = new Iron_Plate();
		lapisplate = new Lapis_Plate();
		quartzplate = new Quartz_Plate();
		redstoneplate = new Redstone_Plate();
		steelplate = new Steel_Plate();
		tinplate = new Tin_Plate();
		uraniumplate = new Uranium_Plate();
		
		circuitmki = new Circuit_MkI();
		circuitmkii = new Circuit_MkII();
		circuitmkiii = new Circuit_MkIII();
		
	}
	public static void register() {
		
		GameRegistry.registerItem(configuratortool, "Configurator");
		GameRegistry.registerItem(hammertool, "Hammer");
		
		GameRegistry.registerItem(copperingot, "CopperIngot");
		GameRegistry.registerItem(tiningot, "TinIngot");
		GameRegistry.registerItem(uranium, "Uranium");
		
		GameRegistry.registerItem(steelblank, "SteelBlank");
		GameRegistry.registerItem(steelingot, "SteelIngot");
		
		GameRegistry.registerItem(coalcopperingot, "CoalCopperIngot");
		GameRegistry.registerItem(uraniumdiamondsteelingot, "UraniumDiamondSteelIngot");
		
		GameRegistry.registerItem(coalplate, "CoalPlate");
		GameRegistry.registerItem(copperplate, "CopperPlate");
		GameRegistry.registerItem(diamondplate, "Diamond_Plate");
		GameRegistry.registerItem(emeraldplate, "Emerald_Plate");
		GameRegistry.registerItem(goldplate, "Gold_Plate");
		GameRegistry.registerItem(ironplate, "Iron_Plate");
		GameRegistry.registerItem(lapisplate, "Lapis_Plate");
		GameRegistry.registerItem(quartzplate, "Quartz_Plate");
		GameRegistry.registerItem(redstoneplate, "Redstone_Plate");
		GameRegistry.registerItem(steelplate, "Steel_Plate");
		GameRegistry.registerItem(tinplate, "Tin_Plate");
		GameRegistry.registerItem(uraniumplate, "Uranium_Plate");
		
		GameRegistry.registerItem(circuitmki, "Circuit_MkI");
		GameRegistry.registerItem(circuitmkii, "Circuit_MkII");
		GameRegistry.registerItem(circuitmkiii, "Circuit_MkIII");
		
	}

}
