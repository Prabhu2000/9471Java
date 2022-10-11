package com.inheritanceprogram.demo;

public class Bycycle {

	protected int speed;
	protected int gear;
	
	
	public void applyBreak(int decrement) {
		speed -= decrement;
		
	}
	public void speedUp(int increase) {
		speed += increase;
		
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	
	public Bycycle(int startSpeed, int startGear) {
		speed = startSpeed;
		gear = startGear;
		
	} 
	
		
	
	
}
