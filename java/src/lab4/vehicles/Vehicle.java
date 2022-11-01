package lab4.vehicles;

import java.util.ArrayList;
import lab4.exception.*;

import lab4.persons.Person;

public abstract class Vehicle<T extends Person> {
	
	private int maxSeats;
	private ArrayList<T> passangers;
	
	Vehicle(int seats) {
		maxSeats = seats;
		passangers = new ArrayList<T>();
	}
	
	public abstract String getInfo();
	
	public int getMaxSeats() {
		return maxSeats;
	}

	public int getTakenSeats() {
		return passangers.size();
	} 

	protected void evaluateSeats(String vehicleType, int id) {
		if (passangers.size() >= maxSeats) throw new VehicleIsFullException(vehicleType + " " + id + " is full! Can`t add more passengers!");
	}
	
	public void addPassanger(T passanger) {	
		if (passanger.isPassangerActive()) throw new PassangerBusyException(passanger.getPersonData() + " is in another vehicle!");
		passanger.setPassangerActive();		
		passangers.add(passanger);		
	}
	
	public void removePassanger(String passangerData) {
		for(T passanger : passangers) {
			if (passanger.getPersonData() == passangerData) {
				passanger.setPassangerInactive();
				passangers.remove(passanger);
				return;
			}
		}
		throw new PassangerNotInVehicleException("The passanger " + passangerData + " is not in the vehicle!");
	}

}