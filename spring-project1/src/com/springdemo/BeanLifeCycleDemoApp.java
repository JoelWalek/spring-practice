package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//test class to test life cycle of beans
public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//print results testing if they point to same place in memory
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPoint to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach.toString());
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach.toString());
		
		//close the context
		context.close();
		
	}

}
