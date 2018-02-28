package com.ust.user;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class RegisterUser extends ActionSupport implements ModelDriven<Register> {
	
	private Register reg = new Register();
	private List<Register> userList = new ArrayList<Register>();
	private RegisterConnect registerDao= new RegisterConnect();
	
	@Override
	public Register getModel() {
		return reg;
	}
	
	public String add()
	{
		registerDao.saveUser(reg);
		return "success";
	}
	
	public String list()
	{
		userList = registerDao.listUser();
		return "success";
	}
		
	public Register getRegister() {
		return reg;
	}
	
	public void setRegister(Register reg) {
		this.reg = reg;
	}

	public List<Register> getUserList() {
		return userList;
	}

	public void setUserList(List<Register> userList) {
		this.userList = userList;
	}
	/*private static SessionFactory factory; 
    
	private String fullname, username, password, birthday, status;
	private int age, id;
	
	public int Date()
	{		
		LocalDate birthdate = LocalDate.parse(birthday);
	    LocalDate now = LocalDate.now();
	    Period p = Period.between(birthdate, now);
	    int year = p.getYears();
	    return year;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	Register reg = new Register();
	RegisterConnectDao rcd = new RegisterConnectDao();
	public String execute()
	{
		  reg.setFullname(fullname);
		  reg.setUsername(username);
		  reg.setBirthday(birthday);
		  reg.setAge(Date());
		  reg.setId(id);
		  reg.setPassword(password);
		  reg.setStatus("enable");
		  
		  rcd.insertDetailsDao(reg);
		  return "success";
	} */
	
  
}
