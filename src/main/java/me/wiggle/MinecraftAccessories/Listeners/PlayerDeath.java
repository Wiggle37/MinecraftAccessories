package me.wiggle.MinecraftAccessories.Listeners;

import me.wiggle.MinecraftAccessories.Plugin.MinecraftAccessories;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {
    public PlayerDeath(MinecraftAccessories instance) {}

    @EventHandler
    public void PlayerDeathEvent(PlayerDeathEvent event) {
        Player player = event.getEntity();
        event.setDeathMessage(null);

        Bukkit.getServer().broadcastMessage(String.format("%s died!", player.getName()));
    }
}
