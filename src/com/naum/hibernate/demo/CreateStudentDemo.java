package com.naum.hibernate.demo;

import java.util.List;

import org.hibernate.Session;

import com.naum.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		Session session = new StudentSession().getSession();

		
		try {
			//use the session object to save java object
			/*Student student = new Student("Naum","Asafov","email@gmail.com");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();*/
			
			//Read object from DB
			/*session.beginTransaction();
			Student rStudent = session.get(Student.class, 1);
			session.getTransaction().commit();
			System.out.println("name = " + rStudent.getFirstName());*/
			
			
			//Query object from Hib
			/*session.beginTransaction();
			List<Student> theStudents =
					session.createQuery("from Student").getResultList();
			
			for(Student st : theStudents) {
				System.out.println(st);
			}*/
			/*List<Student> theStudents =
					session.createQuery("from Student s where s.firstName='Name'").getResultList();
			
			for(Student st : theStudents) {
				System.out.println(st);
			}
			session.getTransaction().commit();*/
			
			
			
			//Update
			/*session.beginTransaction();
			Student rStudent = session.get(Student.class, 1);
			rStudent.setFirstName("Naum");
			session.getTransaction().commit();*/

			//Delete
			/*session.beginTransaction();
			Student rStudent = session.get(Student.class, 2);
			session.delete(rStudent);
			session.getTransaction().commit();*/
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
