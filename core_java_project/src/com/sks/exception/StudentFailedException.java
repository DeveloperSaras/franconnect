package com.sks.exception;

public class StudentFailedException extends Exception {

	private String expMessage;

	public StudentFailedException(String expMessage) {
		super();
		this.expMessage = expMessage;
	}

	public String getExpMessage() {
		return expMessage;
	}

	public void setExpMessage(String expMessage) {
		this.expMessage = expMessage;
	}

}
