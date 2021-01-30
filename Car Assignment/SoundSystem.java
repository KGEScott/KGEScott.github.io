/**
 * SoundSystem modification to vehicle 
 * @author Kyrtis Scott
 *
 */
public class SoundSystem extends VehicleDecorator {

	private Vehicle vehicle;

	/**
	 * Sets vehicle selected and sets it to a variable named vehicle to be used to add more description
	 * and cost.
	 * @param passes through the vehicle information to be used.
	 */
	public SoundSystem(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	/**
	 * Takes vehicles description and adds awesome sound to it.
	 */
	public String toString() {
		return vehicle.toString() + ", awesome sound";
	}
	
	/**
	 * takes the cost of the vehicle and adds the cost of the sound system.
	 */
	public double getCost() {
		return vehicle.getCost() + 350;	
	}
}
