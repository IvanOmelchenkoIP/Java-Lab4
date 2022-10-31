package lab4.road;

import java.util.ArrayList;
import lab4.vehicles.*;

public class Road {

	private ArrayList<Vehicle<?>> vehicles = new ArrayList<Vehicle<?>>();
	
	public int getCountOfHumans() {
		int humanCount = 0;
		for (Vehicle<?> vehicle : vehicles) humanCount += vehicle.getTakenSeats();
		return humanCount;
	}
	
	public void addVehicleToRoad(Vehicle<?> vehicle) {
		vehicles.add(vehicle);
	}
	
}
