/**
 * This interface seporates the offence behavior from the defence behavior and allows each
 * specific player to pick a play based on what the position is.
 * @author Kyrtis Scott
 *
 */
public interface OffenceBehavior {

	/**
	 * Allows the play to be selected from the subclasses.
	 * @return The play.
	 */
	public String play();



}
