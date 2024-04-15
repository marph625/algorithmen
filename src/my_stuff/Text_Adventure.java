package my_stuff;
import Prog1Tools.IOTools;

// This will be a basic text adventure with plain text output and some decision making
// There is no combat and inventory system yet

public class Text_Adventure {
	
	public static void main(String[] args) {
		String player_name = IOTools.readLine("What is your name?\n >> ");
		System.out.println("\nHello " + player_name + "!\nLet's start an adventure!");
		start_adventure();
	}
	
	static void combat_system() {
		//TODO Life Points, Action Points, Actions --> Mana & Magic later
		
	}
	
	static void inventory_system() {
		//TODO Elements from an Array treasure_chest into an array player_inventory
	}
	
	static void start_adventure() {
		System.out.println("You enter a room with a red and a blue door.");
		String door_choice = IOTools.readLine("\nWhich door do you pick?\n >> ");
		System.out.println("\nYou chose the " + door_choice + " door!");
		
		// There are two doors and we can choose which we want to enter
		//TODO Make this switch statement keep asking until "red" or "blue" is written by user
		// --> While loop I guess
		
		switch (door_choice) {
		case "red":
			red_door();
			break;
		case "blue":
			blue_door();
			break;
		default:
			System.out.println("Excuse me?");
		}
	}
	
	static void red_door() {		
		System.out.println("\nYou opened the red door and enter the room.\nYou see a great red dragon!"
				+ "\nIt stares at you with one narrowed eye.");
		String red_room_choice = IOTools.readLine("\nflee or fight?\n >> ");
		
		//There is a dragon behind the red door and we can choose if we want to fight or to flee
		//TODO Implement a combat system with life points, action points and different actions
		
		switch (red_room_choice) {
		case "flee":
			System.out.println("\nThis dragon is terrifying. You run for your life.");
			start_adventure();
			break;
		case "fight":
//			System.out.println("\nI'm sorry, the combat system is in another castle.");
//			System.out.println("~~~~~ GAME OVER ~~~~~");
//			System.exit(0);
			// End the program with a GAME OVER message
		}
	}
	
	static void blue_door() {
		System.out.println("\nYou enter a blue room and see a treasure chest on your left."
				+ "\nOn your right is a door but a sleeping guard blocks it\nYou can also go back if you wish.");
		String blue_room_choice = IOTools.readLine("\nleft or right or back?\n >> ");
		
		//There is a chest on the left and a door on the right
		//TODO The chest will be locked in the future and the guard has the key which we can steal
		//TODO Implement a combat system (see red_door())
		//TODO Implement an inventory system --> array
		
		switch (blue_room_choice) {
		case "left":
			System.out.println("\nYou decided to head for the chest.");
			String chest_choice = IOTools.readLine("\nWanna open the chest? It might waken the guard? [y/n]\n >> ");
			switch (chest_choice) {
			case "y":
				System.out.println("\nThe chest is open! You get:\n");
				String[] treasure_chest = {"Sword", "Gold", "Silver", "Torch", "Diamond"};
				for (int i=0; i<treasure_chest.length; i++) {
					System.out.println(treasure_chest[i]);
				}
				System.out.println("\nAs the chest is empty now there is nothing more to be done here.\nYou take a step back.");
				blue_door();
				break;
			case "n":
				System.out.println("\nYou don't want to risk anything and take a step back.");
				blue_door();
				break;
			}
			break;
			
		case "right":
			System.out.println("\nThe door is right in front of you but you cannot get past the guard that easily.");
			String guard_choice = IOTools.readLine("\nWhat will you do? [fight] [steal] [sneak] [retreat]\n >> ");
			switch (guard_choice) {
			case "fight":
				System.out.println("\nI don't have a combat system yet :(\nYou take a step back.");
				blue_door();
				break;
			case "steal":
				System.out.println("\nTHAT'S ILLEGAL.\nThe guard pretended to be asleep masterfully and arrests you.");
				System.out.println("~~~~~ GAME OVER ~~~~~");
				System.exit(0);
				break;
			case "sneak":
				System.out.println("\nYou managed to squeeze through the small gap between guard and door.\nFortunately the door is not locked!");
				forest();
				break;
			case "retreat":
				System.out.println("\nYou decide to take a step back.");
				blue_door();
				break;
			}
			break;
			
		case "back":
			System.out.println("\nYou decided to go back into the previous room.");
			start_adventure();
			break;
		}
	}
	
	static void forest() {
		System.out.println("\nYou find yourself in the middle of a forest.");
		//The story will go on from here in the future
	}
}
