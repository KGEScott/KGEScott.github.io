/**
 * This randomly chooses which play to use.
 * @author Kyrtis Scott
 */
import java.util.Random;

public class BlockBehavior implements DefenceBehavior {


	/**
	 * Chooses at random what play to pick.
	 * @return returns context of the block and which play it uses.
	 */
	@Override
	public String play() {
		String[] array = {"kick", "punt", "pass", "catch"};
		int blockType = new Random().nextInt(array.length);
		String block = array[blockType];
	return " block a " + block;
	}
}
