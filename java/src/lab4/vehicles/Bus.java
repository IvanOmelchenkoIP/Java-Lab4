package lab4.vehicles;

import lab4.persons.Person;

public final class Bus<T extends Person> extends Vehicle<T> {

	private static final int MIN_BUS_SEATS = 16;
	
	private static final String VEHICLE_TYPE = "Bus";
	private static int BUS_ID = 0;
	
	private int id;
	
	public Bus(int seats) {
		super(createSeats(seats));
		id = ++Bus.BUS_ID;
	}
	
	protected static int createSeats(int reqSeats) {
		return reqSeats < Bus.MIN_BUS_SEATS ? Bus.MIN_BUS_SEATS : reqSeats;
	}
	
	@Override
	public void addPassanger(T passanger) {	
		super.evaluateSeats(Bus.VEHICLE_TYPE, id);
		super.addPassanger(passanger);		
	}
	
}
