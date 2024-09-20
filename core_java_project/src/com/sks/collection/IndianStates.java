package com.sks.collection;

public enum IndianStates {
	
	DELHI("Delhi"),
	WB("West Bengal"),
	UP("Uttar Pradesh");
	
	public String displayDesc() {
		return description.toUpperCase();
	}
	
	public final String description;
	
	IndianStates(String desc){
		description = desc;
	}

	public String getDescription() {
		return description;
	}
	
	

}
