/**
 * Initializes Sedans description and cost.
 * @author Kyrtis Scott
 *
 */
public class Sedan extends Vehicle {

	/**
	 * Sets the description of Sedan to Sedan.
	 */
	public Sedan() {
		this.description = "Sedan";
	}
	
	/**
	 * Sets the cost of the Sedan to $20,000.
	 */
	public double getCost() {
		return 20000;
	}
}
