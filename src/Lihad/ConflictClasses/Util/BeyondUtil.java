package Lihad.ConflictClasses.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion.Tier;
import org.bukkit.potion.PotionType;

import Lihad.ConflictClasses.Classes;
import Lihad.ConflictClasses.ConflictClasses;

/**
 * 
 * Utility class, holds static convenience methods
 * 
 * @author Lihad
 * @author Joren
 *
 */
public class BeyondUtil {
	
	public static boolean canAdvance(Player player, Classes job){
		if(job == Classes.SQUIRE) return true;
		else if(job == Classes.CHEMIST) return true;
		else if(job == Classes.ARCHER && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SQUIRE) >= 2) return true;
		else if(job == Classes.KNIGHT && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SQUIRE) >= 2) return true;
		else if(job == Classes.BLACK_MAGE && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.CHEMIST) >= 2) return true;
		else if(job == Classes.WHITE_MAGE && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.CHEMIST) >= 2) return true;
		else if(job == Classes.THIEF && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.ARCHER) >= 4) return true;
		else if(job == Classes.FIGHTER && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.KNIGHT) >= 4) return true;
		else if(job == Classes.TIME_MAGE && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLACK_MAGE) >= 5) return true;
		else if(job == Classes.BLUE_MAGE && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.WHITE_MAGE) >= 5) return true;
		else if(job == Classes.DRAGOON && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.THIEF) >= 5) return true;
		else if(job == Classes.GEOMANCER && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.FIGHTER) >= 5) return true;
		else if(job == Classes.SUMMONER && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.TIME_MAGE) >= 5) return true;
		else if(job == Classes.MYSTIC && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLUE_MAGE) >= 5) return true;
		else if(job == Classes.RED_MAGE && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLACK_MAGE) >= 7
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.WHITE_MAGE) >= 7
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.TIME_MAGE) >= 7
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLUE_MAGE) >= 7) return true;
		else if(job == Classes.BARD && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SUMMONER) >= 5
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.MYSTIC) >= 5) return true;
		else if(job == Classes.SNIPER && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.ARCHER) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.THIEF) >= 4) return true;
		else if(job == Classes.PALADIN && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.GEOMANCER) >= 5
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.DRAGOON) >= 5) return true;
		else if(job == Classes.NINJA && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.GEOMANCER) >= 4
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.THIEF) >= 5
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.ARCHER) >= 5) return true;
		else if(job == Classes.TEMPEST && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.DRAGOON) >= 4
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.FIGHTER) >= 5
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.KNIGHT) >= 5) return true;
		else if(job == Classes.ARBITER && ((ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.GEOMANCER) >= 7
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SQUIRE) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.DRAGOON) >= 7)
				|| (ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SUMMONER) >= 7
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.CHEMIST) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.MYSTIC) >= 7))) return true;
		else if(job == Classes.BLACK_KNIGHT && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLACK_MAGE) >= 10
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.CHEMIST) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.KNIGHT) >= 10
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SQUIRE) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.TEMPEST) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.DRAGOON) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.GEOMANCER) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.NINJA) >= 8) return true;
		else if(job == Classes.WHITE_KNIGHT && ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.WHITE_MAGE) >= 10
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.CHEMIST) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.KNIGHT) >= 10
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.SQUIRE) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.TEMPEST) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.BLUE_MAGE) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.RED_MAGE) >= 8
				&& ConflictClasses.PLAYER_CLASS_INDEX.get(player.getName()).get(Classes.MYSTIC) >= 8) return true;
		return false;
	}
	
	/**
	 * Compares two locations to see if they share the same block.
	 * 
	 * @param a - Location to be compared with b
	 * @param b - Location to be compared with a
	 * @return true if they share the same block, false if not, false if either Location is null
	 */
	
	public static boolean isSameBlock(Location a, Location b)
	{
		return (a!=null && b!=null && a.getBlock().equals(b.getBlock()));
	}

	
	/**
	 * 
	 * @param chest
	 * @param material
	 * @return Returns amount of specified material in specified chest
	 */
	public static int getChestAmount(Chest chest, Material material){
		int amount = 0;
		for(int i=0; i<chest.getInventory().getSize(); i++){
			if(chest.getInventory().getItem(i) == null) continue;
			if(chest.getInventory().getItem(i).getType() == material){
				amount = amount+chest.getInventory().getItem(i).getAmount();
			}
		}
		return amount;
	}
	
	/**
	 * 
	 * Checks to see if a location is next to another block. z,x ONLY
	 */
	public static boolean isNextTo(Location reference, Location variable){
		variable.setX(variable.getBlockX()+1);
		if(reference.equals(variable)){
			return true;
		}
		variable.setX(variable.getBlockX()-2);
		if(reference.equals(variable)){
			return true;
		}
		variable.setX(variable.getBlockX()+1);
		variable.setZ(variable.getBlockZ()+1);
		if(reference.equals(variable)){
			return true;
		}
		variable.setZ(variable.getBlockZ()-2);
		if(reference.equals(variable)){
			return true;
		}
		return false;
		
	}

	public static int rarity(ItemStack stack){
		int levelvalue = 0;
		int itemvalue = 0;
		if(stack.getEnchantments().keySet() != null){
			for(int i=0;i<stack.getEnchantments().keySet().size();i++){
				levelvalue = levelvalue + stack.getEnchantmentLevel((Enchantment)stack.getEnchantments().keySet().toArray()[i]);
			}
		}
		if(stack.getType() == Material.LEATHER_BOOTS
				|| stack.getType() == Material.LEATHER_CHESTPLATE
				|| stack.getType() == Material.LEATHER_HELMET
				|| stack.getType() == Material.LEATHER_LEGGINGS
				|| stack.getType() == Material.WOOD_AXE
				|| stack.getType() == Material.WOOD_SPADE
				|| stack.getType() == Material.WOOD_PICKAXE
				|| stack.getType() == Material.WOOD_SWORD)
			itemvalue = 60;
		else if(stack.getType() == Material.STONE_PICKAXE
				|| stack.getType() == Material.STONE_SPADE
				|| stack.getType() == Material.STONE_AXE
				|| stack.getType() == Material.STONE_SWORD)
			itemvalue = 80;
		else if(stack.getType() == Material.GOLD_BOOTS
				|| stack.getType() == Material.GOLD_CHESTPLATE
				|| stack.getType() == Material.GOLD_HELMET
				|| stack.getType() == Material.GOLD_LEGGINGS
				|| stack.getType() == Material.GOLD_AXE
				|| stack.getType() == Material.GOLD_SPADE
				|| stack.getType() == Material.GOLD_PICKAXE
				|| stack.getType() == Material.GOLD_SWORD)
			itemvalue = 100;
		else if(stack.getType() == Material.IRON_BOOTS
				|| stack.getType() == Material.IRON_CHESTPLATE
				|| stack.getType() == Material.IRON_HELMET
				|| stack.getType() == Material.IRON_LEGGINGS
				|| stack.getType() == Material.IRON_AXE
				|| stack.getType() == Material.IRON_SPADE
				|| stack.getType() == Material.IRON_PICKAXE
				|| stack.getType() == Material.IRON_SWORD)
			itemvalue = 120;
		else if(stack.getType() == Material.DIAMOND_BOOTS
				|| stack.getType() == Material.BOW
				|| stack.getType() == Material.DIAMOND_CHESTPLATE
				|| stack.getType() == Material.DIAMOND_HELMET
				|| stack.getType() == Material.DIAMOND_LEGGINGS
				|| stack.getType() == Material.DIAMOND_AXE
				|| stack.getType() == Material.DIAMOND_SPADE
				|| stack.getType() == Material.DIAMOND_PICKAXE
				|| stack.getType() == Material.DIAMOND_SWORD)
			itemvalue = 140;



		return (levelvalue+itemvalue);
	}
	public static String getColorOfRarity(double index){
		if(index >= 180)return ChatColor.DARK_RED.toString();
		else if(index >= 160)return ChatColor.RED.toString();
		else if(index >= 140)return ChatColor.LIGHT_PURPLE.toString();
		else if(index >= 120)return ChatColor.BLUE.toString();
		else if(index >= 100)return ChatColor.GREEN.toString();
		else if(index >= 80)return ChatColor.YELLOW.toString();
		else return ChatColor.GRAY.toString();
	}
	public static String getColorOfTotalRarity(int index){
		if(index >= 1000)return ChatColor.DARK_RED.toString();
		else if(index >= 800)return ChatColor.RED.toString();
		else if(index >= 700)return ChatColor.LIGHT_PURPLE.toString();
		else if(index >= 600)return ChatColor.BLUE.toString();
		else if(index >= 500)return ChatColor.GREEN.toString();
		else if(index >= 400)return ChatColor.YELLOW.toString();
		else return ChatColor.GRAY.toString();
	}
	public static String getColorOfLevel(int index){
		if(index >= 12)return ChatColor.DARK_RED.toString();
		else if(index >= 10)return ChatColor.RED.toString();
		else if(index >= 8)return ChatColor.LIGHT_PURPLE.toString();
		else if(index >= 6)return ChatColor.BLUE.toString();
		else if(index >= 4)return ChatColor.GREEN.toString();
		else if(index >= 2)return ChatColor.YELLOW.toString();
		else return ChatColor.GRAY.toString();
	}
	//
	//
	// Helper Functions
	//
	//
	
	
	public static int calculator(Player player){
		Random chance = new Random();
		int next = chance.nextInt(1000);
		int playerlevel = player.getLevel()/10;
		if(playerlevel > 10)playerlevel = 10;
		return (next - (playerlevel*3));
	}
	public static PotionType potionTypeRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(9);
		switch(next){
		case 0: return PotionType.SPEED;
		case 1: return PotionType.SLOWNESS;
		case 2: return PotionType.FIRE_RESISTANCE;
		case 3: return PotionType.REGEN;
		case 4: return PotionType.INSTANT_DAMAGE;
		case 5: return PotionType.INSTANT_HEAL;
		case 6: return PotionType.POISON;
		case 7: return PotionType.WEAKNESS;
		case 8: return PotionType.STRENGTH;
		}
		return PotionType.SPEED;
	}
	public static Tier potionTierRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(3);
		if(next < 2){
			return Tier.ONE;
		}else return Tier.TWO;
	}
	public static boolean potionSplashRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(2);
		if(next == 0)return true;
		else return false;
	}
	public static Material weaponTypeRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<10)return Material.DIAMOND_SWORD;
		else if(next<25)return Material.IRON_SWORD;
		else if(next<40)return Material.GOLD_SWORD;
		else if(next<60)return Material.STONE_SWORD;
		else return Material.WOOD_SWORD;
	}
	public static Enchantment weaponEnchantRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(6);
		switch(next){
		case 0: return Enchantment.LOOT_BONUS_MOBS;
		case 1: return Enchantment.KNOCKBACK;
		case 2: return Enchantment.FIRE_ASPECT;
		case 3: return Enchantment.DAMAGE_UNDEAD;
		case 4: return Enchantment.DAMAGE_ARTHROPODS;
		case 5: return Enchantment.DAMAGE_ALL;
		}
		return Enchantment.DAMAGE_ALL;
	}
	public static int weaponLevelRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<1)return 10;
		else if(next<3)return 9;
		else if(next<6)return 8;
		else if(next<10)return 7;
		else if(next<15)return 6;
		else if(next<20)return 5;
		else if(next<30)return 4;
		else if(next<40)return 3;
		else if(next<50)return 2;
		else return 1;
	}
	public static Enchantment bowEnchantRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(5);
		switch(next){
		case 0: return Enchantment.ARROW_DAMAGE;
		case 1: return Enchantment.ARROW_FIRE;
		case 2: return Enchantment.ARROW_INFINITE;
		case 3: return Enchantment.ARROW_KNOCKBACK;
		case 4: return Enchantment.LOOT_BONUS_MOBS;
		}
		return Enchantment.DAMAGE_ALL;
	}
	public static int bowLevelRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<1)return 10;
		else if(next<3)return 9;
		else if(next<6)return 8;
		else if(next<10)return 7;
		else if(next<15)return 6;
		else if(next<20)return 5;
		else if(next<30)return 4;
		else if(next<40)return 3;
		else if(next<50)return 2;
		else return 1;
	}
	public static Material armorTypeRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<2)return Material.DIAMOND_CHESTPLATE;
		else if(next<5)return Material.DIAMOND_BOOTS;
		else if(next<7)return Material.DIAMOND_HELMET;
		else if(next<10)return Material.DIAMOND_LEGGINGS;
		else if(next<13)return Material.IRON_CHESTPLATE;
		else if(next<17)return Material.IRON_BOOTS;
		else if(next<21)return Material.IRON_HELMET;
		else if(next<25)return Material.IRON_LEGGINGS;
		else if(next<29)return Material.GOLD_CHESTPLATE;
		else if(next<36)return Material.GOLD_BOOTS;
		else if(next<43)return Material.GOLD_HELMET;
		else if(next<50)return Material.GOLD_LEGGINGS;
		else if(next<60)return Material.LEATHER_CHESTPLATE;
		else if(next<73)return Material.LEATHER_BOOTS;
		else if(next<86)return Material.LEATHER_HELMET;
		else return Material.LEATHER_LEGGINGS;
	}
	public static Enchantment armorEnchantRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(4);
		switch(next){
		case 0: return Enchantment.PROTECTION_FIRE;
		case 1: return Enchantment.PROTECTION_PROJECTILE;
		case 2: return Enchantment.PROTECTION_ENVIRONMENTAL;
		case 3: return Enchantment.PROTECTION_EXPLOSIONS;
		}
		return Enchantment.PROTECTION_EXPLOSIONS;
	}
	public static int armorLevelRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<1)return 10;
		else if(next<3)return 9;
		else if(next<6)return 8;
		else if(next<10)return 7;
		else if(next<15)return 6;
		else if(next<20)return 5;
		else if(next<30)return 4;
		else if(next<40)return 3;
		else if(next<50)return 2;
		else return 1;
	}
	public static Material toolTypeRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<4)return Material.DIAMOND_AXE;
		else if(next<7)return Material.DIAMOND_PICKAXE;
		else if(next<10)return Material.DIAMOND_SPADE;
		else if(next<15)return Material.IRON_AXE;
		else if(next<20)return Material.IRON_PICKAXE;
		else if(next<25)return Material.IRON_SPADE;
		else if(next<29)return Material.GOLD_AXE;
		else if(next<33)return Material.GOLD_PICKAXE;
		else if(next<37)return Material.GOLD_SPADE;
		else if(next<41)return Material.STONE_AXE;
		else if(next<45)return Material.STONE_PICKAXE;
		else if(next<50)return Material.STONE_SPADE;
		else if(next<60)return Material.WOOD_PICKAXE;
		else if(next<85)return Material.WOOD_AXE;
		else return Material.WOOD_SPADE;
	}
	public static Enchantment toolEnchantRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(3);
		switch(next){
		case 0: return Enchantment.DURABILITY;
		case 1: return Enchantment.LOOT_BONUS_BLOCKS;
		case 2: return Enchantment.DIG_SPEED;
		}
		return Enchantment.PROTECTION_EXPLOSIONS;
	}
	public static int toolLevelRandomizer(){
		Random chance = new Random();
		int next = chance.nextInt(100);
		if(next<1)return 10;
		else if(next<3)return 9;
		else if(next<6)return 8;
		else if(next<10)return 7;
		else if(next<15)return 6;
		else if(next<20)return 5;
		else if(next<30)return 4;
		else if(next<40)return 3;
		else if(next<50)return 2;
		else return 1;
	}
	
	/**
	 * @param block - Location where player wants to place a tower
	 */
	public static List<ItemStack> randomLootPump(){
		List<ItemStack> stacks = new ArrayList<ItemStack>();
		if(chancizerForHotDrops() == 0){
			ItemStack stack = new ItemStack(BeyondUtil.toolTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerTool());
			stacks.add(stack);
		}else if(chancizerForHotDrops() == 1){
			ItemStack stack = new ItemStack(BeyondUtil.armorTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerArmor());
			stacks.add(stack);
		}else if(chancizerForHotDrops() == 2){
			ItemStack stack = new ItemStack(BeyondUtil.weaponTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerWeapon());
			stacks.add(stack);
		}else if(chancizerForHotDrops() == 3){
			ItemStack stack = new ItemStack(BeyondUtil.armorTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerArmor());
			ItemStack stack2 = new ItemStack(BeyondUtil.toolTypeRandomizer(), 1);
			stack2.addUnsafeEnchantments(lootPumpStackerTool());
			stacks.add(stack);
			stacks.add(stack2);
		}else if(chancizerForHotDrops() == 4){
			ItemStack stack = new ItemStack(BeyondUtil.toolTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerTool());
			ItemStack stack2 = new ItemStack(BeyondUtil.weaponTypeRandomizer(), 1);
			stack2.addUnsafeEnchantments(lootPumpStackerWeapon());
			stacks.add(stack);
			stacks.add(stack2);
		}else if(chancizerForHotDrops() == 5){
			ItemStack stack = new ItemStack(BeyondUtil.armorTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerArmor());
			ItemStack stack2 = new ItemStack(BeyondUtil.weaponTypeRandomizer(), 1);
			stack2.addUnsafeEnchantments(lootPumpStackerWeapon());
			stacks.add(stack);
			stacks.add(stack2);
		}else{
			ItemStack stack = new ItemStack(BeyondUtil.toolTypeRandomizer(), 1);
			stack.addUnsafeEnchantments(lootPumpStackerTool());
			ItemStack stack2 = new ItemStack(BeyondUtil.armorTypeRandomizer(), 1);
			stack2.addUnsafeEnchantments(lootPumpStackerArmor());
			ItemStack stack3 = new ItemStack(BeyondUtil.weaponTypeRandomizer(), 1);
			stack3.addUnsafeEnchantments(lootPumpStackerWeapon());
			stacks.add(stack);
			stacks.add(stack2);
			stacks.add(stack3);
		}
		return stacks;
	}
	private static Map<Enchantment,Integer> lootPumpStackerWeapon(){
		Map<Enchantment,Integer> map = new HashMap<Enchantment,Integer>();
		Random random = new Random();
		int next = random.nextInt(100);
		map.put(BeyondUtil.weaponEnchantRandomizer(), BeyondUtil.weaponLevelRandomizer());
		if(next<15)		map.put(BeyondUtil.weaponEnchantRandomizer(), BeyondUtil.weaponLevelRandomizer());
		if(next<8)		map.put(BeyondUtil.weaponEnchantRandomizer(), BeyondUtil.weaponLevelRandomizer());
		if(next<3)		map.put(BeyondUtil.weaponEnchantRandomizer(), BeyondUtil.weaponLevelRandomizer());
		return map;
	}
	private static Map<Enchantment,Integer> lootPumpStackerArmor(){
		Map<Enchantment,Integer> map = new HashMap<Enchantment,Integer>();
		Random random = new Random();
		int next = random.nextInt(100);
		map.put(BeyondUtil.armorEnchantRandomizer(), BeyondUtil.armorLevelRandomizer());
		if(next<15)		map.put(BeyondUtil.armorEnchantRandomizer(), BeyondUtil.armorLevelRandomizer());
		if(next<8)		map.put(BeyondUtil.armorEnchantRandomizer(), BeyondUtil.armorLevelRandomizer());
		if(next<3)		map.put(BeyondUtil.armorEnchantRandomizer(), BeyondUtil.armorLevelRandomizer());
		return map;
	}
	private static Map<Enchantment,Integer> lootPumpStackerTool(){
		Map<Enchantment,Integer> map = new HashMap<Enchantment,Integer>();
		Random random = new Random();
		int next = random.nextInt(100);
		map.put(BeyondUtil.toolEnchantRandomizer(), BeyondUtil.toolLevelRandomizer());
		if(next<15)		map.put(BeyondUtil.toolEnchantRandomizer(), BeyondUtil.toolLevelRandomizer());
		if(next<8)		map.put(BeyondUtil.toolEnchantRandomizer(), BeyondUtil.toolLevelRandomizer());
		if(next<3)		map.put(BeyondUtil.toolEnchantRandomizer(), BeyondUtil.toolLevelRandomizer());
		return map;
	}
	private static int chancizerForHotDrops(){
		Random random = new Random();
		int next = random.nextInt(7);
		return next;
	}
}
