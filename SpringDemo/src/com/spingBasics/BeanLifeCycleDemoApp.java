package com.spingBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.XML");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//Coach theCoach=(Coach) context.getBean("myCoach");
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		
		context.close();
	}

}
