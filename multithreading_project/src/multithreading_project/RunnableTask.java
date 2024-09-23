package multithreading_project;

//RunnableTask is-a type of Runnable
public class RunnableTask implements Runnable {

	@Override
	public synchronized void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
}
