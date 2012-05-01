package Lihad.ConflictClasses;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

import Lihad.Conflict.Conflict;
import Lihad.Conflict.Util.BeyondUtil;
import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.Information.BeyondInfo;
import Lihad.ConflictClasses.Listeners.BeyondBlockListener;
import Lihad.ConflictClasses.Listeners.BeyondEntityListener;
import Lihad.ConflictClasses.Listeners.BeyondPlayerListener;
import Lihad.ConflictClasses.Listeners.BeyondPluginListener;


public class ConflictClasses extends JavaPlugin {
	/** Name of the plugin, used in output messages */
	protected static String name = "ConflictClasses";
	/** Header used for console and player output messages */
	protected static String header = "[" + name + "] ";

	public static YamlConfiguration information;

	public static PermissionHandler handler;
	public static PermissionManager ex;
	private static Logger log = Logger.getLogger("Minecraft");
	
	public static CommandExecutor cmd;
	public static BeyondInfo info;
	
	public static Map<String, Map<Classes,Integer>> PLAYER_CLASS_INDEX = new HashMap<String, Map<Classes,Integer>>();
	public static Map<String, Classes> PLAYER_CURRENT_INDEX = new HashMap<String, Classes>();
	public static Map<String, Integer> PLAYER_CURRENT_EXP = new HashMap<String, Integer>();


	private final BeyondPluginListener pluginListener = new BeyondPluginListener(this);
	private final BeyondBlockListener blockListener = new BeyondBlockListener(this);
	private final BeyondPlayerListener playerListener = new BeyondPlayerListener(this);
	private final BeyondEntityListener entityListener = new BeyondEntityListener(this);

	public static File infoFile = new File("plugins/Conflict/classes.yml");
	
	
	@Override
	public void onDisable() {
		BeyondInfo.writer();
		try {
			information.save(infoFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onEnable() {
		
		//PluginManager
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(blockListener, this);
		pm.registerEvents(pluginListener, this);
		pm.registerEvents(playerListener, this);
		pm.registerEvents(entityListener, this);
	}
	
	public void setupPermissions() {
		Plugin permissionsPlugin = this.getServer().getPluginManager().getPlugin("Permissions");

		if (permissionsPlugin != null) {
			info("Succesfully connected to Permissions!");
			handler = ((Permissions) permissionsPlugin).getHandler();

		} else {
			handler = null;
			warning("Disconnected from Permissions...what could possibly go wrong?");
		}
	}
	public void setupPermissionsEx() {
		Plugin permissionsPlugin = this.getServer().getPluginManager().getPlugin("PermissionsEx");

		if (permissionsPlugin != null) {
			info("Succesfully connected to PermissionsEx!");
			ex = PermissionsEx.getPermissionManager();

		} else {
			ex = null;
			warning("Disconnected from PermissionsEx...what could possibly go wrong?");
		}
	}
	public void notification(String message){
		getServer().broadcastMessage(ChatColor.LIGHT_PURPLE.toString() +"[Religion Notification] " + ChatColor.AQUA.toString() + message);
	}
	/**
	 * Logs an informative message to the console, prefaced with this plugin's header
	 * @param message: String
	 */
	public static void info(String message)
	{ 
		log.info(header + ChatColor.WHITE + message);
	}

	/**
	 * Logs a severe error message to the console, prefaced with this plugin's header
	 * Used to log severe problems that have prevented normal execution of the plugin
	 * @param message: String
	 */
	public static void severe(String message)
	{
		log.severe(header + ChatColor.RED + message);
	}

	/**
	 * Logs a warning message to the console, prefaced with this plugin's header
	 * Used to log problems that could interfere with the plugin's ability to meet admin expectations
	 * @param message: String
	 */
	public static void warning(String message)
	{
		log.warning(header + ChatColor.YELLOW + message);
	}

	/**
	 * Logs a message to the console, prefaced with this plugin's header
	 * @param level: Logging level under which to send the message
	 * @param message: String
	 */
	public static void log(java.util.logging.Level level, String message)
	{
		log.log(level, header + message);
	}
	public static void saveInfoFile() throws IOException{
		information.save(infoFile);
	}

}
