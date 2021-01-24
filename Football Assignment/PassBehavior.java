/**
 * This implements offence behavior and selects the play of the receiver randomly.
 * @author Kyrtis Scott
 */
import java.util.Random;

public class PassBehavior implements OffenceBehavior {

	/**
	 * this selects the play randomly for the receiver.
	 * @return returns context to the play, along with what play was randomly selected.
	 */
	@Override
	public String play() {
		String[] array = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		int route = new Random().nextInt(array.length);
		String path = array[route];
	return " throws a " + path;
	}
}
