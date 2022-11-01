package lab4.vehicles;

import lab4.persons.Policeman;

public class Policecar<T extends Policeman> extends Car<T> {

	public Policecar(int seats) {
		super(seats);
	}

}
