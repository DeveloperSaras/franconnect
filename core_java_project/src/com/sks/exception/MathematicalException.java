package com.sks.exception;

public class MathematicalException extends Exception {

	private String expMessage;

	public String getExpMessage() {
		return expMessage;
	}

	public void setExpMessage(String expMessage) {
		this.expMessage = expMessage;
	}

	public MathematicalException(String expMessage) {
		super();
		this.expMessage = expMessage;
	}

	public MathematicalException() {
		super();
		// TODO Auto-generated constructor stub
	}

}
