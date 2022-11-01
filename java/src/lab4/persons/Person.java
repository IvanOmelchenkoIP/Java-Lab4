package lab4.persons;

public class Person {
	
	private static int ID_COUNTER = 0;
	
	private final int id;
	private final String firstname;
	private final String lastname;
	
	private boolean isPassanger = false; 
	
	public Person(String fname, String lname) { 
		firstname = fname;
		lastname = lname;
		id = ++Person.ID_COUNTER;
	}
	
	protected Person(String fname, String lname, int jobId) {
		firstname = fname;
		lastname = lname;
		id = jobId;
	}
	
	public String getPersonData() {
		String person = firstname + " " + lastname + " " + id;
		return person;
	}
	
	public boolean isPassangerActive() {
		return isPassanger;
	}
	
	public void setPassangerActive() {
		isPassanger = true;
	}
	
	public void setPassangerInactive() {
		isPassanger = false;
	}
	
}
