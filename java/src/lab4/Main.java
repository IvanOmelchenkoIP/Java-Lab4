package lab4;

import lab4.persons.*;
import lab4.vehicles.*;
import lab4.road.*;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Civillian1_name", "Civillian1_surname");
		Person p2 = new Firefighter("Firefighter_name", "Firefighter1_surname");
		Policeman p3 = new Policeman("Policeman1_name", "Policeman1_surname");
		System.out.printf("%s\n%s\n%s\n", p1.getPersonData(), p2.getPersonData(), p3.getPersonData());
		
		System.out.println(p3 instanceof Person);
		
		Bus<Person> bus1 = new Bus<Person>(20);
		bus1.addPassanger(p1);
		bus1.addPassanger(p2);
		bus1.addPassanger(p3);
		System.out.println(bus1.getTakenSeats());
		
		Firetruck<Firefighter> firetruck1 = new Firetruck<Firefighter>(20);
		firetruck1.addPassanger((Firefighter)p2);
		System.out.println(firetruck1.getTakenSeats());
		
		Policecar<Policeman> policecar1 = new Policecar<Policeman>(20);
		policecar1.addPassanger(p3);
		System.out.println(policecar1.getTakenSeats());
		
		Road road = new Road();
		road.addVehicleToRoad(bus1);
		road.addVehicleToRoad(firetruck1);
		road.addVehicleToRoad(policecar1);
		System.out.println(road.getCountOfHumans());
	}

}
