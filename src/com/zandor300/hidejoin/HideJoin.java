package com.zandor300.hidejoin;

import java.io.IOException;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;

import com.zandor300.hidejoin.listener.player.PlayerJoin;
import com.zandor300.hidejoin.listener.player.PlayerQuit;
import com.zandor300.hidejoin.utilities.Chat;

public class HideJoin extends JavaPlugin {

	@Override
	public void onEnable() {
		Chat.init(this);

		Chat.sendConsoleMessage("Setting up events...");
		PluginManager manager = getServer().getPluginManager();
		manager.registerEvents(new PlayerJoin(this), this);
		manager.registerEvents(new PlayerQuit(this), this);
		Chat.sendConsoleMessage("Setting up events done!");

		Chat.sendConsoleMessage("Sending stats to MCStats...");
		try {
			Metrics metrics = new Metrics(this);
			metrics.start();
			Chat.sendConsoleMessage("Sending stats to MCStats done!");
		} catch (IOException e) {
			Chat.sendConsoleMessage("Sending stats to MCStats failed!");
		}

		Chat.sendConsoleMessage("HideJoin is enabled!");
	}

	@Override
	public void onDisable() {
		Chat.sendConsoleMessage("HideJoin is disabled!");
	}
}
