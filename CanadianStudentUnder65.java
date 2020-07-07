package Assignment6;

public class CanadianStudentUnder65 extends CanadianStudent {

	public CanadianStudentUnder65(String studentName){
		super(studentName);
	}
		
	public CanadianStudentUnder65(String studentName, int classes) {
		super(studentName, classes);
	}

	public double computeFees(){
		if (this.getNumberOfCoursesTaken() >= 4)
			return 800;
		
		else return 200.0 * this.getNumberOfCoursesTaken();
		}

	public boolean lessThan(Sortable otherStudent) {
		String otherName = ((Student)otherStudent).getName();
		if (otherStudent instanceof ForeignStudent) return false;
		else if (otherStudent instanceof SeniorStudent) return false;
		else if (this.getName().compareTo(otherName) < 0) return true;
		return false;
	}
}
