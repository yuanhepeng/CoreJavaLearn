package VolumeOne.Chapter6.clone;

/**
 * This program demonstrates cloning.
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ30ÈÕ
 */
public class CloneTest {

	public static void main(String[] args) {
		Employee original = new Employee("John Q. Public", 50000);
		original.setHireDay(2000, 1, 1);
		try {
			Employee copy = original.clone();
			copy.setHireDay(2002, 12, 31);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
