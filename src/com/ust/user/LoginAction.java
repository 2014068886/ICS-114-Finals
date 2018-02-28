package com.ust.user;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.dispatcher.SessionMap;

public class LoginAction extends ActionSupport{
	

	private static final long serialVersionUID = 1L;

	private String username, password;

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
	
	ArrayList<User> list=new ArrayList<User>();  
	  
	public ArrayList<User> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<User> list) {  
	    this.list = list;  
	}  
	
	LoginDao ld = new LoginDao();
	
	    public String execute() {
	        if (ld.find(getUsername(), getPassword())) 
	        {
	            return "success";
	        }
	        else if(ld.isAdmin(getUsername(), getPassword()))
	        {
	        	return "successAdmin";
	        } else		
	        {
	            this.addActionError("Invalid username and password");
	        }
	        return "error";
	    }  
	    	
}
