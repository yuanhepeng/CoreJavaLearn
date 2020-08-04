package VolumeOne.Chapter5__Inheritance.abstractClasses;

/**
 * This program demonstrates abstract classes.
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ22ÈÕ
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		
		//fill the people array with Student and Employee objects
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		// print out names and descriptions of all Person objects
		for (Person person : people) {
			System.out.println(person.getName() + ", " + person.getDescription());
		}
	}
	
}
