package Assignment6;

public class SeniorStudent extends CanadianStudent{
	private double pension;
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension){
		super(studentName, numberOfCoursesTaken);
		this.pension = pension;
	}
	public double computeFees(){
			return 50.0;// seniors pay $50 irrespective of the number of courses
	}
	
	public boolean lessThan(Sortable anotherStudent){
		String nameOfSenior = ((Student)anotherStudent).getName();
		if (anotherStudent instanceof SeniorStudent){
			if (this.getName().compareTo(nameOfSenior) < 0) return true;
			else return false;
		}
	return true; 
	}
	public String toString(){
		String output;
		output = super.toString() + " senior citizen who gets pension $" + pension;
		return output;
	}
}