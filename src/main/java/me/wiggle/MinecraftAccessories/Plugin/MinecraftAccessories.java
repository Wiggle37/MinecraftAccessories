package me.wiggle.MinecraftAccessories.Plugin;

import me.wiggle.MinecraftAccessories.Commands.Inventory;
import me.wiggle.MinecraftAccessories.Commands.Position;
import me.wiggle.MinecraftAccessories.Listeners.PlayerDeath;
import me.wiggle.MinecraftAccessories.Listeners.PlayerJoin;

import me.wiggle.MinecraftAccessories.Listeners.PlayerLeave;
import me.wiggle.MinecraftAccessories.Listeners.PlayerMessage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftAccessories extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Loading Minecraft Accessories...");

        System.out.println("Loading events...");
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new PlayerJoin(this), this);
        pluginManager.registerEvents(new PlayerLeave(this), this);
        pluginManager.registerEvents(new PlayerDeath(this), this);
        pluginManager.registerEvents(new PlayerMessage(this), this);
        System.out.println("Successfully Loaded events!");

        System.out.println("Loading commands...");
        getCommand("inventory").setExecutor(new Inventory());
        getCommand("position").setExecutor(new Position());
        System.out.println("Successfully loaded commands!");

        System.out.println("Successfully loaded Minecraft Accessories!");

    }

    @Override
    public void onDisable() {
        System.out.println("Minecraft Accessories unloaded");
        getServer().broadcastMessage(String.format("%sMinecraft Accessories unloaded", ChatColor.RED));
    }
}
