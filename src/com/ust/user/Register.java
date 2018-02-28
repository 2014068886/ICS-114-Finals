package com.ust.user;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Register implements Serializable {

	/*public Register(String fullname, String username, String password, String birthday, String status, Integer age, Integer id)
	{
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.birthday = birthday;
		this.status = status;
		this.age = age;
		this.id = id;
	} */
	
	private String fullname, username, password, birthday, status;
	private int age, id;
	
	public void Date()
	{		
		LocalDate birthdate = LocalDate.parse(birthday);
	    LocalDate now = LocalDate.now();
	    Period p = Period.between(birthdate, now);
	    int year = p.getYears();
	}
		
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="fullname")
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="birthday")
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
