package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
@SpringBootApplication

public class BootjpaexampleApplication {

	/*@Autowired
	private static UserRepository repo;*/
	public static void main(String[] args) {
		
	/*SpringApplication.run(BootjpaexampleApplication.class, args);
	User user=new User();
	user.setId(1);
	user.setName("Subhaji");
	user.setCity("Kolkata");
	user.setStatus("ACTIVE");
    repo.save(user);*/
	ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository repo=context.getBean(UserRepository.class);	
	User user=new User();
	user.setId(1);
	user.setName("Subhajit");
	user.setCity("Kolkata");
	user.setStatus("ACTIVE");
	repo.save(user);
	}

}
