package com.subhajit.hibernate.Demo;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subhajit.hibernate.entity.Course;
import com.subhajit.hibernate.entity.Instructor;
import com.subhajit.hibernate.entity.InstructorDetail;

public class CreateCourseDemo {

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

			//get the instructor from db
			int theId=1;
			Instructor tempInstructor=session.get(Instructor.class,theId);
			
			//create some courses
			Course tempCourse1=new Course("Electromagnetic Theory");
			Course tempCourse2=new Course("Solid State Device");
			
			//add courses to the instructor
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			
			//save the courses
           session.save(tempCourse1);
           session.save(tempCourse2);
           
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}






