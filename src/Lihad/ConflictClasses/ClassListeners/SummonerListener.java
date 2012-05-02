package Lihad.ConflictClasses.ClassListeners;

import java.util.List;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

public class SummonerListener implements Listener {
	public static ConflictClasses plugin;
	public SummonerListener(ConflictClasses instance) {
		plugin = instance;
	}
	@EventHandler
	public static void onPlayerInteract(PlayerInteractEvent event){
		if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SUMMONER && event.getPlayer().getItemInHand() != null
				&& event.getPlayer().getItemInHand().getType() == Material.BOOK && (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)){
			if(event.getPlayer().getFoodLevel() > 4){
				event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel()-4);
				PigZombie zomb = (PigZombie)event.getPlayer().getWorld().spawnCreature(event.getPlayer().getLocation(), EntityType.PIG_ZOMBIE);
				List<Block> blocks = event.getPlayer().getLineOfSight(null, 5);
				List<Entity> entities = event.getPlayer().getNearbyEntities(10, 10, 10);
				for(int i = 0;i<blocks.size();i++){
					for(int j = 0;j<entities.size();j++){
						if(entities.get(j) instanceof LivingEntity && (blocks.get(i).getLocation().equals(((LivingEntity)entities.get(j)).getLocation().getBlock().getLocation())
								|| blocks.get(i).getLocation().equals(((LivingEntity)entities.get(j)).getEyeLocation().getBlock().getLocation()))){
							zomb.setTarget((LivingEntity)entities.get(j));
						}
					}
				}
			}
		}
	}
	@EventHandler
	public static void onPlayerInteractEntity(PlayerInteractEntityEvent event){
		if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SUMMONER && event.getPlayer().getItemInHand() != null
				&& event.getPlayer().getItemInHand().getType() == Material.BLAZE_ROD && event.getRightClicked() instanceof PigZombie){
			event.getRightClicked().remove();
		}
	}
}
