package Lihad.ConflictClasses.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;

import Lihad.ConflictClasses.ConflictClasses;

public class BeyondPluginListener implements Listener {
	public static ConflictClasses plugin;
    public BeyondPluginListener(ConflictClasses instance) {
        plugin = instance;
    }
    @EventHandler
    public void onPluginEnable(PluginEnableEvent event){
    	if(event.getPlugin().getDescription().getName().equals("Permissions"))plugin.setupPermissions();
    	else if(event.getPlugin().getDescription().getName().equals("PermissionsEx"))plugin.setupPermissionsEx();
    }
    @EventHandler
    public void onPluginDisable(PluginDisableEvent event){
    	if(event.getPlugin().getDescription().getName().equals("Permissions"))
    		plugin.setupPermissions();
    	else if(event.getPlugin().getDescription().getName().equals("PermissionsEx"))
    		plugin.setupPermissionsEx();
    }
}
