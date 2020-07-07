package Assignment6;

public class ForeignStudent extends Student{
	private String countryOfOrigin;
	private static int numberOfForeignStudents = 0;
	private MyDate dateOfEntryToCanada;
	public ForeignStudent(String studentName, int numberOfCoursesTaken, 
			              String countryOfOrigin, MyDate dateOfEntryToCanada){
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
		numberOfForeignStudents++;
	}
	
	public static int getNumberOfForeignStudents(){
		return numberOfForeignStudents;
	}

	public String findCountry(){
		return countryOfOrigin;
	}
	
	public boolean livinginCanadaBeforeSpecifiedDate(MyDate latestDateOfEntry){
		if (dateOfEntryToCanada.lessThan(latestDateOfEntry)) {
			return true;
		} else {
			return false;
		}
	}

	public double computeFees(){
		return 1000.0 * getNumberOfCoursesTaken();// foreign students pay $1000/course 
	}

	public boolean lessThan(Sortable anotherStudent){
		String nameOfForeignStudent;
		if (anotherStudent instanceof ForeignStudent){
			nameOfForeignStudent = getName();
			return (nameOfForeignStudent.compareTo(((Student)anotherStudent).getName()) < 0);
		} else if (anotherStudent instanceof SeniorStudent){
			return false;
		} else {
			return true;
		}
	}

}
