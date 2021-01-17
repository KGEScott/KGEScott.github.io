/**
 * This selects the offence or defence behavior of a lineman.
 * @author Kyrtis Scott
 */

import java.util.Random;

public class Lineman extends Player {

	/**
	 * This sets the lineman information.
	 * @return this returns the information for the lineman.
	 */
	public Lineman(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	/**
	 * this creates a new instance of an offence behavior for the lineman
	 * @retun This returns the information that because the lineman is on offence, it must block.
	 */
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = new OBlockBehavior();
	}
	
	/**
	 * This sets the behavior at random for a lineman on defence. 
	 * @return This returns what behavior the lineman will use.
	 */
	@Override
	public void setDefenceBehavior() {
		Random rnd = new Random();
		int randInt = rnd.nextInt(1);
		if(randInt == 0)
			defenceBehavior = new BlockBehavior();
		else if (randInt == 1)
			defenceBehavior = new StripBehavior();
		else
			defenceBehavior = new SackBehavior();
	}
	
	/**
	 * this calls upon the name of the player, then tells the play.
	 * @return the name and the play of the lineman.
	 */
	public String toString() {
		return this.name + " " + this.play();
	}


}
