package me.wiggle.MinecraftAccessories.Listeners;

import me.wiggle.MinecraftAccessories.Plugin.MinecraftAccessories;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerMessage implements Listener {
    public PlayerMessage(MinecraftAccessories instance) {}

    @EventHandler
    public void PlayerMessageEvent(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        event.setFormat(String.format("%s%s: %s%s", ChatColor.GREEN, player.getDisplayName(), ChatColor.YELLOW, event.getMessage()));
    }
}
