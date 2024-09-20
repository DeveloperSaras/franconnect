package com.sks.abstraction;

public class CurableTest {
	
	public static void main(String[] args) {
		
		Desease d1 = new Dengue();
		
		Desease d2 = new Corona();
		
		if(d1 instanceof Curable) {
			System.out.println("d1 is a curable desease");
		}
		else {
			System.out.println("d1 is not a curable desease");
		}
		if(d2 instanceof Curable) {
			System.out.println("d2 is a curable desease");
		}
		else {
			System.out.println("d2 is not a curable desease");
		}
		
		
	}

}
