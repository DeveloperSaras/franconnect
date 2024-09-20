package core.java.project;

public class Student {

	private int id;
	private String name;
	private String course;
	private long mobileNumber;
	private String gender;

	
	protected void display() {
		System.out.println("This is a student");
	}
	
	protected void display(String name) {
		System.out.println("Hello, " + name);
	}

}