package VolumeOne.Chapter4__Objects_and_classes;

/**
 * This program demonstrates parameter passing in Java
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ13ÈÕ
 */
public class ParamTest {

	public static void main(String[] args) {
		/**
		 * Test1:Methods can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripValue(percent);
		System.out.println("After: percent=" + percent);
		
		/***
		 * Test 2: Methods can change the state of object parameters
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee3 harry = new Employee3("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripSalary(harry);
		System.out.println("After salary=" + harry.getSalary());
		
		/**
		 * Test 3: Method can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		Employee3 a = new Employee3("Alice", 70000);
		Employee3 b = new Employee3("Bob", 60000);
		swap(a, b);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: a=" + b.getName());
	}

	private static void tripValue(double x) { // doesn't work
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}
	
	private static void tripSalary(Employee3 x) {  // work
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
		
	}

	private static void swap(Employee3 x, Employee3 y) {
		Employee3 temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
		
	}
}

class Employee3 {  // simplified Employee class
	private String name;
	private double salary;
	
	public Employee3(String n, double s){
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
