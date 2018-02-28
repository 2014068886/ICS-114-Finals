package com.ust.user;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class RegisterConnect {

	Session session;
	Transaction transaction;

	public List<Register> listUser() {	
		List<Register> courses = null;
		try {
			courses = session.createQuery("from registration").list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return courses;
	}

	
	public void saveUser(Register reg) {
		try {
			session.save(reg);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} 
	}

	/*Session sess;
    
    public void insertDetails(Register register){
        try{
            sess = HibernateUtils.getSession();
            Transaction tx = sess.beginTransaction();
            sess.save(register);
             
            System.out.println("Data Inserted in user_details");
             
            tx.commit();
            sess.close();
        }
        catch(Exception exep){
            exep.printStackTrace();
        }
    }
    
    public List<Register> list() {
		
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		List<Register> contacts = null;
		try {
			
			contacts = (List<Register>)session.createQuery("from registration").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return contacts;
	} */
}
