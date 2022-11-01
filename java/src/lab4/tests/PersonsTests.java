package lab4.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab4.persons.*;

class PersonsTests {
	
	@Test
	void TestClassTranslationCorrect() {
		String expected = "Firefighter Name Surname 2";
		
		Person person = new Firefighter("Name", "Surname");
		String result = ((Firefighter)person).getPersonData();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestClassTranslationIncorrect() {
		String expected = "cannot be cast";
		
		Person person = new Person("Name", "Surname");
		System.out.println(person.getPersonData());
		Exception exception = assertThrows(ClassCastException.class, () -> { 
			String result = ((Firefighter)person).getPersonData();
		});
		
		String message = exception.getMessage();		
		
		assertTrue(message.contains(expected));
	}

	@Test
	void TestPersonData() {
		String expected = "Name Surname 2";
		
		Person person = new Person("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestPolicemanData() {
		String expected = "Policeman Name Surname 1";
		
        Policeman person = new Policeman("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestFirefighterData() {
		String expected = "Firefighter Name Surname 1";
		
		Person person = new Firefighter("Name", "Surname");
		String result = person.getPersonData();
		
		assertEquals(expected, result);
	}

}
