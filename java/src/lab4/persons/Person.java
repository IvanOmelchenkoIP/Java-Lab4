package lab4.persons;

public class Person {
	
	private static int ID_COUNTER = 0;
	
	private int id;
	private String firstname;
	private String lastname;
	
	private boolean isPassanger = false; 
	
	public Person(String fname, String lname) { 
		firstname = fname;
		lastname = lname;
		id = ++Person.ID_COUNTER;
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
