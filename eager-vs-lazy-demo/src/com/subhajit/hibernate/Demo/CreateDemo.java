package com.subhajit.hibernate.Demo;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subhajit.hibernate.entity.Instructor;
import com.subhajit.hibernate.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Instructor.class)
								.buildSessionFactory();
		
		// create session
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		
		try {			
			// create object
			System.out.println("Creating new student object...");
			Instructor tempInstructor = new Instructor("Jeet","Salal","jeetsalalaesthetics@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("Jeet Salal Fitness","Fitness Model");
			//Instructor tempInstructor = new Instructor("Guru","Mann","gurumannfitness@gmail.com");
			//InstructorDetail tempInstructorDetail=new InstructorDetail("Guru Mann Fitness","Fitness Model");

			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			// start a transaction
			session.beginTransaction();
			
			// save the Instructor
			/*
			 * It will also save the details object because of CascadeType.ALL
			 */
			System.out.println("Saving the Instructor : "+tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}






