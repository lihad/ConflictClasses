package Lihad.ConflictClasses.ClassListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class FighterListener implements Listener {
	public static ConflictClasses plugin;
	public FighterListener(ConflictClasses instance) {
		plugin = instance;
	}
	//Values of Damage and Velocity are subject to change upon testing.
	@EventHandler
	public static void onEntityDamageByEntity(EntityDamageByEntityEvent event){
		if(event.getCause() == DamageCause.ENTITY_ATTACK && (event.getDamager()) instanceof Player
				&& (((Player)(event.getDamager())).getItemInHand() == null || ((Player)(event.getDamager())).getItemInHand().getType() == Material.AIR)
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)(event.getDamager())).getName()) == Classes.FIGHTER){
			if(((Player)(event.getDamager())).isSprinting()){
				event.setDamage(event.getDamage()*12);
				event.getEntity().setVelocity(event.getDamager().getVelocity().multiply(5));
			}else event.setDamage(event.getDamage()*8);
		}
	}
}
