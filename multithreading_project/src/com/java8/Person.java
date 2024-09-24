package com.java8;

public class Person {
	
	String startPoint;
	
	String positionWRTCorridor;
	
	private Corridor corridor;
	
	boolean corridorLeftClear = true;
	boolean corridorRightClear = true;
	
	void startMoving(String side) {
		if(startPoint.equals("front") && side.equals("left")){
			positionWRTCorridor = "right";
		}
		else
			positionWRTCorridor = "left";
		
		corridorLeftClear = false;
	}
	
	public void moveOn() {
		if(positionWRTCorridor.equals("left")) {
			
		}
	}
	
	void changePosition(String side) {
		if(startPoint.equals("front")) {
			if(side.equals("right")) {
			positionWRTCorridor = "left";
			}
			else {
			positionWRTCorridor = "right";
			}
		}
		else {
			if(side.equals("right")) {
				positionWRTCorridor = "right";
				}
				else {
				positionWRTCorridor = "left";
				}
		}
	}

}
