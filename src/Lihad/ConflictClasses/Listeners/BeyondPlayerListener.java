package Lihad.ConflictClasses.Listeners;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import Lihad.Conflict.Util.BeyondUtil;
import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;


public class BeyondPlayerListener implements Listener {
	public static ConflictClasses plugin;
	public BeyondPlayerListener(ConflictClasses instance) {
		plugin = instance;
	}

	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event){
		if(!ConflictClasses.PLAYER_CLASS_INDEX.containsKey(event.getPlayer().getName())){
			Map<Classes, Integer> base_map_index = new HashMap<Classes, Integer>();
			for(int i = 0;i<Classes.values().length;i++){
				base_map_index.put(Classes.values()[i],1);
			}
			ConflictClasses.PLAYER_CLASS_INDEX.put(event.getPlayer().getName(), base_map_index);
		}
	}
	@EventHandler
	public static void onInventoryCloseArmorLimitations(InventoryCloseEvent event){
		if(event.getInventory() instanceof PlayerInventory){
			PlayerInventory inventory = (PlayerInventory) event.getInventory();
			if(event.getPlayer().isOp())return;
			else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.CHEMIST){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 65)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 65)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 65)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 65)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLACK_MAGE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.WHITE_MAGE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.TIME_MAGE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 75)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 75)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 75)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 75)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLUE_MAGE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 80)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 120)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 80)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 120)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 80)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 120)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 80)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 120)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.RED_MAGE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 90)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 130)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 90)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 130)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 90)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 130)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 90)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 130)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SUMMONER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 80)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 80)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 80)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 80)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.MYSTIC){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 85)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 125)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 85)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 125)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 85)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 125)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 85)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 125)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BARD){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SNIPER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SQUIRE){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 65)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 65)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 65)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 65)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.KNIGHT){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 65)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 105)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 125)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 65)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 105)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 125)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 65)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 105)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 125)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 65)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 105)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 125)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.FIGHTER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 110)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 130)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 110)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 130)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 110)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 130)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 110)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 130)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.TEMPEST){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 75)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 115)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 135)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 155)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 75)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 115)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 135)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 155)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 75)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 115)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 135)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 155)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 75)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 115)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 135)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 155)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.ARCHER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.THIEF){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.NINJA){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.GEOMANCER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 80)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 120)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 140)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 80)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 120)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 140)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 80)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 120)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 140)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 80)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 120)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 140)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.DRAGOON){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 75)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 115)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 135)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 75)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 115)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 135)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 75)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 115)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 135)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 75)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 115)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 135)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.PALADIN){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 85)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 125)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 145)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 165)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 85)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 125)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 145)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 165)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 85)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 125)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 145)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 165)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 85)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 125)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 145)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 165)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.ARBITER){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 70)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 110)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 130)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 150)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 70)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 110)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 130)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 150)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 70)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 110)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 130)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 150)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 70)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 110)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 130)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 150)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLACK_KNIGHT){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 80)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 120)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 140)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 80)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 120)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 140)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 80)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 120)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 140)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 80)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 120)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 140)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.WHITE_KNIGHT){
				if((inventory.getHelmet().getType() == Material.LEATHER_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 80)
						|| (inventory.getHelmet().getType() == Material.GOLD_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 120)
						|| (inventory.getHelmet().getType() == Material.IRON_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 140)
						|| (inventory.getHelmet().getType() == Material.DIAMOND_HELMET && BeyondUtil.rarity(inventory.getHelmet()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getHelmet());
					inventory.setHelmet(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The helmet was too heavy or amazing for you to handle");
				}
				if((inventory.getChestplate().getType() == Material.LEATHER_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 80)
						|| (inventory.getChestplate().getType() == Material.GOLD_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 120)
						|| (inventory.getChestplate().getType() == Material.IRON_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 140)
						|| (inventory.getChestplate().getType() == Material.DIAMOND_CHESTPLATE && BeyondUtil.rarity(inventory.getChestplate()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getChestplate());
					inventory.setChestplate(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The chestplate was too heavy or amazing for you to handle");
				}
				if((inventory.getLeggings().getType() == Material.LEATHER_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 80)
						|| (inventory.getLeggings().getType() == Material.GOLD_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 120)
						|| (inventory.getLeggings().getType() == Material.IRON_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 140)
						|| (inventory.getLeggings().getType() == Material.DIAMOND_LEGGINGS && BeyondUtil.rarity(inventory.getLeggings()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getLeggings());
					inventory.setLeggings(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The legging was too heavy or amazing for you to handle");
				}
				if((inventory.getBoots().getType() == Material.LEATHER_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 80)
						|| (inventory.getBoots().getType() == Material.GOLD_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 120)
						|| (inventory.getBoots().getType() == Material.IRON_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 140)
						|| (inventory.getBoots().getType() == Material.DIAMOND_BOOTS && BeyondUtil.rarity(inventory.getBoots()) > 160)){
					event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(),inventory.getBoots());
					inventory.setBoots(new ItemStack(0));
					((Player) event.getPlayer()).sendMessage("The boot was too heavy or amazing for you to handle");
				}
			}
		}
	}
	@EventHandler
	public static void onPlayerInteractBowLimitations(EntityShootBowEvent event){
		if(event.getEntity() instanceof Player){
			Player player = (Player) event.getEntity();
			if(player.isOp())return;
			else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.CHEMIST
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.BLACK_MAGE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.WHITE_MAGE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.TIME_MAGE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.BLUE_MAGE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.RED_MAGE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.SUMMONER
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.MYSTIC
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.BARD
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.SQUIRE
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.KNIGHT
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.FIGHTER
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.TEMPEST
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.NINJA
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.GEOMANCER
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.DRAGOON
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.PALADIN
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.ARBITER
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.WHITE_KNIGHT
					|| ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.BLACK_KNIGHT
			){
				player.getWorld().dropItemNaturally(player.getLocation(),player.getItemInHand());
				player.setItemInHand(new ItemStack(0));
				player.sendMessage("You do not have the knowledge needed to fire this bow");
				event.setCancelled(true);
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.ARCHER
					&& BeyondUtil.rarity(player.getItemInHand()) > 160){
				player.getWorld().dropItemNaturally(player.getLocation(),player.getItemInHand());
				player.setItemInHand(new ItemStack(0));
				player.sendMessage("You do not have the knowledge needed to fire this bow");
				event.setCancelled(true);
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.SNIPER
					&& BeyondUtil.rarity(player.getItemInHand()) > 180){
				player.getWorld().dropItemNaturally(player.getLocation(),player.getItemInHand());
				player.setItemInHand(new ItemStack(0));
				player.sendMessage("You do not have the knowledge needed to fire this bow");
				event.setCancelled(true);
			}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(player.getName()) == Classes.THIEF
					&& BeyondUtil.rarity(player.getItemInHand()) > 150){
				player.getWorld().dropItemNaturally(player.getLocation(),player.getItemInHand());
				player.setItemInHand(new ItemStack(0));
				player.sendMessage("You do not have the knowledge needed to fire this bow");
				event.setCancelled(true);
			}
		}
	}
	@EventHandler
	public static void onPlayerInteractWeaponLimitations(PlayerInteractEvent event){
		if(event.getPlayer().isOp())return;
		else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.CHEMIST && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
				)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLACK_MAGE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.WHITE_MAGE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.TIME_MAGE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLUE_MAGE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.RED_MAGE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SUMMONER && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.MYSTIC && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BARD && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SQUIRE && event.getPlayer().getItemInHand() != null
				&& (event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD
						|| event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.KNIGHT && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 85)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 105)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 125)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.FIGHTER && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.TEMPEST && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 95)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 115)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 135)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 155)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 75)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.ARCHER && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.THIEF && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 85)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 105)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.NINJA && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.GEOMANCER && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 100)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 120)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 140)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 80)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.DRAGOON && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 85)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 105)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 125)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 145)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 65)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.PALADIN && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 105)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 125)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 145)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 165)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 85)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.ARBITER && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 110)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 130)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 150)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 170)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 90)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.BLACK_KNIGHT && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 120)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 140)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 160)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 180)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 100)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.WHITE_KNIGHT && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 120)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 140)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 160)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 180)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD && BeyondUtil.rarity(event.getPlayer().getItemInHand()) > 100)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}else if(ConflictClasses.PLAYER_CURRENT_INDEX.get(event.getPlayer().getName()) == Classes.SNIPER && event.getPlayer().getItemInHand() != null
				&& ((event.getPlayer().getItemInHand().getType() == Material.STONE_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.GOLD_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.IRON_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.DIAMOND_SWORD)
						|| (event.getPlayer().getItemInHand().getType() == Material.WOOD_SWORD)
						)){
			event.getPlayer().getWorld().dropItemNaturally(event.getPlayer().getLocation(), event.getPlayer().getItemInHand());
			event.getPlayer().setItemInHand(new ItemStack(0));
			event.getPlayer().sendMessage("The weapon was too heavy or amazing for you to handle");
			event.setCancelled(true);
		}
	}
}
