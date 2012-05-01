package Lihad.ConflictClasses.Command;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import Lihad.ConflictClasses.ConflictClasses;

public class CommandHandler implements CommandExecutor {
	public static ConflictClasses plugin;
	public ItemStack post;
	public CommandHandler(ConflictClasses instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string,
			String[] arg) {
		
		return false;
	}
}
