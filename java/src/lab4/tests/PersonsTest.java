package lab4.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab4.persons.*;

class PersonsTest {

	@Test
	void PersonTestData() {
		String expected = "Name Surname 1";
		
		Person person = new Person("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}
	
	@Test
	void PolicemanTestData() {
		String expected = "Policeman Name Surname 1";
		
        Policeman person = new Policeman("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}
	
	@Test
	void FirefighterTestData() {
		String expected = "Firefighter Name Surname 1";
		
		Person person = new Firefighter("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}
	
	

}
