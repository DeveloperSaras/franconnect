package com.example;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car("BMW M4");
		Vehicle truck = new Truck("Ahsok Leyland");
		
		car.displayTotalServiceCost();
		truck.displayTotalServiceCost();
		
	}

}
