package core.java.project;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.display();
		s.display("Meera");
		
		MedicalStudent s1 = new MedicalStudent();
		
		s1.display();
		s1.display("Shankar");
		s1.display("Javed", 22);
		
	}

}
