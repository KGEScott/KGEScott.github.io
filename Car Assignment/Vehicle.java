/**
 * Abstract class that returns the description of the vehicle and modifications implemented
 * within the child classes.
 * @author Kyrtis Scott
 *
 */
public abstract class Vehicle {
	
	protected String description;
	
	/**
	 * This sets the description which is implemented within the child class.
	 */
	public String toString() {
		return description;
	}
	
	/**
	 * Abstract method that forces the child to implement getCost.
	 * @return returns the value of the child class getCost.
	 */
	public abstract double getCost();
}
