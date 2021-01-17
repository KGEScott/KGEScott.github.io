/**
 * This sets the play of the receiver. 
 * @author Kyrtis Scott
 *
 */

public class Receiver extends Player {

	/**
	 * this creates a new instance of an offence behavior for the receiver
	 * @retun This returns the information of the receiver.
	 */
	public Receiver(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	/**
	 * This sets the behavior of the receiver on offence.
	 * @return the offence receivers play.
	 */
	public void setOffenceBehavior() {
		this.offenceBehavior = new ReceiveBehavior();
	}
	
	/**
	 * this sets the defence behavior of the player to null because receivers are offence.
	 * @param defenceBehavior passes the information through.
	 * @return This returns null because the receiver cannot play on defence.
	 */
	public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
		this.defenceBehavior = null;
	}
	
	/**
	 * this calls upon the name of the player, then tells the play.
	 * @return this returns the name of the player and the play chosen.
	 */
	public String toString() {
		return this.name + " " + this.play();
	}


}
