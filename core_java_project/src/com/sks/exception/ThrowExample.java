package com.sks.exception;

public class ThrowExample {

	public static int divideNumbers(int n1, int n2) throws MathematicalException {
		int result = 0;

		try {
			result = n1 / n2;
		} finally {
			System.out.println("Please make sure that value of n2 is not zero. Try again.");
			if(n2 == 0)
			throw new MathematicalException("Please make sure that value of n2 is not zero. Try again.".toUpperCase());
		}

		return result;
	}
	
	private static int calculate(int n1, int n2) throws MathematicalException {
		return divideNumbers(n1, n2);
	}

	public static void main(String[] args) {
		try {
			calculate(10, 2);
		} catch (MathematicalException e) {
			e.printStackTrace();
		}
	}

}
