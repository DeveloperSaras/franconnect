package com.example;

public abstract class Vehicle {
	
	protected String name;
	
	public static final int EVALUATION_CHARGE = 500;
	
	public abstract int calculateTotalServiceCost();
	
	public void displayTotalServiceCost() {
		int totalCost = calculateTotalServiceCost();
		System.out.print(this.name + " repaired successfully.");
		System.out.println("Please pay " + totalCost);
	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

}
