package core.java.project;

import java.io.IOException;

public class ExceptionExample {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Going to throw an exception");
		
		try {
			throw new IOException();
		} catch(IOException ex) {
			System.out.println("Exception caught");
			ex.printStackTrace();
		}
		
		System.out.println("Program ended");
		
	}
}
