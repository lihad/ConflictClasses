package Lihad.ConflictClasses.ClassListeners;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class GeomancerListener implements Listener {
	public static ConflictClasses plugin;
	public GeomancerListener(ConflictClasses instance) {
		plugin = instance;
	}
	@EventHandler
	public static void onEntityDamage(EntityDamageEvent event){
		if(event.getEntity() instanceof Player && event.getCause() == DamageCause.FALL
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)(event.getEntity())).getName()) == Classes.GEOMANCER){
			List<Entity> entities = event.getEntity().getNearbyEntities(5, 1, 5);
			if(entities != null && !entities.isEmpty()){
				for(int i = 0; i<entities.size(); i++){
					if(entities.get(i) instanceof LivingEntity){
						((LivingEntity)entities.get(i)).damage(event.getDamage(), event.getEntity());
					}
				}
			}
			event.setCancelled(true);
		}
	}
	@EventHandler
	public static void onEntityDamageByEntity(EntityDamageByEntityEvent event){
		if(event.getCause() == DamageCause.ENTITY_ATTACK && (event.getDamager()) instanceof Player
				&& (((Player)(event.getDamager())).getItemInHand() == null || ((Player)(event.getDamager())).getItemInHand().getType() == Material.AIR)
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)(event.getDamager())).getName()) == Classes.GEOMANCER){
			event.getEntity().teleport(new Location(event.getEntity().getWorld(), event.getEntity().getLocation().getX(), event.getEntity().getLocation().getY()-1, event.getEntity().getLocation().getZ()));
		}
	}
}
