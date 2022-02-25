package com.Interface.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Mobile {
public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    System.out.println("config loaded");
        Raw raw = context.getBean("sim", Raw.class);
        raw.calling();
        raw.data();
   } 
} 

