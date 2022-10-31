package lab4.persons;

public class Person {
	
	private String firstname;
	private String lastname;
	
	private boolean isPassanger = false; 
	
	public Person(String fname, String lname) { 
		firstname = fname;
		lastname = lname;
	}
	
	public String getPersonData() {
		String person = firstname + " " + lastname;
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
