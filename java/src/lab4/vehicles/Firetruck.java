package lab4.vehicles;
import lab4.persons.Firefighter;

public class Firetruck<T extends Firefighter> extends Car<T> {

	@Override
	public int getMaxSeats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTakenSeats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removePassanger(String passangerData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPassanger(T passanger) {
		// TODO Auto-generated method stub
		
	}

}
