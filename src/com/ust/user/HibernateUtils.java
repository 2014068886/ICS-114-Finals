package com.ust.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static Session getSession() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.openSession();
    }
}
