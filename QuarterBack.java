/**
 * This allows the quarterback to pick between offence and defence behaviors like run and pass.
 * @author Kyrtis Scott
 */

import java.util.Random;

public class QuarterBack extends Player {

	/**
	 * This sets the quarterbacks information.
	 * @return this returns the information for the quarterback.
	 */
	public QuarterBack(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}

	/**
	 * This allows for a random choice between run and pass behaviors
	 * @return this returns the choice of run or pass behaviors.
	 */
	public void setOffenceBehavior() {
		Random rnd = new Random();
		int randInt = rnd.nextInt(1);
		if(randInt == 0)
			offenceBehavior = new RunBehavior();
		else
			offenceBehavior = new PassBehavior();
	}
	
	/**
	 * This sets the quarterbacks defence behavior to null
	 * @return this returns null because the quarterback cannot be on defence.
	 */
	public void setDefenceBehavior() {
		defenceBehavior = null;
	}
	
	/**
	 * this calls upon the play.
	 * @return this returns the offence behavior play selected.
	 */
	@Override
	public String play() {
		return offenceBehavior.play();
	}



}
