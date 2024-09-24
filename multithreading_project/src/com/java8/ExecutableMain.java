package com.java8;

public class ExecutableMain {
	
	public static void print() {
		
	}

	public static void main(String[] args) {

		Executable obj = new ExecutableImpl();
		obj.execute();

		Executable obj1 = () -> {
			print();
			System.out.println("Executing via lambda");
		};

		obj1.execute();
		
		Executable obj2 = () -> {
			System.out.println("Executing via lambda in another way");
		};

		obj2.execute();

	}

}
