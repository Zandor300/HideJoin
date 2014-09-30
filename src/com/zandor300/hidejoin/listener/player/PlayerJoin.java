package com.zandor300.hidejoin.listener.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import com.zandor300.hidejoin.HideJoin;
import com.zandor300.hidejoin.listener.HJListener;

public class PlayerJoin extends HJListener {

	public PlayerJoin(HideJoin pl) {
		super(pl);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage(null);
	}
}
