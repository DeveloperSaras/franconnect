package multithreading_project;

//RunnableTask is-a type of Runnable
public class RunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : is running this line");
	}
	
	public static void main(String[] args) {
		
		Runnable task = new RunnableTask();
		Thread t = new Thread(task);
		
		t.start();
	}
}
