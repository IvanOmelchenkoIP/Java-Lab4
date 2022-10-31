package lab4.vehicles;

import java.util.ArrayList;

import lab4.persons.Person;

public final class Bus<T extends Person> extends Vehicle<T> {

	private static final int MIN_BUS_SEATS = 16;
	
	private int maxSeats;
	private ArrayList<T> passangers;
	
	public Bus(int seats) {
		maxSeats = createSeats(seats);
		passangers = new ArrayList<T>();
	}
	
	private int createSeats(int requested) {
		return requested < Bus.MIN_BUS_SEATS ? Bus.MIN_BUS_SEATS : requested;
	}

	@Override
	public void addPassanger(T passanger) {
		if (passangers.size() >= maxSeats) {
			throw new Error();
		}
		
		passangers.add((T) passanger);		
	}

	@Override
	public void removePassanger(String passangerData) {
		for(T passanger : passangers) {
			if (passanger.getPersonData() == passangerData) {
				passangers.remove(passanger);
				return;
			}
		}
		throw new Error();
	}

	@Override
	public int getMaxSeats() {
		return maxSeats;
	}

	@Override
	public int getTakenSeats() {
		return passangers.size();
	} 
	
}
