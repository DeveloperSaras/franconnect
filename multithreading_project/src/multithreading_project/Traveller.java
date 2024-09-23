package multithreading_project;

public class Traveller {
	
	private String name;
	// Initial state of the traveller is blocked
	/*
	 * private boolean isBlocked = true; 
	 */
	
	boolean isBlocked = true;

	

	public Traveller(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
