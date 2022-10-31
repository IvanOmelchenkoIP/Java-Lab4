package lab4.vehicles;

public abstract class Car extends Vehicle {

	@Override
	public abstract int getMaxSeats();

	@Override
	public abstract int getTakenSeats();

	@Override
	public abstract void addPassanger();

	@Override
	public abstract void removePassanger(String passangerData);

}
