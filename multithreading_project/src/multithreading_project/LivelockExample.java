package multithreading_project;

public class LivelockExample {
	
	public static void main(String[] args) {

		final Traveller tvlr1 = new Traveller("Arjun");
		final Traveller tvlr2 = new Traveller("Shankar");
		
		Bus bus = new Bus();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					bus.setDoorAccessor(tvlr1);
					bus.confirmWithTheFellowTraveller(tvlr2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					bus.setDoorAccessor(tvlr2);
					bus.confirmWithTheFellowTraveller(tvlr1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
	}

}
