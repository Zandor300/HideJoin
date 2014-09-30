package com.zandor300.hidejoin.listener.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

import com.zandor300.hidejoin.HideJoin;
import com.zandor300.hidejoin.listener.HJListener;

public class PlayerQuit extends HJListener {

	public PlayerQuit(HideJoin pl) {
		super(pl);
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		event.setQuitMessage(null);
	}
}
