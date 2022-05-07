package com.subhajit.hibernate.Demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subhajit.hibernate.entity.Instructor;
import com.subhajit.hibernate.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.openSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
           // get the instructor detail object
			int theId=2;
			InstructorDetail tempInstructorDetail=session.get(InstructorDetail.class,theId);

			//print the instructor detail
System.out.println("tempInstructorDetail : "+tempInstructorDetail);			
           //print the associated instructor
System.out.println("The associated Instructor : "+tempInstructorDetail.getInstructor());
		   // commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}





