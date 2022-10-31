package lab4.vehicles;

import lab4.persons.Person;

public abstract class Vehicle<T extends Person> {

	public abstract int getMaxSeats();
	
	public abstract int getTakenSeats();
	
	public abstract void removePassanger(String passangerData);

	public abstract void addPassanger(T passanger);
}