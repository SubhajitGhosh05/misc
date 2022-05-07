package com.subhajit.hibernate.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subhajit.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.openSession();
		
		try {			
			
			
			
			
		int studentid=1;
			
			// now get a new session and start transaction
			session = factory.openSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentid);
			
			Student myStudent = session.get(Student.class, studentid);
			
			System.out.println("Updating Student...");
			myStudent.setFirstName("Jalaj");
			myStudent.setLastName("Saxena");
			myStudent.setEmail("jalaxsaxenacricket@gmail.com");
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			//  NEW CODE
			// now get a new session and start transaction
			session = factory.openSession();
			session.beginTransaction();
			// Update the email ID of ID=3
			
			System.out.println("Updating email ID of student ID=3 ....");
			session.createQuery("update Student set email='iamanb@gmail.com' where id=3 ").executeUpdate();
			
			
			
		}
		finally {
			factory.close();
		}
	}

}






