package VolumeOne.Chapter5__Inheritance.abstractClasses;

public class Student extends Person{

	private String major;
	
	/**
	 * 
	 * @param name the student's name
	 * @param major the sudent's major
	 */
	public Student(String name, String major){
		// pass n to superclass constructor
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		
		return "a student majoring in " + major;
	}
}
