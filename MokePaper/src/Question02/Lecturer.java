package Question02;

public class Lecturer implements IPerson {
	private String employeeID;
	private String department;
	
	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}

	@Override
	public String displayDetails() {
		return "Lecture = "+this.employeeID+", Deparment ="+this.department;
	}
	
	
}
