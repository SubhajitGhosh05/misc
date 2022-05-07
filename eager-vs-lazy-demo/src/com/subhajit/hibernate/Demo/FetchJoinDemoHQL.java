package com.subhajit.hibernate.Demo;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.subhajit.hibernate.entity.Course;
import com.subhajit.hibernate.entity.Instructor;
import com.subhajit.hibernate.entity.InstructorDetail;

public class FetchJoinDemoHQL {

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

			Query<Instructor> query=
		session.createQuery("SELECT i from Instructor i "
				+" JOIN fetch i.courses "
				+"where i.id=:theInstructorId"
				,Instructor.class);	
			
			//set parameter on query
			query.setParameter("theInstructorId", theId);
			
			//execute query and get instructor
			Instructor tempInstructor=query.getSingleResult();
			System.out.println("Instructor : "+tempInstructor);
			// commit transaction
			session.getTransaction().commit();
			session.close();
			//get courses for the instructor
			System.out.println("Courses : "+tempInstructor.getCourses());
           
			
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}






