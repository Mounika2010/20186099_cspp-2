import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		Game game = new Game(count);
		game.addPlayer(new Player(scan.nextLine()));
		int totalScore = 0;
		while (scan.hasNextLine()) {
			String lines[] = scan.nextLine().split(" got ");
			if (lines.length == 1) {
				if (game.indexOf(lines[0]) == -1) {
					game.addPlayer(new Player(lines[0]));
				}
			}  else if (lines.length == 2) {
				String player = lines[0];
				int index = game.indexOf(player);
				int score = Integer.parseInt(lines[1]);
				//Please complete the code to complete the game.
				
				if (score != 1) {
					totalScore = totalScore + score;
				}
				else {
					totalScore = 0;
				}
				
				game.getplayer(index).getscoree(totalScore);

			}
		}
		game.winner();
	}
}

class Game {
	int numplayers;
	int size = 0;
	Player[] players;

	Game(int numplayers) {
		this.numplayers = numplayers;
		players = new Player[numplayers];
		size = 0;
	}

	Game() {
		players = new Player[numplayers];
		size = 0;
	}

	public void addPlayer(Player playerName) {
		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				players[i] = playerName;
				size++;
			}
		}
	}

	public Player getplayer(int p) {
		return players[p];
	}

	public int indexOf(String player) {
		for (int i = 0; i < players.length; i++) {
			if (players[i].getName().equals(player)) {
				return i;
			}
		}
		return -1;
	}

	public void winner() {
		// System.out.println(totalScore);
		for (int i = 0; i < players.length; i++) {
			if (players[i].getmaxscore() >= 100) {
				System.out.println(players[i].getName());
			}
		}
		// return null;

	}
	
}


class Player {
	String nameofPlayer;
	int score;

	Player(String playernamee) {
		this.nameofPlayer = playernamee;
		this.score = score;
	}

	public String getName() {
		return nameofPlayer;
	}
	public int getmaxscore() {
		return this.score;
	}

	public void getscoree(int score) {
		this.score = this.score + score;
	}
}
