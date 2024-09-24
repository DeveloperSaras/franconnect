package com.java8;

@FunctionalInterface
public interface B {
	
	void display();
	
	default void print() {
		System.out.println("B's print");
	}

}
