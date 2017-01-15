package com.thom.rcm.utility;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UtilAPI 
{
	public static int getAmountOfItemInInventory(InventoryPlayer inventory, String itemDisplayName)
	{
		int amount = 0;
		
		for (int i = 0; i < inventory.mainInventory.length; i++)
		{
			if (inventory.getStackInSlot(i) != null && inventory.mainInventory[i].getDisplayName().equals(itemDisplayName))
			{
				amount += inventory.mainInventory[i].stackSize;
			}
		}
		
		return amount;
	}
	
	public static int getAmountOfTickFromTime(int hours, int minutes, int seconds)
	{
		int ticks = 0;
		int totalSeconds = seconds + (minutes * 60) + (hours * 60 * 60);
		
		for (int i = 0; i < totalSeconds; i++)
		{
			ticks += 20;
		}
		
		return ticks;
	}
	
	public static ArrayList<Block> getListOfBlocksInBetween(World world, int x, int y, int z, int x2, int y2, int z2)
	{
		ArrayList<Block> blockList = new ArrayList<Block>();
		
		int amountOfBlocks = 0;
		
		for (int i = 0; i < x2-x; i++)
		{
			for (int j = 0; j < y2-y; j++)
			{
				for (int k = 0; k < z2-z; k++)
				{
					blockList.add(world.getBlock(x2-i, y2-j, z2-k));
					amountOfBlocks++;
					LogHelper.info("Added Block " + world.getBlock(x2-i, y2-j, z2-k).getUnlocalizedName() + " to the block List");
					LogHelper.info("This was block nr. " + amountOfBlocks);
				}
			}
		}
		
		return blockList;
	}
	
	public static ArrayList<Block> getListOfBlocksInArea(World world, int x, int y, int z, int x2, int y2, int z2)
	{
		ArrayList<Block> blockList = new ArrayList<Block>();
		
		boolean setBlocks = true;
		Block blockToSpawn = Blocks.air;
		
		int scenario = determineScenario(x, y, z, x2, y2, z2);	
		int amountOfBlocks = 0;
		
		switch (scenario) 
		{
		case 0:
			LogHelper.error("Scenario is 0, which means physics has stopped working :C");
			break;
		case 1:
			for (int i = 0; i < x2-x; i++)
			{
				for (int k = 0; k < y2-y; k++)
				{
					for (int j = 0; j < z2-z; j++)
					{
						blockList.add(world.getBlock(x2-i, y2-k, z2-j));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2-i, y2-j, z2-k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2-i, y2-j, z2-k, blockToSpawn);
					}
				}
			}
			break;
			
		case 2:
			for (int i = 0; i < x-x2; i++)
			{
				for (int k = 0; k < y2-y; k++)
				{
					for (int j = 0; j < z2-z; j++)
					{
						blockList.add(world.getBlock(x2+i, y2-j, z2-k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2+i, y2-j, z2-k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2+i, y2-j, z2-k, blockToSpawn);
					}
				}
			}
			break;
			
		case 3:
			for (int i = 0; i < x-x2; i++)
			{
				for (int k = 0; k < y2-y; k++)
				{
					for (int j = 0; j < z-z2; j++)
					{
						blockList.add(world.getBlock(x2+i, y2-j, z2+k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2+i, y2-j, z2+k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2+i, y2-j, z2+k, blockToSpawn);
					}
				}
			}
			break;
			
		case 4:
			for (int i = 0; i < x2-x; i++)
			{
				for (int k = 0; k < y2-y; k++)
				{
					for (int j = 0; j < z-z2; j++)
					{
						blockList.add(world.getBlock(x2-i, y2-j, z2+k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2-i, y2-j, z2+k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2-i, y2-j, z2+k, blockToSpawn);
					}
				}
			}
			break;
			
		case 5:
			for (int i = 0; i < x2-x; i++)
			{
				for (int j = 0; j < y-y2; j++)
				{
					for (int k = 0; k < z2-z; k++)
					{
						blockList.add(world.getBlock(x2-i, y2+j, z2-k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2-i, y2+j, z2-k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2-i, y2+j, z2-k, blockToSpawn);
					}
				}
			}
			break;
			
		case 6:
			for (int i = 0; i < x-x2; i++)
			{
				for (int j = 0; j < y-y2; j++)
				{
					for (int k = 0; k < z2-z; k++)
					{
						blockList.add(world.getBlock(x2+i, y2+j, z2-k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2+i, y2+j, z2-k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2+i, y2+j, z2-k, blockToSpawn);
					}
				}
			}
			break;
			
		case 7:
			for (int i = 0; i < x-x2; i++)
			{
				for (int j = 0; j < y-y2; j++)
				{
					for (int k = 0; k < z-z2; k++)
					{
						blockList.add(world.getBlock(x2+i, y2+j, z2+k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2+i, y2+j, z2+k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2+i, y2+j, z2+k, blockToSpawn);
					}
				}
			}
			break;
			
		case 8:
			for (int i = 0; i < x2-x; i++)
			{
				for (int j = 0; j < y-y2; j++)
				{
					for (int k = 0; k < z-z2; k++)
					{
						blockList.add(world.getBlock(x2-i, y2+j, z2+k));
						amountOfBlocks++;
						LogHelper.info("Added Block " + world.getBlock(x2-i, y2+j, z2+k).getLocalizedName() + " to the block List");
						LogHelper.info("This was block nr. " + amountOfBlocks);
						if (setBlocks) world.setBlock(x2-i, y2+j, z2+k, blockToSpawn);
					}
				}
			}
			break;
		}
		
		if (scenario != 0) LogHelper.info("Scenario: " + scenario);
		LogHelper.info(amountOfBlocks + " blocks in total, added to the list of blocks in between the coords: " + x + " " + y + " " + z + " " + " & " + x2 + " " + y2 + " " + z2);
		
		return blockList;
	}
	
	public static int determineScenario(int x, int y, int z, int x2, int y2, int z2)
	{
		int scenario;
		if 		(x2>=x&&y2>=y&&z2>=z) scenario = 1;
		else if (x2<=x&&y2>=y&&z2>=z) scenario = 2;
		else if (x2<=x&&y2>=y&&z2<=z) scenario = 3;
		else if (x2>=x&&y2>=y&&z2<=z) scenario = 4;
		else if (x2>=x&&y2<=y&&z2>=z) scenario = 5;
		else if (x2<=x&&y2<=y&&z2>=z) scenario = 6;
		else if (x2<=x&&y2<=y&&z2<=z) scenario = 7;
		else if (x2>=x&&y2<=y&&z2<=z) scenario = 8;
		else scenario = 0;
		return scenario;
	}
}