package me.wiggle.MinecraftAccessories.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Position implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = Bukkit.getServer().getPlayer(args[0]);
        if (!(sender instanceof Player)) {
            sender.sendMessage(String.format("%sYou must be a player to run this command!", ChatColor.RED));
            return false;
        }

        if (target instanceof Player) {
            Location location = target.getLocation();

            sender.sendMessage(String.format("%s%s's current position: %s%s, %s, %s", ChatColor.YELLOW, target.getDisplayName(), ChatColor.AQUA, Math.round(location.getX()), Math.round(location.getY()), Math.round(location.getZ())));
            return true;
        }
        return false;
    }
}
