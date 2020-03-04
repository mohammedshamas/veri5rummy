package com.assignment.veri5rummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RummyCore {

	public Set<PlayerModel> addOrRemovePlayer(Set<PlayerModel> playerSet, Scanner scan) {

		while (true) {

			System.out.println("1 - Add Player ");
			System.out.println("2 - Remove Player ");
			System.out.println("3 - Back ");
			System.out.println("Enter your option : ");
			try {
				int opt = scan.nextInt();
				switch (opt) {
				case 1:
					if (playerSet.size() < 52) {
						System.out.println("Enter name of the player: ");
						playerSet.add(new PlayerModel(scan.next()));
						break;
					} else {
						System.out.println("Maximum number of players already added. "
								+ "Kindly remove any existing players before adding a new player");
						break;
					}

				case 2:
					System.out.println("Player List : " + playerSet);
					System.out.println("Kindly enter the name of the player from the above list : ");
					String s1 = scan.next();
					PlayerModel pm1 = new PlayerModel();
					for (PlayerModel pm : playerSet) {
						if (pm.getPlayerName().equals(s1)) {
							pm1 = pm;
						}
					}
					if (playerSet.remove(pm1)) {
						System.out.println("Player removed successfully\n");
					} else {
						System.out.println("Player name is Invalid !!!\n");
					}
					break;
				case 3:

					return playerSet;
				default:
					System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
					break;
				}
			} catch (InputMismatchException ime) {
				System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
				scan.next();
			}
		}

	}

	public List<String> deckShuffle(List<String> deckList) {
		Collections.shuffle(deckList);
		return deckList;
	}

	public void printDeck(List<String> deckList) {
		if (deckList.isEmpty()) {
			System.out.println("Deck is empty !!!");
		} else {
			Collections.sort(deckList);
			for (String s : deckList) {
				System.out.println(s);
			}
		}

	}

	public void startGame(Set<PlayerModel> playerSet, List<String> deckList, Scanner scan) {
		if (playerSet.isEmpty()) {
			System.out.println("Currently there are no players added. Kindly add the players and start the game !!!");
		} else if (playerSet.size() < 2) {
			System.out.println(
					"Atleast two players are needed to play the game. Kinldy add the players and start the game !!!");
		} else {
			Collections.shuffle(deckList);
			whilebreaker: while (true) {
				System.out.println("1 - Single Card Game");
				System.out.println("2 - Double Card Game");
				System.out.println("Select the Game Type : ");
				try {
					int opt = scan.nextInt();
					switch (opt) {
					case 1:
						for (PlayerModel pm : playerSet) {
							String[] cardHolder = new String[2];
							cardHolder[0] = deckList.get(0);
							deckList.remove(0);
							pm.setCardHolder(cardHolder);
						}
						break whilebreaker;
					case 2:
						if (playerSet.size() > 26) {
							System.out.println(
									"Max of 26 players are allowed in Double Card Game. Kindly remove some of the players !!!");
						} else {
							for (PlayerModel pm : playerSet) {
								String[] cardHolder = new String[2];
								cardHolder[0] = deckList.get(0);
								deckList.remove(0);
								cardHolder[1] = deckList.get(0);
								deckList.remove(0);

								pm.setCardHolder(cardHolder);
							}
						}
						break whilebreaker;

					default:
						System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
						break;
					}

				} catch (InputMismatchException ime) {
					System.out.println("Invalid Input!!!! Please select valid Input\n\n\n");
					scan.next();
				}
			}
		}

	}

	public void printPlayerCards(Set<PlayerModel> playerSet) {
		if (playerSet.isEmpty()) {
			System.out.println("Kindly add the players and play game before printing the player cards !!!");
		} else {
			for (PlayerModel pm : playerSet) {
				String[] cardHolder = new String[2];
				cardHolder = pm.getCardHolder();
				System.out.println("Player Name : " + pm.getPlayerName() + "; Card 1 : " + cardHolder[0] + "; Card 2 : "
						+ cardHolder[1]);

			}
		}

	}

	public void result(Set<PlayerModel> playerSet, Map<String, String> deckPriorityMap) {
		if (playerSet.isEmpty()) {
			System.out.println("Kindly add the players and play game before checking the results !!!");
		} else {
			int score = 0;
			for (PlayerModel pm : playerSet) {
				if (pm.getCardHolder()[1] == null) {
					score = Integer.parseInt(deckPriorityMap.get(pm.getCardHolder()[0]).split(" ")[0]);
					pm.setScore(score);
				} else {
					score = (Integer.parseInt(deckPriorityMap.get(pm.getCardHolder()[0]).split(" ")[0])
							* Integer.parseInt(deckPriorityMap.get(pm.getCardHolder()[0]).split(" ")[1]))
							+ (Integer.parseInt(deckPriorityMap.get(pm.getCardHolder()[1]).split(" ")[0])
									* Integer.parseInt(deckPriorityMap.get(pm.getCardHolder()[1]).split(" ")[1]));
					pm.setScore(score);

				}

			}
			Set<PlayerModel> sorted = new TreeSet<PlayerModel>(playerSet);
			List<PlayerModel> list = new ArrayList<PlayerModel>(sorted);
			if (list.get(list.size() - 1).getScore() == list.get(list.size() - 2).getScore()) {
				resultCalculator(list, 3);
			} else {
				System.out.println("Winner is : " + list.get(list.size() - 1).getPlayerName());
			}
		}

	}

	public void resultCalculator(List<PlayerModel> list, int condition) {
		Map<String, PlayerModel> map = new HashMap<String, PlayerModel>();
		for (int i = list.size() - 1; i > list.size() - condition; i--) {
			map.put(list.get(i).getCardHolder()[0].split(":")[0], list.get(i));
		}
		if (map.containsKey("SPADES")) {
			System.out.println("Winner is : " + map.get("SPADES").getPlayerName());
		} else if (map.containsKey("HEART")) {
			System.out.println("Winner is : " + map.get("HEART").getPlayerName());
		} else if (map.containsKey("CLUB")) {
			System.out.println("Winner is : " + map.get("CLUB").getPlayerName());
		} else {
			System.out.println("Winner is : " + map.get("DIAMOND").getPlayerName());
		}
	}
}