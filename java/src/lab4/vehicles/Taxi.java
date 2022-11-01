package lab4.vehicles;

import lab4.persons.Person;

public class Taxi<T extends Person> extends Car<T> {

	private static final String VEHICLE_TYPE = "Taxi";
	private static int TAXI_ID = 0;
	
	private final int id;
	
	public Taxi(int seats) {
		super(seats);
		id = ++Taxi.TAXI_ID;
	}
	
	@Override
	public String getInfo() {
		String info = Taxi.VEHICLE_TYPE + " " + id;
		return info;
	}
	
	@Override
	public void addPassanger(T passanger) {	
		super.evaluateSeats(Taxi.VEHICLE_TYPE, id);
		super.addPassanger(passanger);		
	}
}
