package hangman_logic;

import java.io.Serializable;

public class User implements Serializable{

	private String username;
	private int totalWins;
	private int totalGames;


	public User() {
		this.username = null;
		this.totalWins = 0;
		this.totalGames = 0;
	}
	
	public User(String uName) {
		this.username = uName;
		this.totalWins = 0;
		this.totalGames = 1;
	}
	
	public User(String uName, int wins, int games, boolean inProg) {
		this.username = uName;
		this.totalWins = wins;
		this.totalGames = games;
	};
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(int totalWins) {
		this.totalWins = totalWins;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	@Override 
	public boolean equals(Object o) {
		if(o instanceof User) {
			if(((User) o).getUsername().equals(this.username)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getUsername() + " has played a total of "+ this.totalGames + " games and has won " + this.totalWins;	
	}

}
