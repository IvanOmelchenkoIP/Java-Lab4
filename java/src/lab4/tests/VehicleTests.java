package lab4.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab4.persons.*;
import lab4.vehicles.*;

class VehicleTests {

	@Test
	void TestBusMaxSeatsNormal() {
		int expected = 36;
		
		Bus<Person> bus = new Bus<Person>(36);
		int result = bus.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestBusMaxSeatsLessThanNormal() {
		int expected = 16;
		
		Bus<Person> bus = new Bus<Person>(6);
		int result = bus.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestCarMaxSeatsNormal() {
		int expected = 5;
		
		Car<Person> car = new Taxi<Person>(5);
		int result = car.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestCarMaxSeatsLessThanNormal() {
		int expected = 1;
		
		Car<Firefighter> car = new Firetruck<Firefighter>(0);
		int result = car.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestCarMaxSeatsNegative() {
		int expected = 1;
		
		Policecar<Policeman> car = new Policecar<Policeman>(-3);
		int result = car.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestCarMaxSeatsMoreThanNormal() {
		int expected = 8;
		
		Taxi<Person> car = new Taxi<Person>(10);
		int result = car.getMaxSeats();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestInfoBus() {
		String expected = "Bus 1";
		
		Bus<Person> bus = new Bus<Person>(56);
		String result = bus.getInfo();
		
		assertEquals(expected, result);
	}
	
	@Test
	void TestInfoTaxi() {
		String expected = "Taxi 3";
		
		Taxi<Person> taxi = new Taxi<Person>(4);
		String result = taxi.getInfo();
		
		assertEquals(expected, result);
	}
	
	@Test	
	void TestInfoPolicecar() {
		String expected = "Policecar 1";
		
		Policecar<Policeman> policecar = new Policecar<Policeman>(4);
		String result = policecar.getInfo();
		
		assertEquals(expected, result);
	}
	
	@Test	
	void TestInfoFiretruck() {
		String expected = "Firetruck 2";
		
		Firetruck<Firefighter> firetruck = new Firetruck<Firefighter>(4);
		String result = firetruck.getInfo();
		
		assertEquals(expected, result);
	}
}
