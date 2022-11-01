package lab4.vehicles;

import lab4.persons.Policeman;

public class Policecar<T extends Policeman> extends Car<T> {

	private static final String VEHICLE_TYPE = "Policecar";
	private static int POLICECAR_ID = 0;
	
	private int id;
	
	public Policecar(int seats) {
		super(seats);
		id = ++Policecar.POLICECAR_ID;
	}
	
	@Override
	public String getInfo() {
		String info = Policecar.VEHICLE_TYPE + " " + id;
		return info;
	}
	
	@Override
	public void addPassanger(T passanger) {	
		super.evaluateSeats(Policecar.VEHICLE_TYPE, id);
		super.addPassanger(passanger);		
	}

}
