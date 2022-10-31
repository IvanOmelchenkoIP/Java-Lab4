package lab4.vehicles;

import java.util.ArrayList;

import lab4.persons.Person;

public final class Bus<T extends Person> extends Vehicle<T> {

	private static final int MIN_BUS_SEATS = 16;
	
	public Bus(int seats) {
		super(createSeats(seats));
	}
	
	protected static int createSeats(int reqSeats) {
		return reqSeats < Bus.MIN_BUS_SEATS ? Bus.MIN_BUS_SEATS : reqSeats;
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
