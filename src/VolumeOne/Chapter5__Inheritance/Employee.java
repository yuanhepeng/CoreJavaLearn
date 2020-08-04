package VolumeOne.Chapter5__Inheritance;

import java.time.LocalDate;

/***
 * This is a superclassses
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ20ÈÕ
 */
public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
}
