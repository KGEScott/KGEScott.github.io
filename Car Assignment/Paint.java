/**
 * Paint modification to vehicle 
 * @author Kyrtis Scott
 *
 */
public class Paint extends VehicleDecorator {
	
	private Vehicle vehicle;

	/**
	 * Sets vehicle selected and sets it to a variable named vehicle to be used to add more description
	 * and cost.
	 * @param passes through the vehicle information to be used.
	 */
	public Paint(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	/**
	 * Takes vehicles description and adds fancy paint to it.
	 */
	public String toString() {
		return vehicle.toString() + ", fancy paint";
	}
	
	/**
	 * takes the cost of the vehicle and adds the cost of the paint.
	 */
	public double getCost() {
		return vehicle.getCost() + 150;
	}
}
