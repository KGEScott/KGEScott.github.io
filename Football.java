

public class Football {
	
	public Football() {}
	
	public void play() {
		Player[] players = new Player[3];
		players[0] = new QuarterBack("Russel Wilson");
		players[1] = new Receiver("Tyler Lockett");
		players[2] = new Lineman("BJ Finney");
		
		System.out.println("***** Offencive Plays *****");
		displayPlays(players);
		turnover(players);
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}
	
	public void displayPlays(Player[] players) {
		for(Player player : players) {
			System.out.println(player.name + " " + player.play());
		}
	}
	
	public void turnover(Player[] players) {
		for(Player player : players) {
			player.turnover();
		}
	}
	
	public static void main(String[] args) {
		Football football = new Football();
		football.play();
	}

}
