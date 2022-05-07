package com.subhajit.hibernate.Demo;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subhajit.hibernate.entity.Course;
import com.subhajit.hibernate.entity.Instructor;
import com.subhajit.hibernate.entity.InstructorDetail;

public class DeleteCourseDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		
		try {			
			// create object

			// start a transaction
			session.beginTransaction();

			//get the course from db
			int theId=4;
		Course tempCourse=session.get(Course.class, theId);
		
		//Delete Course
		System.out.println("Deleting course: "+tempCourse);
		session.delete(tempCourse);
           
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}






