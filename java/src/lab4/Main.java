package lab4;

import lab4.persons.*;
import lab4.vehicles.*;
import lab4.road.*;

public class Main {

	public static void main(String[] args) {
		Road road = new Road();
		
		Bus<Person> bus1 = new Bus<Person>(20);
		Firetruck<Firefighter> firetruck1 = new Firetruck<Firefighter>(4);
		
		Person person1 = new Person("Name1", "Surname1");
		Person person2 = new Person("Name2", "Surname2");
		Person person3 = new Person("Name3", "Surname3");
		bus1.addPassanger(person1);
		bus1.addPassanger(person2);
		bus1.addPassanger(person3);
		
		Policeman policeman1 = new Policeman("Name4", "Surname5");
		bus1.addPassanger(policeman1);
		
		Firefighter firefighter1 = new Firefighter("Name5", "Surname5");
		Firefighter firefighter2 = new Firefighter("Name6", "Surname6");
		firetruck1.addPassanger(firefighter1);
		firetruck1.addPassanger(firefighter2);
		
		road.addVehicleToRoad(firetruck1);
		road.addVehicleToRoad(bus1);
		
		System.out.printf("People on 1st part of the road: %d\n", road.getCountOfHumans());
		
		Policecar<Policeman> policecar1 = new Policecar<Policeman>(4);
		
		Person policeman2 = new Policeman("Name7", "Surname7");
		policecar1.addPassanger((Policeman)policeman2);
		bus1.removePassanger(policeman1.getPersonData());
		policecar1.addPassanger(policeman1);
		
		bus1.removePassanger(person1.getPersonData());
		bus1.removePassanger(person2.getPersonData());
		
		road.addVehicleToRoad(policecar1);
		
		System.out.printf("People on 2nd part of the road: %d\n", road.getCountOfHumans());
	}

}
