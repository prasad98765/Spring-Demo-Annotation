package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("theSillyCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("theSillyCoach",Coach.class);
	
		// check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		
		// print out the result 
		
		System.out.println("Pointing to same object" + result);
		
		System.out.println("Location for theCoach" + theCoach);
	
		System.out.println("Location for alphacode" + alphaCoach);
	
		// Close Context
		context.close();
	}

}
