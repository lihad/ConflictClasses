package Lihad.ConflictClasses.ClassListeners;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class BardListener implements Listener {
	public static ConflictClasses plugin;
	public BardListener(ConflictClasses instance) {
		plugin = instance;
	}
	@EventHandler
	public static void onPlayerInteract(PlayerInteractEvent event){
		if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BARD && event.getPlayer().getItemInHand() != null
				&& event.getPlayer().getItemInHand().getType() == Material.NOTE_BLOCK && (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)){
			List<Entity> entities = event.getPlayer().getNearbyEntities(20, 20, 20);
			for(int i = 0;i<entities.size();i++){
				if(entities.get(i) instanceof LivingEntity){
					((LivingEntity)entities.get(i)).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,20,5));
					((LivingEntity)entities.get(i)).addPotionEffect(new PotionEffect(PotionEffectType.POISON,20,5));
				}
			}
		}
	}
}
