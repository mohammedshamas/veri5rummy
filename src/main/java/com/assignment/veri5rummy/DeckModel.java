package com.assignment.veri5rummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DeckModel {

	private final List<String> deckList;
	private final Map<String, String> deckPriorityMap;

	public DeckModel() {

		this.deckList = new ArrayList<String>();

		this.deckList.add("SPADES:A");
		this.deckList.add("SPADES:2");
		this.deckList.add("SPADES:3");
		this.deckList.add("SPADES:4");
		this.deckList.add("SPADES:5");
		this.deckList.add("SPADES:6");
		this.deckList.add("SPADES:7");
		this.deckList.add("SPADES:8");
		this.deckList.add("SPADES:9");
		this.deckList.add("SPADES:10");
		this.deckList.add("SPADES:K");
		this.deckList.add("SPADES:Q");
		this.deckList.add("SPADES:J");

		this.deckList.add("HEART:A");
		this.deckList.add("HEART:2");
		this.deckList.add("HEART:3");
		this.deckList.add("HEART:4");
		this.deckList.add("HEART:5");
		this.deckList.add("HEART:6");
		this.deckList.add("HEART:7");
		this.deckList.add("HEART:8");
		this.deckList.add("HEART:9");
		this.deckList.add("HEART:10");
		this.deckList.add("HEART:K");
		this.deckList.add("HEART:Q");
		this.deckList.add("HEART:J");

		this.deckList.add("CLUB:A");
		this.deckList.add("CLUB:2");
		this.deckList.add("CLUB:3");
		this.deckList.add("CLUB:4");
		this.deckList.add("CLUB:5");
		this.deckList.add("CLUB:6");
		this.deckList.add("CLUB:7");
		this.deckList.add("CLUB:8");
		this.deckList.add("CLUB:9");
		this.deckList.add("CLUB:10");
		this.deckList.add("CLUB:K");
		this.deckList.add("CLUB:Q");
		this.deckList.add("CLUB:J");

		this.deckList.add("DIAMOND:A");
		this.deckList.add("DIAMOND:2");
		this.deckList.add("DIAMOND:3");
		this.deckList.add("DIAMOND:4");
		this.deckList.add("DIAMOND:5");
		this.deckList.add("DIAMOND:6");
		this.deckList.add("DIAMOND:7");
		this.deckList.add("DIAMOND:8");
		this.deckList.add("DIAMOND:9");
		this.deckList.add("DIAMOND:10");
		this.deckList.add("DIAMOND:K");
		this.deckList.add("DIAMOND:Q");
		this.deckList.add("DIAMOND:J");

		this.deckPriorityMap = new HashMap<String, String>();

		this.deckPriorityMap.put("SPADES:A", "1 4");
		this.deckPriorityMap.put("SPADES:2", "2 4");
		this.deckPriorityMap.put("SPADES:3", "3 4");
		this.deckPriorityMap.put("SPADES:4", "4 4");
		this.deckPriorityMap.put("SPADES:5", "5 4");
		this.deckPriorityMap.put("SPADES:6", "6 4");
		this.deckPriorityMap.put("SPADES:7", "7 4");
		this.deckPriorityMap.put("SPADES:8", "2 4");
		this.deckPriorityMap.put("SPADES:9", "9 4");
		this.deckPriorityMap.put("SPADES:10", "10 4");
		this.deckPriorityMap.put("SPADES:K", "13 4");
		this.deckPriorityMap.put("SPADES:Q", "12 4");
		this.deckPriorityMap.put("SPADES:J", "11 4");

		this.deckPriorityMap.put("HEART:A", "1 3");
		this.deckPriorityMap.put("HEART:2", "2 3");
		this.deckPriorityMap.put("HEART:3", "3 3");
		this.deckPriorityMap.put("HEART:4", "4 3");
		this.deckPriorityMap.put("HEART:5", "5 3");
		this.deckPriorityMap.put("HEART:6", "6 3");
		this.deckPriorityMap.put("HEART:7", "7 3");
		this.deckPriorityMap.put("HEART:8", "2 3");
		this.deckPriorityMap.put("HEART:9", "9 3");
		this.deckPriorityMap.put("HEART:10", "10 3");
		this.deckPriorityMap.put("HEART:K", "13 3");
		this.deckPriorityMap.put("HEART:Q", "12 3");
		this.deckPriorityMap.put("HEART:J", "11 3");

		this.deckPriorityMap.put("CLUB:A", "1 2");
		this.deckPriorityMap.put("CLUB:2", "2 2");
		this.deckPriorityMap.put("CLUB:3", "3 2");
		this.deckPriorityMap.put("CLUB:4", "4 2");
		this.deckPriorityMap.put("CLUB:5", "5 2");
		this.deckPriorityMap.put("CLUB:6", "6 2");
		this.deckPriorityMap.put("CLUB:7", "7 2");
		this.deckPriorityMap.put("CLUB:8", "2 2");
		this.deckPriorityMap.put("CLUB:9", "9 2");
		this.deckPriorityMap.put("CLUB:10", "10 2");
		this.deckPriorityMap.put("CLUB:K", "13 2");
		this.deckPriorityMap.put("CLUB:Q", "12 2");
		this.deckPriorityMap.put("CLUB:J", "11 2");

		this.deckPriorityMap.put("DIAMOND:A", "1 1");
		this.deckPriorityMap.put("DIAMOND:2", "2 1");
		this.deckPriorityMap.put("DIAMOND:3", "3 1");
		this.deckPriorityMap.put("DIAMOND:4", "4 1");
		this.deckPriorityMap.put("DIAMOND:5", "5 1");
		this.deckPriorityMap.put("DIAMOND:6", "6 1");
		this.deckPriorityMap.put("DIAMOND:7", "7 1");
		this.deckPriorityMap.put("DIAMOND:8", "2 1");
		this.deckPriorityMap.put("DIAMOND:9", "9 1");
		this.deckPriorityMap.put("DIAMOND:10", "10 1");
		this.deckPriorityMap.put("DIAMOND:K", "13 1");
		this.deckPriorityMap.put("DIAMOND:Q", "12 1");
		this.deckPriorityMap.put("DIAMOND:J", "11 1");

	}

	public List<String> getDeckList() {
		return deckList;
	}

	public Map<String, String> getDeckPriorityMap() {
		return deckPriorityMap;
	}

}