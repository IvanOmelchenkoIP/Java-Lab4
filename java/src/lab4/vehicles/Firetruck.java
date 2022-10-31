package lab4.vehicles;
import lab4.persons.Firefighter;

public class Firetruck<T extends Firefighter> extends Car<T> {

	public Firetruck(int seats) {
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
