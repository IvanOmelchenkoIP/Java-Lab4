package lab4.persons;

public final class Policeman extends Person {
	
	private static final String JOB = "Policeman";

	public Policeman(String fname, String lname) {
		super(fname, lname);
	}
	
	@Override
	public String getPersonData() {
		String person = Policeman.JOB + " " + super.getPersonData();
		return person;
	}

}
