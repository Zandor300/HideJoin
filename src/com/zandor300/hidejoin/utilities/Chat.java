package com.zandor300.hidejoin.utilities;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.zandor300.hidejoin.HideJoin;

public class Chat {

	private static HideJoin plugin;
	private static ConsoleCommandSender console;
	private static String prefix = "§4[HideJoin]§f ";

	public static void init(HideJoin pl) {
		plugin = pl;
		console = plugin.getServer().getConsoleSender();
	}

	public static void sendConsoleMessage(String message) {
		console.sendMessage(prefix + message);
	}

	public static void sendMessage(Player player, String message) {
		player.sendMessage(prefix + message);
	}

	public static void broadcastMessage(String message) {
		for (Player player : Bukkit.getOnlinePlayers())
			player.sendMessage(prefix + message);
	}
}
