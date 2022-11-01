package lab4.persons;

public final class Firefighter extends Person {
	
	private static final String job = "Firefighter";

	public Firefighter(String fname, String lname) {
		super(fname, lname);
	}
	
	@Override
	public String getPersonData() {
		String person = job + " " + super.getPersonData();
		return person;
	}
	
}
