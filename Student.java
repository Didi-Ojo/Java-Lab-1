package Assignment6;

public abstract class Student implements FeeCalculator, Sortable {
	private static int totalStudents = 0;//to allow for student numbers to be assigned
	private int studentNumber = 0;//the given students number
	private String studentName = null;//student's name
	private int numberOfCoursesTaken;

	public Student(String studentName, int numberOfCoursesTaken){
		totalStudents++;
		studentNumber = totalStudents;//increment student number and assign it
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		this.studentName = studentName;// set student name
	}
	
	public Student(String studentName){
		this(studentName, 5); // If the maximum number of courses is not specified, the default value will be 5
	} 
	
	public String getName(){
		return studentName;
	}
	
	public int getNumberOfCoursesTaken(){
		return numberOfCoursesTaken;
	} 
	
	
	public abstract String findCountry();
	
	public double computeFees(){
		if (numberOfCoursesTaken <= 3 )
		{
			return (200 * numberOfCoursesTaken);
		}
		else return 800;
	}

	public String toString() {//output a formatted student record
		String output;
		output = "Student #:" + studentNumber + ", Name:" + studentName;
		output += " is from " + findCountry() + "; pays fees $" + computeFees();
		return output;
	}	 
}
