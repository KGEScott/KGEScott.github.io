/**
 * This interface seporates the defence behavior from the offence behavior and allows each
 * specific player to pick a play based on what the position is.
 * @author Kyrtis Scott
 *
 */
public interface DefenceBehavior {

	/**
	 * Allows the play to be selected from the subclasses.
	 * @return The play.
	 */
	public String play();
}
