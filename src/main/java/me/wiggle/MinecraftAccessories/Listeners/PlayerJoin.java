package me.wiggle.MinecraftAccessories.Listeners;

import me.wiggle.MinecraftAccessories.Plugin.MinecraftAccessories;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    public PlayerJoin(MinecraftAccessories instance) {}

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(null);

        Bukkit.getServer().broadcastMessage(String.format("%s%s%s has joined the server!", ChatColor.GREEN, player.getDisplayName(), ChatColor.YELLOW));
    }
}
