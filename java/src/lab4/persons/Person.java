package lab4.persons;

public class Person {
	
	private String firstname;
	private String lastname;
	
	public Person(String fname, String lname) { 
		firstname = fname;
		lastname = lname;
	}
	
	public String getPersonData() {
		String person = firstname + " " + lastname;
		return person;
	}
	
}
