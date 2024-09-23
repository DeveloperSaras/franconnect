package multithreading_project;

public class SynchronizedMethodExample {
	
	
	public static void main(String[] args) {
		
		Runnable rt = new RunnableTask();
		
		Thread t1 = new Thread(rt);
		
		Thread t2 = new Thread(rt);
		
		Thread t3 = new Thread(rt);
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		
		
		
	}

}
