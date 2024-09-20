package com.example;

import java.util.Random;

//Car is-a vehicle
public class Truck extends Vehicle {

	public Truck(String name) {
		super(name);
	}

	@Override
	public int calculateTotalServiceCost() {
		Random rd = new Random();
		int serviceCharge = rd.nextInt(100, 2000);
		System.out.println("Service charge is = " + serviceCharge);
		return serviceCharge + EVALUATION_CHARGE;
	}

}
