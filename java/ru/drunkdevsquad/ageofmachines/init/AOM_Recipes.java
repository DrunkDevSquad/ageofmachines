package ru.drunkdevsquad.ageofmachines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class AOM_Recipes {
	
	
	
	public static void ShapelessCraftingRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.coalplate), new Object[] {Items.coal, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.copperplate), new Object[] {AOM_Items.copperingot, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.diamondplate), new Object[] {Items.diamond, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.emeraldplate), new Object[] {Items.emerald, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.goldplate), new Object[] {Items.gold_ingot, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.ironplate), new Object[] {Items.iron_ingot, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.lapisplate), new Object[] {new ItemStack(Items.dye, 1, 14), new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.quartzplate), new Object[] {Items.quartz, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.redstoneplate), new Object[] {Items.redstone, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.steelplate), new Object[] {AOM_Items.steelingot, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.tinplate), new Object[] {AOM_Items.tiningot, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.uraniumplate), new Object[] {AOM_Items.uranium, new ItemStack(AOM_Items.hammertool, 1, OreDictionary.WILDCARD_VALUE)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AOM_Items.steelblank), new Object[] {Items.iron_ingot, Items.coal});
		
	}
	public static void ShapedCraftingRecipes() {
		
		
		
	}
	public static void FurnaceRecipes() {
		
		GameRegistry.addSmelting(AOM_Blocks.copperore, new ItemStack(AOM_Items.copperingot), 1.0F);
		GameRegistry.addSmelting(AOM_Blocks.tinore, new ItemStack(AOM_Items.tiningot), 1.0F);
		GameRegistry.addSmelting(AOM_Blocks.uraniumore, new ItemStack(AOM_Items.uranium), 1.0F);
		
		
		
	}

}
