package com.naum.hibernate.demo;

import org.hibernate.Session;

public interface HibernateSessionFactory {
	public Session getSession();
}
