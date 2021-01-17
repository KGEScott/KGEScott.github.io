/**
 * this allows the player to strip the ball from another players hands.
 * @author Kyrtis Scott
 *
 */
public class StripBehavior implements DefenceBehavior {

	/**
	 * This sets the play, the defence player strips the ball from the offence player.
	 * @return Returns that the ball was stripped from an offence player.
	 */
	@Override
	public String play() {

		return " Strip a ball from runners hands";
	}
}
