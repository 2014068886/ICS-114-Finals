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
<%@page import="java.util.*,org.hibernate.*,org.hibernate.cfg.*,com.ust.user.*"%>
<table>
		<%
			LoginDao ld = new LoginDao();
		
			ld.listUsers();
		%>
 	    <s:iterator value="list">
 	    	<s:property value = "username"/>
 	    </s:iterator>
</table>
</body>
</html>