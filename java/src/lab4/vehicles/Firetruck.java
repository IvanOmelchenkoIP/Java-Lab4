package lab4.vehicles;

import lab4.persons.Firefighter;

public class Firetruck<T extends Firefighter> extends Car<T> {

	public Firetruck(int seats) {
		super(seats);
	}

}
