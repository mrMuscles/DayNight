package org.cadenhead.minecraft;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DayNightCommand extends JavaPlugin {
	public static final Logger log = Logger.getLogger("Minecraft");
	
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] arguments) {
		
		Player me = (Player) sender;
	if(me.isOp()) {
		if(label.equalsIgnoreCase("night")) {
			me.performCommand("time set night");
		} 
		
		if(label.equalsIgnoreCase("day")) {
			me.performCommand("time set day");
		}
			
		if(label.equalsIgnoreCase("sky")) {
			me.performCommand("weather clear");
		}
		
		if(label.equalsIgnoreCase("rain")) {
			me.performCommand("weather rain");
		}
		
		if(label.equalsIgnoreCase("storm")) {
			me.performCommand("weather thunder");
		}
	} else {
		me.sendMessage(ChatColor.RED + "I am sorry but you are not an operator");
	}
				return false;
	}

}