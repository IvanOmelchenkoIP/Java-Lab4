package lab4.vehicles;

import java.util.ArrayList;

import lab4.persons.Person;

abstract class Vehicle<T extends Person> {
	
	private int maxSeats;
	private ArrayList<T> passangers;
	
	Vehicle(int seats) {
		maxSeats = seats;
		passangers = new ArrayList<T>();
	}

	public void addPassanger(T passanger) {
		if (passangers.size() >= maxSeats) {
			throw new Error();
		}
		
		passangers.add((T) passanger);		
	}

	public void removePassanger(String passangerData) {
		for(T passanger : passangers) {
			if (passanger.getPersonData() == passangerData) {
				passangers.remove(passanger);
				return;
			}
		}
		throw new Error();
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public int getTakenSeats() {
		return passangers.size();
	} 
}