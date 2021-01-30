/**
 * Rims modification to vehicle 
 * @author Kyrtis Scott
 *
 */
public class Rims extends VehicleDecorator {

	private Vehicle vehicle;

	/**
	 * Sets vehicle selected and sets it to a variable named vehicle to be used to add more description
	 * and cost.
	 * @param passes through the vehicle information to be used.
	 */
	public Rims(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	/**
	 * Takes vehicles description and adds cool rims to it.
	 */
	public String toString() {
		return vehicle.toString() + ", cool rims";
	}
	
	/**
	 * takes the cost of the vehicle and adds the cost of the rims.
	 */
	public double getCost() {
		return vehicle.getCost() + 200;
	}
}
