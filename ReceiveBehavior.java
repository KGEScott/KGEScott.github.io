/**
 * This selects the recievers play at random then returns the chosen play.
 *@author Kyrtis Scott
 */
import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior {

	/**
	 * this selects the recievers play at random.
	 * @return returns context of the play, then returns the name of the play.
	 */
	@Override
	public String play() {
		String[] array = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		int route = new Random().nextInt(array.length);
		String path = array[route];
	return " runs a " + path;
	}
}
