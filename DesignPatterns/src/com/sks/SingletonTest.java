package com.sks;

public class SingletonTest {
	
	
	public static void main(String[] args) {
		
		
		MySingleton obj = MySingleton.getInstance();
		
		obj.display();
		
		
		MySingleton obj1 = MySingleton.getInstance();
		obj1.display();
	}
}
