package com.assignment.veri5rummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RummyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		RummyCore core = new RummyCore();
		DeckModel deck = new DeckModel();
		List<String> deckList = (ArrayList<String>) deck.getDeckList();
		Map<String, String> deckPriorityMap = (HashMap<String, String>) deck.getDeckPriorityMap();
		Set<PlayerModel> playerSet = new HashSet<PlayerModel>();

		while (true) {
			System.out.println("==============================================");
			System.out.println("===============  VERI5RUMMY GAME  ============");
			System.out.println("==============================================\n");
			System.out.println("MENU (Select options from 1 to 7)\n");
			System.out.println("1 - Add/Remove player(s) to the game");
			System.out.println("2 - Shuffle the deck.");
			System.out.println("3 - Print all the cards present in the deck.");
			System.out.println("4 - Start the game.");
			System.out.println("5 - Print the card each player is holding.");
			System.out.println("6 - Find the winner of the game.");
			System.out.println("7 - Finish the game by returning all cards back to the deck.\n");

			System.out.println("PLEASE SELECT YOUR OPTION: ");
			try {

				int opt = scan.nextInt();
				switch (opt) {

				case 1:
					playerSet = core.addOrRemovePlayer(playerSet, scan);
					break;
				case 2:
					deckList = (ArrayList<String>) core.deckShuffle(deckList);
					System.out.println(deckList);
					break;
				case 3:
					core.printDeck(deckList);
					break;
				case 4:
					deckList = new DeckModel().getDeckList();
					core.startGame(playerSet, deckList, scan);
					System.out.println("Cards have been distributed to all the players successfully !!!\n\n");
					break;
				case 5:
					core.printPlayerCards(playerSet);
					break;
				case 6:
					core.result(playerSet, deckPriorityMap);
					break;
				case 7:
					playerSet.clear();
					deckList = new DeckModel().getDeckList();
					System.out.println("Game has been successfully reset !!!");
					break;

				default:
					System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
					break;
				}

			}

			catch (InputMismatchException ime) {
				System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
				scan.next();
			}

		}

	}

}
