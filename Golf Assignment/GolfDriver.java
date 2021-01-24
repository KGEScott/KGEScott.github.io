

public class GolfDriver {

	public static void main(String[] args) {
		Golfer golfer = new Golfer("Georgy");
		Observer HoleScoreDisplay = new HoleScoreDisplay(golfer);
		Observer RoundScoreDisplay = new RoundScoreDisplay(golfer);

        
		System.out.println("***** " + golfer.getName() + " is staring his round *****");
		golfer.enterScore(5, 3);
		golfer.enterScore(2, 2);
		golfer.enterScore(1, 3);
		golfer.enterScore(3, 3);
		golfer.enterScore(3, 2);
	}
}
