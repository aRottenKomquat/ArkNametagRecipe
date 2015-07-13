package org.dyndns.rottenkomquat;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ArkNametagRecipe extends JavaPlugin {

	@Override
	public void onEnable() {	
		ItemStack nametag = new ItemStack(Material.NAME_TAG);
		nametag.setAmount(2);
		ShapelessRecipe tagRecipe = new ShapelessRecipe(nametag);
		tagRecipe.addIngredient(Material.IRON_INGOT);
		tagRecipe.addIngredient(Material.STRING);
		Bukkit.addRecipe(tagRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}
