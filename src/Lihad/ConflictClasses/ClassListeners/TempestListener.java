package Lihad.ConflictClasses.ClassListeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.weather.LightningStrikeEvent;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class TempestListener implements Listener {
	public static ConflictClasses plugin;
	public TempestListener(ConflictClasses instance) {
		plugin = instance;
	}
	
	@EventHandler
	public static void onEntityDamageByEntity(EntityDamageByEntityEvent event){
		if(event.getCause() == DamageCause.ENTITY_ATTACK && (event.getDamager()) instanceof Player
				&& (((Player)(event.getDamager())).getItemInHand() == null || ((Player)(event.getDamager())).getItemInHand().getType() == Material.AIR)
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)(event.getDamager())).getName()) == Classes.TEMPEST){
			event.getDamager().getWorld().strikeLightning(event.getEntity().getLocation());
		}
	}
	@EventHandler
	public static void onEntityDamage(EntityDamageEvent event){
		if(event.getCause() == DamageCause.LIGHTNING && (event.getEntity()) instanceof Player
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)(event.getEntity())).getName()) == Classes.TEMPEST){
			event.setCancelled(true);
		}
	}
}
