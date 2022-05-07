package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Cricket ck = context.getBean("myCrick", Cricket.class);
		ck.getBowling();

	}

}
