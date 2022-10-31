package lab4.vehicles;

public abstract class Vehicle {

	public abstract int getMaxSeats();
	
	public abstract int getTakenSeats();
	
	public abstract void addPassanger();
	
	public abstract void removePassanger(String passangerData);
	
}
