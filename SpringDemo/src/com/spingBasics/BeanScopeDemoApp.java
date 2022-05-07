package com.spingBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.XML");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//Check if they are the same
		boolean result= (theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\n Poining to the same object=> "+result);
		
		System.out.println("\n Memory location for theCoach " +theCoach);
		System.out.println("\n Memory location for alphaCoach " +alphaCoach);
		
		//close the context
		
		context.close();
	}

}
