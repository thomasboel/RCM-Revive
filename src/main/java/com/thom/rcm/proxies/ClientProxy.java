package com.thom.rcm.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy 
{
	@SideOnly(Side.CLIENT)
	public void proxy() 
	{
		renderBlocks();
		renderEntities();
	}
	
	public void renderBlocks()
	{
//		GameRegistry.registerTileEntity(TileEntitySummoningObelisk.class, "summoning_obelisk");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySummoningObelisk.class, new RenderSummoningObelisk());
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModSummoningBlocks.summoningObelisk), new ItemRenderSummoningObelisk());
//		
//		GameRegistry.registerTileEntity(TileEntityPrayerAltar.class, "prayer_altar");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPrayerAltar.class, new RenderPrayerAltar());
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModPrayerBlocks.prayerAltar), new ItemRenderPrayerAltar());
//		
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModSmithingBlocks.rsFurnace), new ItemRendererFurnace());
//		GameRegistry.registerTileEntity(TileEntityRSFurnace.class, "furnace");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRSFurnace.class, new BlockRendererFurnace());
//		
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModFiremakingBlocks.fire), new ItemRenderFire());
//		GameRegistry.registerTileEntity(TileEntityFire.class, "fire");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFire.class, new BlockRendererFire());
		
		renderAltars();
	}
	
	public void renderEntities()
	{
//		EntityRegistry.registerGlobalEntityID(EntityMagicBolt.class, "magicbolt", EntityRegistry.findGlobalUniqueEntityId());
//		RenderingRegistry.instance().registerEntityRenderingHandler(EntityMagicBolt.class, new RenderMagicBolt());
//		
//		int spiritWolfID = EntityRegistry.findGlobalUniqueEntityId();
//		EntityRegistry.registerGlobalEntityID(FamiliarSpiritwolf.class, "spirit_wolf", spiritWolfID);
//		EntityRegistry.registerModEntity(FamiliarSpiritwolf.class, "spirit_wolf", spiritWolfID, RCM.instance, 64, 1, true);
//		RenderingRegistry.instance().registerEntityRenderingHandler(FamiliarSpiritwolf.class, new RenderSpiritwolf(new ModelSpiritwolf(), 1));
	}
	
	public void renderAltars()
	{
//		GameRegistry.registerTileEntity(TileEntityAltarAir.class, "air_altar");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAir.class, new RenderRunecraftingAltar("air_altar.png"));
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.airAltar), new ItemRenderAltar());
//		
//		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar("astral_altar.png"));
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		/*GameRegistry.registerTileEntity(TileEntityAltarBlood.class, "blood_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarBlood.class, new RenderRunecraftingAltar("blood_altar.png"));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.bloodAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarBody.class, "body_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarBody.class, new RenderRunecraftingAltar("body_altar.png"));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.bodyAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarChaos.class, "chaos_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarChaos.class, new RenderRunecraftingAltar("chaos_altar.png"));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.chaosAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarMind.class, "mind_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarMind.class, new RenderRunecraftingAltar("mind_altar.png"));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.mindAltar), new ItemRenderMindAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());
		
		GameRegistry.registerTileEntity(TileEntityAltarAstral.class, "astral_altar");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarAstral.class, new RenderRunecraftingAltar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModRunecraftingBlocks.astralAltar), new ItemRenderAltar());*/
	}
}