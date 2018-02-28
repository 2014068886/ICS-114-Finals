package com.ust.user;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;


public class LoginDao {
	public boolean find(String name, String password) 
	{
        Session session = HibernateUtils.getSession();
        //session.beginTransaction();
        String sql = "select username, password, status from registration where registration.username='"+name+"' and registration.password='"+password+"' and registration.status='enable'";
        Query query = session.createSQLQuery(sql);
     
        List<User> list = query.list();
        if (list.size() > 0) 
        {
            session.close();
            return true;
        }
        session.close();
        return false;
    }
	
	public boolean isAdmin(String name, String password)
	{
		 	Session session = HibernateUtils.getSession();
	        //session.beginTransaction();
	        String sql = "select username, password, status from adminRegistration where adminRegistration.username='"+name+"' and adminRegistration.password='"+password+"' and adminRegistration.status='enable'";
	        Query query = session.createSQLQuery(sql);
	     
	        List<User> list = query.list();
	        if (list.size() > 0) 
	        {
	            session.close();
	            return true;
	        }
	        session.close();
	        return false;
	}
	
	public void listUsers()
	{
		Session session = HibernateUtils.getSession();
		Query query=session.createSQLQuery("select username, birthday from registration");
		List<User> list=query.list();  
		
		if (list.size() > 0) 
        {
            session.close();
        }

	}
}
