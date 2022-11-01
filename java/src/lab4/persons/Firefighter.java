package lab4.persons;

public final class Firefighter extends Person {
	
	private static int FIREFIGHTER_ID_COUNTER = 0;
	private static final String JOB = "Firefighter";

	public Firefighter(String fname, String lname) {
		super(fname, lname, ++Firefighter.FIREFIGHTER_ID_COUNTER);
	}
	
	@Override
	public String getPersonData() {
		String person = Firefighter.JOB + " " + super.getPersonData();
		return person;
	}
	
}
