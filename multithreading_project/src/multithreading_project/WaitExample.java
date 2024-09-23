package multithreading_project;

public class WaitExample {
	
	private boolean status = true;
	
	
	public synchronized void display() {
		
		System.out.println(Thread.currentThread().getName() + " - Hello from inside display");	
			while(status) {
				try {
					System.out.println(Thread.currentThread().getName() + " - Now Waiting for furter notification");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName() + " - Display completed");	
	}
	
	
	public synchronized void print() {
		
		System.out.println(Thread.currentThread().getName() + " - Hello from inside print");
		status = false;
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " - Notifying now");
		notifyAll();
		
	}

}
