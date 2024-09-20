package multithreading_project;

public class MainThreadExample {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("Currently running thread name is : " + currentThreadName);
		
	}
}
