package com.sks;

public class MySingleton {
	
	private static MySingleton obj;
	
	public static MySingleton getInstance() {
		
		if(obj == null) {
			obj = new MySingleton();
		}
		
		return obj;
	}
	
	public void display() {
		System.out.println("From inside display of MySingleton");
	}

	private MySingleton() {
		
	}
	
}
