package lab4.vehicles;

import lab4.persons.Person;

public class Taxi<T extends Person> extends Car<T> {

	public Taxi(int seats) {
		super(seats);
	}
	
}
