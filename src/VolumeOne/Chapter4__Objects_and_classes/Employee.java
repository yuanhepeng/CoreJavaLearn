package VolumeOne.Chapter4__Objects_and_classes;
import java.time.LocalDate;

/**
 * 
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ7ÈÕ
 */
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day){
		name = n;
		salary = s;
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
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
