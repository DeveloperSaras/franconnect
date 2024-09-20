package com.sks.exception;

public class CustomExceptionExample {

	public static void main(String[] args) {

		int marks = 25;

		if (marks < 35) {
			try {
				throw new StudentFailedException("The student failed because he/she scored less" + " than 35 marks");
			} catch (StudentFailedException e) {
				System.out.println(e.getExpMessage());
				e.printStackTrace();
			}
		} else {
			System.out.println("The student passed with " + marks);
		}

	}

}
