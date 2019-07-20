package com.naum.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.naum.hibernate.demo.entity.Student;

public class StudentSession implements HibernateSessionFactory {

	@Override
	public Session getSession() {
		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory().getCurrentSession();
	}

}
