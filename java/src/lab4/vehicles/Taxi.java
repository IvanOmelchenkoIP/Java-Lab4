package lab4.vehicles;

import lab4.persons.Person;

public class Taxi<T extends Person> extends Car<T> {

	public Taxi(int seats) {
		super(seats);
	}

	@Override
	public void addPassanger(T passanger) {
		super.addPassanger(passanger);
	}

	@Override
	public void removePassanger(String passangerData) {
		super.removePassanger(passangerData);
	}

	@Override
	public int getMaxSeats() {
		return super.getMaxSeats();
	}

	@Override
	public int getTakenSeats() {
		return super.getTakenSeats();
	} 

}
