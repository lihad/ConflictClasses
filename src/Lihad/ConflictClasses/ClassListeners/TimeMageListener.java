package Lihad.ConflictClasses.ClassListeners;

import java.util.List;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class TimeMageListener implements Listener {
	public static ConflictClasses plugin;
	public TimeMageListener(ConflictClasses instance) {
		plugin = instance;
	}
	@EventHandler
	public static void onPlayerInteract(PlayerInteractEvent event){
		if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.WHITE_MAGE && event.getPlayer().getItemInHand() != null
				&& event.getPlayer().getItemInHand().getType() == Material.BOOK && (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)){
			List<Block> blocks = event.getPlayer().getLineOfSight(null, 5);
			List<Entity> entities = event.getPlayer().getNearbyEntities(10, 10, 10);
			for(int i = 0;i<blocks.size();i++){
				blocks.get(i).getWorld().playEffect(blocks.get(i).getLocation(), Effect.SMOKE, 4);
				for(int j = 0;j<entities.size();j++){
					if(entities.get(j) instanceof LivingEntity && (blocks.get(i).getLocation().equals(((LivingEntity)entities.get(j)).getLocation().getBlock().getLocation())
							|| blocks.get(i).getLocation().equals(((LivingEntity)entities.get(j)).getEyeLocation().getBlock().getLocation()))){
						try{
						((LivingEntity)entities.get(j)).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 5));
						}catch(Exception e){}
						blocks.get(i).getWorld().playEffect(blocks.get(i).getLocation(), Effect.CLICK1, null);
					}
				}
			}
		}
	}
}
