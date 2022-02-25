package com.Interface.ioc;

public class Airtel implements Raw {
  
	@Override
	public void calling() {
		System.out.println("person calling Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("person using data Airtel sim");
		
	}

}
