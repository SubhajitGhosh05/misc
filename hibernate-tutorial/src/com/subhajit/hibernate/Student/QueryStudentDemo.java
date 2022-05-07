package com.subhajit.hibernate.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.DataException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.subhajit.hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display the students
			displayStudents(theStudents);

			// query students: lastName='Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Roy'").getResultList();

			// display the students
			System.out.println("\n\nStudents who have last name of Roy");
			displayStudents(theStudents);

			// query students: lastName='Roy' OR firstName='Basudev'
			theStudents = session.createQuery("from Student s where" + " s.lastName='Roy' OR s.firstName='Basudev'")
					.getResultList();

			System.out.println("\n\nStudents who have last name of Roy OR first name Basudev");
			displayStudents(theStudents);

			// query students where email LIKE '%gmail.com'
			theStudents = session.createQuery("from Student s where" + " s.email LIKE '%gmail.com'").getResultList();

			System.out.println("\n\nStudents whose email ends with gmail.com");
			displayStudents(theStudents);

			/*
			 * StringBuilder sb=new StringBuilder();
			 * sb.append("select distinct s from Student s where" +
			 * " s.email LIKE '%gmail.com'"); sb.toString();
			 */

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println("THE STUDENT>>> " + tempStudent);
		}
	}

}
