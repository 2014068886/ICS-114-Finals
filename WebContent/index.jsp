<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> LOGIN PAGE </h2>
<s:form action = "login"> 
			
	 	<s:textfield name = "username" label = "Username"> </s:textfield> 
	 	<s:password name = "password" label = "Password" maxLength="6"> </s:password> 

	    <s:submit value = "LOGIN" align = "left"> </s:submit> <s:reset value = "RESET" align = "left"></s:reset>
</s:form>

<h3> Click <a href = "register.jsp"> here </a> to go to Registration Page </h3>
</body>
</html>