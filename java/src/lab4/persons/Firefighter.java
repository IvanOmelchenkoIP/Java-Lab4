package lab4.persons;

public final class Firefighter extends Person {
	
	private static final String JOB = "Firefighter";

	public Firefighter(String fname, String lname) {
		super(fname, lname);
	}
	
	@Override
	public String getPersonData() {
		String person = Firefighter.JOB + " " + super.getPersonData();
		return person;
	}
	
}
