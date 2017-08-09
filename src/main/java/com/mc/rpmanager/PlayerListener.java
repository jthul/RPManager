package com.mc.rpmanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Represents all the event and actions done linked to the player events
 * 
 * @author jthulliez
 *
 */
public class PlayerListener implements Listener {
	
	 @EventHandler
     public void onPlayerJoin(PlayerJoinEvent event)
     {
		 String welcomeMsg = ChatColor.AQUA.toString() + event.getPlayer().getName() + " vient de se connecter.";
		 event.setJoinMessage("");
		 
		 Player p = event.getPlayer();
		 if(!p.hasPlayedBefore()) {
			 Bukkit.getServer().broadcastMessage(ChatColor.AQUA.toString() + "Merci d'accueillir " + ChatColor.RED.toString() + p.getName() + ChatColor.AQUA.toString() + " comme il se doit ce nouveau personnage");
		 }
		 
     }
}
