package Lihad.ConflictClasses.Information;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;


public class BeyondInfo {
	public static ConflictClasses plugin;
	public BeyondInfo(ConflictClasses instance) {
		plugin = instance;
	}

	@SuppressWarnings("unchecked")
	public static void loader(){
		/**
		for(int i = 0;i<ConflictClasses.information.getConfigurationSection("player_class_index").getKeys(false).size();i++){
			String playername = (String) ConflictClasses.information.getConfigurationSection("player_class_index").getKeys(false).toArray()[i];
			Map<Classes, Integer> base_map_index = new HashMap<Classes, Integer>();
			for(int j = 0;j<Classes.values().length;j++){
				base_map_index.put(Classes.values()[j], ConflictClasses.information.getConfigurationSection("player_class_index."+playername).getInt(Classes.values()[j].name()));
			}
			ConflictClasses.PLAYER_CLASS_INDEX.put(playername, base_map_index);
		}
		*/
		/**
		for(int i = 0;i<ConflictClasses.information.getConfigurationSection("player_current_class").getKeys(false).size();i++){
			String playername = (String) ConflictClasses.information.getConfigurationSection("player_current_class").getKeys(false).toArray()[i];
			ConflictClasses.PLAYER_CURRENT_INDEX.put(playername, Classes.valueOf(ConflictClasses.information.getString("player_current_class."+playername)));
		}
		*/
		ConflictClasses.PLAYER_CLASS_INDEX = (Map<String, Map<Classes, Integer>>) ConflictClasses.information.get("player_class_index");
	}
	public static void writer(){
		ConflictClasses.information.set("player_class_index", ConflictClasses.PLAYER_CLASS_INDEX);
		ConflictClasses.information.set("player_class_index", ConflictClasses.PLAYER_CURRENT_INDEX);
	}
	private static Location toLocation(String path){
		String[] array;
		String str = ConflictClasses.information.getString(path);
		if(str == null) return null;
		array = str.split(",");
		Location location = new Location(plugin.getServer().getWorld(array[3]), Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]));
		return location;
	}
	private static String toString(Location location){
		if(location == null) return null;
		return (location.getBlockX()+","+location.getBlockY()+","+location.getBlockZ()+","+location.getWorld().getName());
	}
}
	