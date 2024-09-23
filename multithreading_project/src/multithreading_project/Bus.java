package multithreading_project;

public class Bus {
	
	private Traveller doorAccessor;
	
	public synchronized void confirmWithTheFellowTraveller(Traveller fellowTvlr) throws InterruptedException {
		// If the traveller feels blocked, he will make way for his fellow traveller
		
		Traveller doorAccessor = this.doorAccessor;
		if (doorAccessor.isBlocked) {
			makeWayForFellowTraveller(doorAccessor, fellowTvlr);
		}
		// If he is not blocked, his name would be the person to enter the bus
		else {
			System.out.println(doorAccessor.getName() + " moved inside.");
		}
	}

	private void makeWayForFellowTraveller(Traveller doorAccessor, Traveller fellowTvlr) throws InterruptedException {
		
		while (doorAccessor.isBlocked) {
			System.out
					.println(Thread.currentThread().getName() + ":" + this.doorAccessor.getName() 
					+ " making way for " + fellowTvlr.getName());

			wait(1000);
		}
	}

	public Traveller getDoorAccessor() {
		return doorAccessor;
	}

	public void setDoorAccessor(Traveller doorAccessor) {
		this.doorAccessor = doorAccessor;
	}
	
	

}
