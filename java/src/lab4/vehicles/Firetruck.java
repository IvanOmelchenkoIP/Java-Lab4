package lab4.vehicles;

import lab4.persons.Firefighter;

public class Firetruck<T extends Firefighter> extends Car<T> {

	private static final String VEHICLE_TYPE = "Firetruck";
	private static int FIRETRUCK_ID = 0;
	
	private int id;
	
	public Firetruck(int seats) {
		super(seats);
		id = ++Firetruck.FIRETRUCK_ID;
	}
	
	@Override
	public void addPassanger(T passanger) {	
		super.evaluateSeats(Firetruck.VEHICLE_TYPE, id);
		super.addPassanger(passanger);		
	}

}
