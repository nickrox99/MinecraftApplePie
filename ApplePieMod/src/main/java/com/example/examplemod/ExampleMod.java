package com.example.examplemod;

import com.example.food.FoodApplePie;
import com.example.food.FoodStrawberry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "ApplePie";
	public static final String VERSION = "1.0";
	
	
	//Food
	public static final Item ApplePie = new  FoodApplePie();
	
			
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		GameRegistry.registerItem(ApplePie, "Apple Pie");
		LanguageRegistry.addName(ApplePie, "Apple Pie");
		
    }
}
