package lab4.vehicles;

import lab4.persons.Person;

public abstract class Car<T extends Person> extends Vehicle<T> {
	
	private final static int MIN_CAR_SEATS = 1;
	private final static int MAX_CAR_SEATS = 8; 
	
	public Car(int seats) {
		super(createSeats(seats));
	}
	
	protected static int createSeats(int reqSeats) {
		if (reqSeats < Car.MIN_CAR_SEATS) return Car.MIN_CAR_SEATS; 
		if (reqSeats > Car.MAX_CAR_SEATS) return Car.MAX_CAR_SEATS;
		return reqSeats;
	}
	
}
