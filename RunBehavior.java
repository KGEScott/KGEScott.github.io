/**
 * This implements offence behavior and selects the play of the quarterback randomly.
 * @author Kyrtis Scott
 */

import java.util.Random;

public class RunBehavior implements OffenceBehavior {

	/**
	 * this selects the play randomly for the quarterback.
	 * @return returns context to the play, along with what play was randomly selected.
	 */
	@Override
	public String play() {
		String[] array = {"drive (up the gut)", "draw", "pitch", "reverse"};
		int route = new Random().nextInt(array.length);
		String path = array[route];
	return " runs a " + path;
	}
}
