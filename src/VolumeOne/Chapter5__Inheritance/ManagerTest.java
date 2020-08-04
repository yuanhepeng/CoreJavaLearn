package VolumeOne.Chapter5__Inheritance;

/***
 * This program demonstrates inheritance
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ20ÈÕ
 */
public class ManagerTest {

	public static void main(String[] args) {
		// construct a Manager object
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		// fill the staff array with Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		//print out information about all employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary());
		}
	}

}
