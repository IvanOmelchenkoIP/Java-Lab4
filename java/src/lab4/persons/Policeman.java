package lab4.persons;

public final class Policeman extends Person {
	
	private static int POLICEMAN_ID_COUNTER = 0;
	private static final String JOB = "Policeman";

	public Policeman(String fname, String lname) {
		super(fname, lname, ++Policeman.POLICEMAN_ID_COUNTER);
	}
	
	@Override
	public String getPersonData() {
		String person = Policeman.JOB + " " + super.getPersonData();
		return person;
	}

}
