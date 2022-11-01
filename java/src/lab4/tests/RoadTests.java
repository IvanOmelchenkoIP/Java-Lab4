package lab4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import lab4.road.Road;
import lab4.exceptions.VehicleEmptyException;
import lab4.persons.*;
import lab4.vehicles.*;

class RoadTests {

	@Test
	void TestAddEmptyCars() {
		String expected = "is empty and cannot enter the road";
		
		Road road = new Road();
		Car<Person> car = new Taxi<Person>(8);
		Exception exception = assertThrows(VehicleEmptyException.class, () -> {
			road.addVehicleToRoad(car);
		});
		
		String message = exception.getMessage();
		
		assertTrue(message.contains(expected));
	}
	
	@Test
	void TestAddVehicles() {
		int expected = 20;
		
		Road road = new Road();	
		Bus<Person> bus = new Bus<Person>(16);
		for (int i = 0; i < 10; i++) {
			Person person = new Person("Name", "Surname");
			bus.addPassanger(person);
		}
		Policecar<Policeman> policecar = new Policecar<Policeman>(8);
		for (int i = 0; i < 6; i++) {
			Person person = new Policeman("Name", "Surname");
			policecar.addPassanger((Policeman)person);
		}
		Firetruck<Firefighter> firetruck = new Firetruck<Firefighter>(8);
		for (int i = 0; i < 4; i++) {
			Firefighter person = new Firefighter("Name", "Surname");
			firetruck.addPassanger(person);
		}
		road.addVehicleToRoad(bus);
		road.addVehicleToRoad(policecar);
		road.addVehicleToRoad(firetruck);
		
		int result = road.getCountOfHumans();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestAddVehiclesAndChange() {
		int expected = 16;
		
		Road road = new Road();
		ArrayList<String> busCivillians = new ArrayList<String>();
		ArrayList<String> busPolicemen = new ArrayList<String>();
		Bus<Person> bus = new Bus<Person>(16);
		for (int i = 0; i < 5; i++) {
			Person person = new Person("Name", "Surname");
			busCivillians.add(person.getPersonData());
			bus.addPassanger(person);
		}
		for (int i = 0; i < 5; i++) {
			Policeman person = new Policeman("Name", "Surname");
			busPolicemen.add(person.getPersonData());
			bus.addPassanger(person);
		}
		ArrayList<String> policecarPolicemen = new ArrayList<String>();
		Policecar<Policeman> policecar = new Policecar<Policeman>(8);
		for (int i = 0; i < 6; i++) {
			Person person = new Policeman("Name", "Surname");
			policecarPolicemen.add(person.getPersonData());
			policecar.addPassanger((Policeman)person);
		}
		ArrayList<String> firetruckFirefighters = new ArrayList<String>();
		Firetruck<Firefighter> firetruck = new Firetruck<Firefighter>(8);
		for (int i = 0; i < 4; i++) {
			Firefighter person = new Firefighter("Name", "Surname");
			firetruckFirefighters.add(person.getPersonData());
			firetruck.addPassanger(person);
		}
		road.addVehicleToRoad(bus);
		road.addVehicleToRoad(policecar);
		road.addVehicleToRoad(firetruck);
		bus.removePassanger(busCivillians.get(0));
		bus.removePassanger(busPolicemen.get(0));
		policecar.removePassanger(policecarPolicemen.get(0));
		firetruck.removePassanger(firetruckFirefighters.get(0));
		
		int result = road.getCountOfHumans();
		
		assertEquals(expected, result);
	}

}
