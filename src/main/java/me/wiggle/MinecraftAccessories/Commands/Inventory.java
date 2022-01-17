package me.wiggle.MinecraftAccessories.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Inventory implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = Bukkit.getServer().getPlayer(args[0]);
        if (!(sender instanceof Player)) {
            sender.sendMessage(String.format("%sYou must be a player to run this command!", ChatColor.RED));
            return false;
        }
        if (args.length == 0) {
            sender.sendMessage(String.format("%sYou need to provide a player to check!", ChatColor.RED));
            return false;
        }
        if (!(target instanceof Player)) {
            sender.sendMessage(String.format("%sYou must provide a valid player!", ChatColor.RED));
            return false;
        }

        org.bukkit.inventory.Inventory inventory = target.getInventory();
        for (ItemStack item: inventory.getContents()) {
            if (item == null) continue;
            sender.sendMessage(ChatColor.YELLOW + "Item: " + ChatColor.GREEN + item.getType().name().replace("_", " ").toLowerCase() + ChatColor.BLUE + " ( " + item.getAmount() + " )");
        }
        return true;
    }
}
