package Question02;

public class Student implements IPerson{

	private String StudentID;
	private int Grade;
	
	public Student(String sstudentID, int grade) {
		super();
		StudentID = sstudentID;
		Grade = grade;
	}

	@Override
	public String displayDetails() {
		return "Student = "+ this.StudentID+", Grade ="+this.Grade;
		 
	}
	
	
}
