package com.assignment.veri5rummy;

public class PlayerModel implements Comparable<PlayerModel> {
	private String playerName;
	private String[] cardHolder = new String[2];
	private int score;

	public PlayerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerModel(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String[] getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String[] cardHolder) {
		this.cardHolder = cardHolder;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	

	@Override
	public String toString() {
		return "PlayerModel [playerName=" + playerName + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerModel other = (PlayerModel) obj;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		return true;
	}

	public int compareTo(PlayerModel o) {
		// TODO Auto-generated method stub
		return this.score - o.getScore();
	}

}
