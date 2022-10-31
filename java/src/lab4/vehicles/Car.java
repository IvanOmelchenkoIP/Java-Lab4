package lab4.vehicles;

import lab4.persons.Person;

public abstract class Car<T extends Person> extends Vehicle<T> {
	
	public abstract int getMaxSeats();
	
	public abstract int getTakenSeats();
	
	public abstract void removePassanger(String passangerData);

	public abstract void addPassanger(T passanger);
}
