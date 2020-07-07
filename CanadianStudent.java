package Assignment6;

public abstract class CanadianStudent extends Student {

	public CanadianStudent(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
	}
	
	public CanadianStudent(String studentName) {
		super(studentName);
	}

	public String findCountry(){
		return "Canada";
	}
}
