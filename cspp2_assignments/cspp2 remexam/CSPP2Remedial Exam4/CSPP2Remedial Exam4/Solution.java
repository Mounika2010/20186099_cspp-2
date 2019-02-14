import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		Game game = new Game(count);
		game.addPlayer(new Player(scan.nextLine()));
		int totalScore = 0;
		String yy=game.players[0].nameofPlayer;
		while (scan.hasNextLine()) {
			String lines[] = scan.nextLine().split(" got ");
			if (lines.length == 1) {
				if(totalScore!=0){
				game.players[game.indexOf(yy)].score+=totalScore;
				totalScore=0;
				System.out.println(yy+game.players[game.indexOf(yy)].score);
				}yy=lines[0];
				if (game.indexOf(lines[0]) == -1) {
					game.addPlayer(new Player(lines[0]));
					
				}
			}  else if (lines.length == 2) {
				String player = lines[0];
				int index = game.indexOf(player);
				int score = Integer.parseInt(lines[1]);
				//Please complete the code to complete the game.
				int y=game.indexOf(lines[0]);
				if (score != 1) {
					totalScore = totalScore + score;
					
				}
				else if (score==1){
					totalScore =0;
					
				}
				
				
			}
			
			if(game.winner(2)!=null)break;
		}
		game.players[game.indexOf(yy)].score+=totalScore;
		System.out.println(game.winner(totalScore).getName());
	}
}

class Game {
	int numplayers;
	int size;
	Player[] players;

	Game(int numplayers) {
		this.numplayers = numplayers;
		players = new Player[numplayers];
		size = 0;
	}


	public void addPlayer(Player playerName) {
		//System.out.println(playerName.getName());
		this.players[this.size++]=playerName;
		return;
	}



	public int indexOf(String player) {
		for (int i = 0; i < players.length; i++) {
			if(players[i]!=null){
			if (players[i].getName().equals(player)) {
				return i;
			}}
		}
		return -1;
	}

	public Player winner(int totalScore) {
		// System.out.println(totalScore);
		for (int i = 0; i < this.players.length; i++) {
			if(this.players[i]!=null){
			if (this.players[i].getmaxscore() >= 100) {
				System.out.println(players[i].getName());
				return this.players[i];
			}}
		}
		return null;

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
