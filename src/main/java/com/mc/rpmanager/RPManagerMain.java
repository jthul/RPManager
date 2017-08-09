package com.mc.rpmanager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class RPManagerMain extends JavaPlugin {
	
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	}

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub
		super.onLoad();
	}

	@Override
    public boolean onCommand(CommandSender sender,
            Command command,
            String label,
            String[] args) {
        if (command.getName().equalsIgnoreCase("hello")) {
            sender.sendMessage("You ran /hello!");
            return true;
        }
        return false;
    }
	
}
