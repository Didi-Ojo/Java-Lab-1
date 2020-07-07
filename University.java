package Assignment6;

public class University {
	private Student[] listOfStudents;
	private int numStudentsInUniversity = 0;
	public University(int maximumNumberOfStudents){
		listOfStudents = new Student[maximumNumberOfStudents];
	}
	
	public boolean insertStudent(Student aStudent){
		if (numStudentsInUniversity == listOfStudents.length){
			return false; // array is full - new student not inserted
		} else {
			listOfStudents[numStudentsInUniversity] = aStudent;
			numStudentsInUniversity++;
			return true;
		}
	}
	
	public int numberOfStudents(String nameOfCountry){
		Student aStudent;
		int numberOfStudentsFromSpecifiedCountry = 0;
		for (int index = 0; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			if ((aStudent.findCountry()).equals(nameOfCountry)){
				numberOfStudentsFromSpecifiedCountry++;
			}
		}
		return numberOfStudentsFromSpecifiedCountry;
	}
	
	public int numberOfForeignStudentLivingInCanadaSince2010(){
		int count = 0;
		Student aStudent;
		MyDate january1_2010 = new MyDate("01/01/2010");
		ForeignStudent aForeignStudent;
		for (int index = 0; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			if (aStudent instanceof ForeignStudent){
				aForeignStudent = (ForeignStudent)aStudent;
				if (aForeignStudent.livinginCanadaBeforeSpecifiedDate(january1_2010)){
					count++;
				}
			}
		}
		return count;
	}
	
	public Student findLeastStudent(){
		Student leastStudent;
		Student aStudent;
		leastStudent = listOfStudents[0];
		
		for (int index = 1; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			if (!leastStudent.lessThan(aStudent)){
				leastStudent = aStudent;
			}
		}
		return leastStudent;
	}
	
	public String toString(){
		String outputString;
		Student aStudent;
		outputString = "Number of students in University = " + numStudentsInUniversity + "\n";
		for (int index = 0; index < numStudentsInUniversity; index++){
			aStudent = listOfStudents[index];
			outputString += aStudent + "\n";
		}
		return outputString;
	}
	
	public String sortStudents(){
		Sortable listOfUniStudents[] = listOfStudents;
		Sort.sortAnything(listOfUniStudents, numStudentsInUniversity);
		return this.toString();
	}

}
