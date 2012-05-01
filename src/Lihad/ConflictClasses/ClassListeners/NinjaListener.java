package Lihad.ConflictClasses.ClassListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class NinjaListener implements Listener {
	public static ConflictClasses plugin;
	public NinjaListener(ConflictClasses instance) {
		plugin = instance;
	}
	
	@EventHandler
	public static void onPlayerInteract(PlayerInteractEvent event){
		if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.NINJA && event.getPlayer().getItemInHand() != null
				&& event.getPlayer().getItemInHand().getType() == Material.ARROW && (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)){
			event.setUseItemInHand(Result.ALLOW);
			event.getPlayer().shootArrow();
		}
	}
	@EventHandler
	public static void onFoodLevelChange(FoodLevelChangeEvent event){
		if(event.getEntity() instanceof Player && ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)event.getEntity()).getName()) == Classes.NINJA){
			if(((Player)event.getEntity()).getFoodLevel() != 20)((Player)event.getEntity()).setFoodLevel(20);
			event.setCancelled(true);
		}
	}
}
