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
<h4> ADD ANOTHER ADMIN </h4>
		<s:form action = "addAdmin">
			<s:textfield name = "fullname" label = "FULLNAME" />
    		<s:textfield name = "username" label = "Username" />
    		<label> Birthday: </label> <input type = "date" name = "birthday" value = "birthday"> <br>
    		<s:password name = "password" id = "password" label = "Password" maxLength="6" onkeyup = "myfunction()"/>
    		<s:password name = "confirmPass" id = "confirmPass" label = "Confirm Password" maxLength="6" onkeyup = "myfunction()"/>
    	
    		<s:submit value = "REGISTER" align="left"/> <s:reset value = "RESET" align = "left"></s:reset>
		</s:form>	
</body>
</html>