package com.thom.rcm.proxies;

import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;

public class CommonProxy 
{
	public void proxy()
	{
		removeRecipes();
	}
	
	public void removeRecipes()
	{
		removeRecipe(new ItemStack(Items.iron_sword, 1));
	}
	
	private static void removeRecipe(ItemStack resultItem)
	{
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		for (int i = 0; i < recipes.size(); i++)
		{
			IRecipe tmpRecipe = recipes.get(i);
			
			if (tmpRecipe instanceof ShapedRecipes)
			{
				ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();
				
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
				{
					recipes.remove(i--);
				}
			}
		}
	}
}
