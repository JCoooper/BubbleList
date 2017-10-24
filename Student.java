
public class Student {

	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	
	public Student(String firstName, String lastName, int gradeLevel,
			double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getGradeLevel() {
		return this.gradeLevel;
	}
	
	public void setLastName(String n) {
		lastName = n;
	}
	
	public void setFirstName(String k) {
		firstName = k;
	}
	
	
	public double getGPA() {
		return this.gpa;
	}
	
	public String toString() {
		String returnString = "";
		returnString += this.getLastName() + ", " + this.getFirstName();
		returnString += "   Grade " + this.getGradeLevel();
		returnString += "   GPA: " + this.getGPA();
		return returnString;
	}
	
}