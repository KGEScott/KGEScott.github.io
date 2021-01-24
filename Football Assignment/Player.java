/**
 * Information of a football player and sets defence and offence.
 * @author Kyrtis Scott
 *
 */

public abstract class Player {

	protected String name = null;
	private boolean defence;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 *  Sets name to the name, sets defense and offense of that player and sets the defence (turnover) to false.
	 * @return returns the boolean value of defence to false stating there is no turnover.
	 */
	public Player(String name) {
		this.name = name;
		this.setDefenceBehavior();
		this.setOffenceBehavior();
		this.defence = false;
	}
	
	/**
	 * Sets the defence behavior for the player
	 * @return null
	 */
	public void setDefenceBehavior() {
		this.defenceBehavior = null;
	}

	/**
	 * Sets the offence behavior for the player
	 * @return null
	 */
	public void setOffenceBehavior() {
		this.offenceBehavior = null;
	}

	/**
	 * Checks to see if the defence boolean is set to turnover or not turnover, then sets the player to not playing if the turnover is true.
	 * If the turnover is not true, then it runs the defence behavior for that player. This does the same with the offence side, it checks
	 * to see if the turnover is true or false, allowing for the player to pick a play based on the turnover.
	 * @return returns null if the player is on offence and there is a turnover, likewise, sets the player as not playing if the quarterback
	 * is on the defence side. otherwise, it returns the play.
	 */
	public String play() {
		if(this.defence) {
			if(this.defenceBehavior == null)
				return " not playing";
			else
				return this.defenceBehavior.play();
		}
		else {
			if(this.offenceBehavior == null)
				return " not playing";
			else
				return this.offenceBehavior.play();
			
		}
	}
	
	/**
	 * Sets the value of the turnover.
	 * @return this returns the value of the turnover.
	 */
	public void turnover() {
		this.defence = true;
		
	}
}
