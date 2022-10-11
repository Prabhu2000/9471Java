package com.inheritanceprogram.demo;

class MoutainBike extends Bycycle  {
	
public int seatHeight;

	public MoutainBike(int startSpeed, int startGear, int startHeight) {
		super(startSpeed, startGear );
		seatHeight = startHeight;
		// TODO Auto-generated constructor stub
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public void setGear(int newValue) {
		gear = newValue+2;
	}
	
	@Override
	public void applyBreak(int deacrement) {
		speed = speed - deacrement - 10; 
	}
	@Override
	public void speedUp(int increment) {
		speed = speed + increment + 10 ; 
	}
	
	

}
