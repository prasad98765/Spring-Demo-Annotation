package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultAnnotetionDemo {
	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("cricketCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}
}