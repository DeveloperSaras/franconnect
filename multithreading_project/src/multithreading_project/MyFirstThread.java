package multithreading_project;

//MyFirstThread is-A Thread
public class MyFirstThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : is running this line");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " : Main starts");
		
		Thread t = new MyFirstThread();
		t.setName("abc-thread");
		t.start();
		
		Thread t1 = new MyFirstThread();
		t1.setName("def-thread");
		t1.start();
		
		System.out.println(Thread.currentThread().getName() + " : Main ends");
				
		
		
		
	}

}
