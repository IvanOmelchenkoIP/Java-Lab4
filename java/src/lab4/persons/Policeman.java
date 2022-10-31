package lab4.persons;

final public class Policeman extends Person {
	
	private static final String job = "Policeman";

	public Policeman(String fname, String lname) {
		super(fname, lname);
	}
	
	@Override
	public String getPersonData() {
		String person = Policeman.job + " " + super.getPersonData();
		return person;
	}

}