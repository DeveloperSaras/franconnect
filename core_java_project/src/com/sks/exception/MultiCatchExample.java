package com.sks.exception;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		int [] arr = {12, 14, 13, 65, 22, 34};
		
		int element = 0;
		
		try {
			
		int index = 10/0;
		
		 element = arr[index];
		 
		 System.out.println("Try executed fully");
		 
		 System.exit(0);
		 
		} catch(ArithmeticException ex) {
			System.out.println("Divisor cannot be zero.");
			ex.printStackTrace();
			System.exit(0);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please make sure the index is within the range of the array");
			ex.printStackTrace();
		} finally {
			System.out.println("Finally executes always");
		}
		
		
		System.out.println(element);
		
	
	
	}

}
