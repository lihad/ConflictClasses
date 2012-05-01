package Lihad.ConflictClasses.ClassListeners;

import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityShootBowEvent;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class SniperListener implements Listener {
	public static ConflictClasses plugin;
	public SniperListener(ConflictClasses instance) {
		plugin = instance;
	}
	@EventHandler
	public static void onEntityShootBow(EntityShootBowEvent event){
		if(event.getEntity() instanceof Player && ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)event.getEntity()).getName()) == Classes.SNIPER){
			event.getProjectile().setVelocity(event.getProjectile().getVelocity().multiply(3));
		}
	}
	
	@EventHandler
	public static void onEntityDamageByEntity(EntityDamageByEntityEvent event){
		if(event.getCause() == DamageCause.PROJECTILE && ((Projectile)event.getDamager()).getShooter() instanceof Player
				&&  ConflictClasses.PLAYER_CURRENT_INDEX.get(((Player)((Projectile)event.getDamager()).getShooter()).getName()) == Classes.SNIPER){
			event.setDamage(event.getDamage()*2);
		}
	}
}
