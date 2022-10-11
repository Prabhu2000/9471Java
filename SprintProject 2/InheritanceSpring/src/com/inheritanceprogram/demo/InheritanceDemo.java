package com.inheritanceprogram.demo;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*Bycycle cycle = new Bycycle(10, 20);
		System.out.println("Gear is :" + cycle.gear);
		//System.out.println("Seatheight is :" + cycle.seatHeight);
		System.out.println("Speed is :" + cycle.speed);
		cycle.applyBreak(2);
		System.out.println("Bike speed after applying a break is:" + cycle.speed);*/
		
		
		Bycycle mountanbike = new MoutainBike(50, 50, 2);
		System.out.println("Gear is :" + mountanbike.gear);
		//System.out.println("Seatheight is :" + mountanbike.seatHeight);
		System.out.println("Speed is :" + mountanbike.speed);
		mountanbike.applyBreak(1);
		System.out.println("Bike speed after applying a break is:" + mountanbike.speed);
		mountanbike.speedUp(10);
		System.out.println("Bike speed after applying a sppedup:" + mountanbike.speed);
	}
	
}
