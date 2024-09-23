package multithreading_project;

import static java.lang.Thread.*;

public class ThreadPriorityExample {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++)
					System.out.println(i);
			}
		};

		t1.setPriority(MIN_PRIORITY);

		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 101; i <= 110; i++)
					System.out.println(i);
			}
		};

		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}
