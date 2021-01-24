/**
 * This returns the play of the lineman on offence behavior.
 * @author Kyrtis Scott
 *
 */
public class OBlockBehavior  implements OffenceBehavior {

	/**
	 * This chooses the play of the lineman on offence.
	 * @return this returns the only play that a lineman can use on offence.
	 */
	@Override
	public String play() {

		return " block defenders";
	}
}
