package lab4.vehicles;

import java.util.ArrayList;

import lab4.persons.Person;

public abstract class Car<T extends Person> extends Vehicle<T> {
	
	private final static int MIN_CAR_SEATS = 1;
	private final static int MAX_CAR_SEATS = 8; 
	
	private int maxSeats;
	private ArrayList<T> passangers;
	
	Car(int seats) {
		maxSeats = createSeats(seats);
		passangers = new ArrayList<T>();
	}
	
	private int createSeats(int requested) {
		if (requested < Car.MIN_CAR_SEATS) return Car.MIN_CAR_SEATS; 
		if (requested > Car.MAX_CAR_SEATS) return Car.MAX_CAR_SEATS;
		return requested;
	}
	
	public abstract int getMaxSeats();
	
	public abstract int getTakenSeats();
	
	public abstract void removePassanger(String passangerData);

	public abstract void addPassanger(T passanger);
}
