package lab4;
import lab4.persons.*;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Civillian1_name", "Civillian1_surname");
		Person p2 = new Firefighter("Firefighter_name", "Firefighter1_surname");
		Policeman p3 = new Policeman("Policeman1_name", "Policeman1_surname");
		System.out.printf("%s\n%s\n%s\n", p1.getPersonData(), p2.getPersonData(), p3.getPersonData());
		
		
	}

}
