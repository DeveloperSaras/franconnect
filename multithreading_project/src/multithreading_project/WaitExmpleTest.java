package multithreading_project;

public class WaitExmpleTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WaitExample obj = new WaitExample();
		
		Thread t1 = new Thread() {
			public void run() {
				obj.display();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				obj.print();
			}
		};
		
		t1.start();
		
		t2.start();
	}
}
