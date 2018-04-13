package ru.drunkdevsquad.ageofmachines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ru.drunkdevsquad.ageofmachines.ores.Coal_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Copper_Ore;
import ru.drunkdevsquad.ageofmachines.ores.Copper_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Diamond_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Emerald_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Gold_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Iron_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Lapis_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Quartz_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Redstone_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Tin_Ore;
import ru.drunkdevsquad.ageofmachines.ores.Tin_Ore_Cluster;
import ru.drunkdevsquad.ageofmachines.ores.Uranium_Ore;
import ru.drunkdevsquad.ageofmachines.ores.Uranium_Ore_Cluster;

public class AOM_Blocks {
	
	public static Block copperore;
	public static Block tinore;
	public static Block uraniumore;
	
	public static Block coalorecluster;
	public static Block copperorecluster;
	public static Block diamondorecluster;
	public static Block emeraldorecluster;
	public static Block goldorecluster;
	public static Block ironorecluster;
	public static Block lapisorecluster;
	public static Block quartzorecluster;
	public static Block redstoneorecluster;
	public static Block tinorecluster;
	public static Block uraniumorecluster;
	
	public static void init() {
		
		copperore = new Copper_Ore();
		tinore = new Tin_Ore();
		uraniumore = new Uranium_Ore();
		
		coalorecluster = new Coal_Ore_Cluster();
		copperorecluster = new Copper_Ore_Cluster();
		diamondorecluster = new Diamond_Ore_Cluster();
		emeraldorecluster = new Emerald_Ore_Cluster();
		goldorecluster = new Gold_Ore_Cluster();
		ironorecluster = new Iron_Ore_Cluster();
		lapisorecluster = new Lapis_Ore_Cluster();
		quartzorecluster = new Quartz_Ore_Cluster();
		redstoneorecluster = new Redstone_Ore_Cluster();
		tinorecluster = new Tin_Ore_Cluster();
		uraniumorecluster = new Uranium_Ore_Cluster();
		
	}
	public static void register() {
		
		GameRegistry.registerBlock(copperore, "CopperOre");
		GameRegistry.registerBlock(tinore, "TinOre");
		GameRegistry.registerBlock(uraniumore, "UraniumOre");
		
		GameRegistry.registerBlock(coalorecluster, "CoalOreCluster");
		GameRegistry.registerBlock(copperorecluster, "CopperOreCluster");
		GameRegistry.registerBlock(diamondorecluster, "DiamondOreCluster");
		GameRegistry.registerBlock(emeraldorecluster, "EmeraldOreCluster");
		GameRegistry.registerBlock(goldorecluster, "GoldOreCluster");
		GameRegistry.registerBlock(ironorecluster, "IronOreCluster");
		GameRegistry.registerBlock(lapisorecluster, "LapisOreCluster");
		GameRegistry.registerBlock(quartzorecluster, "QuartzOreCluster");
		GameRegistry.registerBlock(redstoneorecluster, "RedstoneOreCluster");
		GameRegistry.registerBlock(tinorecluster, "TinOreCluster");
		GameRegistry.registerBlock(uraniumorecluster, "UraniumOreCluster");
		
	}


}
